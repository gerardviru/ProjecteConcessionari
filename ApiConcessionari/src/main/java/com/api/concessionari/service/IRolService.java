package com.api.concessionari.service;

import java.util.List;

import com.api.concessionari.dto.Rol;


public interface IRolService {

	//Lista de reservas
	public List <Rol> listarRol();
						
						
	//Guardar
	public Rol guardarRol(Rol rol);
						
				
	//Leer por id
	public Rol rolID(Long IDPK_ROL);
						
						
	//Actualizar
	public Rol actualizarRol(Rol rol);
						
						
	//Elimina la reserva
	public void eliminarRol(Long IDPK_ROL);
}
