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

import com.api.concessionari.dto.Persona;
import com.api.concessionari.dto.Provincia;
import com.api.concessionari.service.PersonaServiceImpl;
import com.api.concessionari.service.ProvinciaServiceImpl;


@RestController
@RequestMapping("/api")
public class PersonaController {

	@Autowired
	PersonaServiceImpl personaServiceImpl;
	
	@Autowired
	ProvinciaServiceImpl provinciaServiceImpl;
	
	
	public PersonaController() {
	}
	
	// Get all
	@GetMapping("/persona")
	public List<Persona> listarPersonas() {
		return personaServiceImpl.listarPersona();
	}

	// Get persona by id
	@GetMapping("/persona/{id}")
	public Persona getById(@PathVariable(name = "id") Long idpk_persona) {
		return personaServiceImpl.getById(idpk_persona);
	}
	
	//Get persona by Nom
	@GetMapping("/persona/nom/{nom}")
	public Persona findByNom(@PathVariable(name = "nom") String nom) {
		return personaServiceImpl.getByNom(nom);
	}
	
	
	// Add Persona
	@PostMapping("/persona")
	public Persona savePersona(@RequestBody Persona persona) {

		Provincia novaprovincia = new Provincia();
	
		novaprovincia = provinciaServiceImpl.getByNom(persona.getProvincia().getNom());
		persona.setProvincia(novaprovincia);
		
		return personaServiceImpl.savePersona(persona);
	}
	
	// Update Persona
	@PutMapping("/persona/{id}")
	public Persona updatePersona(@PathVariable(name = "id") Long idpk_persona, @RequestBody Persona persona) {

		Persona persona_seleccionada = new Persona();
		Persona persona_actualizada = new Persona();
		
		System.out.println(persona.toString());

		persona_seleccionada = personaServiceImpl.getById(idpk_persona);

		if(persona.getTelefon()!= null) {
			persona_seleccionada.setTelefon(persona.getTelefon());			
		}
		if(persona.getEmail() != null) {
			persona_seleccionada.setEmail(persona.getEmail());			
		}
		if(persona.getNom()!= null) {
			persona_seleccionada.setNom(persona.getNom());			
		}
		if(persona.getAdreca() != null) {
			persona_seleccionada.setAdreca(persona.getAdreca());			
		}

		persona_actualizada = personaServiceImpl.updatePersona(persona_seleccionada);
		return persona_actualizada;
	}

	// Delete persona
	@DeleteMapping("/persona/{id}")
	public void deletePersona(@PathVariable(name = "id") Long idpk_persona) {
		personaServiceImpl.deletePersona(idpk_persona);
	}
}

