package br.com.alura.mvc.mudi.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@GetMapping("/home")
	public String home() {
		
		
		
		return "home";
	}
}
