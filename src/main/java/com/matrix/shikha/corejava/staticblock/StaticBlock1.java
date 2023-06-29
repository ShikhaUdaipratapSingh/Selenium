package com.matrix.shikha.corejava.staticblock;

public class StaticBlock1 {

    static {
        System.out.println("1st Static block");
    }

    static {
        System.out.println("2nd Static block");
    }

    {
        System.out.println("1st instance block");
    }

    StaticBlock1 () {
        System.out.println("0-args constructor");
    }

    StaticBlock1 (int rollNo) {
        System.out.println("1-args constructor");

    }

    public static void main(String[] args) {
        new StaticBlock1();
        new StaticBlock1(10);

    }
}
