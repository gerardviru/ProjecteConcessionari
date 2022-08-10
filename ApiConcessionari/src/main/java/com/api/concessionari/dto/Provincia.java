package com.api.concessionari.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="PROVINCIA")

public class Provincia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="IDPK_PROV", nullable = false)
	private Long IDPK_PROV;
	
	@Column(name="CODI_PROV", nullable = false)
	private String CODI_PROV;
		
	@Column(name="NOM_PROV", nullable = false)
	private String NOM_PROV;
	
	@Column (name = "CREAT_PER")
	private String CREAT_PER;
	
	@Column (name = "DATA_CREACIO")
	private Date DATA_CREACIO;
	
	@Column (name = "ACTUALITZAT_PER")
	private String ACTUALITZAT_PER;
	
	@Column (name = "DATA_ACTUALITZACIO")
	private Date DATA_ACTUALITZACIO;
	
	
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
	
	public Provincia(Long IDPK_PROV, String CODI_PROV, String NOM_PROV, String CREAT_PER, Date DATA_CREACIO, String ACTUALITZAT_PER,Date DATA_ACTUALITZACIO) {
		this.IDPK_PROV = IDPK_PROV;
		this.CODI_PROV = CODI_PROV;
		this.NOM_PROV = NOM_PROV;
		this.CREAT_PER = CREAT_PER;
		this.DATA_CREACIO = DATA_CREACIO;
		this.ACTUALITZAT_PER =ACTUALITZAT_PER;
		this.DATA_ACTUALITZACIO = DATA_ACTUALITZACIO;
		
	}

	public Long getIDPK_PROV() {
		return IDPK_PROV;
	}

	public void setIDPK_PROV(Long iDPK_PROV) {
		IDPK_PROV = iDPK_PROV;
	}

	public String getCODI_PROV() {
		return CODI_PROV;
	}

	public void setCODI_PROV(String cODI_PROV) {
		CODI_PROV = cODI_PROV;
	}

	public String getNOM_PROV() {
		return NOM_PROV;
	}

	public void setNOM_PROV(String nOM_PROV) {
		NOM_PROV = nOM_PROV;
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
		return "Provincia [IDPK_PROV=" + IDPK_PROV + ", CODI_PROV=" + CODI_PROV + ", NOM_PROV=" + NOM_PROV
				+ ", CREAT_PER=" + CREAT_PER + ", DATA_CREACIO=" + DATA_CREACIO + ", ACTUALITZAT_PER=" + ACTUALITZAT_PER
				+ ", DATA_ACTUALITZACIO=" + DATA_ACTUALITZACIO + "]";
	}
	
	

}
