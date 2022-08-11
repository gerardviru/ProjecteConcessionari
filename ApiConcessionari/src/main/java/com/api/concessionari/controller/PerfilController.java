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

import com.api.concessionari.dto.Perfil;
import com.api.concessionari.service.PerfilServiceImp;


@RestController
@RequestMapping("/api")

public class PerfilController {

	@Autowired
	PerfilServiceImp perfilServiceImpl;
	
	
	public PerfilController() {
	}
	
	// Get all
	@GetMapping("/perfil")
	public List<Perfil> listarPerfils() {
		return perfilServiceImpl.listarPerfil();
	}

	// Get perfil by id
	@GetMapping("/perfil/{id}")
	public Perfil listarPorId(@PathVariable(name = "id") Long idpk_perfil) {
		return perfilServiceImpl.getById(idpk_perfil);
	}

	
	// Add Perfil
	@PostMapping("/perfil")
	public Perfil addNewPerfil(@RequestBody Perfil perfil) {
		return perfilServiceImpl.savePerfil(perfil);
	}
	
	// Update Perfil
	@PutMapping("/perfil/{id}")
	public Perfil updatePerfil(@PathVariable(name = "id") Long idpk_perfil, @RequestBody Perfil perfil) {

		Perfil perfil_seleccionada = new Perfil();
		Perfil perfil_actualizada = new Perfil();
		
		System.out.println(perfil.toString());

		perfil_seleccionada = perfilServiceImpl.getById(idpk_perfil);

		if(perfil.getPersona()!= null) {
			perfil_seleccionada.setPersona(perfil.getPersona());			
		}
		if(perfil.getRol() != null) {
			perfil_seleccionada.setRol(perfil.getRol());			
		}
		
		perfil_actualizada = perfilServiceImpl.updatePerfil(perfil_seleccionada);
		return perfil_actualizada;
	}

	// Delete perfil
	@DeleteMapping("/perfil/{id}")
	public void deletePerfil(@PathVariable(name = "id") Long idpk_perfil) {
		perfilServiceImpl.deletePerfil(idpk_perfil);
	}
}
