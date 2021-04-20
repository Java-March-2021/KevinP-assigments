package com.kpacheco.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HomeController {
	
	
	
	@RequestMapping(value="/" , method=RequestMethod.GET)
	public String menu()
	{
		return "index.jsp";
	}
	
	@RequestMapping(value="/submitinfo", method=RequestMethod.POST)
	public String home(@RequestParam("name") String name, @RequestParam("location") String location, 
			@RequestParam("language") String language, @RequestParam("comments") String comments, Model viewModel) {
		viewModel.addAttribute("name", name);
		viewModel.addAttribute("location", location);
		viewModel.addAttribute("language",language);
		viewModel.addAttribute("comments", comments);
		
		
		if(language.equals("Java")) {
			return "java.jsp";
			}
		else
			{
		return "result.jsp";
			}
	}
	
	
}
