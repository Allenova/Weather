package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Parts {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String part_name;
    private Integer temp_min;
    private Integer temp_max;
    private Integer temp_avg;
    private Integer feels_like;
    private String icon;
    private String condition;
    private String daytime;
    private Boolean polar;
    private Double wind_speed;
    private Integer wind_gust;
    private String wind_dir;
    private Integer pressure_mm;
    private Integer pressure_pa;
    private Integer humidity;
    private Integer prec_mm;
    private Integer prec_period;
    private Integer prec_prob;
}
