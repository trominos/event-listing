package com.event.listing.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.event.listing.service.EventListingService;


@RestController
public class EventsController {
	EventListingService svc = new EventListingService();
	
	@GetMapping("/events")
	public String  getEvents() {
		return svc.getEventListing();
	}

}
