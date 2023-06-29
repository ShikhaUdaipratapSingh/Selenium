package com.matrix.shikha.corejava.polymorphism.overloading;

public class OverloadingTypePromotionAmbiguity {

    public void m1(int e, long f) {
        System.out.println(e+f);
    }

    public void m1(long e, int f) {
        System.out.println(e+f);
    }

    public void m1(int sh) {
        System.out.println(sh);
    }

    public static void main(String[] args) {
        OverloadingTypePromotionAmbiguity obj = new OverloadingTypePromotionAmbiguity();
        //obj.m1(2, 2);

        obj.m1('a');
    }
}
