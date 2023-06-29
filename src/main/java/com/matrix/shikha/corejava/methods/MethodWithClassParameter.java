package com.matrix.shikha.corejava.methods;

public class MethodWithClassParameter {

    public void getData(Employee emp) {
        System.out.println(emp.empId);
        System.out.println(emp.company);
        System.out.println(emp.name);

    }

    public void getInfo(Student s) {
        System.out.println(s.name);
        System.out.println(s.rollNo);

    }

    public void display(Employee emp, Student s) {

    }

    public static void main(String[] args) {

        Employee obj1 = new Employee();
        Student st1  = new Student();

        MethodWithClassParameter o = new MethodWithClassParameter();
        o.getData(obj1);
        o.getInfo(st1);
        o.display(obj1, st1);
    }
}
