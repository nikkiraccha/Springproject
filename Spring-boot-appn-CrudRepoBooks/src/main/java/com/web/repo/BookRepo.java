package com.web.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Books;
@Repository
public interface BookRepo extends CrudRepository<Books, Integer> {


}
