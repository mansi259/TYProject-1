package com.mansi.test.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Component
@Entity
public class Result 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 5,updatable = false)
	private int resultId;
	
	//Add Constraint
	@ManyToOne(fetch = FetchType.LAZY)
	private Student grNo;
	
	//Add Constraint
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Division> division;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Standard standard;
	
	//Add Constraint
	@ManyToOne(fetch = FetchType.LAZY)
	private ExamType examtype;
	
	@NotNull
	@Size(max = 7)
	@Column(length = 7,nullable = false)
	private String year;

	@Size(min = 1,max = 3)
	@Column(length = 3)
	private int gujarati;
	
	@Size(min = 1,max = 3)
	@Column(length = 3)
	private int english;
	
	@Size(min = 1,max = 3)
	@Column(length = 3)
	private int environment;
	
	@Size(min = 1,max = 3)
	@Column(length = 3)
	private int science;
	
	@Size(min = 1,max = 3)
	@Column(length = 3)
	private int socialscience;
	
	@Size(min = 1,max = 3)
	@Column(length = 3)
	private int maths;
	
	@Size(min = 1,max = 3)
	@Column(length = 3)
	private int hindi;
	
	@Size(min = 1,max = 3)
	@Column(length = 3)
	private int sanskrit;
	
	@Size(min = 1,max = 3)
	@Column(length = 3)
	private int pt;
	
	@Size(min = 1,max = 3)
	@Column(length = 3)
	private int drawing;
	
	@Size(min = 1,max = 3)
	@Column(length = 3)
	private int pathmala;
	
	@NotNull
	@Size(min = 1,max = 3)
	@Column(length = 3,nullable = false)
	private int obtainedMarks;
	
	@NotNull
	@Size(max = 2)
	@Column(length = 2,nullable = false)
	private int passingmMarks;
	
	@NotNull
	@Size(max = 3)
	@Column(length = 3,nullable = false)
	private int totalMarks;
	
	@NotNull
	@Size(max = 2)
	@Column(length = 2,nullable = false)
	private String grade;

	
	
}
