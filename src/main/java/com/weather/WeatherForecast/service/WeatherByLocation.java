package com.weather.WeatherForecast.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weather.WeatherForecast.dto.WeatherForecastDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class WeatherByLocation {

    @Value("${X.RapidAPI.Key}")
    private String clientId;

    @Value("${X.RapidAPI.Host}")
    private String clientHost;


    public WeatherForecastDTO getWeatherByLocation(String city, Boolean isHourlyApi) {
        HttpHeaders headers = getHeaders();
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        RestTemplate restConfig = new RestTemplate();
        String url;
        if (isHourlyApi) {
            url = "https://forecast9.p.rapidapi.com/rapidapi/forecast/{name}/hourly/";
        } else {
            url = "https://forecast9.p.rapidapi.com/rapidapi/forecast/{name}/summary/";
        }
        ResponseEntity<String> response = restConfig.exchange(url, HttpMethod.GET, entity, String.class, city);
        ObjectMapper objectMapper = new ObjectMapper();
        WeatherForecastDTO weatherForecastDTO;
        try {
            weatherForecastDTO = objectMapper.readValue(response.getBody(), WeatherForecastDTO.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return weatherForecastDTO;
    }

    private HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-RapidAPI-Key", clientId);
        headers.add("X-RapidAPI-Host", clientHost);
        return headers;
    }
}
