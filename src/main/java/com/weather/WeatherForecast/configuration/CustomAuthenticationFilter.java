package com.weather.WeatherForecast.configuration;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import java.io.IOException;
import java.util.Random;

@Component
public class CustomAuthenticationFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String clientId = GenerateSecretAndId.getClientAndSecret().get("clientId");
        String clientSecret = GenerateSecretAndId.getClientAndSecret().get("clientSecret");
        String clientIdHeader = request.getHeader("X-Client-ID");
        String clientSecretHeader = request.getHeader("X-Client-Secret");

        if (clientIdHeader != null && clientSecretHeader != null
                && clientIdHeader.equals(clientId) && clientSecretHeader.equals(clientSecret)) {
            filterChain.doFilter(request, response);
        } else {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        }
    }
}