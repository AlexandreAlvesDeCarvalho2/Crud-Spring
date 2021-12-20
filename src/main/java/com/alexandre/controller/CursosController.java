package com.alexandre.controller;

import java.util.List;

import com.alexandre.model.Course;
import com.alexandre.repository.CourseRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;





@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CursosController {


    private final CourseRepository courseRepository;

    @GetMapping
    public List<Course> list(){
        return courseRepository.findAll();
    }
}
