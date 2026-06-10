package br.com.anderson.bolao_copa.dto;

import java.util.List;

import br.com.anderson.bolao_copa.modelo.Chutes;
import lombok.Data;

@Data
public class FormPalpites {
	
	private String nome;
	private String departamento;
	private List<Chutes> lista;
	
}
