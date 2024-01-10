package com.weather.WeatherForecast.controller;

import com.weather.WeatherForecast.dto.WeatherForecastDTO;
import com.weather.WeatherForecast.service.WeatherByLocation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherForecastController {
    private final WeatherByLocation weatherByLocation;

    public WeatherForecastController(WeatherByLocation weatherByLocation) {
        this.weatherByLocation = weatherByLocation;
    }

    @GetMapping("/{cityName}")
    @ResponseStatus(HttpStatus.OK)
    public WeatherForecastDTO getWeatherForecastByLocation(@PathVariable("cityName") String city){
        Boolean isHourlyApi = false;
        return weatherByLocation.getWeatherByLocation(city, isHourlyApi);
    }

    @GetMapping("/{cityName}/hourly")
    @ResponseStatus(HttpStatus.OK)
    public WeatherForecastDTO getHourlyWeatherForecastByLocation(@PathVariable("cityName") String city){
        Boolean isHourlyApi = true;
        return weatherByLocation.getWeatherByLocation(city, isHourlyApi);
    }
}
