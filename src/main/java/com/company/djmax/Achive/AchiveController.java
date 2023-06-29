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
	
	// 기록실 페이지 이동.
	@RequestMapping(value = "Record.do")
	public ModelAndView Record(ModelAndView mav) {
		mav.setViewName("Content/Achive");
		return mav;
	}
}