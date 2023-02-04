package com.robertramirez.functionalreactive.functional.delegate;

import java.math.BigDecimal;
import java.util.function.Function;

public class CalculateNAV {

    private Function<String, BigDecimal> priceFinder;

    public CalculateNAV(final Function<String, BigDecimal> priceFinder) {
        this.priceFinder = priceFinder;
    }

    public BigDecimal computeStockWorth(
            final String ticket,
            final int shares
    ) {
        return priceFinder.apply(ticket).multiply(BigDecimal.valueOf(shares));
    }
}
