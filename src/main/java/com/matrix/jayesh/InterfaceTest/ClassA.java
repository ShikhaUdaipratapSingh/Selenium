package com.matrix.jayesh.InterfaceTest;

interface ClassA extends Showable{

    void display();

    default void msg(){System.out.println("default method");}
    static void display2(){
        System.out.println("Test method");
    }
}
