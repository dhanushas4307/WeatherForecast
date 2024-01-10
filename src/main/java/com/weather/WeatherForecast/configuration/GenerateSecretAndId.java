package com.weather.WeatherForecast.configuration;

import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

@Component
public class GenerateSecretAndId {
    private static Map<String, String> clientAndSecret = new LinkedHashMap<>();
    public static Map<String, String> getClientAndSecret(){
        return clientAndSecret;
    }

    static {
        generateClientIdAndSecret();
    }

    private static void generateClientIdAndSecret() {
        getClientAndSecret().putIfAbsent("clientId", getRandomString());
        getClientAndSecret().putIfAbsent("clientSecret", getRandomString());
        for(Map.Entry<String, String> clientSecret : getClientAndSecret().entrySet()) {
            System.out.println(clientSecret.getKey() + ":" + clientSecret.getValue());
        }

    }
    private static String getRandomString() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            randomString.append(characters.charAt(random.nextInt(characters.length())));
        }
        return randomString.toString();
    }

}
