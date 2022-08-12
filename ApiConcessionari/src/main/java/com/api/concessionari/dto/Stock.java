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
@Table(name="gcon_tb_stock")

public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="idpk_stock", nullable = false)
	private Long idpk_stock;

	@Column(name="unitats", nullable = false)
	private Integer unitats;
	
	@Column(name="preu", nullable = false)
	private Integer preu;
	
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
	@JoinColumn(name = "idfk_vehicle")
	private Vehicle vehicle;
	
	
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
	
	public Stock(Long idpk_stock, Integer unitats, Integer preu,
			String creat_per, Date data_creacio, String actualitzat_per, Date data_actualitzacio,
			Concessionari concessionari, Vehicle vehicle) {
		this.idpk_stock = idpk_stock;
		this.unitats = unitats;
		this.preu = preu;
		this.creat_per = creat_per;
		this.data_creacio = data_creacio;
		this.actualitzat_per = actualitzat_per;
		this.data_actualitzacio = data_actualitzacio;
		this.concessionari = concessionari;
		this.vehicle = vehicle;
	}

	public Long getIdpk_stock() {
		return idpk_stock;
	}

	public void setIdpk_stock(Long idpk_stock) {
		this.idpk_stock = idpk_stock;
	}

	public Integer getUnitats() {
		return unitats;
	}

	public void setUnitats(Integer unitats) {
		this.unitats = unitats;
	}

	public Integer getPreu() {
		return preu;
	}

	public void setPreu(Integer preu) {
		this.preu = preu;
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

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
	
}
