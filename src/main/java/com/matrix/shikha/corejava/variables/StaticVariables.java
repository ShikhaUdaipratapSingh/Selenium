package com.matrix.shikha.corejava.variables;

public class StaticVariables {

    //Static variable
    static int age = 10;

    //Instance method
    public void getData() {
        //Instance area
        System.out.println(age);
    }

    //Static method
    public static void getData1() {
        //Static Area
        System.out.println(age);
    }

    public void getData2() {
        int a = 20;

    }

    public static void main(String[] args) {
        StaticVariables st = new StaticVariables();
        //1. Direct access
        System.out.println(age);

        //2. Object reference
        System.out.println(st.age);

        //3. Class name - recommended
        System.out.println(StaticVariables.age);
    }
}
