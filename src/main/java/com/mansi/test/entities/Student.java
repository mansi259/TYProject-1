package com.mansi.test.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Component
@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 7,updatable = false)
	private int grNo;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Standard standard;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Parent parent;
	
	@ManyToMany(mappedBy = "student",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Activity> activity;
	
	@OneToMany(mappedBy = "student",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Attendance> attendance;
	
	@OneToMany(mappedBy = "student",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<FeePayment> feePayment;
	
	@OneToMany(mappedBy = "student",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Result> result;
	
	@NotNull
	@Size(max = 20)
	@Column(length = 20,nullable = false)
	private String firstName;
	
	@NotNull
	@Size(max = 20)
	@Column(length = 20,nullable = false)
	private String middleName;
	
	@NotNull
	@Size(max = 20)
	@Column(length = 20,nullable = false)
	private String lastName;
	
	@NotNull
	@Size(max = 20)
	@Column(length = 20,nullable = false)
	private String motherName;
	
	@NotNull
	@Size(max = 20)
	@Column(length = 20,nullable = false)
	private String fatherName;
	
	@NotNull
	@Size(max=2)
	@Column(length = 2,nullable = false)
	private int rollNo;
	
	@NotNull
	@Size(max = 10)
	@Column(length = 10,nullable = false)
	private String division;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date admissionDate;
	
	@NotNull
	@Size(max = 7)
	@Column(length = 7,nullable = false)
	private String stream;
	
	@NotNull
	@Size(max = 8)
	@Column(length = 8,nullable = false)
	private String medium;
	
	@NotNull
	@Size(max = 10)
	@Column(length = 10,nullable = false)
	private String religion;
	
	@NotNull
	@Size(max = 10)
	@Column(length = 10,nullable = false)
	private String subCaste;
	
	@NotNull
	@Size(max = 5)
	@Column(length = 5,nullable = false)
	private String category;
	
	@NotNull
	@Size(max = 6)
	@Column(length = 6,nullable = false)
	private String gender;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date dateOfBirth;
	
	@Size(max = 3)
	@Column(length = 3)
	private String bloodGroup;
	
	@NotNull
	@Size(max = 100)
	@Column(length = 100,nullable = false)
	private String address1;
	
	@NotNull
	@Size(max = 100)
	@Column(length = 100,nullable = false)
	private String address2;
	
	@NotNull
	@Size(max = 6)
	@Column(length = 6,nullable = false)
	private int pincode;
	
	@Size(max = 50)
	@Column(length = 50)
	private String previousSchoolName;
	
	@NotNull
	@Size(max = 255)
	@Column(length = 255,nullable = false)
	private String image;
	
	//getters and setters
}
