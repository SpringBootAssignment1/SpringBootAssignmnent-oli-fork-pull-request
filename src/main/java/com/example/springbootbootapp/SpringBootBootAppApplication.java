package com.example.springbootbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
@RestController
public class SpringBootBootAppApplication {


    public static void main(String[] args) {

        SpringApplication.run(SpringBootBootAppApplication.class, args);


    }

    @GetMapping("/Courses")
    public String getCourses(@RequestParam(value = "courseName", defaultValue = " This course doesn't exist") String name) {
        return FoundationCourses(name) + "<br>" +
                undergraduateCourse(name) + "<br>" +
                HonoursCourses(name);
    }

    @GetMapping("/foundationCourse")
    private String FoundationCourses(@RequestParam(value = "courseName", defaultValue = " ") String name) {
        List<String> FoundationCourses = new ArrayList<>();
        FoundationCourses.add("Computer Literacy for Science (F)");
        FoundationCourses.add("Advanced Computer Programming (F)");

        return String.format("These are 2 Foundation courses offered in the Computer Science Department  %s!: ", name);

    }

    @GetMapping("/undergraduateCourse")

    private String undergraduateCourse(@RequestParam(value = "courseName", defaultValue = " ") String name) {

        List<String> undergraduateCourse = new ArrayList<>();
        undergraduateCourse.add("Advanced Programming");
        undergraduateCourse.add("Computer Architecture and Organisation");
        undergraduateCourse.add("Software Engineering");
        undergraduateCourse.add("Operating Systems");
        undergraduateCourse.add("Computer Networks");
        return String.format("5 Undergraduate courses offered in the Computer Science Department %s!", name);

    }

    @GetMapping("/honoursCourse")
    private String HonoursCourses(@RequestParam(value = "courseName", defaultValue = " ") String name) {
        List<String> HonoursCourses = new ArrayList<>();
        HonoursCourses.add("Advanced Java Programming");
        HonoursCourses.add("Mini Project");
        HonoursCourses.add("Intelligent Systems");
        HonoursCourses.add("Distributed Web Computing");
        return String.format("4 Honours courses offered in the Computer Science Department %s!", name);

    }
}