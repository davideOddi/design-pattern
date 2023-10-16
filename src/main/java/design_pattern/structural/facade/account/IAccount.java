package design_pattern.structural.facade.account;

import java.math.BigDecimal;

public interface IAccount {
    void transfer(Account from, BigDecimal amount);
}
