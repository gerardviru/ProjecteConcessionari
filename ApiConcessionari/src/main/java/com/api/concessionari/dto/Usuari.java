	package com.api.concessionari.dto;
	
	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.Date;
	import java.util.List;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;
	import org.springframework.security.core.GrantedAuthority;
	import org.springframework.security.core.authority.SimpleGrantedAuthority;
	import org.springframework.security.core.userdetails.UserDetails;
	
	@Entity
	@Table(name="gcon_tb_usuari")
	
	public class Usuari implements UserDetails {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idpk_usuari;
	 
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="rol")
	private String rol;
	
	@Column(name="intents")
	private Integer intents;
	
	@Column(name="bloquejat")
	private String bloquejat;
	
	@Column (name = "creat_per")
	private String creat_per;
	
	@Column (name = "data_creacio")
	private Date data_creacio;
	
	@Column (name = "actualitzat_per")
	private String actualitzat_per;
	
	@Column (name = "data_actualitzacio")
	private Date data_actualitzacio;
	
	@ManyToOne
	@JoinColumn(name = "idfk_persona")
	private Persona persona;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority(this.rol));
		return roles;
	}
	
	public Usuari() {
	}
	
	public Usuari(Long idpk_usuari, String username, String password, String rol, Integer intents, String bloquejat,
			String creat_per, Date data_creacio, String actualitzat_per, Date data_actualitzacio, Persona persona) {
		this.idpk_usuari = idpk_usuari;
		this.username = username;
		this.password = password;
		this.rol = rol;
		this.intents = intents;
		this.bloquejat = bloquejat;
		this.creat_per = creat_per;
		this.data_creacio = data_creacio;
		this.actualitzat_per = actualitzat_per;
		this.data_actualitzacio = data_actualitzacio;
		this.persona = persona;
	}
	

	public Long getIdpk_usuari() {
		return idpk_usuari;
	}
	
	public void setIdpk_usuari(int idpk_usuari) {
		this.idpk_usuari = idpk_usuari;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRol() {
		return rol;
	}
	
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	public Integer getIntents() {
		return intents;
	}
	
	public void setIntents(Integer intents) {
		this.intents = intents;
	}
	
	public String getBloquejat() {
		return bloquejat;
	}
	
	public void setBloquejat(String bloquejat) {
		this.bloquejat = bloquejat;
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
	public Persona getPersona() {
		return persona;
	}
	
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
			return true;
	}

}
	
	
