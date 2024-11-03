package com.javaacademy.polyclinic;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import static com.javaacademy.polyclinic.Specialization.*;

@Component
public class Polyclinic {
    private CashBox cashBox;
    private Set<Doctor> doctors;

    public void cureOfDentist() {
        cure(doctors.stream().filter(e -> Objects.equals(e.getSpecialization(), DENTIST)).findAny().get());
    }

    public void cureOfJunSurgeon() {
        cure(doctors.stream().filter(e -> Objects.equals(e.getSpecialization(), DENTIST)).findAny().get());
    }

    public void cureOfSenSurgeon() {
        cure(doctors.stream().filter(e -> Objects.equals(e.getSpecialization(), DENTIST)).findAny().get());
    }

    public void cureOfTherapist() {
        cure(doctors.stream().filter(e -> Objects.equals(e.getSpecialization(), DENTIST)).findAny().get());
    }

    private void cure(Doctor doctor) {
        BigDecimal bill = doctor.cure();
        this.cashBox.setProfit(this.cashBox.getProfit().add(bill));
    }
}
