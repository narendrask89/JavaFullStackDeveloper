package com.capgemini.jfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.jfs.model.Exercise;

@Controller
public class MinutesController {

	/*@RequestMapping("/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise){
		System.out.println("Total minutes entered today " +exercise.getMinutes());
		return "redirect:addMoreMinutes.html";
	}*/
	
	@RequestMapping("/addMinutes")
	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise){
		System.out.println("Add More minutes for today " +exercise.getMinutes());
		return "addMinutes";
	}
}
