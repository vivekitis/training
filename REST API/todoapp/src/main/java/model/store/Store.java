package model.store;

import model.todo.Todo;
import model.user.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {

    private static Store instance = null;

    private long userId = 0;
    private int todoId = 0;
    private Map<String,User> accounts = null;
    private Map<Long, List<Todo>> userTodoList = null;
    private Map<Long, String> userToken = null;


    private Store(){
        accounts = new HashMap<String,User>();
        userTodoList = new HashMap<Long, List<Todo>>();
        userToken = new HashMap<Long, String>();
    }

    public static Store getInstance(){
        if(instance == null){
            instance = new Store();
        }

        return instance;
    }

    public Map<String, User> getAccounts() {
        return accounts;
    }

    public Map<Long, List<Todo>> getUserTodoList() {
        return userTodoList;
    }

    public Map<Long, String> getUserTokenMap(){
        return userToken;
    }

    public long createUser(User u){

        long id = -1;
        if(!accounts.containsKey(u.getUserName())){
            u.setUserId(++userId);
            accounts.put(u.getUserName(), u);
            id = userId;
        }

        return id;
    }

    public User findUser(String username){
        return accounts.get(username);
    }

    public List<Todo> getUserTodoList(long userId){
        return userTodoList.get(userId);
    }

    public void createUserTodoItem(long userId, Todo item){

        List<Todo> list = getUserTodoList(userId);
        if(list == null) {
            list = new ArrayList<Todo>();
        }
        item.setTodoId(++todoId);
        list.add(item);
        userTodoList.put(userId,list);

    }

    public boolean deleteUserTodoItem(long userId, long todoId){
        List<Todo> list = getUserTodoList(userId);
        boolean found = false;
        int index = -1;
        for(Todo td : list){
            index++;
            if(td.getTodoId() == todoId){
                found = true;
                break;
            }
        }

        if(index>-1 && found) {
            list.remove(index);
        }

        return found;
    }

    public Todo getUserToDoItem(long userId, long todoId){
        List<Todo> list = getUserTodoList(userId);
        Todo item = null;
        for(Todo td : list){
            if(td.getTodoId() == todoId){
                item = td;
                break;
            }
        }

        return item;
    }
}
