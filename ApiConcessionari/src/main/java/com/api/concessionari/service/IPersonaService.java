package com.api.concessionari.service;

import java.util.List;

import com.api.concessionari.dto.Persona;

public interface IPersonaService {

	//Listar All
	public List<Persona> listarPersona();  
	
	//Guarda un Cuenta CREATE
	public Persona savePersona(Persona personas);
	
	//Leer datos de un Cuenta READ
	public Persona getById(Long IDPK_PERSONA); 
	
	//Actualiza datos del cuentas UPDATE
	public Persona updatePersona(Persona personas); 
	
	// Elimina el cuentas DELETE
	public void deletePersona(Long IDPK_PERSONA);
	
}
