package com.robertramirez.functionalreactive.functional.delegate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CalculateNAVTest {

    @Test
    public void computeStockWorth() {
        final CalculateNAV calculateNAV =
                new CalculateNAV(ticker -> new BigDecimal("6.01"));
        BigDecimal expected = new BigDecimal("6010.00");
        assertEquals(0, calculateNAV.computeStockWorth("GOOG", 1000)
                .compareTo(expected));
    }
}
