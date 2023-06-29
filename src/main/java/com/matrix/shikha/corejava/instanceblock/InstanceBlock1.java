package com.matrix.shikha.corejava.instanceblock;

public class InstanceBlock1 {

    int a;

// Instance Block
    {
        a = 20;
        System.out.println("I am in instance block...");
    }

    InstanceBlock1 () {
        System.out.println("I am in constructor...");
        System.out.println("value of a " +a);

    }

    public static void main(String[] args) {
        InstanceBlock1 obj = new InstanceBlock1();
        InstanceBlock1 obj1 = new InstanceBlock1();
    }

}
