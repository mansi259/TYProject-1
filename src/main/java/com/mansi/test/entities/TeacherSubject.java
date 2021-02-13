package com.mansi.test.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class TeacherSubject 
{
	@Id
	@Column(length = 3,nullable = false)
	private int teacherSubjectId;
	
	//add Constraint below
	private Teacher teacherId;
	
	//add Constraint below
	private Subject subjectId;

	public int getTeacherSubjectId()
	{
		return teacherSubjectId;
	}

	public void setTeacherSubjectId(int teacherSubjectId)
	{
		this.teacherSubjectId = teacherSubjectId;
	}
	
	
}
