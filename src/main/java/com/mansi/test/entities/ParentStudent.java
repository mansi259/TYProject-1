package com.mansi.test.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

//@Component
@Entity
public class ParentStudent 
{
	@Id
	@Column(length = 5,nullable = false)
	private int parentStudentId;

	
	//add constarint here 
	private Parent parentId;
	
	//add Constarint in below
	private Student grNo;
		
	
	//getters and setters
	public int getParentStudentId() 
	{
		return parentStudentId;
	}

	public void setParentStudentId(int parentStudentId)
	{
		this.parentStudentId = parentStudentId;
	}
	
	//create paramererized , defaul constructor and toString Method.
}
