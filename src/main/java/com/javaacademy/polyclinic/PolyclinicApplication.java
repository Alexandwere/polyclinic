package com.javaacademy.polyclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

import static com.javaacademy.polyclinic.Specialization.*;

@SpringBootApplication
public class PolyclinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolyclinicApplication.class, args);
	}

}
