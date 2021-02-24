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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Component
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"userName"}))
public class Teacher 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 2,updatable = false)
	private int teacherId;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Standard> standard;
	
	@ManyToMany(mappedBy = "teacher",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Subject> subject;
	
	@OneToMany(mappedBy = "teacher",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<TimeTable> timeTable;
	
	@NotNull
	@Size(max = 20)
	@Column(length = 20,nullable = false,unique = true)
	// i had defined unique constraint of this above in @Table notation.
	private String userName;
	
	@NotNull
	@Size(min = 8,max = 15)
	@Column(length = 15,nullable = false)
	private String password;
	
	@NotNull
	@Size(max = 50)
	@Column(length = 50,nullable = false)
	private String teacherName;
	
	@NotNull
	@Size(max = 6)
	@Column(length = 6,nullable = false)
	private String gender;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date joiningDate;
	
	@NotNull
	@Size(max = 40)
	@Column(length = 40,nullable = false)
	private String qualification;
	
	@NotNull
	@Size(max = 40)
	@Column(length = 40,nullable = false)
	private String emailId;
	
	@NotNull
	@Size(max = 10)
	@Column(length = 10,nullable = false)
	private String contactno;
	
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
	
	@NotNull
	@Size(max = 255)
	@Column(length = 255,nullable = false)
	private String image;

		
}
