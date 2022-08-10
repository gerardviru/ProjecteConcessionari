package com.api.concessionari.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE")

public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="IDPK_VEHICLE", nullable = false)
	private Long IDPK_VEHICLE;
	
	@Column(name="MARCA", nullable = false)
	private String MARCA;
		
	@Column(name="MODEL", nullable = false)
	private String MODEL;
	
	@Column(name="COLOR", nullable = false)
	private String COLOR;
	
	@Column(name="DESC_TECNICA")
	private String DESC_TECNICA;
	
	@Column (name = "CREAT_PER")
	private String CREAT_PER;
	
	@Column (name = "DATA_CREACIO")
	private Date DATA_CREACIO;
	
	@Column (name = "ACTUALITZAT_PER")
	private String ACTUALITZAT_PER;
	
	@Column (name = "DATA_ACTUALITZACIO")
	private Date DATA_ACTUALITZACIO;
	
	
	public Vehicle() {
		
	}
	
	/**
	 * @param IDPK_VEHICLE
	 * @param MARCA
	 * @param MODEL
	 * @param COLOR
	 * @param DESC_TECNICA
	 * @param CREAT_PER
	 * @param DATA_CREACIO
	 * @param ACTUALITZAT_PER
	 * @param DATA_ACTUALITZACIO
	 */
	
	public Vehicle(Long iDPK_VEHICLE, String mARCA, String mODEL, String cOLOR, String dESC_TECNICA, String cREAT_PER,
			Date dATA_CREACIO, String aCTUALITZAT_PER, Date dATA_ACTUALITZACIO) {
		this.IDPK_VEHICLE = iDPK_VEHICLE;
		this.MARCA = mARCA;
		this.MODEL = mODEL;
		this.COLOR = cOLOR;
		this.DESC_TECNICA = dESC_TECNICA;
		this.CREAT_PER = cREAT_PER;
		this.DATA_CREACIO = dATA_CREACIO;
		this.ACTUALITZAT_PER = aCTUALITZAT_PER;
		this.DATA_ACTUALITZACIO = dATA_ACTUALITZACIO;
	}

	public Long getIDPK_VEHICLE() {
		return IDPK_VEHICLE;
	}

	public void setIDPK_VEHICLE(Long iDPK_VEHICLE) {
		IDPK_VEHICLE = iDPK_VEHICLE;
	}

	public String getMARCA() {
		return MARCA;
	}

	public void setMARCA(String mARCA) {
		MARCA = mARCA;
	}

	public String getMODEL() {
		return MODEL;
	}

	public void setMODEL(String mODEL) {
		MODEL = mODEL;
	}

	public String getCOLOR() {
		return COLOR;
	}

	public void setCOLOR(String cOLOR) {
		COLOR = cOLOR;
	}

	public String getDESC_TECNICA() {
		return DESC_TECNICA;
	}

	public void setDESC_TECNICA(String dESC_TECNICA) {
		DESC_TECNICA = dESC_TECNICA;
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
		return "Vehicle [IDPK_VEHICLE=" + IDPK_VEHICLE + ", MARCA=" + MARCA + ", MODEL=" + MODEL + ", COLOR=" + COLOR
				+ ", DESC_TECNICA=" + DESC_TECNICA + ", CREAT_PER=" + CREAT_PER + ", DATA_CREACIO=" + DATA_CREACIO
				+ ", ACTUALITZAT_PER=" + ACTUALITZAT_PER + ", DATA_ACTUALITZACIO=" + DATA_ACTUALITZACIO + "]";
	}
	
	
	
}
