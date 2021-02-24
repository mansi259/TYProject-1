package com.mansi.test.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.mansi.test.entities.Result;

public interface ResultRepository extends PagingAndSortingRepository<Result, Integer>
{

}
