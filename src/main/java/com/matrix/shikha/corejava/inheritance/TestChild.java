package com.matrix.shikha.corejava.inheritance;

import com.matrix.akhilesh.constructor.Test;

public class TestChild extends TestParent {

    int a = 20;
    int b = 20;

    public void getData() {
        System.out.println(a+b);
        System.out.println(x+y);

    }

    public void getDetails() {
        System.out.println(a+b);
        System.out.println(x+y);
        System.out.println(super.a+b);

    }

    public void m1() {
        System.out.println("I am in Child m1 method");
    }

    public void m2() {
        m1(); //This will go to the same class because same class will always have the priority
        super.m1(); //This will go to the Parent class because "super" keyword used hence the priority changes
        m3(); //This will go to Parent class because there is no m3 method in child class hence the priority is changed
        System.out.println("I am in Child m2 method");
        m4(10,10);
    }


    public static void main(String[] args) {
        TestChild obj = new TestChild();
        obj.getData();
        obj.getDetails();
        obj.m2();
        obj.m4(25, 25);
    }
}
