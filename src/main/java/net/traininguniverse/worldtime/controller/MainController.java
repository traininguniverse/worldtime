package net.traininguniverse.worldtime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.springframework.web.bind.annotation.ModelAttribute;

import net.traininguniverse.worldtime.domain.Timezone;
import net.traininguniverse.worldtime.service.TimeService;
import net.traininguniverse.worldtime.service.TimezoneService;
import net.traininguniverse.worldtime.service.ValidationService;

@Controller
public class MainController {

	@Autowired
	TimeService ts;

	@Autowired
	ValidationService vs;

	@Autowired
	TimezoneService tzs;

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/getTimeForm")
	public String getTimeForm(Model model) {
		model.addAttribute("timezone", new Timezone());
		return "getTimeForm";
	}

	@GetMapping("/getTimezones")
	public String getTimezones(Model model) {
		model.addAttribute("timezones", tzs.getTimezones());
		return "allTimezones";
	}

	@PostMapping("/getTimeForm")
	public String getTimeSubmit(@ModelAttribute Timezone timezone, Model model)
			throws JsonMappingException, JsonProcessingException {

		if (vs.ifExistTimezone(timezone)) {
			String time = ts.getTime(timezone);
			model.addAttribute("time", time);
			return "getTime";
		} else {
			model.addAttribute("timezones", tzs.getTimezones());
			return "allTimezones";
		}

	}

}
