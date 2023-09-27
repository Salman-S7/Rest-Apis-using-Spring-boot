package com.jsonRestApi.ReadAndParseJsonData.get;

public class Todos {
    private long id;
    private String todo;
    private boolean completed;
    private long userId;


    public Todos() {
    }

    public Todos(long id, String todo, boolean completed, long userId) {
        this.id = id;
        this.todo = todo;
        this.completed = completed;
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
