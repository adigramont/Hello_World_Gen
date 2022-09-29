package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Bsmgeneration")
public class Bsmgenerationcontroller {
	
	@GetMapping
	public String Bsmgeneration() {
		return "<br> <li>comunicacao <br> <li>proatividade <br> <li>persistencia <br> <li>responsabilidade pessoal <br>";
		
	}

}
