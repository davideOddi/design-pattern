package design_pattern.structural.facade.account;

import java.math.BigDecimal;
import java.util.Random;

public class Account implements IAccount{

    private int accountNumber;
    private BigDecimal amount;

    public Account(BigDecimal initAmount){
        this.amount = initAmount;
        accountNumber = new Random().nextInt(100 - 10) + 10;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }


    @Override
    public void transfer(Account from, BigDecimal amount) {
        System.out.printf("{} transfering from: {}$  to:{} ", this.accountNumber, from.accountNumber, amount);
    }
}
