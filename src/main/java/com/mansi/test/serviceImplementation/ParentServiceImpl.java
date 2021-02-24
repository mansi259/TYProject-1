package com.mansi.test.serviceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mansi.test.entities.Parent;
import com.mansi.test.repository.ParentRepository;
import com.mansi.test.service.ParentService;

@Service
public class ParentServiceImpl implements ParentService
{

	@Autowired
	ParentRepository parentrepository;
	
	@Override
	public Parent saveParent(Parent parent) 
	{
		return parentrepository.save(parent);
	}

	@Override
	public Iterable<Parent> getallParents() 
	{
		return parentrepository.findAll();
	}

	@Override
	public Optional<Parent> getParentById(int id) 
	{
		return parentrepository.findById(id);
	}

	@Override
	public Parent updateParent(Parent parent) 
	{
		return parentrepository.save(parent);
	}

	@Override
	public void deleteParentById(int id)
	{
		parentrepository.deleteById(id);
	}

	@Override
	public void deleteAllParent() 
	{	
		parentrepository.deleteAll();
	}

}
