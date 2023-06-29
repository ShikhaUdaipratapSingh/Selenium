package com.matrix.shikha.corejava.polymorphism.overloading;

public class FunctionOverloading2 {

    public void getDetails(int empId, String empName, String companyName) {
        System.out.println("Empid is :"  + " " + empId + " " +  "Empname is:"  + " " + empName + " " + "Companyname is " + companyName);

    }

    public void getDetails(String name, int age) {
        System.out.println("Name is" + " " + name + " " + "Age is :" +age);
    }

    public static void main(String[] args) {
        FunctionOverloading2 obj = new FunctionOverloading2();
        obj.getDetails("Shikha", 32);
        obj.getDetails(45317, "Upendra", "Snow Software");
    }
}
