package com.api.concessionari.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TREBALLADOR")

public class Treballador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="IDPK_TREB", nullable = false)
	private Long IDPK_TREB;
	
	@Column(name="IDFK_PERSONA", nullable = false)
	private Integer IDFK_PERSONA;
		
	@Column(name="IDFK_CON", nullable = false)
	private Integer IDFK_CON;
	
	@Column(name="NUM_SEG_SOC", nullable = false)
	private Integer NUM_SEG_SOC;
	
	@Column(name="CARREC", nullable = false)
	private Integer CARREC;
	
	@Column (name = "CREAT_PER")
	private String CREAT_PER;
	
	@Column (name = "DATA_CREACIO")
	private Date DATA_CREACIO;
	
	@Column (name = "ACTUALITZAT_PER")
	private String ACTUALITZAT_PER;
	
	@Column (name = "DATA_ACTUALITZACIO")
	private Date DATA_ACTUALITZACIO;
	
	
	public Treballador() {
	}


	/**
	 * @param IDPK_TREB
	 * @param IDFK_PERSONA
	 * @param IDFK_CON
	 * @param NUM_SEG_SOC
	 * @param CARREC
	 * @param CREAT_PER
	 * @param DATA_CREACIO
	 * @param ACTUALITZAT_PER
	 * @param DATA_ACTUALITZACIO
	 */
	
	public Treballador(Long iDPK_TREB, Integer iDFK_PERSONA, Integer iDFK_CON, Integer nUM_SEG_SOC, Integer cARREC,
			String cREAT_PER, Date dATA_CREACIO, String aCTUALITZAT_PER, Date dATA_ACTUALITZACIO) {
		IDPK_TREB = iDPK_TREB;
		IDFK_PERSONA = iDFK_PERSONA;
		IDFK_CON = iDFK_CON;
		NUM_SEG_SOC = nUM_SEG_SOC;
		CARREC = cARREC;
		CREAT_PER = cREAT_PER;
		DATA_CREACIO = dATA_CREACIO;
		ACTUALITZAT_PER = aCTUALITZAT_PER;
		DATA_ACTUALITZACIO = dATA_ACTUALITZACIO;
	}


	public Long getIDPK_TREB() {
		return IDPK_TREB;
	}


	public void setIDPK_TREB(Long iDPK_TREB) {
		IDPK_TREB = iDPK_TREB;
	}


	public Integer getIDFK_PERSONA() {
		return IDFK_PERSONA;
	}


	public void setIDFK_PERSONA(Integer iDFK_PERSONA) {
		IDFK_PERSONA = iDFK_PERSONA;
	}


	public Integer getIDFK_CON() {
		return IDFK_CON;
	}


	public void setIDFK_CON(Integer iDFK_CON) {
		IDFK_CON = iDFK_CON;
	}


	public Integer getNUM_SEG_SOC() {
		return NUM_SEG_SOC;
	}


	public void setNUM_SEG_SOC(Integer nUM_SEG_SOC) {
		NUM_SEG_SOC = nUM_SEG_SOC;
	}


	public Integer getCARREC() {
		return CARREC;
	}


	public void setCARREC(Integer cARREC) {
		CARREC = cARREC;
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
		return "Treballador [IDPK_TREB=" + IDPK_TREB + ", IDFK_PERSONA=" + IDFK_PERSONA + ", IDFK_CON=" + IDFK_CON
				+ ", NUM_SEG_SOC=" + NUM_SEG_SOC + ", CARREC=" + CARREC + ", CREAT_PER=" + CREAT_PER + ", DATA_CREACIO="
				+ DATA_CREACIO + ", ACTUALITZAT_PER=" + ACTUALITZAT_PER + ", DATA_ACTUALITZACIO=" + DATA_ACTUALITZACIO
				+ "]";
	}
	
	

}
