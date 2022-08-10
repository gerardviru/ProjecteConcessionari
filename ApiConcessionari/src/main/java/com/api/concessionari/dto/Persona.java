package com.api.concessionari.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="IDPK_PERSONA", nullable = false)
	private Long IDPK_PERSONA;
	
	@Column(name="NIF", nullable = false)
	private String NIF;
		
	@Column(name="NOM", nullable = false)
	private String NOM;
	
	@Column (name = "COGNOM1", nullable = false)
	private String COGNOM1;
	
	@Column (name = "COGNOM2")
	private String COGNOM2;
	
	@Column (name = "TELEFON")
	private String TELEFON;
	
	@Column (name = "EMAIL")
	private String EMAIL;
	
	@Column (name = "ADREÇA")
	private String ADREÇA;
	
	@Column (name = "IDFK_PROV", nullable = false)
	private Integer IDFK_PROV;
	
	@Column (name = "CODI_POSTAL")
	private Integer CODI_POSTAL;
	
	@Column (name = "CREAT_PER")
	private String CREAT_PER;
	
	@Column (name = "DATA_CREACIO")
	private Date DATA_CREACIO;
	
	@Column (name = "ACTUALITZAT_PER")
	private String ACTUALITZAT_PER;
	
	@Column (name = "DATA_ACTUALITZACIO")
	private Date DATA_ACTUALITZACIO;
	

	
	public Persona() {
	}

	/**
	 * @param IDPK_PERSONA
	 * @param NIF
	 * @param NOM
	 * @param COGNOM1
	 * @param COGNOM2
	 * @param TELEFON
	 * @param EMAIL
	 * @param ADREÇA
	 * @param IDFK_PROV
	 * @param CODI_POSTAL
	 * @param CREAT_PER
	 * @param DATA_CREACIO
	 * @param ACTUALITZAT_PER
	 * @param DATA_ACTUALITZACIO
	 */
	
	public Persona(Long IDPK_PERSONA, String NIF, String NOM, String COGNOM1, String COGNOM2, String TELEFON, String EMAIL, String ADREÇA, 
			Integer IDFK_PROV,Integer CODI_POSTAL,String CREAT_PER, Date DATA_CREACIO, String ACTUALITZAT_PER,Date DATA_ACTUALITZACIO) {
		this.IDPK_PERSONA = IDPK_PERSONA;
		this.NIF = NIF;
		this.NOM = NOM;
		this.COGNOM1 = COGNOM1;
		this.COGNOM2 = COGNOM2;
		this.TELEFON = TELEFON;
		this.EMAIL = EMAIL;
		this.ADREÇA = ADREÇA;
		this.CREAT_PER = CREAT_PER;
		this.DATA_CREACIO = DATA_CREACIO;
		this.ACTUALITZAT_PER =ACTUALITZAT_PER;
		this.DATA_ACTUALITZACIO = DATA_ACTUALITZACIO;
		
	}

	public Long getIDPK_PERSONA() {
		return IDPK_PERSONA;
	}

	public void setIDPK_PERSONA(Long iDPK_PERSONA) {
		IDPK_PERSONA = iDPK_PERSONA;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public String getNOM() {
		return NOM;
	}

	public void setNOM(String nOM) {
		NOM = nOM;
	}

	public String getCOGNOM1() {
		return COGNOM1;
	}

	public void setCOGNOM1(String cOGNOM1) {
		COGNOM1 = cOGNOM1;
	}

	public String getCOGNOM2() {
		return COGNOM2;
	}

	public void setCOGNOM2(String cOGNOM2) {
		COGNOM2 = cOGNOM2;
	}

	public String getTELEFON() {
		return TELEFON;
	}

	public void setTELEFON(String tELEFON) {
		TELEFON = tELEFON;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getADREÇA() {
		return ADREÇA;
	}

	public void setADREÇA(String aDREÇA) {
		ADREÇA = aDREÇA;
	}

	public Integer getIDFK_PROV() {
		return IDFK_PROV;
	}

	public void setIDFK_PROV(Integer iDFK_PROV) {
		IDFK_PROV = iDFK_PROV;
	}

	public Integer getCODI_POSTAL() {
		return CODI_POSTAL;
	}

	public void setCODI_POSTAL(Integer cODI_POSTAL) {
		CODI_POSTAL = cODI_POSTAL;
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
		return "Persona [IDPK_PERSONA=" + IDPK_PERSONA + ", NIF=" + NIF + ", NOM=" + NOM + ", COGNOM1=" + COGNOM1
				+ ", COGNOM2=" + COGNOM2 + ", TELEFON=" + TELEFON + ", EMAIL=" + EMAIL + ", ADREÇA=" + ADREÇA
				+ ", IDFK_PROV=" + IDFK_PROV + ", CODI_POSTAL=" + CODI_POSTAL + ", CREAT_PER=" + CREAT_PER
				+ ", DATA_CREACIO=" + DATA_CREACIO + ", ACTUALITZAT_PER=" + ACTUALITZAT_PER + ", DATA_ACTUALITZACIO="
				+ DATA_ACTUALITZACIO + "]";
	}
	
	

}
