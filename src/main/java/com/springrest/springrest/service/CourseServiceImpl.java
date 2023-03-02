package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.model.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(123, "Java", "Springboot in the backend"));
		list.add(new Course(234, "Python", "Django is the backend"));
	}
	
	@Override
	public List<Course> getCourses(){
		return list;
	}
	
	@Override
	public Course getCourse(long courseID) {
		Course c = null;
		for(Course course : list) {
			if(course.getId() == courseID) {
				c = course;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public String deleteCourse(long courseID) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId() == courseID) {
				list.remove(i);
				return "Removal Done";
			}
		}
		return null;
	}

	@Override
	public Course updateCourse(Course course) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId() == course.getId()) {
				list.set(i, course);
				return course;
			}
		}
		return null;
	}
}
