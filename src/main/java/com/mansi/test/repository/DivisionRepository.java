package com.mansi.test.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.mansi.test.entities.Division;

public interface DivisionRepository extends PagingAndSortingRepository<Division, Integer>{

}
