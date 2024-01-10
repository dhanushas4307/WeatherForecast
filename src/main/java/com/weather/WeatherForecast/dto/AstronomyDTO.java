package com.weather.WeatherForecast.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AstronomyDTO {
    @JsonProperty
    private String dawn;
    @JsonProperty
    private String sunrise;
    @JsonProperty
    private String suntransit;
    @JsonProperty
    private String sunset;
    @JsonProperty
    private String dusk;
    @JsonProperty
    private String moonrise;
    @JsonProperty
    private String moontransit;
    @JsonProperty
    private String moonset;
    @JsonProperty
    private Long moonphase;
    @JsonProperty
    private Long moonzodiac;

}
