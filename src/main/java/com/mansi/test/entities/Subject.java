package com.mansi.test.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Subject 
{
	@Id
	@Column(length = 2,nullable = false)
	private int subjectId;
	
	//add constraint below
	private Standard standardId;
	
	//add constraint below
	private TeacherSubject teacherSubjectId;
	
	@Column(length = 15,nullable = false)
	@Size(min = 2,max = 15)
	@NotNull
	private String subjectName;

	
	//getters and setters
	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	
}
