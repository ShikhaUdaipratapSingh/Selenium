package com.matrix.shikha.corejava.methods;

public class MethodChaining {

    public void m1() {
        System.out.println("I am in m1 method");
        m2();
    }

    public void m2() {
        System.out.println("I am in m2 method");
        m3();
    }

    public void m3() {
        System.out.println("I am in m3 method");
    }

    public static void main(String[] args) {
        MethodChaining obj = new MethodChaining();
        obj.m1();
    }
}
