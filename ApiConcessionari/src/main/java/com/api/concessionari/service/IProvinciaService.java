package com.api.concessionari.service;

import java.util.List;

import com.api.concessionari.dto.Provincia;

public interface IProvinciaService {
	
	//Lista de reservas
	public List <Provincia> listarProvincia();
			
			
	//Guardar
	public Provincia saveProvincia(Provincia provincia);
			
			
	//Leer por id
	public Provincia getById(Long IDPK_PROV);
			
			
	//Actualizar
	public Provincia updateProvincia(Provincia provincia);
			
			
	//Elimina la reserva
	public void deleteProvincia(Long IDPK_PROV);

}
