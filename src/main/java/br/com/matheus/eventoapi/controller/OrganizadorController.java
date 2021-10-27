package br.com.matheus.eventoapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.matheus.eventoapi.model.Evento;
import br.com.matheus.eventoapi.model.Organizador;
import br.com.matheus.eventoapi.repository.OrganizadorRepository;

@RestController
@RequestMapping("/organizador")
public class OrganizadorController {
	
	@Autowired
	private OrganizadorRepository or;
	
	@GetMapping("/listar")
	public List<Organizador> listar(){
		return or.findAll();
	}
	
	@GetMapping("/pesquisar/{id}")
	public Optional<Organizador> pesquisarId(@PathVariable Long id) {
	   return or.findById(id);
	}
	
	@PostMapping("/cadastro")
	public String cadastro(@RequestBody Organizador organizador) {
		or.save(organizador);
		return "Organizador cadastrado com sucesso";
	}
	
	@PutMapping("/atualizar/{id}")
	public String atualizar(@PathVariable Long id,@RequestBody Organizador organizador) {
		
		Optional<Organizador> pac = or.findById(id);
		
		if(!pac.isPresent()) {
			return "Organizador não localizado";
		}
		organizador.setIdOrganizador(id);
		or.save(organizador);
		return "Dados do organizador atualizado com sucesso";
	}
	@DeleteMapping("/apagar/{id}")
	public String apagar(@PathVariable Long id ) {
		or.deleteById(id);
		return "Organizador apagado";
	}

	
	

}
