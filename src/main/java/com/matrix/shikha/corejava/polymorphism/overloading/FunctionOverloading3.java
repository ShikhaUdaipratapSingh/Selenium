package com.matrix.shikha.corejava.polymorphism.overloading;

public class FunctionOverloading3 {


    public void m1(int age, String name) {
        System.out.println(age + "-----" + name);
    }

    public void m1(String name, int age) {
        System.out.println(name + "------" + age);

    }

    public void m1(int [] arr, String [] stArr) {
        System.out.println(arr + "------" + stArr);
        for (String str: stArr) {
            System.out.println(str);
        }

        for (int num : arr) {
            System.out.println(num);
        }

    }

    public void m1(Student st) {
        System.out.println(st.name);
        System.out.println(st.rollNo);

    }

    public int m1() {
        return 10;
    }

    public static void main(String[] args) {
        FunctionOverloading3 obj = new FunctionOverloading3();
        obj.m1(20, "Shikha");
        obj.m1("Shikha",  20);

        int [] ar = {10, 20, 30};
        String [] strArr = {"Shi", "Shik", "Shikha"};
        obj.m1(ar, strArr);

        Student std_obj = new Student();
        obj.m1(std_obj);

        System.out.println("value of m1 method" + " " + obj.m1());

    }
}
