package com.api.concessionari.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="gcon_tb_treballador")

public class Treballador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idpk_treb;
		
	@Column(name="num_seg_soc", nullable = false)
	private Integer num_seg_soc;
	
	@Column(name="carrec", nullable = false)
	private String carrec;
	
	@Column (name = "creat_per")
	private String creat_per;
	
	@Column (name = "data_creacio")
	private Date data_creacio;
	
	@Column (name = "actualitzat_per")
	private String actualitzat_per;
	
	@Column (name = "data_actualitzacio")
	private Date data_actualitzacio;
	
	
	@ManyToOne
	@JoinColumn(name = "idfk_con")
	private Concessionari concessionari;
	
	
	@ManyToOne
	@JoinColumn(name = "idfk_persona")
	private Persona persona;
	
	@OneToMany
	@JoinColumn(name = "idfk_treb")
	private List<Venta> venta;
	
	
	
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
	
	public Treballador(Long idpk_treb, Integer num_seg_soc, String carrec,
			String creat_per, Date data_creacio, String actualitzat_per, Date data_actualitzacio,
			Concessionari concessionari, Persona persona, List<Venta> venta) {
		this.idpk_treb = idpk_treb;
		this.num_seg_soc = num_seg_soc;
		this.carrec = carrec;
		this.creat_per = creat_per;
		this.data_creacio = data_creacio;
		this.actualitzat_per = actualitzat_per;
		this.data_actualitzacio = data_actualitzacio;
		this.concessionari = concessionari;
		this.persona = persona;
		this.venta = venta;
	}

	public Long getIdpk_treb() {
		return idpk_treb;
	}

	public void setIdpk_treb(Long idpk_treb) {
		this.idpk_treb = idpk_treb;
	}

	public Integer getNum_seg_soc() {
		return num_seg_soc;
	}

	public void setNum_seg_soc(Integer num_seg_soc) {
		this.num_seg_soc = num_seg_soc;
	}

	public String getCarrec() {
		return carrec;
	}

	public void setCarrec(String carrec) {
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

	public Concessionari getConcessionari() {
		return concessionari;
	}

	public void setConcessionari(Concessionari concessionari) {
		this.concessionari = concessionari;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getVenta() {
		return venta;
	}

	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}
	
	

	
}
