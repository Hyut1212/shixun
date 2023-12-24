package com.example.demo.service;

import com.example.demo.dto.CourseDTO;
import com.example.demo.enity.Course;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {
    boolean addCourse(CourseDTO courseDTO);
    PageInfo<Course> findCourseByName(Integer page, Integer limit, String
            courseName, String teacherName);
    boolean deleteCourse(Long id);
}

