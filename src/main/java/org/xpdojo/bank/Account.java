package org.xpdojo.bank;

public class Account {


    int balance = 0;

    public Account() {

    }

    public Account(int initialAmount) {
        balance = initialAmount;
    }


    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) throws IllegalStateException {
        if(balance < amount) throw new IllegalStateException("Not enough balace to perform the withdrawal");
        balance -= amount;
    }

    public void transferTo(Account accountB, int amount) {
        withdraw(amount);
        accountB.deposit(amount);
    }

}
