package com.workintech.developers;

public class Employee {
    private String name;
    private int salary;
    private int id;

    public Employee( int id, String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void work() {
        System.out.println("Employee starts working");
    }

}
