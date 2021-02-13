package com.mansi.test.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

//@Component
@Entity
public class Standard 
{
	@Id
	@Column(length = 2,nullable = false)
	private int standardId;
	
	@Column(length = 2,nullable = false)
	@Size(min = 1,max = 2)
	@NotNull
	private int standardName;
	
	@Column(length = 3,nullable = false)
	@Size(min = 2,max = 3)
	@NotNull
	private int noOfStudents;
	
	@Column(length = 2,nullable = false)
	@Size(min = 1,max = 2)
	@NotNull
	private int noOfSubjects;
	
	//getters and setters
	public int getStandardId() 
	{
		return standardId;
	}

	public void setStandardId(int standardId)
	{
		this.standardId = standardId;
	}

	public int getStandardName() 
	{
		return standardName;
	}

	public void setStandardName(int standardName) 
	{
		this.standardName = standardName;
	}

	public int getNoOfStudents() 
	{
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) 
	{
		this.noOfStudents = noOfStudents;
	}

	public int getNoOfSubjects() 
	{
		return noOfSubjects;
	}

	public void setNoOfSubjects(int noOfSubjects)
	{
		this.noOfSubjects = noOfSubjects;
	}

	//parameterized constructor
	public Standard(int standardId, int standardName, int noOfStudents, int noOfSubjects)
	{
		super();
		this.standardId = standardId;
		this.standardName = standardName;
		this.noOfStudents = noOfStudents;
		this.noOfSubjects = noOfSubjects;
	}

	//default constructor
	public Standard() {
		super();
		// TODO Auto-generated constructor stub
	}

	//tostring method
	@Override
	public String toString() {
		return "Standard [standardId=" + standardId + ", standardName=" + standardName + ", noOfStudents="
				+ noOfStudents + ", noOfSubjects=" + noOfSubjects + "]";
	}
	
	
	
}
