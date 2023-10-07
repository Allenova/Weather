package com.example.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class PartsDto {
    String part_name;
    Integer temp_min;
    Integer temp_max;
    Integer temp_avg;
    Integer feels_like;
    String icon;
    String condition;
    String daytime;
    Boolean polar;
    Double wind_speed;
    Integer wind_gust;
    String wind_dir;
    Integer pressure_mm;
    Integer pressure_pa;
    Integer humidity;
    Integer prec_mm;
    Integer prec_period;
    Integer prec_prob;
}
