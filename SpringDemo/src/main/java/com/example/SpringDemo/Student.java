package com.example.SpringDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;  // Corrected the field name
    private String city;  // Corrected the field name

    // Default constructor (required by JPA)
    public Student() {}

    // Parameterized constructor
    public Student(String name, String city) {
        this.name = name;  // Corrected assignment
        this.city = city;  // Corrected assignment
    }

    // Getter and Setter methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Override toString method for better readability
    @Override
    public String toString() {
        return "Student{name='" + name + "', city='" + city + "'}";
    }
}
