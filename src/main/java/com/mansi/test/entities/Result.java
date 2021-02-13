package com.mansi.test.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

//@Component
@Entity
public class Result {
	
	@Id
	@Column(length = 5,nullable = false)
	private int resultId;
	
	//Add Constraint
	private Student grNo;
	
	//Add Constraint
	private Division divisionId;
	
	//Add Constraint
	private ExamType examtype_id;
	
	@Column(length = 7,nullable = false)
	@Size(max = 7)
	@NotNull
	private String year;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int gujarati;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int english;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int environment;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int science;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int socialscience;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int maths;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int hindi;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int sanskrit;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int pt;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int drawing;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int pathmala;
	
	@Column(length = 3,nullable = false)
	@Size(min = 1,max = 3)
	@NotNull
	private int obtainedMarks;
	
	@Column(length = 2,nullable = false)
	@Size(max = 2)
	@NotNull
	private int passingmMarks;
	
	@Column(length = 3,nullable = false)
	@Size(max = 3)
	@NotNull
	private int totalMarks;
	
	@Column(length = 2,nullable = false)
	@Size(max = 2)
	@NotNull
	private String grade;
}
