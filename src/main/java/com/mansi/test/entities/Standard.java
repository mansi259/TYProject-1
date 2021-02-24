package com.mansi.test.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Component
@Entity
public class Standard 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 2,updatable = false)
	private int standardId;
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Division> division;
	
	//Add Constraint below
	@OneToMany(mappedBy = "standard",fetch = FetchType.LAZY)
	private List<Student> grNo; 
	
	//add
	@ManyToMany(mappedBy = "standard" ,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Subject> subject;
	
	@OneToMany(mappedBy = "standard",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Standard> timetable;
	
	@ManyToMany(mappedBy = "standard",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Teacher> teacher;
	
	@ManyToMany(mappedBy = "standard",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<StudyMaterial> studyMaterial;
	
	@OneToMany(mappedBy = "standard",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Result> result;
	
	@NotNull
	@Size(max = 2)
	@Column(length = 2,nullable = false)
	private int standardName;
	
	@NotNull
	@Size(max = 3)
	@Column(length = 3,nullable = false)
	private int noOfStudents;
	
	@NotNull
	@Size(max = 2)
	@Column(length = 2,nullable = false)
	private int noOfSubjects;

	//getters and setters
	

	

	
	
	
	
	
	
	
}
