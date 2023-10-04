package br.gov.etec.gestaofesta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.etec.gestaofesta.model.Convidado;
import br.gov.etec.gestaofesta.repository.ConvidadoRepository;

@RestController
public class ApiConvidados {
	
	@Autowired
	ConvidadoRepository repository;
	
	@GetMapping("convidados")
	public ResponseEntity<?> convidados(){
		
		List<Convidado> lista = repository.findAll();
		
		return new ResponseEntity<>(lista, HttpStatus.OK);

		
	}

}
