package com.mansi.test.service;

import java.util.Optional;

import com.mansi.test.entities.Login;

public interface LoginService 
{
	//save
	public Login saveLogin(Login login);
	
	//get all
	public Iterable<Login> getallLogins();
	
	//getbyId
	public Optional<Login> getLoginById(int id);
	
	//update
	public Login updateLogin(Login login);
	
	//deleteby id
	public void deleteLoginById(int id);
	
	//deleteall
	public void deleteallLogins();
}
