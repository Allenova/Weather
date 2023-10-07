package com.example;

import com.example.dto.WeatherDto;
import com.example.mapper.WeatherMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherConnector connect;
    private final WeatherMapper weatherMapper;
   public WeatherDto getWeatherForLonAndLat(String lon, String lat){
       return connect.getForEntity(lon,lat).getBody();
   }


}
