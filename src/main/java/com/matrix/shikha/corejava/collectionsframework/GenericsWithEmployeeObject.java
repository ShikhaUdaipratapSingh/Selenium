package com.matrix.shikha.corejava.collectionsframework;

import java.util.ArrayList;

public class GenericsWithEmployeeObject {

    public static void main(String[] args) {
        Employee emp1 = new Employee(14010, "Shikha");
        Employee emp2 = new Employee(14012, "Shivani"); //parameterized constructor

        ArrayList<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);


        for (Employee e : list) {
            System.out.println(e.empName + "   " + e.empId);
            e.getEmployeeDetails();

        }

        for (int i = 0; i <= list.size()-1; i++) {
            Employee e = list.get(i);
            e.getEmployeeDetails();
        }
    }
}
