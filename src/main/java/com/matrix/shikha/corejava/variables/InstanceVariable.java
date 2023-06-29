package com.matrix.shikha.corejava.variables;

public class InstanceVariable {

    //Instance variable
    int age = 10;
    String str = "Shikha";
    int[] ar = {11, 12, 13};
    boolean b = true;

    public void m4() {
        System.out.println(age);
    }


    public void m1() {
        age = 20;
        System.out.println(age);

    }

    //Instance method
    public void m2() {
        //Instance area
        System.out.println(age);
    }

    //Static method
    public static void m3() {
        //Static area

        InstanceVariable obj = new InstanceVariable();
        System.out.println(obj.age);
        System.out.println(obj.b);
        System.out.println(obj.str);

    }

//    InstanceVariables void() {
//        System.out.println(age);
//    }

//    {
//        System.out.println(age);
//    }

    public static void main(String[] args) {

    }
}
