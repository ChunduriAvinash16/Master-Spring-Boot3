package com.learn.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "learn", "Learn AWS",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "learn", "Learn Azure",
                LocalDate.now().plusYears(2), false));
        todos.add(new Todo(3, "learn", "Learn GCP",
                LocalDate.now().plusMonths(4), false));
    }

    public List<Todo> getTodoByUsername(String name) {
        return todos;
    }
}
