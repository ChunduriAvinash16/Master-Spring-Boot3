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

//@Controller
@SessionAttributes("name")
public class TodoController {

    TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("list-todos")
    public String listAlltodos(ModelMap model) {
        String username = getLoggedinUsername();
//        System.out.println(username);
        model.put("todos",todoService.getTodoByUsername(username));
        return  "listTodos";
    }

    @RequestMapping(value = "add-todo",method = RequestMethod.GET)
    public String addNewTodo(ModelMap map)  {
        String username = getLoggedinUsername();
        map.put("todo",new Todo(0, username,"",LocalDate.now(),false));
        return "todo";
    }

    @RequestMapping(value = "add-todo",method = RequestMethod.POST)
    public String addTodo(ModelMap model, @Valid Todo todo, BindingResult result)  {
        String username = getLoggedinUsername();
        if(result.hasErrors()) {
            return "todo";
        }
        todoService.addTodo(username,todo.getDescription(), todo.getTargetDate(),false);
        return "redirect:list-todos";
    }

    @RequestMapping("delete-todo")
    public String deleteTodo(@RequestParam int id) {
        todoService.deleteTodoById(id);
        return "redirect:list-todos";
    }

    @RequestMapping(value = "update-todo",method = RequestMethod.GET)
    public String showupdateTodoPage(@RequestParam int id,ModelMap map) {
        Todo todo = TodoService.findById(id);
        map.addAttribute("todo",todo);
        return "todo";
    }

    @RequestMapping(value = "update-todo",method = RequestMethod.POST)
    public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result)  {
        if(result.hasErrors()) {
            return "todo";
        }
        todo.setUsername(getLoggedinUsername());
        todoService.updateTodo(todo);
        return "redirect:list-todos";
    }

    private String getLoggedinUsername() {
        return SecurityContextHolder.getContext().getAuthentication().getName().toString();
    }
}
