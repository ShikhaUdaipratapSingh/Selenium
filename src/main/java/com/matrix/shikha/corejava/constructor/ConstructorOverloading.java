package com.matrix.shikha.corejava.constructor;

public class ConstructorOverloading {

    ConstructorOverloading() {
        System.out.println("I am in default constructor");

    }

    ConstructorOverloading(int age, String name) {
        System.out.println("I am in Param constructor");
        System.out.println(age + " " + name);

    }

    public void getData() {

    }

    public static void main(String[] args) {

        //1st Way
        new ConstructorOverloading().getData(); // nameless object

        //2nd way
        ConstructorOverloading obj2 = new ConstructorOverloading(30, "Shikha"); // named object
        obj2.getData();

        //3rd way
        ConstructorOverloading obj3;
        obj3 = new ConstructorOverloading();
    }
}
