package com.api.concessionari.service;

import java.util.List;

import com.api.concessionari.dto.Rol;


public interface IRolService {

	//Lista de reservas
	public List <Rol> listarRol();
						
						
	//Guardar
	public Rol saveRol(Rol rol);
						
				
	//Leer por id
	public Rol getById(Long IDPK_ROL);
						
						
	//Actualizar
	public Rol updateRol(Rol rol);
						
						
	//Elimina la reserva
	public void deleteRol(Long IDPK_ROL);
}
