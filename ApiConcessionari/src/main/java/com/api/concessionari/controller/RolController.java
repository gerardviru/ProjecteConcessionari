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

import com.api.concessionari.dto.Rol;
import com.api.concessionari.service.RolServiceImpl;


@RestController
@RequestMapping("/api")
public class RolController {
	
	@Autowired
	RolServiceImpl rolServiceImpl;
	
	// Get all
	@GetMapping("/rol")
	public List<Rol> listarRols() {
		return rolServiceImpl.listarRol();
	}

	// Get rol by id
	@GetMapping("/rol/{id}")
	public Rol listarPorId(@PathVariable(name = "id") Long idpk_rol) {
		return rolServiceImpl.getById(idpk_rol);
	}

	
	// Add Rol
	@PostMapping("/rol")
	public Rol addNewRol(@RequestBody Rol rol) {
		return rolServiceImpl.saveRol(rol);
	}
	
	// Update Rol
	@PutMapping("/rol/{id}")
	public Rol updateRol(@PathVariable(name = "id") Long idpk_rol, @RequestBody Rol rol) {

		Rol rol_seleccionada = new Rol();
		Rol rol_actualizada = new Rol();
		
		System.out.println(rol.toString());

		rol_seleccionada = rolServiceImpl.getById(idpk_rol);
		rol_actualizada = rolServiceImpl.updateRol(rol_seleccionada);
		return rol_actualizada;
	}

	// Delete rol
	@DeleteMapping("/rol/{id}")
	public void deleteRol(@PathVariable(name = "id") Long idpk_rol) {
		rolServiceImpl.deleteRol(idpk_rol);
	}

}
