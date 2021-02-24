package com.mansi.test.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.mansi.test.entities.Login;

public interface LoginRepository extends PagingAndSortingRepository<Login, Integer>{

}
