package utilities;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.store.Store;
import model.todo.Todo;
import model.user.User;

import java.io.IOException;

public  class Utilities {


    public static User loadUser(String reqBody){
        ObjectMapper mapper = new ObjectMapper();

        User user = null;
        try{
            user = mapper.readValue(reqBody, User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return user;
    }

    public static Todo loadTodo(String reqBody){
        ObjectMapper mapper = new ObjectMapper();

        Todo todo = null;
        try{
            todo = mapper.readValue(reqBody, Todo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return todo;
    }

    public static boolean checkValidSession(long userId, String token){
        boolean flag = false;
        if(Store.getInstance().getUserTokenMap().get(userId) != null){
            if(token.equals(Store.getInstance().getUserTokenMap().get(userId))) {
                flag = true;
            }
        }
        return flag;
    }

    public static long getIdFromString(String id){
        long uId = -1;

        try{
            uId = Long.parseLong(id);
        }catch(NumberFormatException e){
            e.printStackTrace();
        }

        return uId;
    }
}
