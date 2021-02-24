package com.mansi.test.serviceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mansi.test.entities.Login;
import com.mansi.test.repository.LoginRepository;
import com.mansi.test.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService
{
	@Autowired
	LoginRepository loginrepository;
	
	@Override
	public Login saveLogin(Login login)
	{
		return loginrepository.save(login);
	}
	
	@Override
	public Iterable<Login> getallLogins()
	{
		return loginrepository.findAll();
	}
	
	@Override
	public Optional<Login> getLoginById(int id)
	{
		return loginrepository.findById(id);
	}
	
	@Override
	public Login updateLogin(Login login)
	{
		return loginrepository.save(login);
	}
	
	@Override
	public void deleteLoginById(int id)
	{
		loginrepository.deleteById(id);
	}
	
	@Override
	public void deleteallLogins()
	{
		loginrepository.deleteAll();
	}
}
