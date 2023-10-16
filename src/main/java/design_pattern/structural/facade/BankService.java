package design_pattern.structural.facade;

import design_pattern.structural.facade.account.*;

import java.math.BigDecimal;
import java.util.Hashtable;

public class BankService{

    public static enum types {
        SAVINGS, INVESTMENT, CHEQUING
    }
    private Hashtable<Integer, Account> bankAccount;

    public BankService(){
        this.bankAccount = new Hashtable<>();
    }

    public int createNewAccount(types type, BigDecimal initAmount) throws Exception {
        Account newAccount = null;

        switch (type){
            case SAVINGS:
                newAccount = new Saving(initAmount);
                break;
            case CHEQUING:
                newAccount = new Saving(initAmount);
                break;
            case INVESTMENT:
                newAccount = new Investment(initAmount);
                break;
            default:
                throw new Exception("Invalid account type");
        }
        if (newAccount != null){
            int number = newAccount.getAccountNumber();
            this.bankAccount.put(number, newAccount);
            return newAccount.getAccountNumber();
        }
        return -1;
    }

    public void transferMoney(int to, int from, BigDecimal amount){
        Account toAccount = this.bankAccount.get(to);
        Account fromAccount = this.bankAccount.get(from);
        fromAccount.transfer(toAccount, amount);

    }

}
