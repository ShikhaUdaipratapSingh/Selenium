package com.matrix.shikha.corejava.inheritance;

public class TestParentClassConstructor {

    int a;
    String name;
    String name1;
    int b;

    public TestParentClassConstructor() {
        System.out.println("Parent class Constructor");
        a = 100;
        name = "Shikha";

    }
    public TestParentClassConstructor(int rollNo) {
        this();
        System.out.println(rollNo);
    }

    public TestParentClassConstructor(String  str) {
        this(46);
        System.out.println(str);
    }

    public TestParentClassConstructor(boolean br) {
        this("Shikha");
        System.out.println(br);

    }

}
