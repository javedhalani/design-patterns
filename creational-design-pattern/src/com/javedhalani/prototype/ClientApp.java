package com.javedhalani.prototype;

public class ClientApp {

    public static void main(String[] args) throws CloneNotSupportedException {

        EmployeeList employees = new EmployeeList();
        employees.loadData();

        EmployeeList employees1 = employees.clone();
        EmployeeList employees2 = employees.clone();

        employees1.getEmployees().remove("Ashwin");
        employees2.getEmployees().add("Utpal");

        System.out.println("Employees : " + employees.getEmployees());
        System.out.println("Employees-1 : " + employees1.getEmployees());
        System.out.println("Employees-2 : " + employees2.getEmployees());


    }
}
