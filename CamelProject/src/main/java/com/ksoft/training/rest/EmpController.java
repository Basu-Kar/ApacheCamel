package com.ksoft.training.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {

	@RequestMapping("getEmployee.do")
	public ModelAndView getEmployee(){
		
		System.out.println("...............Test.........");
		
		return new ModelAndView("jqueryTest");
	}
} 	
