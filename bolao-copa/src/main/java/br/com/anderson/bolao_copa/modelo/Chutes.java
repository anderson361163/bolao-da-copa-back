package br.com.anderson.bolao_copa.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Chutes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String time1;
	private String time2;
	private String resultado;
	
	@ManyToOne
	@JoinColumn(name="palpite_id")
	private Palpites palpite;
	
}
