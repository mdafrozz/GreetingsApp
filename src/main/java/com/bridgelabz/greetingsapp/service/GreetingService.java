package com.bridgelabz.greetingsapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.greetingsapp.model.GreetingsModel;
import com.bridgelabz.greetingsapp.repository.GreetingsRepository;

@Service
public class GreetingService {
	
	@Autowired 
	GreetingsRepository repo;
	public String getmessage() {
		return "Hello World";
	}

	public String HelloByName(String firstName, String lastName) {
	        return "Hello "+firstName+" "+lastName+"..!!";
    }
	
	public GreetingsModel add(GreetingsModel model) {
		repo.save(model);
		return model;
	}
}
