package com.api.concessionari.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="GCON_TB_CLIENT")

public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="idpk_client", nullable = false)
	private Long idpk_client;
	
	@Column(name="idfk_persona", nullable = false)
	private Integer idfk_persona;
		
	@Column(name="idfk_con", nullable = false)
	private Integer idfk_con;
	
	@Column (name = "creat_per")
	private String creat_per;
	
	@Column (name = "data_creacio")
	private Date data_creacio;
	
	@Column (name = "actualitzat_per")
	private String actualitzat_per;
	
	@Column (name = "data_actualitzacio")
	private Date data_actualitzacio;
	
	@ManyToOne
	@JoinColumn(name = "idpk_con")
	private Concessionari concessionari;
	
	@OneToMany
	@JoinColumn(name = "idfk_client")
	private List<Venta> venta;
	
	@ManyToOne
	@JoinColumn(name = "idpk_persona")
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
	
	public Client(Long idpk_client, Integer idfk_persona, Integer idfk_con, String creat_per, Date data_creacio,
			String actualitzat_per, Date data_actualitzacio) {
		this.idpk_client = idpk_client;
		this.idfk_persona = idfk_persona;
		this.idfk_con = idfk_con;
		this.creat_per = creat_per;
		this.data_creacio = data_creacio;
		this.actualitzat_per = actualitzat_per;
		this.data_actualitzacio = data_actualitzacio;
	}


	public Long getIdpk_client() {
		return idpk_client;
	}


	public void setIdpk_client(Long idpk_client) {
		this.idpk_client = idpk_client;
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
