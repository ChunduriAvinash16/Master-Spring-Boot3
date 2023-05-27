package com.learn.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    private static int todoCounter = 0;

    static {
        todos.add(new Todo(++todoCounter, "learn", "Learn AWS from Udemy",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todoCounter, "learn", "Learn FullStack development",
                LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todoCounter, "learn", "Learn GCP from Webinars",
                LocalDate.now().plusMonths(4), false));
    }

    public List<Todo> getTodoByUsername(String name) {
        return todos;
    }

    public void addTodo(String username,String description,LocalDate targetData,boolean done) {
        Todo todo = new Todo(++todoCounter,username,description,targetData,done);
        todos.add(todo);
    }

    public void deleteTodoById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public static Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        return todos.stream().filter(predicate).findFirst().get();
    }

    public void updateTodo(Todo todo) {
        deleteTodoById(todo.getId());
        todos.add(todo);
    }
}
