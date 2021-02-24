package com.mansi.test.serviceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mansi.test.entities.Subject;
import com.mansi.test.repository.SubjectRepository;
import com.mansi.test.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService 
{

	@Autowired
	SubjectRepository subjectrepository;
	
	@Override
	public Iterable<Subject> getAllSubjects()
	{
		return subjectrepository.findAll();
	}

	@Override
	public Optional<Subject> getSubjectById(int id) 
	{
		return subjectrepository.findById(id);
	}

}
