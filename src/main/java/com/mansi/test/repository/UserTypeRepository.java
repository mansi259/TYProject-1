package com.mansi.test.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.mansi.test.entities.UserType;

@Repository
public interface UserTypeRepository extends PagingAndSortingRepository<UserType, Integer>{

}
