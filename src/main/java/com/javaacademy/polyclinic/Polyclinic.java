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
    private List<Doctor> doctors;

    public Polyclinic(CashBox cashBox, List<Doctor> doctors) {
        this.cashBox = cashBox;
        this.doctors = doctors;
    }

    public void cureOfDentist() {
        cure(doctors.get(0));
    }

    public void cureOfJunSurgeon() {
        cure(doctors.get(1));
    }

    public void cureOfSenSurgeon() {
        cure(doctors.get(2));
    }

    public void cureOfTherapist() {
        cure(doctors.get(3));
    }

    private void cure(Doctor doctor) {
        BigDecimal bill = doctor.cure();
        cashBox.acceptPay(bill);
    }

//    private Doctor findDoctor(Specialization specialization) {
//        return doctors.stream().filter(e -> Objects.equals(e.getSpecialization(), specialization))
//                .findAny().get();
//    }
}
