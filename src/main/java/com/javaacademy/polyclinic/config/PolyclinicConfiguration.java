package com.javaacademy.polyclinic.config;

import com.javaacademy.polyclinic.Doctor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.javaacademy.polyclinic.Specialization.*;

@Configuration
@EnableConfigurationProperties(value = DoctorProperty.class)
public class PolyclinicConfiguration {
    private DoctorProperty doctorProperty;

    public PolyclinicConfiguration(DoctorProperty doctorProperty) {
        this.doctorProperty = doctorProperty;
    }

    @Bean
    public Doctor dentist() {
        return new Doctor(doctorProperty.getCostOfDentist(), DENTIST);
    }

    @Bean
    public Doctor junSurgeon() {
        return new Doctor(doctorProperty.getCostOfJuniorSurgeon(), SURGEON);
    }

    @Bean
    public Doctor SenSurgeon() {
        return new Doctor(doctorProperty.getCostOfSeniorSurgeon(), SURGEON);
    }

     @Bean
    public Doctor therapist() {
        return new Doctor(doctorProperty.getCostOfTherapist(), THERAPIST);
    }
}
