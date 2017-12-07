package com.capgemini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.capgemini.model.Event;

@Controller
@SessionAttributes("event")
public class EventController {

	@RequestMapping(value = "/event", method = RequestMethod.GET)
	public String getEvents(Model model) {

		Event event = new Event();
		event.setName("Java test event");
		model.addAttribute("event", event);
		return "event";
	}

	@RequestMapping(value = "/event", method = RequestMethod.POST)
	public String getEvents(@ModelAttribute("event") Event event) {
		System.out.println(event.getName());
		return "redirect:/";
	}
}
