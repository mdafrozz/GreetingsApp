package com.bridgelabz.greetingsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.greetingsapp.model.GreetingsModel;
import com.bridgelabz.greetingsapp.service.GreetingService;

@RestController
public class GreetingsController {
	
	@Autowired
	GreetingService greetingService;
		//UC1
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
	    //UC2
	    @GetMapping("/getbyservice")
	    public String getbyservice() {
	    	String message = greetingService.getmessage();
	    	return message;
	    }
	    //UC3
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
	  //UC4
	    @PostMapping("/save")
	    public GreetingsModel get(@RequestBody GreetingsModel model){
	     GreetingsModel newModel = greetingService.add(model);
	     return newModel;
	    }
}