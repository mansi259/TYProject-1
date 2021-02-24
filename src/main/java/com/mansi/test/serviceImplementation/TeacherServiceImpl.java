package com.mansi.test.serviceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mansi.test.entities.Teacher;
import com.mansi.test.repository.TeacherRepository;
import com.mansi.test.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService 
{

	@Autowired
	TeacherRepository teacherrepository;
	
	@Override
	public Teacher saveTeacher(Teacher teacher)
	{
		return teacherrepository.save(teacher);
	}

	@Override
	public Iterable<Teacher> getAllTeachers() 
	{
		return teacherrepository.findAll();
	}

	@Override
	public Optional<Teacher> getTeacheById(int id) 
	{
		return teacherrepository.findById(id);
	}

	@Override
	public Teacher updaTeacher(Teacher teacher) 
	{
		return teacherrepository.save(teacher);
	}

	@Override
	public void deleteTeacherById(int id)
	{
		 teacherrepository.deleteById(id);
	}

	@Override
	public void deleteAllTeachers() 
	{
		teacherrepository.deleteAll();
	}

}
