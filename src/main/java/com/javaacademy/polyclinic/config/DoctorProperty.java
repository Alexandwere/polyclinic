package com.javaacademy.polyclinic.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.math.BigDecimal;

@ConfigurationProperties(prefix = "cost")
@Getter
public class DoctorProperty {
    private String costOfSession1;
    private String costOfSession2;
    private String costOfSession3;
    private String costOfSession4;
}
