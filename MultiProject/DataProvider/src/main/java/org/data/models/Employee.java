package org.data.models;

import java.util.Date;

public class Employee {
    private String name;

    private int age;

    private Date joinDate;
    private int baseSalary;

    public Employee(String name,int age,Date joinDate,int baseSalary) {
        this.name = name;
        this.age = age;
        this.joinDate = joinDate;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", joinDate=" + joinDate +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
