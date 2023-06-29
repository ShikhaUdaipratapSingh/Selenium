package com.matrix.shikha.corejava.polymorphism.overriding;

public class OverridingChild1 extends OverridingParent1{

    public void m1() {
        System.out.println("In Child:: m1 method");
    }

    public void m3() {
        System.out.println("Marry GF");
    }

    public static void main(String[] args) {

        //Parent ref = Parent object
        OverridingParent1 obj = new OverridingParent1();
        obj.m1();


        //CHild ref = Child obect
        OverridingChild1 obj1 = new OverridingChild1();
        obj1.m1();
        obj1.m3();
        obj.m2();

        OverridingParent1 obj2 = new OverridingChild1();
        obj2.m1();


    }


}
