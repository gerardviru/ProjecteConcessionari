package com.api.concessionari.service;

import java.util.List;

import com.api.concessionari.dto.Provincia;

public interface IProvinciaService {
	
	//Lista de reservas
	public List <Provincia> listarProvincia();
			
			
	//Guardar
	public Provincia guardarProvincia(Provincia provincia);
			
			
	//Leer por id
	public Provincia provinciaID(Long IDPK_PROV);
			
			
	//Actualizar
	public Provincia actualizarProvincia(Provincia provincia);
			
			
	//Elimina la reserva
	public void eliminarProvincia(Long IDPK_PROV);

}
