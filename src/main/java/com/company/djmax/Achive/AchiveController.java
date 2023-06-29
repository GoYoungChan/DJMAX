package com.company.djmax.Achive;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AchiveController {
	
	@RequestMapping(value="/")
	public ModelAndView main(ModelAndView mav) {
		mav.addObject("test","test");
		mav.setViewName("main");
		return mav;
	}
	
}