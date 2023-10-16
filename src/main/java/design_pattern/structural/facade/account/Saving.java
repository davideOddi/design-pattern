package design_pattern.structural.facade.account;

import java.math.BigDecimal;

public class Saving extends Account{
    public Saving(BigDecimal initAmount) {
        super(initAmount);
    }
}
