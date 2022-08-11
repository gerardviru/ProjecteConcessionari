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
@Table(name="GCON_TB_PERFIL")

public class Perfil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="idpk_perfil", nullable = false)
	private Long idpk_perfil;
	
	@Column(name="idfk_persona", nullable = false)
	private Integer idfk_persona;
		
	@Column(name="idfk_rol", nullable = false)
	private Integer idfk_rol;
	
	@Column (name = "creat_per")
	private String creat_per;
	
	@Column (name = "data_creacio")
	private Date data_creacio;
	
	@Column (name = "actualitzat_per")
	private String actualitzat_per;
	
	@Column (name = "data_actualitzacio")
	private Date data_actualitzacio;
	
	
	@ManyToOne
	@JoinColumn(name = "idpk_perfil")
	private Persona persona;
	
	@ManyToOne
	@JoinColumn(name = "idpk_perfil")
	private Rol rol;

	
	public Perfil() {
		
	}
	
	/**
	 * @param IDPK_PERFIL
	 * @param IDFK_PERSONA
	 * @param IDFK_ROL
	 * @param CREAT_PER
	 * @param DATA_CREACIO
	 * @param ACTUALITZAT_PER
	 * @param DATA_ACTUALITZACIO
	 */
	
	public Perfil(Long idpk_perfil, Integer idfk_persona, Integer idfk_rol, String creat_per, Date data_creacio,
			String actualitzat_per, Date data_actualitzacio, Persona persona, Rol rol) {
		this.idpk_perfil = idpk_perfil;
		this.idfk_persona = idfk_persona;
		this.idfk_rol = idfk_rol;
		this.creat_per = creat_per;
		this.data_creacio = data_creacio;
		this.actualitzat_per = actualitzat_per;
		this.data_actualitzacio = data_actualitzacio;
		this.persona = persona;
		this.rol = rol;
	}

	public Long getIdpk_perfil() {
		return idpk_perfil;
	}

	public void setIdpk_perfil(Long idpk_perfil) {
		this.idpk_perfil = idpk_perfil;
	}

	public Integer getIdfk_persona() {
		return idfk_persona;
	}

	public void setIdfk_persona(Integer idfk_persona) {
		this.idfk_persona = idfk_persona;
	}

	public Integer getIdfk_rol() {
		return idfk_rol;
	}

	public void setIdfk_rol(Integer idfk_rol) {
		this.idfk_rol = idfk_rol;
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

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	
}
