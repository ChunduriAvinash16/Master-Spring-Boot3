package com.learn.rest.webservices.restfulwebservices.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    private UserDaoService userDaoService;

    public UserController(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }
    @GetMapping("/users")
    public List<User> retriveAllUsers(){
        return userDaoService.findAll();
    }

    @GetMapping("/users/{id}")
    public User retriveUser(@PathVariable Integer id) {
        User user = userDaoService.findOne(id);
        if(user == null)
            throw new UserNotFoundException("Id:"+id);
        return user;
    }

    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        User saveduser = userDaoService.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                 .path("/{id}")
                 .buildAndExpand(user.getId())
                 .toUri();
        return ResponseEntity.created(location).build();
    }
}
