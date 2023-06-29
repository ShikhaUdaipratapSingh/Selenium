package com.matrix.shikha.corejava.inheritance;

import java.security.PublicKey;

public class TestParent {

    int x = 100;
    int y = 250;
    int a = 1000;
    int b = 4000;

    public void m1() {
        System.out.println("I am in Parent m1 method");

    }

    public void m2() {
        System.out.println("I am in Parent m2 method");
    }

    public void m3() {
        System.out.println("I am in Parent m3 method");
    }

    public void m4(int a, int b) {
        System.out.println(a+b);
    }
}
