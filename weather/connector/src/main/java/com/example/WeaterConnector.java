package com.example;

import com.example.dto.WeatherDto;
import lombok.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class WeatherConnector  {
    @Value("${yandex.weather}")
    private String url;
    @Value("${yandex.weather_apikey}")
    private String apikey;
    private final RestTemplate restTemplate;

    public WeatherConnector(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public HttpEntity<WeatherDto> getForEntity(String lat, String lon) {
        HttpHeaders headers = new HttpHeaders();
        headers.set(ParamsForWeatherRequest.API_KEY.getParam(), apikey);

        Map<String, String> params = new HashMap<>();
        params.put(ParamsForWeatherRequest.LAT.getParam(), lat);
        params.put(ParamsForWeatherRequest.LON.getParam(), lon);
        params.put(ParamsForWeatherRequest.EXTRA.getParam(), "true");

        HttpEntity httpEntity = new HttpEntity(headers);

        ResponseEntity<WeatherDto> exchange = restTemplate.exchange(url, HttpMethod.GET, httpEntity, WeatherDto.class, params);

        return exchange;
    }
}
