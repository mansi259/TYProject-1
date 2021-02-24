package com.mansi.test.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.mansi.test.entities.Admin;

public interface AdminRepository extends PagingAndSortingRepository<Admin, Integer>{

}
