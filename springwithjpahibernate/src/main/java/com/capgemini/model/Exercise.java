package com.capgemini.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
public class Exercise {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Range(min = 1, max = 120)
	private int minutes;

	@NotNull
	private String activity;

	public String getActivity() {
		return activity;
	}
	
	public Long getId() {
		return id;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
}
