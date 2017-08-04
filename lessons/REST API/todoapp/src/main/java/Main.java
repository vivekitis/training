import com.fasterxml.jackson.databind.ObjectMapper;
import model.store.Store;
import model.todo.Todo;
import model.user.User;
import utilities.Utilities;

import java.util.List;
import java.util.UUID;

import static spark.Spark.delete;
import static spark.Spark.get;
import static spark.Spark.post;

public class Main {

    public static void main(String[] args) {

        get("/hello", (req, res) -> {
            res.type("application/json");
            return "{\"message\" :\"Hello World\"}";
        });

        get("/ping", (req, res) -> {
            res.type("application/json");
            return "{\"message\" :\"pong\"}";
        });

        post("/login", (request, response) -> {
            response.type("application/json");

            String reqBody = request.body();
            String resp;
            User user = Utilities.loadUser(reqBody);

            if(user == null){
                response.status(400);
                resp = "{\"message\":\"Bad request\"}";
            }else{
                User checkUser = Store.getInstance().findUser(user.getUserName());
                if(checkUser == null || !checkUser.getPassword().equals(user.getPassword())){
                    response.status(403);
                    resp = "{\"message\":\"Invalid username or password.\"}";
                }else{
                    String token = UUID.randomUUID().toString();
                    Store.getInstance().getUserTokenMap().put(checkUser.getUserId(), token);
                    resp = "{\"userid\":\""+ checkUser.getUserId() +"\"," +
                            "\"token\" : \"" + token + "\"}";
                }
            }
            return resp;
        });

        get("/logout/:userid", (request, response) -> {

            response.type("application/json");

            String resp;
            long userId = Utilities.getIdFromString(request.params(":userid"));

            String token = request.headers("token");

            if(Utilities.checkValidSession(userId, token)){
                Store.getInstance().getUserTokenMap().remove(userId);
                resp = "{\"message\":\"User logged out Successfully.\"}";
            }else{
                response.status(400);
                resp = "{\"message\":\"Bad request\"}";
            }
            return resp;

        });

        post("/signup", (request, response) -> {
            response.type("application/json");

            String reqBody = request.body();
            String resp;
            User user = Utilities.loadUser(reqBody);

            if(user == null){
                response.status(400);
                resp = "{\"message\":\"Bad request\"}";
            }else{
                long userId = Store.getInstance().createUser(user);
                if(userId < 0){
                    response.status(403);
                    resp = "{\"message\":\"User already exist\"}";
                }
                else
                    resp = "{\"message\":\"User created Successfully\"}";
            }
            return resp;
        });

        get("/todo/:userid/list", (request, response) -> {

            response.type("application/json");
            String resp = "";

            long userId = Utilities.getIdFromString(request.params(":userid"));

            String token = request.headers("token");

            if(Utilities.checkValidSession(userId, token)){
                ObjectMapper objectMapper = new ObjectMapper();
                List<Todo> tdList= Store.getInstance().getUserTodoList(userId);
                if(tdList == null)
                    resp = "[]";
                else
                    resp = objectMapper.writeValueAsString(tdList);
            }else{
                response.status(400);
                resp = "{\"message\":\"Bad request\"}";
            }

            return resp;

        });

        post("/todo/:userid/create", (request, response) -> {
            response.type("application/json");
            String resp;

            long userId = Utilities.getIdFromString(request.params(":userid"));

            String token = request.headers("token");
            String reqBody = request.body();
            if(Utilities.checkValidSession(userId, token)){
                Todo td = Utilities.loadTodo(reqBody);
                Store.getInstance().createUserTodoItem(userId, td);
                resp = "{\"message\":\"Created Successfully\"}";

            }else{
                response.status(400);
                resp = "{\"message\":\"Bad request\"}";
            }

            return resp;
        });

        get("/todo/:userid/get/:todoid", (request, response) -> {
            response.type("application/json");
            String resp;

            long userId = Utilities.getIdFromString(request.params(":userid"));

            long tdId = Utilities.getIdFromString(request.params(":todoid"));

            String token = request.headers("token");

            if(Utilities.checkValidSession(userId, token)){
                ObjectMapper objectMapper = new ObjectMapper();
                Todo td = Store.getInstance().getUserToDoItem(userId, tdId);
                if(td == null) {
                    resp = "{}";
                } else {
                    resp = objectMapper.writeValueAsString(td);
                }
            }else{
                response.status(400);
                resp = "{\"message\":\"Bad request\"}";
            }

            return resp;
        });

        delete("/todo/:userid/delete/:todoid", (request, response) -> {
            response.type("application/json");
            String resp;

            long userId = Utilities.getIdFromString(request.params(":userid"));

            long tdId = Utilities.getIdFromString(request.params(":todoid"));

            String token = request.headers("token");

            if(Utilities.checkValidSession(userId, token)){
                boolean found = Store.getInstance().deleteUserTodoItem(userId, tdId);
                if(found) {
                    resp = "{\"message\":\"Deleted Successfully\"}";
                } else {
                    resp = "{\"message\":\"Item not found\"}";
                }
            }else{
                response.status(400);
                resp = "{\"message\":\"Bad request\"}";
            }

            return resp;
        });
    }

}
