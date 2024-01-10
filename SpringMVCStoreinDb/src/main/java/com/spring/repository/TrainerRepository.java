package com.spring.repository;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.entity.TrainerEntity;
@Repository
@Transactional
public class TrainerRepository {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void save(TrainerEntity trainerentity) {
		System.out.println("repository");
		hibernateTemplate.save(trainerentity);
	}

}
