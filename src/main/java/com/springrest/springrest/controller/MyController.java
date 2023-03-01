package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.model.Course;
import com.springrest.springrest.service.CourseService;

@RestController
public class MyController {
	
	@Autowired
	public CourseService courseService;
	
	@GetMapping("/courses")
	public List<Course> courses(){
		return this.courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseID}")
	public Course course(@PathVariable String courseID) {
		return this.courseService.getCourse(Long.parseLong(courseID));
	}
}
