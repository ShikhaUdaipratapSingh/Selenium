package com.matrix.shikha.corejava.variables;

public class LocalVariables {

    //Method
    public void getData(){
        System.out.println();
        //"a" cannot be accessed because it is not into the local variable
    }
    //Constructor
    public LocalVariables(){
        int b = 20;
    }

    {
        //Blocks
        int a = 50;
        System.out.println(a);
    }

    public void getDetails(int age ) {
        age = 40;
        int data = 10;
        System.out.println(data);
        System.out.println(age);

    }

    //Instance method
    public void getDetails() {
        //Instance area
    }

    //Static method
    public static void getDetails1() {
        //static area

    }
    // Method void getData
    public static void main(String[] args) {
        // local variables
        int a = 10;
        int b = 15;
        System.out.println(a-b);
        //can be accessed inside the "{}" only
    }

}
