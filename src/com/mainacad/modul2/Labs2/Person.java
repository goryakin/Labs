package com.mainacad.modul2.Labs2;

public class Person {

    String firstName, lastName, gender;
    int age, phoneNumber;

    public void data(String firstName){
        System.out.println(firstName);
    }

    public void data(String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
    }

    public void data(String firstName, String lastName, String gender){
        System.out.println(firstName + " " + lastName + " " + gender);
    }

    public void data(String firstName, String lastName, String gender, int age){
        System.out.println(firstName + " " + lastName + " " + gender + " " + age);
    }

    public void data(String firstName, String lastName, String gender, int age, int phoneNumber){
        System.out.println(firstName + " " + lastName + " " + gender + " " + age + " " + phoneNumber);
    }
}
class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.data("Vadya");
        person.data("Vadya", "Abramov");
        person.data("Vadya", "Abramov", "male");
        person.data("Vadya", "Abramov", "male", 40);
        person.data("Vadya", "Abramov", "male", 40, 98654123);
    }
}