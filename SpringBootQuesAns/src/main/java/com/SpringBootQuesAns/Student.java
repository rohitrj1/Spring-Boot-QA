package com.SpringBootQuesAns;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String item;
	public Student(Integer id, String item) {
		super();
		this.id = id;
		this.item = item;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
	

}
