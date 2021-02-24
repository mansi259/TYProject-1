package com.mansi.test.service;

import java.util.Optional;

import com.mansi.test.entities.Parent;

public interface ParentService 
{
	//save
	public Parent saveParent(Parent parent);
	
	//get all
	public Iterable<Parent> getallParents();
	
	//get by id
	public Optional<Parent> getParentById(int id);
	
	//update 
	public Parent updateParent(Parent parent);
	
	//delete by id
	public void deleteParentById(int id);
	
	//delete all
	public void deleteAllParent();
}
