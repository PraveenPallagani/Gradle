package org.service;

import org.data.GiveMeEmployee;
import org.data.models.Employee;

import java.util.List;

public class GiveStats {
    private GiveMeEmployee gme;
    public GiveStats() {
        this.gme = new GiveMeEmployee();
    }

    public List<Employee> giveAllEmps() {
        return this.gme.getData();
    }
}