package com.javaacademy.polyclinic;

import lombok.ToString;

public enum Specialization {
    DENTIST("Стоматолог"), SURGEON("Хирург"), THERAPIST("Терапевт");

    private final String specialization;

    Specialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return specialization;
    }
}
