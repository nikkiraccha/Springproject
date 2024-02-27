package com.eureka.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eureka.model.Citizen;

@Repository
public interface CitizenRepo extends JpaRepository<Citizen, Integer> {
	
	public List<Citizen> findByVaccinationId(Integer id);

}
