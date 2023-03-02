package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.model.Course;

public interface CourseService {
	public List<Course> getCourses();
	public Course getCourse(long courseID);
	public Course addCourse(Course course);
	public String deleteCourse(long courseID);
	public Course updateCourse(Course course);
}
