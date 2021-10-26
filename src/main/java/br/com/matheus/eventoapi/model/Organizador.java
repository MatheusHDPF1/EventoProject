package br.com.matheus.eventoapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Organizador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOrganizador;
	
	@Column(length=100,nullable=false)
	private String nomeOrganizador;
	
	@Column(length=100,nullable=false, unique = true)
	private String emailOrganizador;
	
	@Column(length=20)
	private String telefoneOrganizador;
	
	public Organizador() {
		
	}

	public Organizador(Long idOrganizador, String nomeOrganizador, String emailOrganizador,
			String telefoneOrganizador) {
		this.idOrganizador = idOrganizador;
		this.nomeOrganizador = nomeOrganizador;
		this.emailOrganizador = emailOrganizador;
		this.telefoneOrganizador = telefoneOrganizador;
	}

	public Long getIdOrganizador() {
		return idOrganizador;
	}

	public void setIdOrganizador(Long idOrganizador) {
		this.idOrganizador = idOrganizador;
	}

	public String getNomeOrganizador() {
		return nomeOrganizador;
	}

	public void setNomeOrganizador(String nomeOrganizador) {
		this.nomeOrganizador = nomeOrganizador;
	}

	public String getEmailOrganizador() {
		return emailOrganizador;
	}

	public void setEmailOrganizador(String emailOrganizador) {
		this.emailOrganizador = emailOrganizador;
	}

	public String getTelefoneOrganizador() {
		return telefoneOrganizador;
	}

	public void setTelefoneOrganizador(String telefoneOrganizador) {
		this.telefoneOrganizador = telefoneOrganizador;
	}
     
}
