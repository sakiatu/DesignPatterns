package facade;

import java.math.BigDecimal;

/*
A structural design pattern

facade means mask -> hide all the complexity of implementation of any object from the client class

for example: i go to a restaurant and talking to all the cooks and taking foods by myself. but if a use facade in this,
i would use a waiter to work as a middle person and this is make sense.
so here waiter is like the facade class, a wrapper class

in programming, if a class need to use bunch of same classes, it is better to use a wrapper class
which provides all the functionality.

Example:
(without facade)
 User.class uses Savings.class,Chequing.class,Investment.class
 and these 3 classes use Account.class interface

 (with facade)
 User.class uses BankService.class(facade class) in order to interact with Account.class

 */

public class Customer {

    public static void main(String[] args) {
        BankServices bankServices = new BankServices();

        int savings = bankServices.createAccount("savings",new BigDecimal(500.00));
        int investment = bankServices.createAccount("investment",new BigDecimal(500.00));

        bankServices.transferMoney(savings,investment,new BigDecimal(400.00));
    }
}
