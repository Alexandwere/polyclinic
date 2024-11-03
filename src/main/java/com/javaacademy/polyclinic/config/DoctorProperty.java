package com.javaacademy.polyclinic.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.math.BigDecimal;

@ConfigurationProperties(prefix = "cost")
@Getter
public class DoctorProperty {
    private String costOfDentist;
    private String costOfJuniorSurgeon;
    private String costOfSeniorSurgeon;
    private String costOfTherapist;
}
