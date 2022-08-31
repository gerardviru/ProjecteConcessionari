package com.api.concessionari.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.concessionari.dto.Provincia;
import com.api.concessionari.service.ProvinciaServiceImpl;

	@RestController
	@RequestMapping("/api")
	
	public class ProvinciaController {
		
	@Autowired
	ProvinciaServiceImpl provinciaServiceImpl;
	
	
	public ProvinciaController() {
	}
	
	// Get all
	@GetMapping("/provincia")
	public List<Provincia> listarProvincias() {
		return provinciaServiceImpl.listarProvincia();
	}

	// Get provincia by id
	@GetMapping("/provincia/{id}")
	public Provincia listarPorId(@PathVariable(name = "id") Long idpk_prov) {
		return provinciaServiceImpl.getById(idpk_prov);
	}

	
	// Add Provincia
	@PostMapping("/provincia")
	@PreAuthorize("hasAnyAuthority('ADMIN','USER')")
	public Provincia addNewProvincia(@RequestBody Provincia provincia) {
		return provinciaServiceImpl.saveProvincia(provincia);
	}
	
	// Update Provincia
	@PutMapping("/provincia/{id}")
	public Provincia updateProvincia(@PathVariable(name = "id") Long idpk_prov, @RequestBody Provincia provincia) {

		Provincia provincia_seleccionada = new Provincia();
		Provincia provincia_actualizada = new Provincia();
		
		System.out.println(provincia.toString());

		provincia_seleccionada = provinciaServiceImpl.getById(idpk_prov);

		if(provincia.getNom_prov()!= null) {
			provincia_seleccionada.setNom_prov(provincia.getNom_prov());			
		}
		if(provincia.getConcessionari() != null) {
			provincia_seleccionada.setConcessionari(provincia.getConcessionari());			
		}
		
		if(provincia.getCreat_per() != null) {
			provincia_seleccionada.setCreat_per(provincia.getCreat_per());			
		}
		
		if(provincia.getActualitzat_per() != null) {
			provincia_seleccionada.setActualitzat_per(provincia.getActualitzat_per());			
		}

		provincia_actualizada = provinciaServiceImpl.updateProvincia(provincia_seleccionada);
		return provincia_actualizada;
	}

	// Delete provincia
	@DeleteMapping("/provincia/{id}")
	public void deleteProvincia(@PathVariable(name = "id") Long idpk_prov) {
			provinciaServiceImpl.deleteProvincia(idpk_prov);
	}
	
}

