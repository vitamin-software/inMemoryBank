package com.vitamin.bank;

import java.math.BigDecimal;

/**
 * Created by vitamin on 09/06/2017.
 */
public interface Bank {
    class InsufficientFundsException extends Exception {}

    void transferMoney(Account from, Account to, BigDecimal amount) throws InsufficientFundsException;
}
