package com.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.bean.Trainer;
import com.spring.service.TrainerService;

@Controller
public class TrainerController {
	@Autowired
	private TrainerService trainerService;
	
	private static Logger log = LoggerFactory
			.getLogger(TrainerController.class.getSimpleName());
	
	@RequestMapping(path = "/Trainer",method =RequestMethod.GET)
	public ModelAndView trainer() {
		 Map<String,Object> map=new HashMap<>();
		 map.put("headername","trainer");
		 map.put("trainer",new Trainer());
		return new ModelAndView("Trainer","trainer",new Trainer()).addAllObjects(map);
	}
	@RequestMapping(path = "/Trainer",method =RequestMethod.POST)
	public ModelAndView createStudent(@ModelAttribute(name="trainer") Trainer trainer) {
		trainerService.save(trainer);
		log.info(trainer.toString());
		return new ModelAndView("Trainer","trainer",trainer);
		
	}
}
