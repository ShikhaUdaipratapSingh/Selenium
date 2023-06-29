package com.matrix.shikha.corejava.methods;

public class MethodWithReturnType1 {

    public Employee getEmployeeDetails() {
        return new Employee();

    }

    public static void main(String[] args) {
        MethodWithReturnType1 obj = new MethodWithReturnType1();
        Employee emp = obj.getEmployeeDetails();
        System.out.println(emp.empId + " " + emp.company + " " + emp.name); //+ means upend


    }
}
