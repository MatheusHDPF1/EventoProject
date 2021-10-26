package br.com.matheus.eventoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.matheus.eventoapi.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {

}
