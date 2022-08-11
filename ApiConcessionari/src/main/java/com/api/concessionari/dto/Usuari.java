package com.api.concessionari.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="GCON_TB_USUARI")

public class Usuari {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="idpk_usuari", nullable = false)
	private Long idpk_usuari;
	
	@Column(name="idfk_persona", nullable = false)
	private Integer idfk_persona;
		
	@Column(name="username", nullable = false)
	private String username;
	
	@Column(name="password", nullable = false)
	private String password;
	
	@Column(name="intents", nullable = false)
	private Integer intents;
	
	@Column(name="bloquejat", nullable = false)
	private String bloquejat;
	
	@Column (name = "creat_per")
	private String creat_per;
	
	@Column (name = "data_creacio")
	private Date data_creacio;
	
	@Column (name = "actualitzat_per")
	private String actualitzat_per;
	
	@Column (name = "data_actualitzacio")
	private Date data_actualitzacio;
	
	
	@ManyToOne
	@JoinColumn(name = "idpk_usuari")
	private Persona persona;
	
	
	public Usuari() {
		
	}

	/**
	 * @param IDPK_USUARI
	 * @param IDFK_PERSONA
	 * @param USERNAME
	 * @param PASSWORD
	 * @param INTENTS
	 * @param BLOQUEJAT
	 * @param CREAT_PER
	 * @param DATA_CREACIO
	 * @param ACTUALITZAT_PER
	 * @param DATA_ACTUALITZACIO
	 */

	public Usuari(Long idpk_usuari, Integer idfk_persona, String username, String password, Integer intents,
			String bloquejat, String creat_per, Date data_creacio, String actualitzat_per, Date data_actualitzacio,
			Persona persona) {
		this.idpk_usuari = idpk_usuari;
		this.idfk_persona = idfk_persona;
		this.username = username;
		this.password = password;
		this.intents = intents;
		this.bloquejat = bloquejat;
		this.creat_per = creat_per;
		this.data_creacio = data_creacio;
		this.actualitzat_per = actualitzat_per;
		this.data_actualitzacio = data_actualitzacio;
		this.persona = persona;
	}

	public Long getIdpk_usuari() {
		return idpk_usuari;
	}

	public void setIdpk_usuari(Long idpk_usuari) {
		this.idpk_usuari = idpk_usuari;
	}

	public Integer getIdfk_persona() {
		return idfk_persona;
	}

	public void setIdfk_persona(Integer idfk_persona) {
		this.idfk_persona = idfk_persona;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getIntents() {
		return intents;
	}

	public void setIntents(Integer intents) {
		this.intents = intents;
	}

	public String getBloquejat() {
		return bloquejat;
	}

	public void setBloquejat(String bloquejat) {
		this.bloquejat = bloquejat;
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

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	
	
	
}
