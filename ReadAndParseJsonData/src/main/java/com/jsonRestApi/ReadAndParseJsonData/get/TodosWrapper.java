package com.jsonRestApi.ReadAndParseJsonData.get;

import java.util.List;

public class TodosWrapper {
    private List<Todos> todos;
    private int total;
    private int skip;
    private int limit;

    public TodosWrapper() {
    }

    public TodosWrapper(List<Todos> todos, int total, int skip, int limit) {
        this.todos = todos;
        this.total = total;
        this.skip = skip;
        this.limit = limit;
    }

    public List<Todos> getTodos() {
        return todos;
    }

    public void setTodos(List<Todos> todos) {
        this.todos = todos;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
