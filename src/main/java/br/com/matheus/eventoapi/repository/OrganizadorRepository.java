package br.com.matheus.eventoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.matheus.eventoapi.model.Organizador;

public interface OrganizadorRepository extends JpaRepository<Organizador, Long> {

}
