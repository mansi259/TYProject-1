package com.mansi.test.service;

import java.util.Optional;

import com.mansi.test.entities.Admin;

public interface AdminService 
{
	//create
	public Admin saveAdmin(Admin admin);
	
	//getall
	public Iterable<Admin> getallAdmins();
	
	//get by id
	public Optional<Admin> getAdminById(int id);
	
	//update
	public Admin updateAdmin(Admin admin);
	
	//delete
	public void deleteAdminById(int id);
	
	//deleteall
	public void deleteallAdmins();
}
