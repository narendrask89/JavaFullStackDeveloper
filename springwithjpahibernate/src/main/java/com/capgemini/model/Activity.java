package com.capgemini.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Activity {

	@Id
	@GeneratedValue
	private Long id;
	
	private String desc;

	public String getDesc() {
		return desc;
	}

	public Long getId() {
		return id;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
