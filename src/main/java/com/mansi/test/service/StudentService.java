package com.mansi.test.service;

import java.util.Optional;

import com.mansi.test.entities.Student;

public interface StudentService 
{
	//save
	//save is not in our app bt created temporary here.
	//remove if is it need
	public Student saveStudent(Student student);
	
	//get all
	public Iterable<Student> getAllStudents();
	
	//get by id
	public Optional<Student> getStudentById(int id);
	
	//update 
	public Student updateStudent(Student student);
	
	//delete by id
	public void deleteStudentById(int id);
	
	//delete all
	public void deleteAllStudents();
}
