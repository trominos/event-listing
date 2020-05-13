package com.event.listing.service;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
 
import java.io.FileReader;
import java.util.Iterator;

public class EventListingService {
	
	
	public String   getEventListing() {
		String events = null;
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("/tmp/data/events.json"));
			JSONObject jsonObject = (JSONObject) obj;
			events = jsonObject.toJSONString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return events;
	}
	

}
