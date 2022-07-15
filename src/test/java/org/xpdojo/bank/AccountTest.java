package org.xpdojo.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    Account account;

    @BeforeEach
    public void setup() {
        account = new Account();
    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        assertEquals(0, account.getBalance());
    }

    @Test
    public void deposit() {
        account.deposit(50);
        assertEquals(50, account.getBalance());
    }

    @Test
    public void withdraw_hasMoney() {
        account.deposit(50);
        account.withdraw(20);
        assertEquals(30, account.getBalance());
   }

   @Test
   public void withdraw_notEnoughMoney() {
        account.deposit(50);
        assertThrows(IllegalStateException.class, () -> account.withdraw(100));

    }
}
