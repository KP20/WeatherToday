package com.pk.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pk.api.models.Weather;
import com.pk.api.service.WeatherService;

@RestController
@RequestMapping(value = "/weather")
public class WeatherController {
    @Autowired
	private WeatherService weatherservice;

	@RequestMapping(method = RequestMethod.POST)
	public Weather WeatherUpdate(@RequestBody Weather current) {
		return weatherservice.WeatherUpdate(current);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/cities")
	public List<String> getcities() {
		return weatherservice.getcities();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{city}")
	public Weather getWeatherBycity(@PathVariable("city") String city) {
		return weatherservice.getWeatherBycity(city);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/avgdaily/{city}")
	public Weather getAvgDailyWeather(@PathVariable("city") String city) {
		return weatherservice.getAvgDailyWeather(city);
 
	}

	@RequestMapping(method = RequestMethod.GET, value = "/avghourly/{city}")
	public Weather getAvgHourlyWeather(@PathVariable("city") String city) {
		return weatherservice.getAvgHourlyWeather(city);
	}
}
