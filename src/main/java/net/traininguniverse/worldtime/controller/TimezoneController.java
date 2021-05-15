package net.traininguniverse.worldtime.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.traininguniverse.worldtime.domain.Timezone;
import net.traininguniverse.worldtime.service.TimezoneService;

@RestController
public class TimezoneController {

	@Autowired
	TimezoneService timezoneService;

	@GetMapping("/timezones")
	public ArrayList<Timezone> getTimezones() {
		return timezoneService.getTimezones();
	}
}
