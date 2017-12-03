package com.pk.api.models;

import java.sql.Timestamp;

public class Weather {
 
	private String city; 
	private String description;
	private int temperature;
	private int humidity;
	private int pressure;
	private Wind wind; 
	private Timestamp timestamp;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public Timestamp getTime() {
		return timestamp;
	}
	public void setTime(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
