package com.learn.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloworldContorller {

    @RequestMapping(method = RequestMethod.GET,value="/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    //Path parameters.
    @GetMapping(path="/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldBeanPathParameter(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World %s",name));
    }
}
