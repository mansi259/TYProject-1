package com.mansi.test.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

//@Component
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"userName"}))
public class Teacher 
{
	@Id
	@Column(length = 2,nullable = false)
	private int teacherId;
	
	//add constraint in below
	private TeacherSubject teacherSubjectId;
	
	//add constraint in below
	private TeacherStandard teacherStandardId;
	
	@Column(length = 20,nullable = false,unique = true)
	@Size(min = 4,max = 20)
	// i had defined unique constraint of this above in @Table notation.
	@NotNull
	private String userName;
	
	@Column(length = 15,nullable = false)
	@Size(min = 8,max = 15)
	@NotNull
	private String password;
	
	@Column(length = 50,nullable = false)
	@Size(max = 50)
	@NotNull
	private String teacherName;
	
	@Column(length = 6,nullable = false)
	@Size(min = 4,max = 6)
	@NotNull
	private String gender;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	@NotNull
	private Date joiningDate;
	
	@Column(length = 40,nullable = false)
	@Size(max = 40)
	@NotNull
	private String qualification;
	
	@Column(length = 40,nullable = false)
	@Size(max = 40)
	@NotNull
	private String emailId;
	
	@Column(length = 10,nullable = false)
	@Size(min = 10,max = 10)
	@NotNull
	private String contactno;
	
	@Column(length = 100,nullable = false)
	@Size(max = 100)
	@NotNull
	private String address1;
	
	@Column(length = 100,nullable = false)
	@Size(max = 100)
	@NotNull
	private String address2;
	
	@Column(length = 6,nullable = false)
	@Size(min = 6,max = 6)
	@NotNull
	private int pincode;
	
	//create column of storing path of image
	@Column(length = 255,nullable = false)
	@Size(max = 255)
	@NotNull
	private String image;
	
	//getters and setters
	public int getTeacherId() 
	{
		return teacherId;
	}
	
	public void setTeacherId(int teacherId) 
	{
		this.teacherId = teacherId;
	}
	
	public String getUserName() 
	{
		return userName;
	}
	
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public String getTeacherName() 
	{
		return teacherName;
	}
	
	public void setTeacherName(String teacherName)
	{
		this.teacherName = teacherName;
	}
	
	public String getGender() 
	{
		return gender;
	}
	
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	
	public Date getJoiningDate() 
	{
		return joiningDate;
	}
	
	public void setJoiningDate(Date joiningDate) 
	{
		this.joiningDate = joiningDate;
	}
	
	public String getQualification()
	{
		return qualification;
	}
	
	public void setQualification(String qualification) 
	{
		this.qualification = qualification;
	}
	
	public String getEmailId() 
	{
		return emailId;
	}
	
	public void setEmailId(String emailId) 
	{
		this.emailId = emailId;
	}
	
	public String getContactno()
	{
		return contactno;
	}
	
	public void setContactno(String contactno)
	{
		this.contactno = contactno;
	}
	
	public String getAddress1() 
	{
		return address1;
	}
	
	public void setAddress1(String address1)
	{
		this.address1 = address1;
	}
	
	public String getAddress2() 
	{
		return address2;
	}
	
	public void setAddress2(String address2) 
	{
		this.address2 = address2;
	}
	
	public int getPincode() 
	{
		return pincode;
	}
	
	public void setPincode(int pincode) 
	{
		this.pincode = pincode;
	}
	
	//parameterized constructor
	public Teacher(int teacherId, String userName, String password, String teacherName, String gender, Date joiningDate,
			String qualification, String emailId, String contactno, String address1, String address2, int pincode) 
	{
		super();
		this.teacherId = teacherId;
		this.userName = userName;
		this.password = password;
		this.teacherName = teacherName;
		this.gender = gender;
		this.joiningDate = joiningDate;
		this.qualification = qualification;
		this.emailId = emailId;
		this.contactno = contactno;
		this.address1 = address1;
		this.address2 = address2;
		this.pincode = pincode;
	}
	
	//default constructor
	public Teacher()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	//tostring 
	@Override
	public String toString()
	{
		return "Teacher [teacherId=" + teacherId + ", userName=" + userName + ", password=" + password
				+ ", teacherName=" + teacherName + ", gender=" + gender + ", joiningDate=" + joiningDate
				+ ", qualification=" + qualification + ", emailId=" + emailId + ", contactno=" + contactno
				+ ", address1=" + address1 + ", address2=" + address2 + ", pincode=" + pincode + "]";
	}
	
	
	
}
