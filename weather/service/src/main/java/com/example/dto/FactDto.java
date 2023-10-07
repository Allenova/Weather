package com.example.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class FactDto {
    Double temp;
    Double feels_like;
    Double temp_water;
}
