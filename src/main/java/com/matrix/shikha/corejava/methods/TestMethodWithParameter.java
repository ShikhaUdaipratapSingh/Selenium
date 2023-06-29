package com.matrix.shikha.corejava.methods;

public class TestMethodWithParameter {

    public void addition(int a, int b) {
        System.out.println("Addition of a and b is:" + (a+b));
    }

    public void multiply(int a, int b) {
        System.out.println("Multiplication of a and b is:" + (a*b));
    }

    public void subtraction(int a, int b, int c) {
        System.out.println("Subtraction of a, b and c is:" + (a-b-c));
    }

    public void getName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        TestMethodWithParameter obj = new TestMethodWithParameter();
        obj.addition(10, 30);
        obj.multiply(20, 40);
        obj.subtraction(80, 10, 20);
        obj.getName("Shikha");
    }


}
