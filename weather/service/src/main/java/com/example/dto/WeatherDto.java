package com.example.dto;

import com.example.Fact;
import com.example.Forecasts;
import com.example.Info;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@Data
public class WeatherDto implements Serializable {
    Integer now;
    String now_dt;
    InfoDto info;
    FactDto fact;
    ForecastsDto forecasts;
}
