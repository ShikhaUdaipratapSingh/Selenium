package com.matrix.shikha.corejava.methods;

public class MethodWithLocalVariablePriority {

    int a;
    int b;

    public void add(int a, int b) {
        System.out.println(a+b);
        System.out.println(this.a + this.b); //this is a keyword which refers to current class instance(methods, variables, constructor)
        System.out.println(a+b);
        this.a = a;
        this.b = b;
//Local variable will be given priority if called.

    }

    public void getData() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        MethodWithLocalVariablePriority obj = new MethodWithLocalVariablePriority();
        obj.add(10, 20); //if we remove the values when calling, it will automatically take the values from instance variable.
        obj.getData();
    }

}
