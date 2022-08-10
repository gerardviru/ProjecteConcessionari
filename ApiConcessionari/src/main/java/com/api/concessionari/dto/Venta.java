package com.api.concessionari.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VENTA")

public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="IDPK_VENTA", nullable = false)
	private Long IDPK_VENTA;
	
	@Column(name="IDFK_CON", nullable = false)
	private Integer IDFK_CON;
		
	@Column(name="IDFK_VEHICLE", nullable = false)
	private Integer IDFK_VEHICLE;
	
	@Column(name="IDFK_TREB", nullable = false)
	private Integer IDFK_TREB;
	
	@Column(name="IDFK_CLIENT", nullable = false)
	private Integer IDFK_CLIENT;
	
	@Column(name="DESCOMPTE")
	private Integer DESCOMPTE;
	
	@Column(name="IVA", nullable = false)
	private Integer IVA;
	
	@Column(name="PREU", nullable = false)
	private Integer PREU;
	
	@Column(name="PREU_FINAL", nullable = false)
	private Integer PREU_FINAL;
	
	@Column (name = "CREAT_PER")
	private String CREAT_PER;
	
	@Column (name = "DATA_CREACIO")
	private Date DATA_CREACIO;
	
	@Column (name = "ACTUALITZAT_PER")
	private String ACTUALITZAT_PER;
	
	@Column (name = "DATA_ACTUALITZACIO")
	private Date DATA_ACTUALITZACIO;
	
	
	public Venta() {
		
	}
	
	
	/**
	 * @param IDPK_VENTA
	 * @param IDFK_CON
	 * @param IDFK_VEHICLE
	 * @param IDFK_TREB
	 * @param IDFK_CLIENT
	 * @param DESCOMPTE
	 * @param IVA
	 * @param PREU
	 * @param PREU_FINAL
	 * @param CREAT_PER
	 * @param DATA_CREACIO
	 * @param ACTUALITZAT_PER
	 * @param DATA_ACTUALITZACIO
	 */
	
	
	public Venta(Long iDPK_VENTA, Integer iDFK_CON, Integer iDFK_VEHICLE, Integer iDFK_TREB, Integer iDFK_CLIENT,
			Integer dESCOMPTE, Integer iVA, Integer pREU, Integer pREU_FINAL, String cREAT_PER, Date dATA_CREACIO,
			String aCTUALITZAT_PER, Date dATA_ACTUALITZACIO) {
		this.IDPK_VENTA = iDPK_VENTA;
		this.IDFK_CON = iDFK_CON;
		this.IDFK_VEHICLE = iDFK_VEHICLE;
		this.IDFK_TREB = iDFK_TREB;
		this.IDFK_CLIENT = iDFK_CLIENT;
		this.DESCOMPTE = dESCOMPTE;
		this.IVA = iVA;
		this.PREU = pREU;
		this.PREU_FINAL = pREU_FINAL;
		this.CREAT_PER = cREAT_PER;
		this.DATA_CREACIO = dATA_CREACIO;
		this.ACTUALITZAT_PER = aCTUALITZAT_PER;
		this.DATA_ACTUALITZACIO = dATA_ACTUALITZACIO;
	}


	public Long getIDPK_VENTA() {
		return IDPK_VENTA;
	}


	public void setIDPK_VENTA(Long iDPK_VENTA) {
		IDPK_VENTA = iDPK_VENTA;
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


	public Integer getIDFK_TREB() {
		return IDFK_TREB;
	}


	public void setIDFK_TREB(Integer iDFK_TREB) {
		IDFK_TREB = iDFK_TREB;
	}


	public Integer getIDFK_CLIENT() {
		return IDFK_CLIENT;
	}


	public void setIDFK_CLIENT(Integer iDFK_CLIENT) {
		IDFK_CLIENT = iDFK_CLIENT;
	}


	public Integer getDESCOMPTE() {
		return DESCOMPTE;
	}


	public void setDESCOMPTE(Integer dESCOMPTE) {
		DESCOMPTE = dESCOMPTE;
	}


	public Integer getIVA() {
		return IVA;
	}


	public void setIVA(Integer iVA) {
		IVA = iVA;
	}


	public Integer getPREU() {
		return PREU;
	}


	public void setPREU(Integer pREU) {
		PREU = pREU;
	}


	public Integer getPREU_FINAL() {
		return PREU_FINAL;
	}


	public void setPREU_FINAL(Integer pREU_FINAL) {
		PREU_FINAL = pREU_FINAL;
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
		return "Venta [IDPK_VENTA=" + IDPK_VENTA + ", IDFK_CON=" + IDFK_CON + ", IDFK_VEHICLE=" + IDFK_VEHICLE
				+ ", IDFK_TREB=" + IDFK_TREB + ", IDFK_CLIENT=" + IDFK_CLIENT + ", DESCOMPTE=" + DESCOMPTE + ", IVA="
				+ IVA + ", PREU=" + PREU + ", PREU_FINAL=" + PREU_FINAL + ", CREAT_PER=" + CREAT_PER + ", DATA_CREACIO="
				+ DATA_CREACIO + ", ACTUALITZAT_PER=" + ACTUALITZAT_PER + ", DATA_ACTUALITZACIO=" + DATA_ACTUALITZACIO
				+ "]";
	}
	
	
}
