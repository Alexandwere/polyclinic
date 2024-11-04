package com.javaacademy.polyclinic;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Specialization {
    DENTIST("Стоматолог"), SURGEON("Хирург"), THERAPIST("Терапевт");

    private final String specialization;

    @Override
    public String toString() {
        return specialization;
    }
}
