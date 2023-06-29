package com.matrix.shikha.corejava.methods;

public class MethodWithReturnType {

    public int getAddition() {
        int a = 100;
        int b = 200;
        int c = a+b;
        return c;
    }

    public String getName() {
        String name = "Shikha";
        return name;
    }

    public int doAddition(int a, int b) {
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
        MethodWithReturnType obj = new MethodWithReturnType();
        int i = obj.getAddition();
        System.out.println(i);

        System.out.println("----------------------");

        String str = obj.getName();
        System.out.println(str);

       int a = obj.doAddition(100, 200);
        System.out.println("Addition is:" +a);
    }
}

