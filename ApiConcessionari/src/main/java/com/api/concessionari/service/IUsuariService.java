package com.api.concessionari.service;

import java.util.List;

import com.api.concessionari.dto.Usuari;

public interface IUsuariService {

	//Lista de reservas
		public List <Usuari> listarUsuari();
					
					
		//Guardar
		public Usuari guardarUsuari(Usuari usuari);
					
			
		//Leer por id
		public Usuari usuariID(Long IDPK_USUARI);
					
					
		//Actualizar
		public Usuari actualizarUsuari(Usuari usuari);
					
					
		//Elimina la reserva
		public void eliminarUsuari(Long IDPK_USUARI);
	
}
