package br.com.anderson.bolao_copa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.anderson.bolao_copa.modelo.Jogos;

@Repository
public interface JogosRepository extends JpaRepository<Jogos, Long>{

}
