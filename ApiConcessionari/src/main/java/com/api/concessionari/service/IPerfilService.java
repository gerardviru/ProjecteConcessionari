package com.api.concessionari.service;

import java.util.List;
import com.api.concessionari.dto.Perfil;

public interface IPerfilService {

	//Lista de reservas
		public List <Perfil> listarPerfil();
						
		
		//Guardar
		public Perfil guardarPerfil(Perfil perfil);
						
				
		//Leer por id
		public Perfil perfilID(Long IDPK_PERFIL);
						
						
		//Actualizar
		public Perfil actualizarPerfil(Perfil perfil);
						
						
		//Elimina la reserva
		public void eliminarPerfil(Long IDPK_PERFIL);
	
	
}
