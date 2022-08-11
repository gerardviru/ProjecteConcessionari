package com.api.concessionari.service;

import java.util.List;
import com.api.concessionari.dto.Client;

public interface IClientService {

	//Listar All
		public List<Client> listarClient();  
		
		//Guarda un Cuenta CREATE
		public Client saveClient(Client client);
		
		//Leer datos de un Cuenta READ
		public Client getById(Long IDPK_CLIENT); 
		
		//Actualiza datos del cuentas UPDATE
		public Client updateClient(Client client); 
		
		// Elimina el cuentas DELETE
		public void deleteClient(Long IDPK_CLIENT);
		
}
