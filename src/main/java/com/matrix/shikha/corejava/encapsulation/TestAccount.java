package com.matrix.shikha.corejava.encapsulation;

public class TestAccount {

   private String name;
   private int accountNumber;
    private int accountBal;

    //getter method
    public String getName() {
        return name;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBal() {
        return accountBal;
    }

    //setter method
    public void setName(String Shikha) {
        this.name=Shikha;

    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber=accountNumber;
    }

    public void setAccountBal(int accountBal) {
        this.accountBal=accountBal;
    }
}
