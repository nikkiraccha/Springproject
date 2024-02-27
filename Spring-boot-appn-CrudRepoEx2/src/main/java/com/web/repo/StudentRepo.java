package com.web.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Student_data;
@Repository
public interface StudentRepo extends CrudRepository<Student_data, Integer> {


}
