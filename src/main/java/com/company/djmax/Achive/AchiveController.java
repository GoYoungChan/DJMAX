package com.company.djmax.Achive;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AchiveController {
	
	@Autowired
	AchiveService achiveService;
	
	@RequestMapping(value="/")
	public ModelAndView main(ModelAndView mav) {
		mav.addObject("test","test");
		mav.setViewName("main");
		return mav;
	}
	
	// 기록실 페이지 이동.
	@RequestMapping(value = "Record.do", method=RequestMethod.GET)
	public ModelAndView Record(ModelAndView mav) {
		mav.setViewName("Achive");
		return mav;
	}
	
	// 일단 Post 방식으로 전달하는 메서드 생성. 추후 코딩.
	@RequestMapping(value = "Record.do", method=RequestMethod.POST)
	public ModelAndView RecordData(ModelAndView mav) {
		return mav;
	}
	
	// 일반 Navbar 페이지 이동.
	@RequestMapping(value = "Page.do")
	public ModelAndView Page(ModelAndView mav, HttpServletRequest request) {
		//achiveService.create();
		//achiveService.insert();
		String view = request.getParameter("value");
		mav.setViewName(view);
		return mav;
	}
}