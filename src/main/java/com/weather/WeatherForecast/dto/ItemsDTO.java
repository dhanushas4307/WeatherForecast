package com.weather.WeatherForecast.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemsDTO {
    @JsonProperty
    private String date;
    @JsonProperty
    private String dateWithTimezone;
    @JsonProperty
    private String period;
    @JsonProperty
    private Long freshSnow;
    @JsonProperty
    private Long snowHeight;
    @JsonProperty
    private WeatherDTO weather;
    @JsonProperty
    private PrecDTO prec;
    @JsonProperty
    private Long sunHours;
    @JsonProperty
    private Long rainHours;
    @JsonProperty
    private Temprature temperature;
    @JsonProperty
    private String pressure;
    @JsonProperty
    private String relativeHumidity;
    @JsonProperty
    private WindDTO wind;
    @JsonProperty
    private WindChillDTO windchill;
    @JsonProperty
    private SnowLineDTO snowLine;
    @JsonProperty
    private AstronomyDTO astronomy;
    @JsonProperty
    private String isNight;
    @JsonProperty
    private CloudDTO clouds;


}
