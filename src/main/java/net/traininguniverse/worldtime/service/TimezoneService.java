package net.traininguniverse.worldtime.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import net.traininguniverse.worldtime.domain.Timezone;

@Service
public class TimezoneService {

	ArrayList<Timezone> timezones = new ArrayList<Timezone>();

	public void retrieveTimezones() throws IOException {
		List<String> result = Files.readAllLines(Paths.get("src/main/resources/static/timezone.txt"));
		String[] array = new String[3];
		for (String s : result) {
			array = s.split("/");
			switch (array.length) {
			case 1:
				timezones.add(new Timezone(array[0]));
				break;
			case 2:
				timezones.add(new Timezone(array[0], array[1]));
				break;
			case 3:
				timezones.add(new Timezone(array[0], array[1], array[2]));
				break;
			default:
				break;
			}
		}
	}

	public ArrayList<Timezone> getTimezones() {
		return timezones;
	}
}
