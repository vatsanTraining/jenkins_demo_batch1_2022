package com.example.demo.controllers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class TeacherController {

	
	@GetMapping(path = "/teachers")
	public String getTeachers() {
		
	  List<String> list =Arrays.asList("Amar","Akbar","Anthony");
	 
	   return list.toString();
	}
	
	
	@GetMapping(path = "/teachers/{dept}")
	public String getTeachersByDept(@PathVariable("dept") String dept) {
		
	  List<String> list =Arrays.asList("Amar","Akbar","Anthony");
	 
	  if(dept.equals("ece")) {
		  list = Arrays.asList("Shankar","Salim","Simon");
	  }
	   return list.toString();
	}

	
	@GetMapping(path = "/teachers/{id}")
	public String getTeachersById(@PathVariable("id") int id) {
		
	 
	   return "Best Teacher";
	}
	
	
	@PostMapping(path = "/teachers/{id}")
	public String addTeacher(@RequestBody String teacher) {
		
	 
	   return "Best Teacher";
	}
}

