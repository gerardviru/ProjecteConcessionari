package com.api.concessionari.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CONCESSIONARI")

public class Concessionari {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="IDPK_CON", nullable = false)
	private Long IDPK_CON;
	
	@Column(name="CIF", nullable = false)
	private String CIF;
		
	@Column(name="CIntNOM")
	private String CIntNOM;
		
	@Column (name = "TELEFON", nullable = false)
	private String TELEFON;
	
	@Column (name = "EMAIL", nullable = false)
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
	
		
	@OneToMany
	@JoinColumn(name="IDPK_CON")
	private List<Provincia> provincia;
		
	
	public Concessionari() {
	}

	/**
	 * @param IDPK_CON
	 * @param CIF
	 * @param CIntNOM
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
	public Concessionari(Long IDPK_CON, String CIF, String CIntNOM, String TELEFON, String EMAIL, String ADREÇA, List<Provincia> provincia, 
			Integer IDFK_PROV,Integer CODI_POSTAL,String CREAT_PER, Date DATA_CREACIO, String ACTUALITZAT_PER,Date DATA_ACTUALITZACIO) {
		this.IDPK_CON = IDPK_CON;
		this.CIF = CIF;
		this.CIntNOM = CIntNOM;
		this.TELEFON = TELEFON;
		this.EMAIL = EMAIL;
		this.ADREÇA = ADREÇA;
		this.IDFK_PROV =IDFK_PROV;
		this.CODI_POSTAL = CODI_POSTAL;
		this.provincia = provincia;
		this.CREAT_PER = CREAT_PER;
		this.DATA_CREACIO = DATA_CREACIO;
		this.ACTUALITZAT_PER =ACTUALITZAT_PER;
		this.DATA_ACTUALITZACIO = DATA_ACTUALITZACIO;
		
	}

	public void setProvincia(List<Provincia> provincia) {
		this.provincia = provincia;
	}

	public Long getIDPK_CON() {
		return IDPK_CON;
	}

	public void setIDPK_CON(Long iDPK_CON) {
		IDPK_CON = iDPK_CON;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	public String getCIntNOM() {
		return CIntNOM;
	}

	public void setCIntNOM(String cIntNOM) {
		CIntNOM = cIntNOM;
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
		return "Concessionari [IDPK_CON=" + IDPK_CON + ", CIF=" + CIF + ", CIntNOM=" + CIntNOM + ", TELEFON=" + TELEFON
				+ ", EMAIL=" + EMAIL + ", ADREÇA=" + ADREÇA + ", IDFK_PROV=" + IDFK_PROV + ", CODI_POSTAL="
				+ CODI_POSTAL + ", CREAT_PER=" + CREAT_PER + ", DATA_CREACIO=" + DATA_CREACIO + ", ACTUALITZAT_PER="
				+ ACTUALITZAT_PER + ", DATA_ACTUALITZACIO=" + DATA_ACTUALITZACIO + ", provincia=" + provincia + "]";
	}

}
