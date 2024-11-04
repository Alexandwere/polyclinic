package com.javaacademy.polyclinic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.util.List;

@Component
@Getter
@AllArgsConstructor
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
        cashBox.acceptPay(bill);
    }
}
