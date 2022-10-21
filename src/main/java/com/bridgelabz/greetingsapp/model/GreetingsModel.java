package com.bridgelabz.greetingsapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GreetingsModel {
	
	@Id
	@GeneratedValue
	private int ID;
	private String firstName;
	private String lastName;
	
	public GreetingsModel(int iD, String firstName, String lastName) {
		ID = iD;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
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
}
