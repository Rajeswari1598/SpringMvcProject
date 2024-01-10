package com.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.bean.Trainer;
import com.spring.entity.TrainerEntity;
import com.spring.repository.TrainerRepository;
@Service
public class TrainerImplementationService implements TrainerService {
	
	private static Logger log = LoggerFactory
			.getLogger(TrainerImplementationService.class.getSimpleName());
	@Autowired
	private TrainerRepository trainerRepository;
	@Override
	public void save(Trainer trainer) {
		TrainerEntity trainervalue=new TrainerEntity();
		trainervalue.setName(trainer.getName());
		trainervalue.setSalary(trainer.getSalary());
		trainervalue.setSubject(trainer.getSubject());
		
		trainerRepository.save(trainervalue);
		log.info("Trainer saved -"+trainer);
	}

}
