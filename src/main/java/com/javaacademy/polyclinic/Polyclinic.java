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
    public static final int INDEX_OF_DENTIST = 0;
    public static final int INDEX_OF_JUN_SURGEON = 1;
    public static final int INDEX_OF_SEN_SURGEON = 2;
    public static final int INDEX_OF_THERAPIST = 3;

    private CashBox cashBox;
    private List<Doctor> doctors;

    public void cureOfDentist() {
        cure(doctors.get(INDEX_OF_DENTIST));
    }

    public void cureOfJunSurgeon() {
        cure(doctors.get(INDEX_OF_JUN_SURGEON));
    }

    public void cureOfSenSurgeon() {
        cure(doctors.get(INDEX_OF_SEN_SURGEON));
    }

    public void cureOfTherapist() {
        cure(doctors.get(INDEX_OF_THERAPIST));
    }

    private void cure(Doctor doctor) {
        BigDecimal bill = doctor.cure();
        cashBox.acceptPay(bill);
    }
}
