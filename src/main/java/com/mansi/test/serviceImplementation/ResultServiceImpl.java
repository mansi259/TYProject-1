package com.mansi.test.serviceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mansi.test.entities.Result;
import com.mansi.test.repository.ResultRepository;
import com.mansi.test.service.ResultService;

@Service
public class ResultServiceImpl implements ResultService
{

	@Autowired
	ResultRepository resultrepository;
	
	@Override
	public Result saveResult(Result result) 
	{
		return resultrepository.save(result);
	}

	@Override
	public Iterable<Result> getAllResults() 
	{
		return resultrepository.findAll();
	}

	@Override
	public Optional<Result> getResultById(int id) 
	{
		return resultrepository.findById(id);
	}

	@Override
	public Result updateResult(Result result) 
	{
		return resultrepository.save(result);
	}

	@Override
	public void delteResultById(int id) 
	{
		resultrepository.deleteById(id);
	}

	@Override
	public void deleteAllResults() 
	{
		resultrepository.deleteAll();
	}

}
