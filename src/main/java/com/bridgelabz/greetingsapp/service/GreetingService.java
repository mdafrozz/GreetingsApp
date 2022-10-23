package com.bridgelabz.greetingsapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.greetingsapp.model.Greeting;
import com.bridgelabz.greetingsapp.repository.GreetingsRepository;

@Service
public class GreetingService {
   
	@Autowired
    GreetingsRepository repo;

    public String getmessage() {
        return "Hello World";
    }

    public String getmsgByName(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName;
    }

    public Greeting addData(Greeting model) {
        repo.save(model);
        return model;
    }
    
    public Optional<Greeting> findById(int id) {
        return repo.findById(id);
    }
    public List<Greeting> showAll() {
        return repo.findAll();
    }
    
    public Greeting edit(int id, Greeting model) {
        Greeting getUser = repo.getReferenceById(id);
        getUser.setFirstName(model.getFirstName());
        getUser.setLastName(model.getLastName());
        Greeting updateUser;
        updateUser = repo.save(getUser);
        return updateUser;
    }

}