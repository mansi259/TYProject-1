package com.mansi.test.serviceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mansi.test.entities.Division;
import com.mansi.test.repository.DivisionRepository;
import com.mansi.test.service.DivisionService;

@Service
public class DivisionServiceImpl implements DivisionService
{
	@Autowired
	DivisionRepository divisionRepository;
	
	@Override
	public Iterable<Division> getallDivision()
	{
		return divisionRepository.findAll();
	}
	
	@Override
	public Optional<Division> getDivisionById(int id)
	{
		return divisionRepository.findById(id);
	}
	
}
