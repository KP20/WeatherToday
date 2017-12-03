package com.pk.api.service;

import java.util.List;

import com.pk.api.models.Weather;

public interface WeatherService {
	public Weather WeatherUpdate(Weather current);

	public List<String> getcities(); 
	
	public boolean findcity(); 

	public Weather getWeatherBycity(String city);

	public Weather getAvgDailyWeather(String city);

	public Weather getAvgHourlyWeather(String city);
}
