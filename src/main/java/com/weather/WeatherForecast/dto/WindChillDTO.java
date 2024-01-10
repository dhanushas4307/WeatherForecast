package com.weather.WeatherForecast.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WindChillDTO {
    @JsonProperty
    private Long min;
    @JsonProperty
    private Long max;
    @JsonProperty
    private Long avg;

}
