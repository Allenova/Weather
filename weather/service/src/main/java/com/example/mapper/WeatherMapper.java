package com.example.mapper;

import com.example.Weather;
import com.example.dto.WeatherDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface WeatherMapper {
    WeatherDto weatherToWeatherDto(Weather weather);
    Weather weatherDtoToWeather(WeatherDto weatherDto);


}
