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

import com.api.concessionari.dto.Usuari;
import com.api.concessionari.service.UsuariServiceImpl;


@RestController
@RequestMapping("/api")

public class UsuariController {

	@Autowired
	UsuariServiceImpl usuariServiceImpl;

	// Get all
	@GetMapping("/usuari")
	public List<Usuari> listarUsuaris() {
		return usuariServiceImpl.listarUsuari();
	}

	// Get usuari by id
	@GetMapping("/usuari/{id}")
	public Usuari listarPorId(@PathVariable(name = "id") Long idpk_usuari) {
		return usuariServiceImpl.getById(idpk_usuari);
	}

	
	// Add Usuari
	@PostMapping("/usuari")
	public Usuari addNewUsuari(@RequestBody Usuari usuari) {
		return usuariServiceImpl.saveUsuari(usuari);
	}
	
	// Update Usuari
	@PutMapping("/usuari/{id}")
	public Usuari updateUsuari(@PathVariable(name = "id") Long idpk_usuari, @RequestBody Usuari usuari) {

		Usuari usuari_seleccionada = new Usuari();
		Usuari usuari_actualizada = new Usuari();
		
		System.out.println(usuari.toString());

		usuari_seleccionada = usuariServiceImpl.getById(idpk_usuari);

		if(usuari.getUsername()!= null) {
			usuari_seleccionada.setUsername(usuari.getUsername());			
		}
		if(usuari.getPassword() != null) {
			usuari_seleccionada.setPassword(usuari.getPassword());			
		}
		if(usuari.getIntents() != null) {
			usuari_seleccionada.setIntents(usuari.getIntents());			
		}
		if(usuari.getPersona() != null) {
			usuari_seleccionada.setPersona(usuari.getPersona());			
		}

		usuari_actualizada = usuariServiceImpl.updateUsuari(usuari_seleccionada);
		return usuari_actualizada;
	}

	// Delete usuari
	@DeleteMapping("/usuari/{id}")
	public void deleteUsuari(@PathVariable(name = "id") Long idpk_usuari) {
		usuariServiceImpl.deleteUsuari(idpk_usuari);
	}
}
