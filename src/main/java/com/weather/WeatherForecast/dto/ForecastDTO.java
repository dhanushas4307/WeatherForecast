package com.weather.WeatherForecast.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.Collection;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ForecastDTO {
    @JsonProperty("items")
    private Collection<ItemsDTO> items;
    @JsonProperty("forecastDate")
    private String forecastDate;
    @JsonProperty("nextUpdate")
    private String nextUpdate;
    @JsonProperty("source")
    private String source;
    @JsonProperty("point")
    private String point;
    @JsonProperty("fingerprint")
    private String fingerprint;



}
