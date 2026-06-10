package br.com.anderson.bolao_copa.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Premio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double premioAcumulado;
	private Double premioPrimeiroColocado;
	private Double premioSegundoColocado;
	private Double premioTerceiroColocado;
}
