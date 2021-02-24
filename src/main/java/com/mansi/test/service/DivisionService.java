package com.mansi.test.service;

import java.util.Optional;

import com.mansi.test.entities.Division;

public interface DivisionService
{
	//get all
	public Iterable<Division> getallDivision();
	
	//get by id
	public Optional<Division> getDivisionById(int id);
}
