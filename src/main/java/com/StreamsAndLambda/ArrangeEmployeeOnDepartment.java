package com.StreamsAndLambda;

import com.StreamsAndLambda.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrangeEmployeeOnDepartment {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Vinayak","IT"));
        employees.add(new Employee(2,"Uttu","IT"));
        employees.add(new Employee(3,"Ankit","IT"));
        employees.add(new Employee(4,"Satyjit","IT"));
        employees.add(new Employee(5,"Paresh","Account"));
        employees.add(new Employee(6,"Savi","Admin"));
        employees.add(new Employee(7,"Shana","Account"));
        employees.add(new Employee(8,"Sanju","Admin"));


        groupbyDepartment(employees);



    }

    private static void groupbyDepartment(List<Employee> employees) {

        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment)));
    }
}
