package dev.fredyhg.api.controllers;

import dev.fredyhg.api.models.Course;
import dev.fredyhg.api.requests.CoursePostRequest;
import dev.fredyhg.api.services.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @GetMapping
    public ResponseEntity<List<Course>> list(){
        return ResponseEntity.status(HttpStatus.OK).body(courseService.listAllCourses());
    }

    @PostMapping
    public ResponseEntity<String> createCourse(@RequestBody CoursePostRequest course){
        return ResponseEntity.status(HttpStatus.CREATED).body("Course created successfully");
    }

}
