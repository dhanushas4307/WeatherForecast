package com.weather.WeatherForecast.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CloudDTO {
    @JsonProperty
    private Long high;
    @JsonProperty
    private Long low;
    @JsonProperty
    private Long middle;

}
