package com.javedhalani.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList implements Cloneable {

    private List<String> employees;

    public EmployeeList() {
        employees = new ArrayList<>();
    }

    public EmployeeList(List<String> employees) {
        this.employees = employees;
    }

    public void loadData() {
        this.employees.add("Javed");
        this.employees.add("Ashwin");
        this.employees.add("Saurabh");
        this.employees.add("Apurva");
    }

    public List<String> getEmployees() {
        return this.employees;
    }

    @Override
    public EmployeeList clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for(String emp : employees) {
            temp.add(emp);
        }

        return new EmployeeList(temp);
    }
}
