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
        cure(findDoctor(DENTIST));
    }

    public void cureOfJunSurgeon() {
        cure(findDoctor(SURGEON));
    }

    public void cureOfSenSurgeon() {
        cure(findDoctor(SURGEON));
    }

    public void cureOfTherapist() {
        cure(findDoctor(THERAPIST));
    }

    private void cure(Doctor doctor) {
        BigDecimal bill = doctor.cure();
        cashBox.acceptPay(bill);
    }

    private Doctor findDoctor(Specialization specialization) {
        return doctors.stream().filter(e -> Objects.equals(e.getSpecialization(), specialization))
                .findAny().get();
    }
}
