package com.mansi.test.service;

import java.util.Optional;

import com.mansi.test.entities.Teacher;

public interface TeacherService 
{
	//save
	public Teacher saveTeacher(Teacher teacher);
	
	//get all
	public Iterable<Teacher> getAllTeachers();
	
	//get by id
	public Optional<Teacher> getTeacheById(int id);
	
	//update
	public Teacher updaTeacher(Teacher teacher);
	
	//delete by id
	public void deleteTeacherById(int id);
	
	//delete all
	public void deleteAllTeachers();
}
