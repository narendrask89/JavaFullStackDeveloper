package com.capgemini.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.model.Attendee;

@Controller
public class AttendeeController {

	@RequestMapping(value = "/attendee", method = RequestMethod.GET)
	public String getAttendee(Model model) {
		Attendee attendee = new Attendee();
		model.addAttribute("attendee", attendee);
		return "attendee";
	}
	
	@RequestMapping(value = "/attendee", method = RequestMethod.POST)
	public String getAttendee(@Valid Attendee attendee, BindingResult bindingResult, Model model) {

		if(bindingResult.hasErrors()){
			return "attendee";
		}
		return "redirect:/";
	}
}
