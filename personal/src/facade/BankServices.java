package facade;

import java.math.BigDecimal;
import java.util.Hashtable;

public class BankServices {

    private Hashtable<Integer,Account> bankAccounts;

    BankServices(){
        bankAccounts = new Hashtable<>();
    }

    public int createAccount(String type, BigDecimal initAmount){
        Account newAccount = null;
        switch (type){
            case "chequing":
                newAccount = new Chequing();
                break;
            case "savings":
                newAccount = new Savings();
                break;
            case "investment":
                newAccount = new Investment();
                break;
            default:
                System.out.println("invalid type");
        }
        if(newAccount !=null){
            bankAccounts.put(newAccount.getAccountNumber(),newAccount);
            return newAccount.getAccountNumber();
        }
        return -1;
    }

    void transferMoney(int to, int from, BigDecimal amount){
        Account toAccount = bankAccounts.get(to);
        Account fromAccount = bankAccounts.get(from);
        fromAccount.transfer(toAccount,amount);
    }
}
