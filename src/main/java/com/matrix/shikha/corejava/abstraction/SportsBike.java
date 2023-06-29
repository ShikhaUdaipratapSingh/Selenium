package com.matrix.shikha.corejava.abstraction;

public class SportsBike extends Bike{

    public void m2(){
        System.out.println("In SPortsBike::m2 method");
    }

    public static void main(String[] args) {
        Vehicle obj = new SportsBike();
        obj.start();
        obj.m1();
        obj.m2();
        obj.basicDetails();
    }
}
