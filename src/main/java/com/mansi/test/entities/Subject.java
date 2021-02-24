package com.mansi.test.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Subject 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 2,updatable = false)
	private int subjectId;
	
	//add constraint below
	@ManyToMany(fetch = FetchType.LAZY)
	private Standard standard;
	
	//add constraint below
	@ManyToMany(fetch = FetchType.LAZY)
	private Teacher teacher;
	
	@Column(length = 15,nullable = false)
	@Size(min = 2,max = 15)
	@NotNull
	private String subjectName;

	
	//getters and setters
	}
