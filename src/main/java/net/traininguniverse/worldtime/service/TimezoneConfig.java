package net.traininguniverse.worldtime.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TimezoneConfig {

	@Autowired
	TimezoneService timezoneService;

	@Bean
	public void getTimezoneService() throws IOException {
		timezoneService.retrieveTimezones();
	}

}
