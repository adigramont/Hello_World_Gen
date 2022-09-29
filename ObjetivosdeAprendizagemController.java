package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objetivo")
public class ObjetivosdeAprendizagemController {
	
	@GetMapping
	public String ObjetivoAprendizagem() {
		return "<br> <li>aprender novos conteudos de Java <br> <li>finalizar todas as atividades <br> <li>persistir apesar das dificuldades <br>";
		
	
	}
}
