package com.bridgelabz.greetingsapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
	  	@GetMapping("/getMap")
	    public String getMessage() {
	        return "Hello World";
	    }

	    @GetMapping("/getByParam")
	    public String getByParam(@RequestParam String name) {
	        return "Hello" + name;
	    }

	    @GetMapping("/getPath/{name}")
	    public String getPath(@PathVariable String name) {
	        return "Hello" + name;
	    }
}