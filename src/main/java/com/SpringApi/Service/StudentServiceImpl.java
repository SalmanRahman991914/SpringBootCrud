package com.SpringApi.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringApi.Dao.StudentDao;
import com.SpringApi.entities.Student;
@Service
public class StudentServiceImpl implements StudentService{
     @Autowired
	private StudentDao studentDao;
	
	 public StudentServiceImpl() {
		
	}
	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}
	@Override
	public Student addStudent(Student student) {
		
		studentDao.save(student);
		return student;
	}
	@Override
	public Student updateStudent(Student student) {
		
		studentDao.save(student);
		return student;
	}

}
