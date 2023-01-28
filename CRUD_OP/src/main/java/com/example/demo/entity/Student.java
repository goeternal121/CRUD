package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="student_tbl") 	

public class Student {
	@Id
	@GeneratedValue()
	private int id;
	private String name;
	private int age;
	private int mobile;
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
	
	public int getMobile() {
		return mobile;
	}
	
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}



}
