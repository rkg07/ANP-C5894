package com.example.demo.service;


import com.example.demo.entity.Courses;

public interface CoursesService
{
    Courses addCourses(Courses courses);
	
	//method to fetch teacher detail based on tid from db table
    Courses getCoursesDetail(int cid);
	
	//method to modify teacher detail based on tid from db table
    Courses updateCoursesDetail(Courses courses, int cid);
	
	//method to remove teacher detail based on tid from db table
	void deleteCoursesDetail(int cid);
}
