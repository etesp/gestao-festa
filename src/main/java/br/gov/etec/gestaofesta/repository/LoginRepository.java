package br.gov.etec.gestaofesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.etec.gestaofesta.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
	Login findByEmail(String email);
	
	
	
}

