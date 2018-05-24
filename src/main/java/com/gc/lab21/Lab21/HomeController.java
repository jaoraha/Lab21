package com.gc.lab21.Lab21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	userInfo u;
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/registration")
	public ModelAndView registration() {
		return new ModelAndView("registration");
	}
	

	@RequestMapping("/summary") 							
	public ModelAndView formTest(@RequestParam("fName") String firstName) {
		u.setFirstName(firstName);
		
		return new ModelAndView("summary", "userinfo", u); 
		}
	
}
