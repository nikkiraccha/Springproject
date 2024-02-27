package com.eureka.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eureka.model.VaccinationCenter;

@Repository
public interface VaccinationRepo extends JpaRepository<VaccinationCenter, Integer> {
	


}
