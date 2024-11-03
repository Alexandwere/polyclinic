package com.javaacademy.polyclinic;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Slf4j
@Setter
@Getter
public class CashBox {
    private BigDecimal profit = BigDecimal.ZERO;

    public void acceptPay() {

    }

    public void printProfit() {
        log.info("Доход: {}", profit);
    }
}