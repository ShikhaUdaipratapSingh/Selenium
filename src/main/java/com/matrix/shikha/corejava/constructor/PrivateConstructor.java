package com.matrix.shikha.corejava.constructor;

public class PrivateConstructor {

    private PrivateConstructor() {
        System.out.println("I am in private constructor");
    }

    protected PrivateConstructor (int a, int b) {

    }

    //public static PrivateConstructor(String str) {

  //  }
    public static void main(String[] args) {
        PrivateConstructor obj = new PrivateConstructor();
    }
}
