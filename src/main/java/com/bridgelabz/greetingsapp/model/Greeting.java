package com.bridgelabz.greetingsapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "greetings")
public class Greeting {
	 
	String firstName;
    String lastName;
   
    @Id
    @GeneratedValue
     private int id;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastNmae) {
        this.lastName = lastNmae;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getId() {
        return id;
    }

    }