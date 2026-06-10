package br.com.anderson.bolao_copa.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anderson.bolao_copa.dto.FormPalpites;
import br.com.anderson.bolao_copa.modelo.Palpites;
import br.com.anderson.bolao_copa.repository.PalpitesRepository;

@RequestMapping("/palpites")
@RestController
public class PalpitesController {

	@Autowired
	private PalpitesRepository palpitesRepository;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Palpites>> listar() {
		return ResponseEntity.ok().body(palpitesRepository.findAll());
	}
	
	@PostMapping("/salvar")
	public Palpites salvar(@Valid FormPalpites form) {
		return null;//ResponseEntity.ok().body(palpitesRepository.save(form));
	}
}
