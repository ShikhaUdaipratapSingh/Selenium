package com.matrix.shikha.corejava.methodspractice;

public class MethodWithLocalVariable {

    int a = 15;
    int b = 20;

    public void add(int a, int b) {
        /* System.out.println(a+b);
        System.out.println(this.b + a); */
        System.out.println(this.b + this.a);
        this.a = a;
        this.b = b;

    }

    public void getData() {
        System.out.println(a);
        System.out.println(b);
    }


    public static void main(String[] args) {
        MethodWithLocalVariable obj = new MethodWithLocalVariable();
        obj.add(50, 60);
        obj.getData();
    }

}
