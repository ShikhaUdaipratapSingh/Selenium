package com.matrix.shikha.corejava.encapsulation;

public class TestAccountClass {

    public static void main(String[] args) {
        TestAccount obj = new TestAccount();

        obj.setAccountNumber(456987);
        obj.getAccountNumber();
        System.out.println("From getter method: " +obj.getAccountNumber());
    }
}
