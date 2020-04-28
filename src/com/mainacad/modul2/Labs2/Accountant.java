package com.mainacad.modul2.Labs2;

public class Accountant {

    public static void main(String[] a) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        employee1.calcSalary("Vadim", 9, 11, 15);
        employee2.calcSalary("Andrey", 22);
        employee3.calcSalary("Sergey", 50, 70, 4, 3, 2);
    }
}