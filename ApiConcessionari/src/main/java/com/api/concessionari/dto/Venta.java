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
@Table(name="gcon_tb_venta")

public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="idpk_venta", nullable = false)
	private Long idpk_venta;
	
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
	@JoinColumn(name = "idfk_client")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name = "idfk_con")
	private Concessionari concessionari;
	
	@ManyToOne
	@JoinColumn(name = "idfk_vehicle")
	private Vehicle vehicle;
	
	@ManyToOne
	@JoinColumn(name = "idfk_treb")
	private Treballador treballador;
	
	
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
	
	public Venta(Long idpk_venta, Integer descompte, Integer iva, Integer preu, Integer preu_final, String creat_per, Date data_creacio,
			String actualitzat_per, Date data_actualitzacio, Client client, Concessionari concessionari,
			Vehicle vehicle, Treballador treballador) {
		this.idpk_venta = idpk_venta;
		this.descompte = descompte;
		this.iva = iva;
		this.preu = preu;
		this.preu_final = preu_final;
		this.creat_per = creat_per;
		this.data_creacio = data_creacio;
		this.actualitzat_per = actualitzat_per;
		this.data_actualitzacio = data_actualitzacio;
		this.client = client;
		this.concessionari = concessionari;
		this.vehicle = vehicle;
		this.treballador = treballador;
	}


	public Long getIdpk_venta() {
		return idpk_venta;
	}


	public void setIdpk_venta(Long idpk_venta) {
		this.idpk_venta = idpk_venta;
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


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
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


	public Treballador getTreballador() {
		return treballador;
	}


	public void setTreballador(Treballador treballador) {
		this.treballador = treballador;
	}
	
	
	
}
