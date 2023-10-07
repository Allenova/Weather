package com.example.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class TzinfoDto {
    String name;
    String abbr;
    Boolean dst;
    Integer offset;
}
