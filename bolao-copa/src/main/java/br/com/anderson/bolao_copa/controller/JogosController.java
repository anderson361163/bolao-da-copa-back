package br.com.anderson.bolao_copa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anderson.bolao_copa.modelo.Jogos;
import br.com.anderson.bolao_copa.repository.JogosRepository;


/*
 * Lista todos os jogos possíveis para exibir na interface
 */

@RequestMapping("/jogos")
@RestController
public class JogosController {

	@Autowired
	private JogosRepository jogosRepository;
	
	@GetMapping("/listar")
	private ResponseEntity<List<Jogos>> listar() {
		return ResponseEntity.ok().body(jogosRepository.findAll());
	}
}
