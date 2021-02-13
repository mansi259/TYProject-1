package com.mansi.test.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class TeacherStandard 
{
	@Id
	@Column(length = 3,nullable = false)
	private int teacherStandardId;
	
	//add constarint below
	private Teacher teacherId;
	
	//add constraint below
	private Standard standardId;
	
	//add foreign key --> primary key of standard table

	
	//getters and setters
	public int getTeacherStandardId() 
	{
		return teacherStandardId;
	}

	public void setTeacherStandardId(int teacherStandardId) 
	{
		this.teacherStandardId = teacherStandardId;
	}
}
