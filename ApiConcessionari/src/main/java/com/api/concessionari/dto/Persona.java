package com.api.concessionari.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="gcon_tb_persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idpk_persona;

	@Column(name="nif")
	private String nif;
		
	@Column(name="nom")
	private String nom;
	
	@Column (name = "cognom1")
	private String cognom1;
	
	@Column (name = "cognom2")
	private String cognom2;
	
	@Column (name = "telefon")
	private String telefon;
	
	@Column (name = "email")
	private String email;
	
	@Column (name = "adreca")
	private String adreca;

	@Column (name = "codi_postal")
	private Integer codi_postal;
	
	@Column (name = "tipo_persona")
	private String tipo_persona;
	
	@Column (name = "creat_per")
	private String creat_per;
	
	@Column (name = "data_creacio")
	private Date data_creacio;
	
	@Column (name = "actualitzat_per")
	private String actualitzat_per;
	
	@Column (name = "data_actualitzacio")
	private Date data_actualitzacio;
	
	
	@ManyToOne
	@JoinColumn(name = "idfk_prov")
	private Provincia provincia;
	
	@OneToOne
	@JoinColumn(name="idfk_con")
	private Concessionari concessionari;

	@OneToMany
	@JoinColumn(name = "idfk_persona")
	private List<Usuari> usuari;
	
	@OneToMany
	@JoinColumn(name = "idfk_persona")
	private List<Treballador> treballador;
	
	@OneToMany
	@JoinColumn(name = "idfk_persona")
	private List<Perfil> perfil;
	
	@OneToMany
	@JoinColumn(name = "idfk_persona")
	private List<Client> client;
	

	public Persona() {
	}


	public Long getIdpk_persona() {
		return idpk_persona;
	}


	public void setIdpk_persona(Long idpk_persona) {
		this.idpk_persona = idpk_persona;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom1() {
		return cognom1;
	}

	public void setCognom1(String cognom1) {
		this.cognom1 = cognom1;
	}

	public String getCognom2() {
		return cognom2;
	}

	public void setCognom2(String cognom2) {
		this.cognom2 = cognom2;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdreca() {
		return adreca;
	}

	public void setAdreca(String adreça) {
		this.adreca = adreça;
	}

	public Integer getCodi_postal() {
		return codi_postal;
	}

	public void setCodi_postal(Integer codi_postal) {
		this.codi_postal = codi_postal;
	}
	
	public String getTipo_persona() {
		return tipo_persona;
	}

	public void setTipo_persona(String tipo_persona) {
		this.tipo_persona = tipo_persona;
	}

	public String getCreat_per() {
		return creat_per;
	}

	public void setCreat_per(String creat_per) {
		this.creat_per = creat_per;
	}

	public Date getData_creacio() {
		return data_creacio;
	}

	public void setData_creacio(Date data_creacio) {
		this.data_creacio = data_creacio;
	}

	public String getActualitzat_per() {
		return actualitzat_per;
	}

	public void setActualitzat_per(String actualitzat_per) {
		this.actualitzat_per = actualitzat_per;
	}

	public Date getData_actualitzacio() {
		return data_actualitzacio;
	}

	public void setData_actualitzacio(Date data_actualitzacio) {
		this.data_actualitzacio = data_actualitzacio;
	}
	
	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	public Concessionari getConcessionari() {
		return concessionari;
	}

	public void setConcessionari(Concessionari concessionari) {
		this.concessionari = concessionari;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuari")
	public List<Usuari> getUsuari() {
		return usuari;
	}

	public void setUsuari(List<Usuari> usuari) {
		this.usuari = usuari;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "treballador")
	public List<Treballador> getTreballador() {
		return treballador;
	}

	public void setTreballador(List<Treballador> treballador) {
		this.treballador = treballador;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "perfil")
	public List<Perfil> getPerfil() {
		return perfil;
	}

	public void setPerfil(List<Perfil> perfil) {
		this.perfil = perfil;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
	public List<Client> getClient() {
		return client;
	}

	public void setClient(List<Client> client) {
		this.client = client;
	}


	
}
