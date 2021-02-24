package com.mansi.test.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.mansi.test.entities.Teacher;

public interface TeacherRepository extends PagingAndSortingRepository<Teacher, Integer>
{

}
