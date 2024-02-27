package com.web.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Employee;

@Repository
public interface EmpRepo extends CrudRepository<Employee, Integer> {

}
