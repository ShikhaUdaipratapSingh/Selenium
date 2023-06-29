package com.matrix.shikha.corejava.polymorphism.overriding;

public class OverridingChild2 extends OverridingParent2{

    public static void m1(String a) {
        System.out.println("Child m1 method");
    }

    private void m2() {
        System.out.println("Child Private:: m2 method");
    }

    public HDFC m3() {
        System.out.println("Child :: m3 method");
        return null;
    }

    public static void main(String[] args) {

        OverridingParent2 obj1 = new OverridingChild2();
        obj1.m1(10);
        System.out.println("---------------");
        obj1.m3();

        OverridingChild2 obj2 = new OverridingChild2();
        obj2.m1("Hello");
        obj2.m2();

        OverridingParent2 obj3 = new OverridingParent2();
        obj3.m1(20);




    }

}
