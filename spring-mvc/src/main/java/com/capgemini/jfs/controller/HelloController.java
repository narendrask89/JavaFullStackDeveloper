package com.capgemini.jfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/home")
	public String home(Model model){
		
		model.addAttribute("name", "Narendra");
		return "home";
	}
}
