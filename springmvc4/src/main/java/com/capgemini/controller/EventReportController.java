package com.capgemini.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.Event;

@RestController
public class EventReportController {

	@RequestMapping(value="/events")
	public List<Event> getEvents() {

		List<Event> list = new ArrayList<>();
		Event event = new Event();
		event.setName("Java Group");
		list.add(event);
		
		event = new Event();
		event.setName("Angular Group");
		list.add(event);
		
		return list;
	}
}
