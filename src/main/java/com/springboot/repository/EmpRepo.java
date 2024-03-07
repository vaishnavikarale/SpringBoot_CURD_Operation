package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entities.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer>{

}
