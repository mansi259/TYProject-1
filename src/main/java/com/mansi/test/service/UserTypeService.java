package com.mansi.test.service;

import java.util.Optional;

import com.mansi.test.entities.UserType;

public interface UserTypeService 
{
	//getAll
	public Iterable<UserType> getAllUserTypes();
	
	//getById
	public Optional<UserType> getUserTypeById(int id);
}
