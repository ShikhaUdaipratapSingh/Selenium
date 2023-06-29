package com.matrix.shikha.corejava.constructor;

import java.security.PublicKey;

public class TestConstructor2 {

    public void getData() {
        int a = 10;
        int b = 40;
        int c = a+b;
        System.out.println("Addition of a and b is :" + c);
    }

    public TestConstructor2 () {
        int c = 50;
        int d = 40;
        int e = c+d;
        System.out.println("Addition of a and b is :" + e);

    }

    public static void main(String[] args) {
        TestConstructor2 obj = new TestConstructor2();

    }
}
