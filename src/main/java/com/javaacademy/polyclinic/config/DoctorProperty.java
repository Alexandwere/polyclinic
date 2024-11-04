package com.javaacademy.polyclinic.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.math.BigDecimal;

@ConfigurationProperties(prefix = "doctor")
@Getter
@Setter
public class DoctorProperty {
    private BigDecimal costOfDentist;
    private BigDecimal costOfJuniorSurgeon;
    private BigDecimal costOfSeniorSurgeon;
    private BigDecimal costOfTherapist;
}
