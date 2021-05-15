package net.traininguniverse.worldtime.domain;

import org.springframework.stereotype.Component;

@Component
public class Timezone {

	private String area;
	private String location;
	private String region;

	public Timezone() {
	}

	public Timezone(String area, String location, String region) {
		super();
		this.area = area;
		this.location = location;
		this.region = region;
	}

	public Timezone(String area, String location) {
		super();
		this.area = area;
		this.location = location;
	}

	public Timezone(String area) {
		super();
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Timezone that = (Timezone) o;
		if (that.area == null)
			that.area = "";
		if (that.location == null)
			that.location = "";
		if (that.region == null)
			that.region = "";
		return area.equals(that.area) && location.equals(that.location) && region.equals(that.region);
	}

	@Override
	public String toString() {
		return "Timezone [area=" + area + ", location=" + location + ", region=" + region + "]";
	}

}
