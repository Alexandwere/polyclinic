package com.javaacademy.polyclinic;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Getter
@Setter
@Slf4j
public class CashBox {
    private BigDecimal profit = BigDecimal.ZERO;

    public void acceptPay(@NonNull BigDecimal bill) {
        profit = profit.add(bill);
    }

    public void printProfit() {
        log.info("Доход: {}", profit);
    }
}
