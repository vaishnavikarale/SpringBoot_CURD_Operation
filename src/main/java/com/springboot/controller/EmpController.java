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

import com.springboot.entities.Emp;
import com.springboot.repository.EmpRepo;

@RestController
public class EmpController {

	@Autowired
	EmpRepo er;
	
	@PostMapping("/saveemp")
	public String saveEmp(@RequestBody Emp e)
	{
		er.save(e);
		return "Data Saved!";
		
	}
	
	@PutMapping("/updateemp")
	public String updateEmp(@RequestBody Emp e)
	{
		er.save(e);
		return "Data updated!";
	}
	
	@DeleteMapping("/deleteemp")
	public String deleteEmp(@RequestParam int id)
	{
		er.deleteById(id);
		return "Data deleted";
	}
	@DeleteMapping("/delallemp")
	public String deleteAllEmp()
	{
		er.deleteAll();
		return "deleted All";
	}
	
	
	@GetMapping("/getsingledata")
	public Optional<Emp> getSingleData(@RequestParam int id)
	{
		Optional<Emp> o= er.findById(id);
		Emp e=o.get();
		return o;
	}
	
}
