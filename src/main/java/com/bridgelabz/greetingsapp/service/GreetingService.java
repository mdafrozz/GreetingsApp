package com.bridgelabz.greetingsapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	
	public String getmessage() {
		return "Hello World";
	}

	public String HelloByName(String firstName, String lastName) {
	        return "Hello "+firstName+" "+lastName+"..!!";
    }
}
