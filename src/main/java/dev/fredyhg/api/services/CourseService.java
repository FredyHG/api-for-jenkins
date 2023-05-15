package dev.fredyhg.api.services;

import dev.fredyhg.api.models.Course;
import dev.fredyhg.api.repositories.CourseRepository;
import dev.fredyhg.api.requests.CoursePostRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public void createCourse(CoursePostRequest course){

        Course courseToBeSaved = Course.builder()
                .name(course.getName())
                .description(course.getDesc())
                .build();

        courseRepository.save(courseToBeSaved);
    }

    public List<Course> listAllCourses(){
        return courseRepository.findAll();
    }
}
