package com.mansi.test.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.mansi.test.entities.Parent;

public interface ParentRepository extends PagingAndSortingRepository<Parent, Integer>
{

}
