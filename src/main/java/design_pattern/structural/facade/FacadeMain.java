package design_pattern.structural.facade;

import java.math.BigDecimal;

public class FacadeMain {

    /*
    * Just one easy client to encapsulate subsystem (single point of entry/access) hiding complexity
    * Design interface
    * */
    public static void main(String[] args) throws Exception {
        BankService myBankService = new BankService();
        int mySaving = myBankService.createNewAccount(BankService.types.SAVINGS, new BigDecimal(500.00));
        int myInvestment = myBankService.createNewAccount(BankService.types.INVESTMENT, new BigDecimal(1000.00));
        int myChequing = myBankService.createNewAccount(BankService.types.INVESTMENT, new BigDecimal(1000.00));
    }
}
