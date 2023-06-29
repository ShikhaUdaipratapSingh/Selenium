package com.matrix.shikha.corejava.polymorphism.overloading;

public class FunctionOverloading1 {

    public void multiplication(int a, int b) {

        System.out.println(a*b);
    }

    public void multiplication(int a, int b, int c) {
        System.out.println(a*b*c);
    }

    public void multiplication(int a, int b, int c, int d) {
        System.out.println(a*b*c*d);
    }

    public void multiplication(double a, int b) {
        System.out.println(a*b); //Same number of parameters but different data types
    }

    public static void main(String[] args) {
        FunctionOverloading1 obj = new FunctionOverloading1();
        obj.multiplication(2, 2);
        obj.multiplication(2, 2, 2);
        obj.multiplication(2, 2, 2, 2);
        obj.multiplication(20.5,10);

    }
}
