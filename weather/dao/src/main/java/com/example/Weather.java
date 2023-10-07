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
public class Weather {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer now;
    private String now_dt;
    @OneToOne
    private Info info;
    @OneToOne
    private Fact fact;
    @OneToOne
    private Forecasts forecasts;
}
