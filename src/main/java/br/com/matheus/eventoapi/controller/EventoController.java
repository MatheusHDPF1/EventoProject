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
import br.com.matheus.eventoapi.repository.EventoRepository;

@RestController
@RequestMapping("/evento")
public class EventoController {
	
	@Autowired
	private EventoRepository er;
	
	@GetMapping("/listar")
	private List<Evento> listar() {
		return er.findAll();
	}
	
	@GetMapping("/pesquisar/{id}")
	public Optional<Evento> pesquisarId(@PathVariable Long id) {
	   return er.findById(id);
	}
	
	@PostMapping("/cadastro")
	public String cadastro(@RequestBody Evento evento) {
		er.save(evento);
		return "Evento cadastrado com sucesso";
		
	}
	
	@PutMapping("/atualizar/{id}")
	public String atualizar(@PathVariable Long id,@RequestBody Evento evento ) {
		
		Optional<Evento> pac = er.findById(id);
		
		if(!pac.isPresent()) {
			return "Evento não localizado";
		}
		evento.setIdEvento(id);
	    er.save(evento);
	    return " Dados do Evento atualizados com sucesso";		
	  }
	
	@DeleteMapping("/apagar")
	public String apagar(@PathVariable Long id) {
		er.deleteById(id);
		return"Evento apagado";
	}
	

}
