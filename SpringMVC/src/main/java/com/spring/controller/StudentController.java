package com.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.bean.Student;

@Controller
public class StudentController {
	
	private static Logger log = LoggerFactory
			.getLogger(StudentController.class.getSimpleName());
	
	@RequestMapping(path = "/Student",method =RequestMethod.GET)
	public ModelAndView student() {
		 Map map=new HashMap();
		 map.put("HeaderName","Student");
		return new ModelAndView("Student","Stu",new Student()).addAllObjects(map);
	}
	@RequestMapping(path = "/Student",method =RequestMethod.POST)
	public ModelAndView createStudent(@ModelAttribute Student student) {
		log.info(student.toString());
		return new ModelAndView("Student","Stu",student);
		
	}
}
