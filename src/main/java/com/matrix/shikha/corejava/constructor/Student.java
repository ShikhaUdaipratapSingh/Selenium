package com.matrix.shikha.corejava.constructor;

public class Student {

    int rollNo;
    String name;

    // Parameterized Constructor
    public Student(int roll, String str) {
        this.rollNo = roll;
        this.name = str;
        System.out.println(this.rollNo);
        System.out.println(this.name);

    }

    // no-args constructor
    public Student() {
        System.out.println("I am in constructor");
    }


    public static void main(String[] args) {
        Student s1 = new Student(11, "Shikha");

        Student s2 = new Student(20, "Upendra");

        Student s3 = new Student(44, "Shivani");

        Student s4 = new Student();

    }
}
