package com.bridgelabz.greetingsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.greetingsapp.service.GreetingService;

@RestController
public class GreetingsController {
	
	@Autowired
	GreetingService greetingService;
	
	  	@GetMapping({"/",""})
	    public String getMessage() {
	        return "Hello World!!";
	    }

	    @GetMapping("/getByParam")
	    public String getByParam(@RequestParam String name) {
	        return "Hello" + name;
	    }

	    @GetMapping("/getPath/{name}")
	    public String getPath(@PathVariable String name) {
	        return "Hello" + name;
	    }
	    
	    @GetMapping("/getbyservice")
	    public String getbyservice() {
	    	String message = greetingService.getmessage();
	    	return message;
	    }
	    
	    @SuppressWarnings("unused")
		@GetMapping("/post")
	    public String post(@RequestParam(required = false) String firstName,
	    		@RequestParam(required = false) String lastName) {
	        if (lastName == null) lastName = "";
	        else if (firstName == null) firstName = "";
	        else if (firstName == null && lastName == null) {
	            firstName = "";
	            lastName = "";
	        }
	        return greetingService.HelloByName(firstName, lastName);
	    }
}