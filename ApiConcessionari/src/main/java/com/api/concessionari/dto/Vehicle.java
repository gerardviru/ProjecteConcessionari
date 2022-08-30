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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="gcon_tb_vehicle")

public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idpk_vehicle;
	
	@Column(name="marca", nullable = false)
	private String marca;
		
	@Column(name="model", nullable = false)
	private String model;
	
	@Column(name="color", nullable = false)
	private String color;
	
	@Column(name="desc_tecnica")
	private String desc_tecnica;
	
	@Column (name = "creat_per")
	private String creat_per;
	
	@Column (name = "data_creacio")
	private Date data_creacio;
	
	@Column (name = "actualitzat_per")
	private String actualitzat_per;
	
	@Column (name = "data_actualitzacio")
	private Date data_actualitzacio;
	
	
	@OneToMany
	@JoinColumn(name = "idfk_vehicle")
	private List<Venta> venta;
	
	@OneToMany
	@JoinColumn(name = "idfk_vehicle")
	private List<Stock> stock;
	
	
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
	
	public Vehicle(Long idpk_vehicle, String marca, String model, String color, String desc_tecnica, String creat_per,
			Date data_creacio, String actualitzat_per, Date data_actualitzacio, List<Venta> venta, List<Stock> stock) {
		this.idpk_vehicle = idpk_vehicle;
		this.marca = marca;
		this.model = model;
		this.color = color;
		this.desc_tecnica = desc_tecnica;
		this.creat_per = creat_per;
		this.data_creacio = data_creacio;
		this.actualitzat_per = actualitzat_per;
		this.data_actualitzacio = data_actualitzacio;
		this.venta = venta;
		this.stock = stock;
	}

	public Long getIdpk_vehicle() {
		return idpk_vehicle;
	}

	public void setIdpk_vehicle(Long idpk_vehicle) {
		this.idpk_vehicle = idpk_vehicle;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDesc_tecnica() {
		return desc_tecnica;
	}

	public void setDesc_tecnica(String desc_tecnica) {
		this.desc_tecnica = desc_tecnica;
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

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "venta")
	public List<Venta> getVenta() {
		return venta;
	}

	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}

	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stock")
	public List<Stock> getStock() {
		return stock;
	}

	public void setStock(List<Stock> stock) {
		this.stock = stock;
	}
	
	
}
