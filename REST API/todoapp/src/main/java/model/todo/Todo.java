package model.todo;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Todo {

    private long todoId = -1;
    private String title = "";
    private String desc = "";
    private Date created;

    public Todo(int todoId, String title, String desc) {
        this.todoId = todoId;
        this.title = title;
        this.desc = desc;
        this.created = new Date();
    }

    @JsonCreator
    public Todo(@JsonProperty("title") String title, @JsonProperty("desc") String desc){
        this.title = title;
        this.desc = desc;
        this.created = new Date();

    }
    public long getTodoId() {
        return todoId;
    }

    public void setTodoId(int todoId) {
        this.todoId = todoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getCreated() {
        return created;
    }

}
