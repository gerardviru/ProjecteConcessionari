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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="gcon_tm_provincia")

public class Provincia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long idpk_prov;
	
	@Column(name="codi_prov", nullable = false)
	private String codi_prov;
		
	@Column(name="nom", nullable = false)
	private String nom;
	
	@Column (name = "create_per")
	private String creat_per;
	
	@Column (name = "data_creacio")
	private Date data_creacio;
	
	@Column (name = "actualitzat_per")
	private String actualitzat_per;
	
	@Column (name = "data_actualitzacio")
	private Date data_actualitzacio;
	
	@OneToMany
	@JoinColumn(name = "idfk_prov")
	private List<Concessionari> concessionari;
	
	@OneToMany
	@JoinColumn(name = "idfk_prov")
	private List<Persona> persona;
	
	

	public Provincia() {
	}


	/**
	 * @param IDPK_PROV
	 * @param CODI_PROV
	 * @param NOM_PROV
	 * @param CREAT_PER
	 * @param DATA_CREACIO
	 * @param ACTUALITZAT_PER
	 * @param DATA_ACTUALITZACIO
	 */
	
	public Provincia(Long idpk_prov, String codi_prov, String nom, String creat_per, Date data_creacio,
			String actualitzat_per, Date data_actualitzacio, List<Concessionari> concessionari, List<Persona> persona) {
		this.idpk_prov = idpk_prov;
		this.codi_prov = codi_prov;
		this.nom = nom;
		this.creat_per = creat_per;
		this.data_creacio = data_creacio;
		this.actualitzat_per = actualitzat_per;
		this.data_actualitzacio = data_actualitzacio;
		this.concessionari = concessionari;
		this.persona = persona;
	}


	public Long getIdpk_prov() {
		return idpk_prov;
	}

	public void setIdpk_prov(Long idpk_prov) {
		this.idpk_prov = idpk_prov;
	}


	public String getCodi_prov() {
		return codi_prov;
	}


	public void setCodi_prov(String codi_prov) {
		this.codi_prov = codi_prov;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
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


	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "concessionari")
	public List<Concessionari> getConcessionari() {
		return concessionari;
	}


	public void setConcessionari(List<Concessionari> concessionari) {
		this.concessionari = concessionari;
	}


	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	public List<Persona> getPersona() {
		return persona;
	}


	public void setPersona(List<Persona> persona) {
		this.persona = persona;
	}
	
	

}
