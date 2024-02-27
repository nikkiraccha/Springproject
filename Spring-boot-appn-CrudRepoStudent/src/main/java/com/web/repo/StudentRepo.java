package com.web.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.StudentTable;
@Repository
public interface StudentRepo extends CrudRepository<StudentTable, Integer> {

}
