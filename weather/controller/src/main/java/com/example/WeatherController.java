package com.example;

import com.example.dto.WeatherDto;
import io.swagger.v3.oas.annotations.headers.Header;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping
    public WeatherDto getWeather(@RequestParam String lon, String lat) {
        return weatherService.getWeatherForLonAndLat(lon, lat);
    }
}
