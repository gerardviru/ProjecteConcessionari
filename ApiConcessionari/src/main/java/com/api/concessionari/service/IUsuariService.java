package com.api.concessionari.service;

import java.util.List;

import com.api.concessionari.dto.Usuari;

public interface IUsuariService {

	//Lista de reservas
	public List <Usuari> listarUsuari();
					
	
	//Guardar
	public Usuari saveUsuari(Usuari usuari);
					
			
	//Leer por id
	public Usuari getById(Long IDPK_USUARI);
					
					
	//Actualizar
	public Usuari updateUsuari(Usuari usuari);
					
					
	//Elimina la reserva
	public void deleteUsuari(Long IDPK_USUARI);
	
	public Usuari findByUsername(String username);
	
}
