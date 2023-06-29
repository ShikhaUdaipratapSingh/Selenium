package com.matrix.shikha.corejava.interface_int;

public interface Vehicle1 {

    String empName = "Shikha";

    void m1();

    void m2();

    //compiler will convert this interface like below.
    //public static final String empName = variable
    //public abstract m1() = method
}

