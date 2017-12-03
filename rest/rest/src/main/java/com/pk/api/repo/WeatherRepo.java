package com.pk.api.repo;

import java.util.List;

import com.pk.api.models.Weather;

public interface WeatherRepo {

	public Weather WeatherUpdate(Weather current);

	public List<String> getcities(); 

	public Weather getWeatherBycity(String city);

	public Weather getAvgDailyWeather(String city);

	public Weather getAvgHourlyWeather(String city);
}
