package br.com.anderson.bolao_copa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.anderson.bolao_copa.modelo.Premio;

@Repository
public interface PremioRepository extends JpaRepository<Premio, Long>{

}
