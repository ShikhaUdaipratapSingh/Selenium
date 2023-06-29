package com.matrix.shikha.corejava.polymorphism.overriding;

public class OverridingParent2 {

    public static void m1(int a) {
        System.out.println("Parent m1 method");

    }

    private void m2() {
        System.out.println("Parent Private:: m2 method");
    }

    public RBI m3() {
        System.out.println("Parent :: m3 method");
        return null;
    }
}
