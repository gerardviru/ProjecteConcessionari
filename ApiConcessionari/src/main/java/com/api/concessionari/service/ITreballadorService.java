package com.api.concessionari.service;

import java.util.List;

import com.api.concessionari.dto.Treballador;


public interface ITreballadorService {

	//Lista de reservas
	public List <Treballador> listarTreballador();
				
				
	//Guardar
	public Treballador guardarTreballador(Treballador treballador);
				
		
	//Leer por id
	public Treballador treballadorID(Long IDPK_TREB);
				
				
	//Actualizar
	public Treballador actualizarTreballador(Treballador treballador);
				
				
	//Elimina la reserva
	public void eliminarTreballador(Long IDPK_PROV);
	
}
