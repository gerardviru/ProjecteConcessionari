package com.api.concessionari.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERFIL")

public class Perfil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="IDPK_PERFIL", nullable = false)
	private Long IDPK_PERFIL;
	
	@Column(name="IDFK_PERSONA", nullable = false)
	private Integer IDFK_PERSONA;
		
	@Column(name="IDFK_ROL", nullable = false)
	private Integer IDFK_ROL;
	
	@Column (name = "CREAT_PER")
	private String CREAT_PER;
	
	@Column (name = "DATA_CREACIO")
	private Date DATA_CREACIO;
	
	@Column (name = "ACTUALITZAT_PER")
	private String ACTUALITZAT_PER;
	
	@Column (name = "DATA_ACTUALITZACIO")
	private Date DATA_ACTUALITZACIO;

	
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
	
	public Perfil(Long iDPK_PERFIL, Integer iDFK_PERSONA, Integer iDFK_ROL, String cREAT_PER, Date dATA_CREACIO,
			String aCTUALITZAT_PER, Date dATA_ACTUALITZACIO) {
		this.IDPK_PERFIL = iDPK_PERFIL;
		this.IDFK_PERSONA = iDFK_PERSONA;
		this.IDFK_ROL = iDFK_ROL;
		this.CREAT_PER = cREAT_PER;
		this.DATA_CREACIO = dATA_CREACIO;
		this.ACTUALITZAT_PER = aCTUALITZAT_PER;
		this.DATA_ACTUALITZACIO = dATA_ACTUALITZACIO;
	}


	public Long getIDPK_PERFIL() {
		return IDPK_PERFIL;
	}


	public void setIDPK_PERFIL(Long iDPK_PERFIL) {
		IDPK_PERFIL = iDPK_PERFIL;
	}


	public Integer getIDFK_PERSONA() {
		return IDFK_PERSONA;
	}


	public void setIDFK_PERSONA(Integer iDFK_PERSONA) {
		IDFK_PERSONA = iDFK_PERSONA;
	}


	public Integer getIDFK_ROL() {
		return IDFK_ROL;
	}


	public void setIDFK_ROL(Integer iDFK_ROL) {
		IDFK_ROL = iDFK_ROL;
	}


	public String getCREAT_PER() {
		return CREAT_PER;
	}


	public void setCREAT_PER(String cREAT_PER) {
		CREAT_PER = cREAT_PER;
	}


	public Date getDATA_CREACIO() {
		return DATA_CREACIO;
	}


	public void setDATA_CREACIO(Date dATA_CREACIO) {
		DATA_CREACIO = dATA_CREACIO;
	}


	public String getACTUALITZAT_PER() {
		return ACTUALITZAT_PER;
	}


	public void setACTUALITZAT_PER(String aCTUALITZAT_PER) {
		ACTUALITZAT_PER = aCTUALITZAT_PER;
	}


	public Date getDATA_ACTUALITZACIO() {
		return DATA_ACTUALITZACIO;
	}


	public void setDATA_ACTUALITZACIO(Date dATA_ACTUALITZACIO) {
		DATA_ACTUALITZACIO = dATA_ACTUALITZACIO;
	}


	@Override
	public String toString() {
		return "Perfil [IDPK_PERFIL=" + IDPK_PERFIL + ", IDFK_PERSONA=" + IDFK_PERSONA + ", IDFK_ROL=" + IDFK_ROL
				+ ", CREAT_PER=" + CREAT_PER + ", DATA_CREACIO=" + DATA_CREACIO + ", ACTUALITZAT_PER=" + ACTUALITZAT_PER
				+ ", DATA_ACTUALITZACIO=" + DATA_ACTUALITZACIO + "]";
	}
	
	
	
}
