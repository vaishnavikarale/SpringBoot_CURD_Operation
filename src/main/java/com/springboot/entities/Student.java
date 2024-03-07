package com.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //  used at the class level and marks the class as a persistent entity
public class Student {
@Id //used to provide primary key to attribute
int id;
String name;
int age;
int yop;
//getter setter
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getYop() {
	return yop;
}
public void setYop(int yop) {
	this.yop = yop;
}
}