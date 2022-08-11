package com.api.concessionari.service;

import java.util.List;
import com.api.concessionari.dto.Perfil;

public interface IPerfilService {

	//Lista de reservas
		public List <Perfil> listarPerfil();
						
		
		//Guardar
		public Perfil savePerfil(Perfil perfil);
						
				
		//Leer por id
		public Perfil getById(Long IDPK_PERFIL);
						
						
		//Actualizar
		public Perfil updatePerfil(Perfil perfil);
						
						
		//Elimina la reserva
		public void deletePerfil(Long IDPK_PERFIL);
	
	
}
