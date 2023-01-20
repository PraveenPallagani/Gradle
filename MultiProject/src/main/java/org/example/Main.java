package org.example;

import org.service.GiveStats;

public class Main {

    public static void main(String[] args) {
        GiveStats gs = new GiveStats();
        gs.giveAllEmps().stream().forEach(emp->{
            System.out.println(emp.toString());
        });
    }
}