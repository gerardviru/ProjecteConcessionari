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
@Table(name="gcon_tb_concessionari")

public class Concessionari {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idpk_con;
	
	@Column(name="cif", nullable = false)
	private String cif;
		
	@Column(name="nom")
	private String nom;
		
	@Column (name = "telefon", nullable = false)
	private String telefon;
	
	@Column (name = "email", nullable = false)
	private String email;
	
	@Column (name = "adreça")
	private String adreça;
	
	@Column (name = "codi_postal")
	private Integer codi_postal;
	
	@Column (name = "creat_per")
	private String creat_per;
	
	@Column (name = "data_creacio")
	private Date data_creacio;
	
	@Column (name = "actualitzat_per")
	private String actualitzat_per;
	
	@Column (name = "data_actualitzacio")
	private Date data_actualitzacio;
	
		
	@ManyToOne
	@JoinColumn(name = "idfk_prov")
	private Provincia provincia;
	
	@OneToMany
	@JoinColumn(name = "idfk_con")
	private List<Stock> stock;
		
	@OneToMany
	@JoinColumn(name = "idfk_con")
	private List<Venta> venta;
	
	@OneToMany
	@JoinColumn(name = "idfk_con")
	private List<Treballador> treballador;
	
	@OneToMany
	@JoinColumn(name = "idfk_con")
	private List<Client> client;
	
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
	
	public Concessionari(Long idpk_con, String cif, String nom, String telefon, String email, String adreça,
			Integer codi_postal, String creat_per, Date data_creacio, String actualitzat_per, Date data_actualitzacio,
			List<Stock> stock, List<Venta> venta, List<Treballador> treballador,
			List<Client> client) {
		this.idpk_con = idpk_con;
		this.cif = cif;
		this.nom = nom;
		this.telefon = telefon;
		this.email = email;
		this.adreça = adreça;
		this.codi_postal = codi_postal;
		this.creat_per = creat_per;
		this.data_creacio = data_creacio;
		this.actualitzat_per = actualitzat_per;
		this.data_actualitzacio = data_actualitzacio;
		this.stock = stock;
		this.venta = venta;
		this.treballador = treballador;
		this.client = client;
	}
	

	public Long getIdpk_con() {
		return idpk_con;
	}


	public void setIdpk_con(Long idpk_con) {
		this.idpk_con = idpk_con;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdreça() {
		return adreça;
	}

	public void setAdreça(String adreça) {
		this.adreça = adreça;
	}

	public Integer getCodi_postal() {
		return codi_postal;
	}

	public void setCodi_postal(Integer codi_postal) {
		this.codi_postal = codi_postal;
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

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Stock")
	public List<Stock> getStock() {
		return stock;
	}

	public void setStock(List<Stock> stock) {
		this.stock = stock;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getVenta() {
		return venta;
	}

	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}

	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Treballador")
	public List<Treballador> getTreballador() {
		return treballador;
	}

	public void setTreballador(List<Treballador> treballador) {
		this.treballador = treballador;
	}

	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Client")
	public List<Client> getClient() {
		return client;
	}

	public void setClient(List<Client> client) {
		this.client = client;
	}
	
	
	
	
	

}
