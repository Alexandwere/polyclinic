package com.javaacademy.polyclinic.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.math.BigDecimal;

@ConfigurationProperties(prefix = "cost")
@Getter
public class DoctorProperty {
    private BigDecimal costOfDentist;
    private BigDecimal costOfJuniorSurgeon;
    private BigDecimal costOfSeniorSurgeon;
    private BigDecimal costOfTherapist;
}
