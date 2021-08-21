package com.tts.week9day2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// adding entity to your model class sllows spring to assume that we want to
// create a table for our sutomers and add all instances
@Entity                                         // makes certain the data is seen as an SQL Table
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)     // AUTO == static constant ENUM
    private Long id;                                    // this is the SQL Primary Key
    private String firstName;
    private String lastName;


    // default constructor
    public Customer() {                         // you have to create the default constructor if you create any additional constructors, otherwise Java creates a constructor by default


    }

    //constructor
    public Customer(String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    // toString()
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}


