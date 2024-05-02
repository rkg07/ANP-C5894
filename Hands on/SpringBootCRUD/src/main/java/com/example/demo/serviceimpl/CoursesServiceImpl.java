package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Courses;
import com.example.demo.entity.Teacher;
import com.example.demo.exception.CoursesIdNotFoundException;
import com.example.demo.exception.TeacherIdNotFoundException;
import com.example.demo.respository.CoursesRespository;
import com.example.demo.service.CoursesService;

//business logic(CRUD Implementation) of entity teacher
@Service
public class CoursesServiceImpl implements CoursesService{
	
	@Autowired
	CoursesRespository trepo;

	@Override
	public Courses addCourses(Courses courses) {
		// TODO Auto-generated method stub
		return trepo.save(courses);
	}

	@Override
	public Courses getCoursesDetail(int cid) {
		// TODO Auto-generated method stub
		return trepo.findById(cid).
		         orElseThrow(()-> new CoursesIdNotFoundException("Courses Id is not correct"));
	}

	@Override
	public Courses updateCoursesDetail(Courses courses, int cid) {
		// TODO Auto-generated method stub
		Courses updatedCourses = trepo.findById(cid).
		         orElseThrow(()-> new CoursesIdNotFoundException("Courses Id is not correct"));

		//set new values
		updatedCourses.setDuration(courses.getDuration());
		
		
		trepo.save(updatedCourses); //saving updated details 
			return updatedCourses; 
	}

	@Override
	public void deleteCoursesDetail(int cid) {
		// TODO Auto-generated method stub
		trepo.findById(cid).
		orElseThrow(()-> new CoursesIdNotFoundException("Courses Id is not correct"));
	    trepo.deleteById(cid);
	}

	

}

