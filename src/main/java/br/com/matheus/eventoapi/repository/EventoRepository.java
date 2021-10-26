package br.com.matheus.eventoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.matheus.eventoapi.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{

}
