package design_pattern.structural.facade.account;

import java.math.BigDecimal;

public class Chequing extends Account{
    public Chequing(BigDecimal initAmount) {
        super(initAmount);
    }
}
