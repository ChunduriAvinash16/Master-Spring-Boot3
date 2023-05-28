package com.learn.springboot.myfirstwebapp.todo;

import jakarta.validation.Valid;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.Optional;

@Controller
@SessionAttributes("name")
public class TodoControllerJPA {
    TodoRepository todoRepository;

    public TodoControllerJPA(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @RequestMapping("list-todos")
    public String listAlltodos(ModelMap model) {
        String username = getLoggedinUsername();
        model.put("todos", todoRepository.findByUsername(username));
        return "listTodos";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String addNewTodo(ModelMap map) {
        String username = getLoggedinUsername();
        map.put("todo", new Todo(0, username, "", LocalDate.now(), false));
        return "todo";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String addTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
        String username = getLoggedinUsername();
        if (result.hasErrors()) {
            return "todo";
        }
        todo.setUsername(username);
        todoRepository.save(todo);
        return "redirect:list-todos";
    }

    @RequestMapping("delete-todo")
    public String deleteTodo(@RequestParam int id) {
        todoRepository.deleteById(id);
        return "redirect:list-todos";
    }

    @RequestMapping(value = "update-todo", method = RequestMethod.GET)
    public String showupdateTodoPage(@RequestParam int id, ModelMap map) {
        Optional<Todo> todo = todoRepository.findById(id);
        map.addAttribute("todo", todo);
        return "todo";
    }

    @RequestMapping(value = "update-todo", method = RequestMethod.POST)
    public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
        if (result.hasErrors()) {
            return "todo";
        }
        todo.setUsername(getLoggedinUsername());
        todoRepository.save(todo);
        return "redirect:list-todos";
    }

    private String getLoggedinUsername() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }
}
