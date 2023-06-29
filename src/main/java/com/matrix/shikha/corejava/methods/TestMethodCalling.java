package com.matrix.shikha.corejava.methods;

public class TestMethodCalling {

    //Method declaration
    public void getData() {
        //Method implementation
        System.out.println("I am in geData method..");
    }

    //Static Method declaration
    public static void getInfo() {
        //Static Method implementation
        System.out.println("I am in geInfo method..");
    }

    public static void main(String[] args) {
        TestMethodCalling obj = new TestMethodCalling();
        obj.getData();//Method calling

        //By using object
        obj.getInfo();//Static Method calling

        //Direct call
        getInfo();

        //By using class name
        TestMethodCalling.getInfo();
    }



}

