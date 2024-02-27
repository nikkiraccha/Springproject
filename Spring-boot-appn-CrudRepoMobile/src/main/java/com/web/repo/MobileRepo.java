package com.web.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Mobiles_data;
@Repository
public interface MobileRepo extends CrudRepository<Mobiles_data, Integer> {


}
