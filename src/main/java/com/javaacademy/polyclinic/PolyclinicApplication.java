package com.javaacademy.polyclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PolyclinicApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PolyclinicApplication.class, args);
		Polyclinic polyclinic = context.getBean(Polyclinic.class);
		CashBox cashBox = context.getBean(CashBox.class);
		polyclinic.cureOfDentist();
		polyclinic.cureOfTherapist();
		polyclinic.cureOfJunSurgeon();
		polyclinic.cureOfSenSurgeon();

		System.out.println(cashBox.getProfit());
	}

}
