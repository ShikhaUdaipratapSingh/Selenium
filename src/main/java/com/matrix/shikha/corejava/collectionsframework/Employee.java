package com.matrix.shikha.corejava.collectionsframework;

public class Employee {

    int empId;
    String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public void getEmployeeDetails () {
        System.out.println(empId);
        System.out.println(empName);
    }
}
