package com.api.concessionari.service;

import java.util.List;

import com.api.concessionari.dto.Treballador;


public interface ITreballadorService {

	//Lista de reservas
	public List <Treballador> listarTreballador();
				
				
	//Guardar
	public Treballador saveTreballador(Treballador treballador);
				
		
	//Leer por id
	public Treballador getById(Long IDPK_TREB);
				
				
	//Actualizar
	public Treballador updateTreballador(Treballador treballador);
				
				
	//Elimina la reserva
	public void deleteTreballador(Long IDPK_TREB);
	
}
