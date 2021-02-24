package com.mansi.test.service;

import java.util.Optional;

import com.mansi.test.entities.Standard;

public interface StandardService 
{
	//get all
	public Iterable<Standard> getAllStandards();
	
	//get By Id
	public Optional<Standard> getStandardById(int id);
}
