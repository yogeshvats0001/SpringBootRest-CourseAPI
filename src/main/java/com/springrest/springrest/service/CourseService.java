package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.model.Course;

public interface CourseService {
	public List<Course> getCourses();
	public Course getCourse(long courseID);
}
