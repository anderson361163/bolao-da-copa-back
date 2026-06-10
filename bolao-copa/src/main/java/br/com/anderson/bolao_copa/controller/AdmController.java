package br.com.anderson.bolao_copa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anderson.bolao_copa.repository.JogosRepository;
import br.com.anderson.bolao_copa.repository.PalpitesRepository;
import br.com.anderson.bolao_copa.repository.PremioRepository;

/*
 * Permite 
 * - Salvar ResultadosPartidas
 * - Salvar o valor do premio
 */

@RequestMapping("/adm/")
@RestController
public class AdmController {

	@Autowired
	private PalpitesRepository palpitesRepository;
	
	@Autowired
	private PremioRepository premioRepository;
	
	@GetMapping("/palpites/salvar")
	public Object palpites() {
		return null;
	}
}
