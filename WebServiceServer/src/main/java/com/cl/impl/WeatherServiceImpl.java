package com.cl.impl;

import com.cl.WeatherService;

public class WeatherServiceImpl implements WeatherService {

	@Override
	public String reportWeather(String address) {
		if(address.equals("武汉")){
			return "雨";
		}else{
			return "多云";
		}
	}

}
