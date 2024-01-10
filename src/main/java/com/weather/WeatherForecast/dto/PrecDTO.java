package com.weather.WeatherForecast.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PrecDTO {
    @JsonProperty
    private Long sum;
    @JsonProperty
    private Long probability;
    @JsonProperty
    private Long sumAsRain;
    @JsonProperty("class")
    private Long precClass;
}
