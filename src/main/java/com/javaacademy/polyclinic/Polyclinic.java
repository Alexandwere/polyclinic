package com.javaacademy.polyclinic;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class Polyclinic {
    private CashBox cashBox;
    private List<Doctor> doctors;

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
        this.cashBox.setProfit(this.cashBox.getProfit().add(bill));
    }
}
