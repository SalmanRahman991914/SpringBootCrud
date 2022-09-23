package com.SpringApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringApi.Service.StudentService;
import com.SpringApi.entities.Student;

@RestController
public class MyController {
	@Autowired
	private StudentService studentService;
@GetMapping("/home")
	public String home() {
		
		return "this is home controller";
	}
	@GetMapping("/student")
public List<Student> getStudent(){
	return this.studentService.getStudent();
	
}
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return this.studentService.addStudent(student);
		
	}
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student) {
		return this.studentService.updateStudent(student);
	}
}
