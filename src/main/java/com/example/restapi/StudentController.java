package com.example.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
public class StudentController {
	
	private List<String> students = new ArrayList<>(); 
	
	@GetMapping("/students")
	public List<String> getAllStudents(){
		
		return students;
	}
	
	@PostMapping("/students/add")
	@ResponseStatus(code =  HttpStatus.CREATED)
    public List<String> addStudent(@RequestBody String name) {
        students.add(name);
        return students;
    }
	
	@PutMapping("students/{id}")
	public String putMethodName(@PathVariable String id, @RequestBody String entity) {
		//TODO: process PUT request
		
		return entity;
	}

}
