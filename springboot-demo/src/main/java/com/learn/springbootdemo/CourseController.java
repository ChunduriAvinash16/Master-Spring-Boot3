package com.learn.springbootdemo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retriveAllCourses() {
        return Arrays.asList(
                new Course(1,"AWS","learn"),
                new Course(2,"GCP","learn"),
                new Course(3,"Azure","learn")

        );
    }
}
