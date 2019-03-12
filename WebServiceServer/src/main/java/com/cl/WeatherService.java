package com.cl;

import javax.jws.WebService;

@WebService
public interface WeatherService {

	String reportWeather(String address);
}
