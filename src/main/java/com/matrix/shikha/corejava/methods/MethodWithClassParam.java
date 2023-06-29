package com.matrix.shikha.corejava.methods;

public class MethodWithClassParam {

    public void getInfo() {
        Employee emp = new Employee();
        System.out.println(emp.name);
        System.out.println(emp.empId);
        System.out.println(emp.company);
    }

    public static void main(String[] args) {
        MethodWithClassParam obj = new MethodWithClassParam();
        obj.getInfo();
    }
}
