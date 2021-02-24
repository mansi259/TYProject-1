package com.mansi.test.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.mansi.test.entities.Subject;

public interface SubjectRepository extends PagingAndSortingRepository<Subject, Integer>
{

}
