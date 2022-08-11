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
@Table(name="GCON_TB_VENTA")

public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="idpk_venta", nullable = false)
	private Long idpk_venta;
	
	@Column(name="idfk_con", nullable = false)
	private Integer idfk_con;
		
	@Column(name="idfk_vehicle", nullable = false)
	private Integer idfk_vehicle;
	
	@Column(name="idfk_treb", nullable = false)
	private Integer idfk_treb;
	
	@Column(name="idfk_client", nullable = false)
	private Integer idfk_client;
	
	@Column(name="descompte")
	private Integer descompte;
	
	@Column(name="iva", nullable = false)
	private Integer iva;
	
	@Column(name="preu", nullable = false)
	private Integer preu;
	
	@Column(name="preu_final", nullable = false)
	private Integer preu_final;
	
	@Column (name = "creat_per")
	private String creat_per;
	
	@Column (name = "data_creacio")
	private Date data_creacio;
	
	@Column (name = "actualitzat_per")
	private String actualitzat_per;
	
	@Column (name = "data_actualitzacio")
	private Date data_actualitzacio;
	
	
	@ManyToOne
	@JoinColumn(name = "idpk_venta")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name = "idpk_venta")
	private Concessionari concessionari;
	
	@ManyToOne
	@JoinColumn(name = "idpk_venta")
	private Vehicle vehicle;
	
	
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
	
	public Venta(Long idpk_venta, Integer idfk_con, Integer idfk_vehicle, Integer idfk_treb, Integer idfk_client,
			Integer descompte, Integer iva, Integer preu, Integer preu_final, String creat_per, Date data_creacio,
			String actualitzat_per, Date data_actualitzacio) {
		this.idpk_venta = idpk_venta;
		this.idfk_con = idfk_con;
		this.idfk_vehicle = idfk_vehicle;
		this.idfk_treb = idfk_treb;
		this.idfk_client = idfk_client;
		this.descompte = descompte;
		this.iva = iva;
		this.preu = preu;
		this.preu_final = preu_final;
		this.creat_per = creat_per;
		this.data_creacio = data_creacio;
		this.actualitzat_per = actualitzat_per;
		this.data_actualitzacio = data_actualitzacio;
	}

	public Long getIdpk_venta() {
		return idpk_venta;
	}

	public void setIdpk_venta(Long idpk_venta) {
		this.idpk_venta = idpk_venta;
	}

	public Integer getIdfk_con() {
		return idfk_con;
	}

	public void setIdfk_con(Integer idfk_con) {
		this.idfk_con = idfk_con;
	}

	public Integer getIdfk_vehicle() {
		return idfk_vehicle;
	}

	public void setIdfk_vehicle(Integer idfk_vehicle) {
		this.idfk_vehicle = idfk_vehicle;
	}

	public Integer getIdfk_treb() {
		return idfk_treb;
	}

	public void setIdfk_treb(Integer idfk_treb) {
		this.idfk_treb = idfk_treb;
	}

	public Integer getIdfk_client() {
		return idfk_client;
	}

	public void setIdfk_client(Integer idfk_client) {
		this.idfk_client = idfk_client;
	}

	public Integer getDescompte() {
		return descompte;
	}

	public void setDescompte(Integer descompte) {
		this.descompte = descompte;
	}

	public Integer getIva() {
		return iva;
	}

	public void setIva(Integer iva) {
		this.iva = iva;
	}

	public Integer getPreu() {
		return preu;
	}

	public void setPreu(Integer preu) {
		this.preu = preu;
	}

	public Integer getPreu_final() {
		return preu_final;
	}

	public void setPreu_final(Integer preu_final) {
		this.preu_final = preu_final;
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
