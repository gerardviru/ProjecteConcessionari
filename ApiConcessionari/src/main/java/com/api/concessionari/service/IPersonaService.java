package com.api.concessionari.service;

import java.util.List;

import com.api.concessionari.dto.Persona;

public interface IPersonaService {

	//Listar All
	public List<Persona> listarPersona();  
	
	//Guarda un Cuenta CREATE
	public Persona guardarPersona(Persona personas);
	
	//Leer datos de un Cuenta READ
	public Persona personasXID(Long IDPK_PERSONA); 
	
	//Actualiza datos del cuentas UPDATE
	public Persona actualizarPersona(Persona personas); 
	
	// Elimina el cuentas DELETE
	public void eliminarPersona(Long IDPK_PERSONA);
	
	// Cuenta por NIF
	public Persona getPersonaByNIF(String NIF);
}
