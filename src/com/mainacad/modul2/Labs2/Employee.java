package com.mainacad.modul2.Labs2;

public class Employee {

    public void calcSalary(String name, double... salary) {
        double finSalary = 0;
        for (int i = 0; i < salary.length; i++) {
            finSalary += salary[i];
        }
        System.out.println(String.format("Name is %s, salary is %f", name, finSalary));
    }
}