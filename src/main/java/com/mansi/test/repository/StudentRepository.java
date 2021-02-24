package com.mansi.test.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.mansi.test.entities.Student;

public interface StudentRepository extends PagingAndSortingRepository<Student, Integer>
{

}
