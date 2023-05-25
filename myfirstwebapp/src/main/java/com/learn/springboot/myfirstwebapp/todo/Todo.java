package com.learn.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

public class Todo {
    private int id;
    private String username;
    private String description;
    private LocalDate target;
    private Boolean done;

    public Todo(int id, String username, String description, LocalDate target, Boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.target = target;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTarget() {
        return target;
    }

    public void setTarget(LocalDate target) {
        this.target = target;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" + "id=" + id + ", username='" + username + '\'' + ", description='" + description + '\'' + ", target=" + target + ", done=" + done + '}';
    }
}
 