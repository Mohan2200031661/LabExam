package com.klef.jfsd.exam.SetterDI;

import java.util.List;

public class EmployeeSetter {
    private int id; // primitive
    private String name; // non-primitive
    private String department; // non-primitive (corrected typo from 'depaartment')
    private double salary; // primitive
    private List<String> skills; // non-primitive

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    // Overriding toString() Method
    @Override
    public String toString() {
        return "Employee {" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", department='" + department + '\'' +
               ", salary=" + salary +
               ", skills=" + skills +
               '}';
    }
}
