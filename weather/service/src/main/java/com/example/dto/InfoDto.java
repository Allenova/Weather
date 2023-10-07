package com.example.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class InfoDto {
    Double lat;
    Double lon;
    TzinfoDto tzinfoDto;
    Double offset;
    String name;
    String abbr;
    Boolean dst;
    Double def_pressure_mm;
    Double def_pressure_pa;
    String url;
}

