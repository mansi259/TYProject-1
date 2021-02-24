package com.mansi.test.serviceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mansi.test.entities.Admin;
import com.mansi.test.repository.AdminRepository;
import com.mansi.test.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService 
{

	@Autowired
	AdminRepository adminrepository;
	
	@Override
	public Admin saveAdmin(Admin admin) 
	{
		return adminrepository.save(admin);
	}

	@Override
	public Iterable<Admin> getallAdmins() 
	{
		return adminrepository.findAll();
	}

	@Override
	public Optional<Admin> getAdminById(int id) 
	{
		return adminrepository.findById(id);
	}

	@Override
	public Admin updateAdmin(Admin admin) 
	{
		return adminrepository.save(admin);
	}

	@Override
	public void deleteAdminById(int id) 
	{
		adminrepository.deleteById(id);
	}

	@Override
	public void deleteallAdmins() 
	{
		adminrepository.deleteAll();
	}

}
