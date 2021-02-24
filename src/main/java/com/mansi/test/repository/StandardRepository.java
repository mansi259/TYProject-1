package com.mansi.test.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.mansi.test.entities.Standard;

public interface StandardRepository extends PagingAndSortingRepository<Standard, Integer>
{

}
