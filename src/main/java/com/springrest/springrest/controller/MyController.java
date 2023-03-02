package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.model.Course;
import com.springrest.springrest.service.CourseService;

/**
 * RestController for handling the requests
 * @author Yogesh
 *
 */
@RestController
public class MyController {
	
	@Autowired
	public CourseService courseService;
	
	
	//get all courses
	@GetMapping("/courses")
	public List<Course> courses(){
		return this.courseService.getCourses();
	}
	
	//get particular course
	@GetMapping("/courses/{courseID}")
	public Course course(@PathVariable String courseID) {
		return this.courseService.getCourse(Long.parseLong(courseID));
	}
	
	//post the course
	@PostMapping(path="/courses", consumes = "application/json")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}
	
	//delete the course
	@DeleteMapping("/courses/{courseID}")
	public String deleteCourse(@PathVariable String courseID) {
		return this.courseService.deleteCourse(Long.parseLong(courseID));
	}
	
	//updating the course
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
	}
	
}
