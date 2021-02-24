package com.mansi.test.service;

import java.util.Optional;

import com.mansi.test.entities.Subject;

public interface SubjectService 
{
	//get all
	public Iterable<Subject> getAllSubjects();
	
	//get by id
	public Optional<Subject> getSubjectById(int id);
}
