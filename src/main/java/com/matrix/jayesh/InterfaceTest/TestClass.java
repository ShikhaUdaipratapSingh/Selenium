package com.matrix.jayesh.InterfaceTest;

public class TestClass implements ClassA, Showable {
    /**
     * Multiple inheritance in Java by interface
     * Note: A class cannot be private or protected except nested class.
     * **/
    public void display(){
        System.out.println("Test ");
    }

    public void cal(){
        System.out.println("Test cal");
    }

    public static void main(String[] args) {
        TestClass obj = new TestClass();
        obj.display();
        obj.cal();
        obj.msg(); // default method

    }
}
