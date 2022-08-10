package com.api.concessionari.service;

import java.util.List;
import com.api.concessionari.dto.Client;

public interface IClientService {

	//Listar All
		public List<Client> listarClient();  
		
		//Guarda un Cuenta CREATE
		public Client guardarClient(Client client);
		
		//Leer datos de un Cuenta READ
		public Client personasXID(Long IDPK_CLIENT); 
		
		//Actualiza datos del cuentas UPDATE
		public Client actualizarClient(Client client); 
		
		// Elimina el cuentas DELETE
		public void eliminarClient(Long IDPK_CLIENT);
		
}
