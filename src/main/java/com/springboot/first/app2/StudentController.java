package com.springboot.first.app2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/student")
	public Student getStudent() {
		return new Student("zaid","khan");
	}
	
	@GetMapping("/students")
	 public List<Student> getStudents(){
     
		 List<Student> students = new ArrayList<>();
		 students.add(new Student("zaid","khan"));
		 students.add(new Student("zaid","shaikh"));
		 students.add(new Student("faheem","khan"));
		 students.add(new Student("hashim","khan"));
		 students.add(new Student("siddi","khan"));
		 return students;
	 }
}
