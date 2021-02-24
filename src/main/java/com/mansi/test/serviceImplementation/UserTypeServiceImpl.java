package com.mansi.test.serviceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mansi.test.entities.UserType;
import com.mansi.test.repository.UserTypeRepository;
import com.mansi.test.service.UserTypeService;

@Service
public class UserTypeServiceImpl implements UserTypeService
{

	@Autowired
	UserTypeRepository usertyperepository;
	
	@Override
	public Iterable<UserType> getAllUserTypes() 
	{
		return usertyperepository.findAll();
	}

	@Override
	public Optional<UserType> getUserTypeById(int id) 
	{
		return usertyperepository.findById(id);
	}

}
