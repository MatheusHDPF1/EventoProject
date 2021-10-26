package br.com.matheus.eventoapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgenda;
	
	@Column
	private Long idOrganizador;
	
	private Long idEvento;
	
	@Column(nullable = false)
	private String dataEvento;
	
	@Column(nullable = false)
	private String horaEvento;
	
	@Column(nullable = false)
	private String cidadeEvento;
	
	@Column(nullable = false)
	private String ruaEvento;
	
	public Agenda() {
		
	}

	public Agenda(Long idAgenda, Long idOrganizador, Long idEvento, String dataEvento, String horaEvento,
			String cidadeEvento, String ruaEvento) {
		this.idAgenda = idAgenda;
		this.idOrganizador = idOrganizador;
		this.idEvento = idEvento;
		this.dataEvento = dataEvento;
		this.horaEvento = horaEvento;
		this.cidadeEvento = cidadeEvento;
		this.ruaEvento = ruaEvento;
	}

	public Long getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Long idAgenda) {
		this.idAgenda = idAgenda;
	}

	public Long getIdOrganizador() {
		return idOrganizador;
	}

	public void setIdOrganizador(Long idOrganizador) {
		this.idOrganizador = idOrganizador;
	}

	public Long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}

	public String getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(String dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getHoraEvento() {
		return horaEvento;
	}

	public void setHoraEvento(String horaEvento) {
		this.horaEvento = horaEvento;
	}

	public String getCidadeEvento() {
		return cidadeEvento;
	}

	public void setCidadeEvento(String cidadeEvento) {
		this.cidadeEvento = cidadeEvento;
	}

	public String getRuaEvento() {
		return ruaEvento;
	}

	public void setRuaEvento(String ruaEvento) {
		this.ruaEvento = ruaEvento;
	}

	
}
