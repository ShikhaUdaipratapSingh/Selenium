package com.matrix.shikha.corejava.methods;

public class MethodChaining2 {

    public void m1(String str) {
        System.out.println(str);
    }

    public void m2(int a) {
        m1("Shikha");
        System.out.println(a);
    }

    public static void main(String[] args) {
        MethodChaining2 obj = new MethodChaining2();
        obj.m2(15);
    }


}
