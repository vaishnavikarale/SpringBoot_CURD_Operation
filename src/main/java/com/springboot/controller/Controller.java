package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entities.Student;
import com.springboot.repository.StudentRepository;


@RestController //used to convert resp to json & and handle the request
public class Controller {
	@Autowired // used for automatic dependency injection
	StudentRepository sr;

	@PostMapping("/savestudent")
	public String saveStudent(@RequestBody Student s) // convert json to java object
	{
		sr.save(s);
		return "Data saved!";
	}

	@GetMapping("/fetchid")
	public Student getStudentById(@RequestParam int id) //used to fetch data from url
	{
		Optional<Student> o = sr.findById(id);
		Student student = o.get();
		return student;
	}
		
	@GetMapping("/fetchname")
	public List<Student> findByName(@RequestParam String name)
		{
			List<Student> o=sr.findByName(name);
			return o;
		}
	@GetMapping("/fetchlessthan")
	public List<Student> findByAgeLessThan(@RequestParam int  age)
		{
			List<Student> o=sr.findByAgeLessThan(age);
			return o;
		}
	@GetMapping("/fetchgreaterthan")
	public List<Student> findByAgeGreaterThan(@RequestParam int  age)
		{
			List<Student> o=sr.findByAgeGreaterThan(age);
			return o;
		}
	@GetMapping("/fetchagebet")
	public List<Student> findByAgeBetween(@RequestParam int age1 ,@RequestParam int age2)
		{
			List<Student> o=sr.findByAgeBetween( age1,age2);
			return o;
		}
	@GetMapping("/fetchageequals")
	public List<Student> findByAgeEqual(@RequestParam int age )
		{
			List<Student> o=sr.findByAgeEquals(age);
			return o;
		}
	@GetMapping("/fetchagegreaterequals")
	public List<Student> findByAgeGreaterThanEquals(@RequestParam int age)
		{
			List<Student> o=sr.findByAgeGreaterThanEqual(age);
			return o;
		}
	@GetMapping("/fetchagelessthanequals")
	public List<Student> findByAgeLessThanEquals(@RequestParam int age)
		{
			List<Student> o=sr.findByAgeGreaterThanEqual(age);
			return o;
		}
	@DeleteMapping("/deletedata")
	public String delete(@RequestParam int id) {
		sr.deleteById(id);
		return "Data deleted!";
	}

	@PutMapping("/update")
	public String updateStudent(@RequestBody Student s) 
	{
		sr.save(s);
		return "Data Updated!";
	}

}