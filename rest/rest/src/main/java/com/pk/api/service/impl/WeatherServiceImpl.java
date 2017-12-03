package com.pk.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.api.models.Weather;
import com.pk.api.repo.WeatherRepo;
import com.pk.api.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {
    @Autowired
	private WeatherRepo weather_repo;
	@Override
	public Weather WeatherUpdate(Weather current) {
		
		return null;
	}

	@Override 
	public List<String> getcities() {
		
		return null;
	}

	@Override
	public Weather getWeatherBycity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Weather getAvgDailyWeather(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Weather getAvgHourlyWeather(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean findcity() { 
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
