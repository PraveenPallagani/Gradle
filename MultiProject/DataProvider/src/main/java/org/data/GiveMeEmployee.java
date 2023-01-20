package org.data;

import org.data.models.Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GiveMeEmployee {
    private List<Employee> emplyeeList;
    public GiveMeEmployee() {
        this.emplyeeList = new ArrayList<>();
    }
    public List<Employee> getData() {

        this.emplyeeList.add(new Employee(
                "Emp1",
                22,
                new Date(),
                100
        ));

        this.emplyeeList.add(new Employee(
                "Emp2",
                23,
                new Date(),
                200
        ));

        this.emplyeeList.add(new Employee(
                "Emp3",
                24,
                new Date(),
                300
        ));

        return this.emplyeeList;
    }
}