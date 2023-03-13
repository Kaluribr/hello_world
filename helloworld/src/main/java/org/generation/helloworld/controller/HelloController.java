package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Indica para o spring que essa é uma classe controladora
@RestController

// Indica um endpoint para nossa aplicação
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}
	@GetMapping("/bsm")
	public String bsm() {
		return "Persistência<br/>" +
                "Mentalidade de Crescimento<br/>" + 
                "Orientação ao Futuro<br/>" + 
                "Responsabilidade Pessoal<br/>" + 
                "Trabalho em Equipe<br/>" + 
                "Comunicação<br/>" + 
                "Comunicação Não Violenta<br/>" + 
                "Atenção para Detalhes<br/>" + 
                "Proatividade<br/>";
	}
	@GetMapping("/semana")
	public String semana() {
		return "Spring Tool<br/>" +
                "Git e Github<br/>" + 
                "Projeto do Grupo<br/>" + 
                "Portifólio<br/>" + 
                "Inglês<br/>";
	}
}


