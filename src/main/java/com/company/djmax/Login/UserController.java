package com.company.djmax.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	
	@Autowired 
	LoginServiceImp service;
	
	
	@RequestMapping(value="/join.do", method = RequestMethod.GET)
	public ModelAndView Test(ModelAndView mav) {
		System.out.println("접속 성공.");
		mav.setViewName("main");
		service.Register();
		return mav;
	}
	
}