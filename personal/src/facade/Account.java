package facade;

import java.math.BigDecimal;

public interface Account {
    void deposit(BigDecimal amount);

    void withdraw(BigDecimal amount);

    void transfer(Account toAccount,BigDecimal amount);

    int getAccountNumber();
}
