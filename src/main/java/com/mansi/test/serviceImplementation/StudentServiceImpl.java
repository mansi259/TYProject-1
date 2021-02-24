package com.mansi.test.serviceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mansi.test.entities.Student;
import com.mansi.test.repository.StudentRepository;
import com.mansi.test.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService 
{

	@Autowired
	StudentRepository studentrepository;
	
	@Override
	public Student saveStudent(Student student)
	{
		return studentrepository.save(student);
	}

	@Override
	public Iterable<Student> getAllStudents()
	{
		return studentrepository.findAll();
	}

	@Override
	public Optional<Student> getStudentById(int id) 
	{
		return studentrepository.findById(id);
	}

	@Override
	public Student updateStudent(Student student) 
	{
		return studentrepository.save(student);
	}

	@Override
	public void deleteStudentById(int id) 
	{
		studentrepository.deleteById(id);
	}

	@Override
	public void deleteAllStudents() 
	{
		studentrepository.deleteAll();
	}

}
