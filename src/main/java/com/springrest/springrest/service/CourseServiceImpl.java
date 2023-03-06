package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.model.Course;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao courseDao;
//	List<Course> list;
//	
//	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(123, "Java", "Springboot in the backend"));
//		list.add(new Course(234, "Python", "Django is the backend"));
//	}
	
	@Override
	public List<Course> getCourses(){
//		return list;
		return courseDao.findAll();
	}
	
	@Override
	public Course getCourse(long courseID) {
//		Course c = null;
//		for(Course course : list) {
//			if(course.getId() == courseID) {
//				c = course;
//			}
//		}
//		return c;
		return courseDao.getOne(courseID);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
//		return course;
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseID) {
//		for(int i=0; i<list.size(); i++) {
//			if(list.get(i).getId() == courseID) {
//				list.remove(i);
//				return "Removal Done";
//			}
//		}
//		return null;
		@SuppressWarnings("deprecation")
		Course entity = courseDao.getOne(courseID);
		courseDao.delete(entity);
	}

	@Override
	public Course updateCourse(Course course) {
//		for(int i=0; i<list.size(); i++) {
//			if(list.get(i).getId() == course.getId()) {
//				list.set(i, course);
//				return course;
//			}
//		}
//		return null;
		courseDao.save(course);
		return course;
		
	}
}
