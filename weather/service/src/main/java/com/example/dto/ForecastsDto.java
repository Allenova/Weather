package com.example.dto;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Data
@Getter
@Setter
public class ForecastsDto {
    Date date;
    String date_ts;
    String week;
    String sunrise;
    String sunset;
    String moon_code;
    String moon_text;
    PartsDto partsDto;
}
