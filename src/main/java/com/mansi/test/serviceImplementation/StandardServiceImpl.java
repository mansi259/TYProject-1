package com.mansi.test.serviceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mansi.test.entities.Standard;
import com.mansi.test.repository.StandardRepository;
import com.mansi.test.service.StandardService;

@Service
public class StandardServiceImpl implements StandardService 
{
	@Autowired
	StandardRepository standardrepository;
	
	@Override
	public Iterable<Standard> getAllStandards() 
	{
		return standardrepository.findAll();
	}

	@Override
	public Optional<Standard> getStandardById(int id) 
	{
		return standardrepository.findById(id);
	}

}
