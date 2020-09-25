package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	
	static {System.out.println("controller");}
	
	@RequestMapping(value="/home.htm")
	public String getWelcomePage() {
		
		
		
		return "welcome";
	}

}
