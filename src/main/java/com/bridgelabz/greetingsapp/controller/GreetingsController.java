package com.bridgelabz.greetingsapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.greetingsapp.model.Greeting;
import com.bridgelabz.greetingsapp.service.GreetingService;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {
		
		@Autowired
	    GreetingService greetingService;

	    //UC1
	    @GetMapping("/")
	    public String getMessage() {
	        return "Hello  World";
	    }

	    @GetMapping("/param")
	    public String getByParam(@RequestParam String name) {
	        return "Hello" + name;
	    }

	    @GetMapping("/path/{name}")
	    public String getPath(@PathVariable String name) {
	        return "Hello" + name;
	    }

	    //UC2
	    @GetMapping("/getmessage")
	    public String getByService() {
	        String message = greetingService.getmessage();
	        return message;
	    }

	    //UC3
	    @SuppressWarnings("unused")
		@GetMapping("/hello")
	    public String post(@RequestParam(required = false) String firstName, 
	    		@RequestParam(required = false) String lastName) {
	        if (lastName == null) lastName = "";
	        else if (firstName == null) firstName = "";
	        else if (firstName == null && lastName == null) {
	            firstName = "";
	            lastName = "";
	        }
	        return greetingService.getmsgByName(firstName, lastName);
	    }

	    //UC4
	    @PostMapping("/add")
	    public Greeting getdata(@RequestBody Greeting model) {
	        Greeting model1 = greetingService.addData(model);
	        return model1;
	    }
	    
	    //UC5
	    @GetMapping("/get/{id}")
	    public Optional<Greeting> findById(@PathVariable int id) {
	        Optional<Greeting> response = greetingService.findById(id);
	        return response;
	    }
	    
	    //UC6
	    @GetMapping("/getall")
	    public List<Greeting> showAll() {
	        List<Greeting> response = greetingService.showAll();
	        return response;
	    }
	    
	  //UC7
	    @PutMapping("/edit/{id}") 
	    public Greeting edit(@RequestBody Greeting model, @PathVariable int id) {
	        Greeting response;
	        response = greetingService.edit(id, model);
	        return response;
	    }
	}