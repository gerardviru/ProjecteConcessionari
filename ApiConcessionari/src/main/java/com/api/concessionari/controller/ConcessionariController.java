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

import com.api.concessionari.dto.Concessionari;
import com.api.concessionari.service.ConcessionariServiceImpl;

@RestController
@RequestMapping("/api")

public class ConcessionariController {
	
	@Autowired
	ConcessionariServiceImpl concessionariServiceImpl;
	
	
	public ConcessionariController() {
	}
	
	// Get all
	@GetMapping("/concessionari")
	public List<Concessionari> listarConcessionaris() {
		return concessionariServiceImpl.listarConcessionari();
	}

	// Get concessionari by id
	@GetMapping("/concessionari/{id}")
	public Concessionari listarPorId(@PathVariable(name = "id") Long idpk_con) {
		return concessionariServiceImpl.getById(idpk_con);
	}

	
	// Add Concessionari
	@PostMapping("/concessionari")
	public Concessionari addNewConcessionari(@RequestBody Concessionari concessionari) {
		return concessionariServiceImpl.saveConcessionari(concessionari);
	}
	
	// Update Concessionari
	@PutMapping("/concessionari/{id}")
	public Concessionari updateConcessionari(@PathVariable(name = "id") Long idpk_con, @RequestBody Concessionari concessionari) {

		Concessionari concessionari_seleccionada = new Concessionari();
		Concessionari concessionari_actualizada = new Concessionari();
		
		System.out.println(concessionari.toString());

		concessionari_seleccionada = concessionariServiceImpl.getById(idpk_con);

		if(concessionari.getTelefon()!= null) {
			concessionari_seleccionada.setTelefon(concessionari.getTelefon());			
		}
		if(concessionari.getEmail() != null) {
			concessionari_seleccionada.setEmail(concessionari.getEmail());			
		}
		if(concessionari.getCif() != null) {
			concessionari_seleccionada.setCif(concessionari.getCif());			
		}
		if(concessionari.getAdreça() != null) {
			concessionari_seleccionada.setAdreça(concessionari.getAdreça());			
		}

		concessionari_actualizada = concessionariServiceImpl.updateConcessionari(concessionari_seleccionada);
		return concessionari_actualizada;
	}

	// Delete concessionari
	@DeleteMapping("/concessionari/{id}")
	public void deleteConcessionari(@PathVariable(name = "id") Long idpk_con) {
		concessionariServiceImpl.deleteConcessionari(idpk_con);
	}

}