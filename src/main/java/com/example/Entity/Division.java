package com.mansi.test.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Division 
{
	@Id
	@Column(length = 2,nullable = false)
	private int divisionId;
	
	//add Constraint
	private Standard standardId;
	
	@Column(length = 10,nullable = false)
	@Size(min = 4,max = 10)
	@NotNull
	private String divisionName;
	
	
	@Column(length = 255,nullable = false)
	@Size(max = 255)
	@NotNull
	private String resultFile;

	
	public int getDivisionId() 
	{
		return divisionId;
	}

	public void setDivisionId(int divisionId)
	{
		this.divisionId = divisionId;
	}

	public String getDivisionName() 
	{
		return divisionName;
	}

	public void setDivisionName(String divisionName) 
	{
		this.divisionName = divisionName;
	}

	public String getResultFile() 
	{
		return resultFile;
	}

	public void setResultFile(String resultFile)
	{
		this.resultFile = resultFile;
	}
	
	
}
