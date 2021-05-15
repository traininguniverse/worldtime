package net.traininguniverse.worldtime.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import net.traininguniverse.worldtime.domain.Timezone;
import net.traininguniverse.worldtime.service.TimeService;

@RestController
public class TimeController {

	private TimeService timeService;

	public TimeController(TimeService timeService) {
		this.timeService = timeService;
	}

	@PostMapping("/time")
	public String getTime(@RequestBody Timezone timezone) throws JsonMappingException, JsonProcessingException {
		return timeService.getTime(timezone);
	}

}
