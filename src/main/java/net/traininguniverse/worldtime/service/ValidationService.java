package net.traininguniverse.worldtime.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.traininguniverse.worldtime.domain.Timezone;

@Service
public class ValidationService {

	@Autowired
	TimezoneService timezoneService;

	public boolean ifExistTimezone(Timezone timezone) {
		ArrayList<Timezone> timezones = timezoneService.getTimezones();

		Timezone t = new Timezone(timezone.getArea(), timezone.getLocation(), timezone.getRegion());

		return timezones.contains(t);
	}
}
