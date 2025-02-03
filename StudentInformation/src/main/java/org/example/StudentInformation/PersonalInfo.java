package org.example.StudentInformation;

import org.springframework.stereotype.Component;

@Component("personalInfo")
public class PersonalInfo {

    private String name;
    private int age;
    private String city;
    private String email;

    public PersonalInfo(String name, int age, String city, String email) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.email = email;
    }

    public void displayPersonalInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}
