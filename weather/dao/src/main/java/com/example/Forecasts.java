package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Forecasts {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private String date_ts;
    private String week;
    private String sunrise;
    private String sunset;
    private String moon_code;
    private String moon_text;
    @OneToOne
    private Parts parts;
}
