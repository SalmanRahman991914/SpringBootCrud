package com.SpringApi.Service;

import java.util.List;

import com.SpringApi.entities.Student;

public interface StudentService {


public List<Student> getStudent();
public Student addStudent(Student student);
public Student updateStudent(Student student);

}
