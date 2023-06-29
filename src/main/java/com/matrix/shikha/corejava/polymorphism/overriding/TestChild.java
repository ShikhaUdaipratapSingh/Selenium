package com.matrix.shikha.corejava.polymorphism.overriding;

public class TestChild extends TestParent{

    public void m1() {
        System.out.println("Child m1 method");
    }

    public static void main(String[] args) {
        TestChild obj = new TestChild();
        obj.m1();
    }

}
