package net.traininguniverse.worldtime.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import net.traininguniverse.worldtime.domain.Data;
import net.traininguniverse.worldtime.domain.Timezone;

@Service
public class TimeService {

	public String getTime(Timezone timezone) throws JsonMappingException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Data> response = restTemplate.getForEntity("http://worldtimeapi.org/api/timezone/"
				+ timezone.getArea() + "/" + timezone.getLocation() + "/" + timezone.getRegion(), Data.class);

		String datetime = response.getBody().getDatetime();

		datetime = datetime.substring(11, 19);

		return datetime;
	}

}
