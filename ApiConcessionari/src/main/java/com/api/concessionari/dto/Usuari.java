package com.api.concessionari.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USUARI")

public class Usuari {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="IDPK_USUARI", nullable = false)
	private Long IDPK_USUARI;
	
	@Column(name="IDFK_PERSONA", nullable = false)
	private Integer IDFK_PERSONA;
		
	@Column(name="USERNAME", nullable = false)
	private String USERNAME;
	
	@Column(name="PASSWORD", nullable = false)
	private String PASSWORD;
	
	@Column(name="INTENTS", nullable = false)
	private Integer INTENTS;
	
	@Column(name="BLOQUEJAT", nullable = false)
	private String BLOQUEJAT;
	
	@Column (name = "CREAT_PER")
	private String CREAT_PER;
	
	@Column (name = "DATA_CREACIO")
	private Date DATA_CREACIO;
	
	@Column (name = "ACTUALITZAT_PER")
	private String ACTUALITZAT_PER;
	
	@Column (name = "DATA_ACTUALITZACIO")
	private Date DATA_ACTUALITZACIO;
	
	
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
	
	public Usuari(Long iDPK_USUARI, Integer iDFK_PERSONA, String uSERNAME, String pASSWORD, Integer iNTENTS,
			String bLOQUEJAT, String cREAT_PER, Date dATA_CREACIO, String aCTUALITZAT_PER, Date dATA_ACTUALITZACIO) {
		this.IDPK_USUARI = iDPK_USUARI;
		this.IDFK_PERSONA = iDFK_PERSONA;
		this.USERNAME = uSERNAME;
		this.PASSWORD = pASSWORD;
		this.INTENTS = iNTENTS;
		this.BLOQUEJAT = bLOQUEJAT;
		this.CREAT_PER = cREAT_PER;
		this.DATA_CREACIO = dATA_CREACIO;
		this.ACTUALITZAT_PER = aCTUALITZAT_PER;
		this.DATA_ACTUALITZACIO = dATA_ACTUALITZACIO;
	}



	public Long getIDPK_USUARI() {
		return IDPK_USUARI;
	}



	public void setIDPK_USUARI(Long iDPK_USUARI) {
		IDPK_USUARI = iDPK_USUARI;
	}



	public Integer getIDFK_PERSONA() {
		return IDFK_PERSONA;
	}



	public void setIDFK_PERSONA(Integer iDFK_PERSONA) {
		IDFK_PERSONA = iDFK_PERSONA;
	}



	public String getUSERNAME() {
		return USERNAME;
	}



	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}



	public String getPASSWORD() {
		return PASSWORD;
	}



	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}



	public Integer getINTENTS() {
		return INTENTS;
	}



	public void setINTENTS(Integer iNTENTS) {
		INTENTS = iNTENTS;
	}



	public String getBLOQUEJAT() {
		return BLOQUEJAT;
	}



	public void setBLOQUEJAT(String bLOQUEJAT) {
		BLOQUEJAT = bLOQUEJAT;
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
		return "Usuari [IDPK_USUARI=" + IDPK_USUARI + ", IDFK_PERSONA=" + IDFK_PERSONA + ", USERNAME=" + USERNAME
				+ ", PASSWORD=" + PASSWORD + ", INTENTS=" + INTENTS + ", BLOQUEJAT=" + BLOQUEJAT + ", CREAT_PER="
				+ CREAT_PER + ", DATA_CREACIO=" + DATA_CREACIO + ", ACTUALITZAT_PER=" + ACTUALITZAT_PER
				+ ", DATA_ACTUALITZACIO=" + DATA_ACTUALITZACIO + "]";
	}
	
	
	
}
