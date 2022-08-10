package com.api.concessionari.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STOCK")

public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="IDPK_STOCK", nullable = false)
	private Long IDPK_STOCK;
	
	@Column(name="IDFK_CON", nullable = false)
	private Integer IDFK_CON;
		
	@Column(name="IDFK_VEHICLE", nullable = false)
	private Integer IDFK_VEHICLE;
	
	@Column(name="UNITATS", nullable = false)
	private Integer UNITATS;
	
	@Column(name="PREU", nullable = false)
	private Integer PREU;
	
	@Column (name = "CREAT_PER")
	private String CREAT_PER;
	
	@Column (name = "DATA_CREACIO")
	private Date DATA_CREACIO;
	
	@Column (name = "ACTUALITZAT_PER")
	private String ACTUALITZAT_PER;
	
	@Column (name = "DATA_ACTUALITZACIO")
	private Date DATA_ACTUALITZACIO;
	
	
	public Stock() {
		
	}

	/**
	 * @param IDPK_STOCK
	 * @param IDFK_CON
	 * @param IDFK_VEHICLE
	 * @param UNITATS
	 * @param PREU
	 * @param CREAT_PER
	 * @param DATA_CREACIO
	 * @param ACTUALITZAT_PER
	 * @param DATA_ACTUALITZACIO
	 */
	
	public Stock(Long iDPK_STOCK, Integer iDFK_CON, Integer iDFK_VEHICLE, Integer uNITATS, Integer pREU,
			String cREAT_PER, Date dATA_CREACIO, String aCTUALITZAT_PER, Date dATA_ACTUALITZACIO) {
		this.IDPK_STOCK = iDPK_STOCK;
		this.IDFK_CON = iDFK_CON;
		this.IDFK_VEHICLE = iDFK_VEHICLE;
		this.UNITATS = uNITATS;
		this.PREU = pREU;
		this.CREAT_PER = cREAT_PER;
		this.DATA_CREACIO = dATA_CREACIO;
		this.ACTUALITZAT_PER = aCTUALITZAT_PER;
		this.DATA_ACTUALITZACIO = dATA_ACTUALITZACIO;
	}


	public Long getIDPK_STOCK() {
		return IDPK_STOCK;
	}


	public void setIDPK_STOCK(Long iDPK_STOCK) {
		IDPK_STOCK = iDPK_STOCK;
	}


	public Integer getIDFK_CON() {
		return IDFK_CON;
	}


	public void setIDFK_CON(Integer iDFK_CON) {
		IDFK_CON = iDFK_CON;
	}


	public Integer getIDFK_VEHICLE() {
		return IDFK_VEHICLE;
	}


	public void setIDFK_VEHICLE(Integer iDFK_VEHICLE) {
		IDFK_VEHICLE = iDFK_VEHICLE;
	}


	public Integer getUNITATS() {
		return UNITATS;
	}


	public void setUNITATS(Integer uNITATS) {
		UNITATS = uNITATS;
	}


	public Integer getPREU() {
		return PREU;
	}


	public void setPREU(Integer pREU) {
		PREU = pREU;
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
		return "Stock [IDPK_STOCK=" + IDPK_STOCK + ", IDFK_CON=" + IDFK_CON + ", IDFK_VEHICLE=" + IDFK_VEHICLE
				+ ", UNITATS=" + UNITATS + ", PREU=" + PREU + ", CREAT_PER=" + CREAT_PER + ", DATA_CREACIO="
				+ DATA_CREACIO + ", ACTUALITZAT_PER=" + ACTUALITZAT_PER + ", DATA_ACTUALITZACIO=" + DATA_ACTUALITZACIO
				+ "]";
	}
	
	
}
