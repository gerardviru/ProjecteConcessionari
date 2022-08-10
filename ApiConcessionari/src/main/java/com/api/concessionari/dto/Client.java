package com.api.concessionari.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENT")

public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="IDPK_CLIENT", nullable = false)
	private Long IDPK_CLIENT;
	
	@Column(name="IDFK_PERSONA", nullable = false)
	private Integer IDFK_PERSONA;
		
	@Column(name="IDFK_CON", nullable = false)
	private Integer IDFK_CON;
	
	@Column (name = "CREAT_PER")
	private String CREAT_PER;
	
	@Column (name = "DATA_CREACIO")
	private Date DATA_CREACIO;
	
	@Column (name = "ACTUALITZAT_PER")
	private String ACTUALITZAT_PER;
	
	@Column (name = "DATA_ACTUALITZACIO")
	private Date DATA_ACTUALITZACIO;
	
	
	public Client() {
	}

	/**
	 * @param IDPK_CLIENT
	 * @param IDFK_PERSONA
	 * @param IDFK_CON
	 * @param CREAT_PER
	 * @param DATA_CREACIO
	 * @param ACTUALITZAT_PER
	 * @param DATA_ACTUALITZACIO
	 */
	
	public Client(Long IDPK_CLIENT, Integer IDFK_PERSONA, Integer IDFK_CON, String CREAT_PER, Date DATA_CREACIO, String ACTUALITZAT_PER,Date DATA_ACTUALITZACIO) {
		this.IDPK_CLIENT = IDPK_CLIENT;
		this.IDFK_PERSONA = IDFK_PERSONA;
		this.IDFK_CON = IDFK_CON;
		this.CREAT_PER = CREAT_PER;
		this.DATA_CREACIO = DATA_CREACIO;
		this.ACTUALITZAT_PER =ACTUALITZAT_PER;
		this.DATA_ACTUALITZACIO = DATA_ACTUALITZACIO;
		
	}

	public Long getIDPK_CLIENT() {
		return IDPK_CLIENT;
	}

	public void setIDPK_CLIENT(Long iDPK_CLIENT) {
		IDPK_CLIENT = iDPK_CLIENT;
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
		return "Client [IDPK_CLIENT=" + IDPK_CLIENT + ", IDFK_PERSONA=" + IDFK_PERSONA + ", IDFK_CON=" + IDFK_CON
				+ ", CREAT_PER=" + CREAT_PER + ", DATA_CREACIO=" + DATA_CREACIO + ", ACTUALITZAT_PER=" + ACTUALITZAT_PER
				+ ", DATA_ACTUALITZACIO=" + DATA_ACTUALITZACIO + "]";
	}
	
	
	
}
