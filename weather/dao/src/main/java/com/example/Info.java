package com.example;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Info {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double lat;
    private Double lon;
    @OneToOne
    private Tzinfo tzinfo;
    private Double offset;
    private String name;
    private String abbr;
    private Boolean dst;
    private Double def_pressure_mm;
    private Double def_pressure_pa;
    private String url;
}
