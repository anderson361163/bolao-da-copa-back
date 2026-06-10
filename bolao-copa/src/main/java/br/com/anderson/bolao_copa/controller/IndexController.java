package br.com.anderson.bolao_copa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@GetMapping("/")
	private String index() {
		return "Funcionando...";
	}

}
