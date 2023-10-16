package design_pattern.structural.facade.account;

import java.math.BigDecimal;

public class Investment extends Account{
    public Investment(BigDecimal initAmount) {
        super(initAmount);
    }
}
