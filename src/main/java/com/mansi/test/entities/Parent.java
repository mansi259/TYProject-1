package com.mansi.test.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

//@Component
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"userName"}))
public class Parent 
{
	@Id
	@Column(length = 4 , nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int parentId;
	
	//add constraint in below 
	private ParentStudent parentStudentId;
	
	@Column(length = 1,nullable = false)
	@Size(min = 1,max = 1)
	@NotNull
	private int noOfChild;
	
	@Column(length = 20,nullable = false,unique = true)
	@Size(min = 4,max = 20)
	//unique constraint of this is defined above in @table annotation
	private String userName;
	
	@Column(length = 15,nullable = false)
	@NotNull
	@Size(min = 8,max = 15)
	private String password;
	
	@Column(length = 50,nullable = false)
	@Size(max = 50)
	@NotNull
	private String parentName;
	
	@Column(length = 40)
	@Size(max = 40)
	private String emailId;
	
	@Column(length = 10,nullable = false)
	@Size(min = 10,max = 10)
	@NotNull
	private String contactNo1;
	
	@Column(length = 10)
	@Size(min = 10,max = 10)
	private String contactNo2;
	
	@Column(length = 20,nullable = false)
	@Size(max = 20)
	@NotNull
	private String qualification;
	
	@Column(length = 15,nullable = false)
	@Size(max = 15)
	@NotNull
	private String occupation;
	
	//getters and setters
	public int getParentId()
	{
		return parentId;
	}
	
	public void setParentId(int parentId)
	{
		this.parentId = parentId;
	}
	
	public int getNoOfChild() 
	{
		return noOfChild;
	}
	
	public void setNoOfChild(int noOfChild) 
	{
		this.noOfChild = noOfChild;
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
	
	public String getParentName()
	{
		return parentName;
	}
	
	public void setParentName(String parentName)
	{
		this.parentName = parentName;
	}
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) 
	{
		this.emailId = emailId;
	}
	
	public String getContactNo1() 
	{
		return contactNo1;
	}
	
	public void setContactNo1(String contactNo1) 
	{
		this.contactNo1 = contactNo1;
	}
	
	public String getContactNo2() 
	{
		return contactNo2;
	}
	
	public void setContactNo2(String contactNo2)
	{
		this.contactNo2 = contactNo2;
	}
	
	public String getQualification() 
	{
		return qualification;
	}
	
	public void setQualification(String qualification)
	{
		this.qualification = qualification;
	}
	
	public String getOccupation() 
	{
		return occupation;
	}
	
	public void setOccupation(String occupation) 
	{
		this.occupation = occupation;
	}
	
	//parameterized constructor
	public Parent(int parentId, int noOfChild, String userName, String password, String parentName, String emailId,
			String contactNo1, String contactNo2, String qualification, String occupation) {
		super();
		this.parentId = parentId;
		this.noOfChild = noOfChild;
		this.userName = userName;
		this.password = password;
		this.parentName = parentName;
		this.emailId = emailId;
		this.contactNo1 = contactNo1;
		this.contactNo2 = contactNo2;
		this.qualification = qualification;
		this.occupation = occupation;
	}
	
	//default Constructor
	public Parent() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	//toString Method
	@Override
	public String toString() 
	{
		return "Parent [parentId=" + parentId + ", noOfChild=" + noOfChild + ", userName=" + userName + ", password="
				+ password + ", parentName=" + parentName + ", emailId=" + emailId + ", contactNo1=" + contactNo1
				+ ", contactNo2=" + contactNo2 + ", qualification=" + qualification + ", occupation=" + occupation
				+ "]";
	}
	
	
}
