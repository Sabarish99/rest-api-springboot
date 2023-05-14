package com.springboot.com.restapispringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@RestController
public class RestEndpoint {

    @RequestMapping("/")
    public String hello() {
        return "Hi User";
    }

    @RequestMapping("/courses")
    public List<Courses> getAllCourses()
    {
        return Arrays.asList(new Courses(1,"Learn Kafka", "Sabarish"),
                new Courses(2,"Learn Streams", "Sabarish_New"));
    }
}

