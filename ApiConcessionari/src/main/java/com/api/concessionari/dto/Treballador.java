package com.api.concessionari.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="GCON_TB_TREBALLADOR")

public class Treballador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="idpk_treb", nullable = false)
	private Long idpk_treb;
	
	@Column(name="idfk_persona", nullable = false)
	private Integer idfk_persona;
		
	@Column(name="idfk_con", nullable = false)
	private Integer idfk_con;
	
	@Column(name="num_seg_soc", nullable = false)
	private Integer num_seg_soc;
	
	@Column(name="carrec", nullable = false)
	private Integer carrec;
	
	@Column (name = "creat_per")
	private String creat_per;
	
	@Column (name = "data_creacio")
	private Date data_creacio;
	
	@Column (name = "actualitzat_per")
	private String actualitzat_per;
	
	@Column (name = "data_actualitzacio")
	private Date data_actualitzacio;
	
	
	@ManyToOne
	@JoinColumn(name = "idpk_treb")
	private Concessionari concessionari;
	
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
	
	public Treballador(Long idpk_treb, Integer idfk_persona, Integer idfk_con, Integer num_seg_soc, Integer carrec,
			String creat_per, Date data_creacio, String actualitzat_per, Date data_actualitzacio) {
		this.idpk_treb = idpk_treb;
		this.idfk_persona = idfk_persona;
		this.idfk_con = idfk_con;
		this.num_seg_soc = num_seg_soc;
		this.carrec = carrec;
		this.creat_per = creat_per;
		this.data_creacio = data_creacio;
		this.actualitzat_per = actualitzat_per;
		this.data_actualitzacio = data_actualitzacio;
	}


	public Long getIdpk_treb() {
		return idpk_treb;
	}


	public void setIdpk_treb(Long idpk_treb) {
		this.idpk_treb = idpk_treb;
	}


	public Integer getIdfk_persona() {
		return idfk_persona;
	}


	public void setIdfk_persona(Integer idfk_persona) {
		this.idfk_persona = idfk_persona;
	}


	public Integer getIdfk_con() {
		return idfk_con;
	}


	public void setIdfk_con(Integer idfk_con) {
		this.idfk_con = idfk_con;
	}


	public Integer getNum_seg_soc() {
		return num_seg_soc;
	}


	public void setNum_seg_soc(Integer num_seg_soc) {
		this.num_seg_soc = num_seg_soc;
	}


	public Integer getCarrec() {
		return carrec;
	}


	public void setCarrec(Integer carrec) {
		this.carrec = carrec;
	}


	public String getCreat_per() {
		return creat_per;
	}


	public void setCreat_per(String creat_per) {
		this.creat_per = creat_per;
	}


	public Date getData_creacio() {
		return data_creacio;
	}


	public void setData_creacio(Date data_creacio) {
		this.data_creacio = data_creacio;
	}


	public String getActualitzat_per() {
		return actualitzat_per;
	}


	public void setActualitzat_per(String actualitzat_per) {
		this.actualitzat_per = actualitzat_per;
	}


	public Date getData_actualitzacio() {
		return data_actualitzacio;
	}


	public void setData_actualitzacio(Date data_actualitzacio) {
		this.data_actualitzacio = data_actualitzacio;
	}	

	
}
