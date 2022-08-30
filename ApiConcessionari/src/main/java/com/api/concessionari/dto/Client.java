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
@Table(name="gcon_tb_client")

public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idpk_client;
	
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
	
	@OneToMany
	@JoinColumn(name = "idfk_client")
	private List<Venta> venta;
	
	@ManyToOne
	@JoinColumn(name = "idfk_persona")
	private Persona persona;
	
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
	
	public Client(Long idpk_client,String creat_per, Date data_creacio,
			String actualitzat_per, Date data_actualitzacio, Concessionari concessionari, List<Venta> venta,
			Persona persona) {
		this.idpk_client = idpk_client;
		this.creat_per = creat_per;
		this.data_creacio = data_creacio;
		this.actualitzat_per = actualitzat_per;
		this.data_actualitzacio = data_actualitzacio;
		this.concessionari = concessionari;
		this.venta = venta;
		this.persona = persona;
	}



	public Long getIdpk_client() {
		return idpk_client;
	}



	public void setIdpk_client(Long idpk_client) {
		this.idpk_client = idpk_client;
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


	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "venta")
	public List<Venta> getVenta() {
		return venta;
	}



	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}



	public Persona getPersona() {
		return persona;
	}



	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	
}
