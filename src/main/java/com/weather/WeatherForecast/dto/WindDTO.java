package com.weather.WeatherForecast.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WindDTO {
    @JsonProperty
    private String unit;
    @JsonProperty
    private String direction;
    @JsonProperty
    private String text;
    @JsonProperty
    private Long avg;
    @JsonProperty
    private Long min;
    @JsonProperty
    private Long max;
    @JsonProperty
    private Guests gusts;
    @JsonProperty
    private Boolean significationWind;


}
