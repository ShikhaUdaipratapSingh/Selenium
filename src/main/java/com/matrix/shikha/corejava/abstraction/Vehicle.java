package com.matrix.shikha.corejava.abstraction;

public abstract class Vehicle {

    //abstract method
    public abstract void start();

    public abstract void m1();

    public abstract void m2();

    //non abstract method
    public void basicDetails() {
        System.out.println("Basic details about Vehicle");
    }

}
