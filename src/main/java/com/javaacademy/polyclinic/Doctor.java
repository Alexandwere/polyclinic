package com.javaacademy.polyclinic;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Slf4j
public class Doctor {
    private BigDecimal costOfSession;
    private Specialization specialization;

    public BigDecimal cure() {
        log.info("{} вылечил человека", this.specialization);
        return costOfSession;
    }
}
