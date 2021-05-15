package net.traininguniverse.worldtime.domain;

import org.springframework.stereotype.Component;

@Component
public class Data {

	private String abbreviation;
	private String datetime;
	private int day_of_week;
	private int day_of_year;
	private boolean dst;
	private String dst_from;
	private int dst_offset;
	private String dst_until;
	private int raw_offset;
	private String timezone;
	private int unixtime;
	private String utc_datetime;
	private String utc_offset;
	private int week_number;

	public Data() {
	}

	public Data(String abbreviation, String datetime, int day_of_week, int day_of_year, boolean dst, String dst_from,
			int dst_offset, String dst_until, int raw_offset, String timezone, int unixtime, String utc_datetime,
			String utc_offset, int week_number) {
		this.abbreviation = abbreviation;
		this.datetime = datetime;
		this.day_of_week = day_of_week;
		this.day_of_year = day_of_year;
		this.dst = dst;
		this.dst_from = dst_from;
		this.dst_offset = dst_offset;
		this.dst_until = dst_until;
		this.raw_offset = raw_offset;
		this.timezone = timezone;
		this.unixtime = unixtime;
		this.utc_datetime = utc_datetime;
		this.utc_offset = utc_offset;
		this.week_number = week_number;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public int getDay_of_week() {
		return day_of_week;
	}

	public void setDay_of_week(int day_of_week) {
		this.day_of_week = day_of_week;
	}

	public int getDay_of_year() {
		return day_of_year;
	}

	public void setDay_of_year(int day_of_year) {
		this.day_of_year = day_of_year;
	}

	public boolean isDst() {
		return dst;
	}

	public void setDst(boolean dst) {
		this.dst = dst;
	}

	public String getDst_from() {
		return dst_from;
	}

	public void setDst_from(String dst_from) {
		this.dst_from = dst_from;
	}

	public int getDst_offset() {
		return dst_offset;
	}

	public void setDst_offset(int dst_offset) {
		this.dst_offset = dst_offset;
	}

	public String getDst_until() {
		return dst_until;
	}

	public void setDst_until(String dst_until) {
		this.dst_until = dst_until;
	}

	public int getRaw_offset() {
		return raw_offset;
	}

	public void setRaw_offset(int raw_offset) {
		this.raw_offset = raw_offset;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public int getUnixtime() {
		return unixtime;
	}

	public void setUnixtime(int unixtime) {
		this.unixtime = unixtime;
	}

	public String getUtc_datetime() {
		return utc_datetime;
	}

	public void setUtc_datetime(String utc_datetime) {
		this.utc_datetime = utc_datetime;
	}

	public String getUtc_offset() {
		return utc_offset;
	}

	public void setUtc_offset(String utc_offset) {
		this.utc_offset = utc_offset;
	}

	public int getWeek_number() {
		return week_number;
	}

	public void setWeek_number(int week_number) {
		this.week_number = week_number;
	}

	@Override
	public String toString() {
		return "Data [abbreviation=" + abbreviation + ", datetime=" + datetime + ", day_of_week=" + day_of_week
				+ ", day_of_year=" + day_of_year + ", dst=" + dst + ", dst_from=" + dst_from + ", dst_offset="
				+ dst_offset + ", dst_until=" + dst_until + ", raw_offset=" + raw_offset + ", timezone=" + timezone
				+ ", unixtime=" + unixtime + ", utc_datetime=" + utc_datetime + ", utc_offset=" + utc_offset
				+ ", week_number=" + week_number + "]";
	}

}
