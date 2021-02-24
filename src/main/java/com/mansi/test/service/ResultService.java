package com.mansi.test.service;

import java.util.Optional;

import com.mansi.test.entities.Result;

public interface ResultService 
{
	//save
	public Result saveResult(Result result);
	
	//get all
	public Iterable<Result> getAllResults();
	
	//get by id
	public Optional<Result> getResultById(int id);
	
	//update
	public Result updateResult(Result result);
	
	//delete by id
	public void delteResultById(int id);
	
	//delete all
	public void deleteAllResults();
}
