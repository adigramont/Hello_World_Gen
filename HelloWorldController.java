package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello_World")
public class HelloWorldController {
	
	
	@GetMapping
	public String helloWorld() {
		return "helloWorld";
			
	}
	
	}
