package com.spring.mvc;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    private String name;
    private String surname;
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String laptop;
    private Map<String, String> laptops;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        laptops = new HashMap<>();
        laptops.put("Lenovo", "Lenovo z300");
        laptops.put("Asus", "Asus Rog 3Z");
        laptops.put("MacBook", "MacBook air m2");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getLaptop() {
        return laptop;
    }

    public void setLaptop(String laptop) {
        this.laptop = laptop;
    }

    public Map<String, String> getLaptops() {
        return laptops;
    }

    public void setLaptops(Map<String, String> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
