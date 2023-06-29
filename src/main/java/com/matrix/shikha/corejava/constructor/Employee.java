package com.matrix.shikha.corejava.constructor;

public class Employee {

    int empID;
    String empName;

   // Parameterized constructor
    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;

    }

    public void getEmployeeDetails() {
        System.out.println("Employee Id:" + empID);
        System.out.println("Employee Name:" + empName);
    }


    public static void main(String[] args) {
        Employee emp = new Employee(200, "Shikha");
        emp.getEmployeeDetails();
        Employee emp1 = new Employee(313, "Upendra");
        emp1.getEmployeeDetails();
        Employee emp2 = new Employee(122, "Shivani");
        emp1.getEmployeeDetails();

    }
}
