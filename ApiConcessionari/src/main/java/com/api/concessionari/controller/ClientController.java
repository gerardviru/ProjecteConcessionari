package com.api.concessionari.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.concessionari.dto.Client;
import com.api.concessionari.service.ClientServiceImpl;

@RestController
@RequestMapping("/api")
public class ClientController {
	
	@Autowired
	ClientServiceImpl clientServiceImpl;
	
	
	public ClientController() {
	}
	
	// Get all
	@GetMapping("/client")
	public List<Client> listarClients() {
		return clientServiceImpl.listarClient();
	}

	// Get client by id
	@GetMapping("/client/{id}")
	public Client listarPorId(@PathVariable(name = "id") Long idpk_client) {
		return clientServiceImpl.getById(idpk_client);
	}

	
	// Add Client
	@PostMapping("/client")
	public Client addNewClient(@RequestBody Client client) {
		return clientServiceImpl.saveClient(client);
	}
	
	// Update Client
	@PutMapping("/client/{id}")
	public Client updateClient(@PathVariable(name = "id") Long idpk_client, @RequestBody Client client) {

		Client client_seleccionada = new Client();
		Client client_actualizada = new Client();
		
		System.out.println(client.toString());

		client_seleccionada = clientServiceImpl.getById(idpk_client);

		if(client.getConcessionari()!= null) {
			client_seleccionada.setConcessionari(client.getConcessionari());			
		}
		if(client.getPersona() != null) {
			client_seleccionada.setPersona(client.getPersona());			
		}
		client_actualizada = clientServiceImpl.updateClient(client_seleccionada);
		return client_actualizada;
	}

	// Delete client
	@DeleteMapping("/client/{id}")
	public void deleteClient(@PathVariable(name = "id") Long idpk_client) {
		clientServiceImpl.deleteClient(idpk_client);
	}

}
