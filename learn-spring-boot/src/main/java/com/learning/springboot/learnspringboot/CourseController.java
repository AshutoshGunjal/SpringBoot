package com.learning.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class CourseController {
//Course URL - "http://localhost:8080/courses"
//Course: ID, Name, Author
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourse() {
        return Arrays.asList(
                new Course(1, "Learn Spring", "Tom Cruise"),
                new Course(2, "Learn Java", "Matt Bryan")
        );
    }
}
