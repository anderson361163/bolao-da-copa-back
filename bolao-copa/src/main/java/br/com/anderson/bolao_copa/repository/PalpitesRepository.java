package br.com.anderson.bolao_copa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.anderson.bolao_copa.modelo.Jogos;
import br.com.anderson.bolao_copa.modelo.Palpites;

@Repository
public interface PalpitesRepository extends JpaRepository<Palpites, Long>{

}
