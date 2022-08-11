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
@Table(name="GCON_TM_ROL")

public class Rol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="idpk_rol", nullable = false)
	private Long idpk_rol;
	
	@Column(name="codi_rol", nullable = false)
	private String codi_rol;
		
	@Column(name="desc_rol", nullable = false)
	private String desc_rol;
	
	@Column (name = "creat_per")
	private String creat_per;
	
	@Column (name = "data_creacio")
	private Date data_creacio;
	
	@Column (name = "actualitzat_per")
	private String actualitzat_per;
	
	@Column (name = "data_actualitzacio")
	private Date data_actualitzacio;
	
	
	@OneToMany
	@JoinColumn(name = "idfk_perfil")
	private List<Perfil> perfil;


	public Rol() {
		
	}
	
	/**
	 * @param IDPK_ROL
	 * @param CODI_ROL
	 * @param DESC_ROL
	 * @param CREAT_PER
	 * @param DATA_CREACIO
	 * @param ACTUALITZAT_PER
	 * @param DATA_ACTUALITZACIO
	 */
	
	public Rol(Long idpk_rol, String codi_rol, String desc_rol, String creat_per, Date data_creacio,
			String actualitzat_per, Date data_actualitzacio, List<Perfil> perfil) {
		this.idpk_rol = idpk_rol;
		this.codi_rol = codi_rol;
		this.desc_rol = desc_rol;
		this.creat_per = creat_per;
		this.data_creacio = data_creacio;
		this.actualitzat_per = actualitzat_per;
		this.data_actualitzacio = data_actualitzacio;
		this.perfil = perfil;
	}

	public Long getIdpk_rol() {
		return idpk_rol;
	}

	public void setIdpk_rol(Long idpk_rol) {
		this.idpk_rol = idpk_rol;
	}

	public String getCodi_rol() {
		return codi_rol;
	}

	public void setCodi_rol(String codi_rol) {
		this.codi_rol = codi_rol;
	}

	public String getDesc_rol() {
		return desc_rol;
	}

	public void setDesc_rol(String desc_rol) {
		this.desc_rol = desc_rol;
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
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "perfil")
	public List<Perfil> getPerfil() {
		return perfil;
	}

	public void setPerfil(List<Perfil> perfil) {
		this.perfil = perfil;
	}
	
	
	
}