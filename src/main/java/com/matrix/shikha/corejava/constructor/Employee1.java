package com.matrix.shikha.corejava.constructor;

public class Employee1 {

    int empID;
    String empName;

   // Parameterized constructor
    public Employee1(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;

    }

    public void getEmployeeDetails() {
        System.out.println("Employee Id:" + empID);
        System.out.println("Employee Name:" + empName);
    }


}
