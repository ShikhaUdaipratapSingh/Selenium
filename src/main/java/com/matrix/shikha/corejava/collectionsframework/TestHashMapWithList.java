package com.matrix.shikha.corejava.collectionsframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestHashMapWithList {
    public static void main(String[] args) {

        List<String> student1 = new ArrayList<>();
        student1.add("Rahul");
        student1.add("ABC");

        List<String> student2 = new ArrayList<>();
        student2.add("Prachi");
        student2.add("LMN");

        Map<Integer, List<String>> map = new HashMap<>();
        map.put(100, student1 );
        map.put(200, student2);

        System.out.println(map);

        Employee emp = new Employee(14, "Abhishek");
        Employee emp3 = new Employee(16, "Shikha");

        Map<String, Employee> emp1 = new HashMap<>();
        emp1.put("Abhishek",emp);
        emp1.put("Shikha", emp3);

        Employee e = emp1.get("Abhishek");
        System.out.println(e.empName + "-------" + e.empId);

        Employee eee = emp1.get("Shikha");
        System.out.println(eee.empName + "------" + eee.empId);

        for (Map.Entry<String, Employee> entry: emp1.entrySet()) {
            String key = entry.getKey();
            Employee ee = entry.getValue();
            System.out.println(e.empName+"--------" +e.empId);
//            Employee e2 = entry.getValue();
//            System.out.println(eee.empName+"-----"+eee.empId);

        }
    }
}
