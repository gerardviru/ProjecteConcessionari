package com.api.concessionari.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROL")

public class Rol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="IDPK_ROL", nullable = false)
	private Long IDPK_ROL;
	
	@Column(name="CODI_ROL", nullable = false)
	private String CODI_ROL;
		
	@Column(name="DESC_ROL", nullable = false)
	private String DESC_ROL;
	
	@Column (name = "CREAT_PER")
	private String CREAT_PER;
	
	@Column (name = "DATA_CREACIO")
	private Date DATA_CREACIO;
	
	@Column (name = "ACTUALITZAT_PER")
	private String ACTUALITZAT_PER;
	
	@Column (name = "DATA_ACTUALITZACIO")
	private Date DATA_ACTUALITZACIO;


	public Rol() {
		
	}
	
	/**
	 * @param IDPK_ROL
	 * @param CODI_ROL
	 * @param DESC_ROL
	 * @param CREAT_PER
	 * @param DATA_CREACIO
	 * @param ACTUALITZAT_PER
	 * @param DATA_ACTUALITZACIO
	 */
	
	
	public Rol(Long iDPK_ROL, String cODI_ROL, String dESC_ROL, String cREAT_PER, Date dATA_CREACIO,
			String aCTUALITZAT_PER, Date dATA_ACTUALITZACIO) {
		this.IDPK_ROL = iDPK_ROL;
		this.CODI_ROL = cODI_ROL;
		this.DESC_ROL = dESC_ROL;
		this.CREAT_PER = cREAT_PER;
		this.DATA_CREACIO = dATA_CREACIO;
		this.ACTUALITZAT_PER = aCTUALITZAT_PER;
		this.DATA_ACTUALITZACIO = dATA_ACTUALITZACIO;
	}

	public Long getIDPK_ROL() {
		return IDPK_ROL;
	}

	public void setIDPK_ROL(Long iDPK_ROL) {
		IDPK_ROL = iDPK_ROL;
	}

	public String getCODI_ROL() {
		return CODI_ROL;
	}

	public void setCODI_ROL(String cODI_ROL) {
		CODI_ROL = cODI_ROL;
	}

	public String getDESC_ROL() {
		return DESC_ROL;
	}

	public void setDESC_ROL(String dESC_ROL) {
		DESC_ROL = dESC_ROL;
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
		return "Rol [IDPK_ROL=" + IDPK_ROL + ", CODI_ROL=" + CODI_ROL + ", DESC_ROL=" + DESC_ROL + ", CREAT_PER="
				+ CREAT_PER + ", DATA_CREACIO=" + DATA_CREACIO + ", ACTUALITZAT_PER=" + ACTUALITZAT_PER
				+ ", DATA_ACTUALITZACIO=" + DATA_ACTUALITZACIO + "]";
	}
	
	
	
}