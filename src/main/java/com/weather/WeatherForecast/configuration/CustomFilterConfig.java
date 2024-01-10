package com.weather.WeatherForecast.configuration;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomFilterConfig {

    @Bean
    public FilterRegistrationBean<CustomAuthenticationFilter> filterRegistrationBean() {
        FilterRegistrationBean<CustomAuthenticationFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new CustomAuthenticationFilter());
        registrationBean.addUrlPatterns("/weather/*");
        return registrationBean;
    }
}
