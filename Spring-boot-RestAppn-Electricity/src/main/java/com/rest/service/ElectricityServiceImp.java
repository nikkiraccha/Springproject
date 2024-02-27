package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Electricity;
import com.rest.repo.ElectricityRepo;

@Service
public class ElectricityServiceImp implements ElectricityService {

	@Autowired
	private ElectricityRepo electricityRepo;
	
	@Override
	public Electricity saveRecord(Electricity electricity) {
		
		int unts=0;
		double total=0.0;
		unts=electricity.getCurrent_Reading()-electricity.getPrevious_Reading();
         if (unts<300) {
			
			total=unts*1.75;
		}
         else if(unts>300&&unts<500) {
 			
 			total=unts*2.75;
 		}
         else if(unts>=500) {
 			
 			total=unts*3.75;
 		}
         electricity.setUnits(unts);
         electricity.setTotalBill(total);
         Electricity e=electricityRepo.save(electricity);
		return e;
	}

	@Override
	public Electricity updateRecord(Electricity electricity, int cid) {
		Electricity oldRecord=electricityRepo.findById(cid).get();
		oldRecord.setName(electricity.getName());
		oldRecord.setCurrent_Reading(electricity.getCurrent_Reading());
		oldRecord.setPrevious_Reading(electricity.getPrevious_Reading());
		int unts=0;
		double total=0.0;
		unts=electricity.getCurrent_Reading()-electricity.getPrevious_Reading();
		 electricity.setUnits(unts);
         if (unts<300) {
			
			total=unts*1.75;
		}
         else if(unts>300&&unts<500) {
 			
 			total=unts*2.75;
 		}
         else if(unts>=500) {
 			
 			total=unts*3.75;
 		}
        oldRecord.setUnits(unts);
         oldRecord.setTotalBill(total);
         Electricity e=electricityRepo.save(oldRecord);
		return e;
		
	}

	@Override
	public void deleteRecord(int cid) {
		electricityRepo.deleteById(cid);

	}

	@Override
	public Electricity getOneRecord(int cid) {
		
		Electricity get=electricityRepo.findById(cid).get();
		return get;
	}

	@Override
	public List<Electricity> getAllRecord() {
		List<Electricity> l=electricityRepo.findAll();
		return l;
	}

}
