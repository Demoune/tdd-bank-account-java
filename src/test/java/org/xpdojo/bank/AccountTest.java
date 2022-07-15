package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account newAcc = new Account();
        assertEquals(0, newAcc.getBalance());
    }
}
