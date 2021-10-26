package br.com.matheus.eventoapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private Long idAgenda;
	
	@Column
	private Long idEvento;
	
	@Column
	private Long idOrganizador;
	
	@Column(length=100,nullable = false)
	private String tituloEvento;
	
	@Column(length=20)
	private String telefoneEvento;
	
	@Column(length=100,nullable = false)
	private String tipoEvento;

	public Evento() {
		
	}

	public Evento(Long idAgenda, Long idEvento, Long idOrganizador, String tituloEvento, String telefoneEvento,
			String tipoEvento) {
		this.idAgenda = idAgenda;
		this.idEvento = idEvento;
		this.idOrganizador = idOrganizador;
		this.tituloEvento = tituloEvento;
		this.telefoneEvento = telefoneEvento;
		this.tipoEvento = tipoEvento;
	}

	public Long getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Long idAgenda) {
		this.idAgenda = idAgenda;
	}

	public Long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}

	public Long getIdOrganizador() {
		return idOrganizador;
	}

	public void setIdOrganizador(Long idOrganizador) {
		this.idOrganizador = idOrganizador;
	}

	public String getTituloEvento() {
		return tituloEvento;
	}

	public void setTituloEvento(String tituloEvento) {
		this.tituloEvento = tituloEvento;
	}

	public String getTelefoneEvento() {
		return telefoneEvento;
	}

	public void setTelefoneEvento(String telefoneEvento) {
		this.telefoneEvento = telefoneEvento;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
    
}