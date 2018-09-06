package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWordController {
	
	// controller method to show the initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// create a new controller method to read from data
	// add data to model
	@RequestMapping("/processFormTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read the request parameter from html form
		String theName = request.getParameter("studentName");
		
		// convert data to all caps
		theName = theName.toUpperCase();
		
		// create message
		String result = "Yo!" + theName;
				
		// add message to model 
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
