package com.api.concessionari.controller;

import java.util.List;

import javax.transaction.Transactional;

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

import com.api.concessionari.dto.Concessionari;
import com.api.concessionari.dto.Provincia;
import com.api.concessionari.service.ConcessionariServiceImpl;
import com.api.concessionari.service.ProvinciaServiceImpl;

@RestController
@RequestMapping("/api")
@Transactional

public class ConcessionariController {
	
	@Autowired
	ConcessionariServiceImpl concessionariServiceImpl;
	
	@Autowired
	ProvinciaServiceImpl provinciaServiceImpl;
	
	
	public ConcessionariController() {
	}
	
	// Get all
	@GetMapping("/concessionari")
	@PreAuthorize("hasAnyAuthority('ADMIN','USER')")
	public List<Concessionari> listarConcessionaris() {
		return concessionariServiceImpl.listarConcessionari();
	}

	// Get concessionari by id
	@GetMapping("/concessionari/{id}")
	@PreAuthorize("hasAnyAuthority('ADMIN','USER')")
	public Concessionari listarPorId(@PathVariable(name = "id") Long idpk_con) {
		return concessionariServiceImpl.getById(idpk_con);
	}
	
	//Get concessionari by nom
	@GetMapping("/concessionari/nom/{id}")
	public Concessionari findByNom(@PathVariable(name = "id") String nom) {
		return concessionariServiceImpl.getByNom(nom);
	}

	
	// Add Concessionari
	@PostMapping("/concessionari")
	@PreAuthorize("hasAnyAuthority('ADMIN','USER')")
	public Concessionari addNewConcessionari(@RequestBody Concessionari concessionari) {
		
		Provincia novaprovincia = new Provincia();
		
		novaprovincia = provinciaServiceImpl.getByNom(concessionari.getProvincia().getNom());
		concessionari.setProvincia(novaprovincia);
		
		return concessionariServiceImpl.saveConcessionari(concessionari);
		
		
	}
	
	// Update Concessionari
	@PutMapping("/concessionari/{id}")
	@PreAuthorize("hasAnyAuthority('ADMIN','USER')")
	public Concessionari updateConcessionari(@PathVariable(name = "id") Long idpk_con, @RequestBody Concessionari concessionari) {

		
		Concessionari concessionari_seleccionada = new Concessionari();
		Concessionari concessionari_actualizada = new Concessionari();
		
		Provincia novaprovincia = new Provincia();
		
		novaprovincia = provinciaServiceImpl.getByNom(concessionari.getProvincia().getNom());
		concessionari.setProvincia(novaprovincia);
		
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
		if(concessionari.getNom() != null) {
			concessionari_seleccionada.setNom(concessionari.getNom());			
		}
		if(concessionari.getProvincia().getNom() != null) {
			concessionari_seleccionada.setProvincia(concessionari.getProvincia());			
		}

		concessionari_actualizada = concessionariServiceImpl.updateConcessionari(concessionari_seleccionada);
		return concessionari_actualizada;
	}

	// Delete concessionari
	@DeleteMapping("/concessionari/{id}")
	@PreAuthorize("hasAnyAuthority('ADMIN','USER')")
	public void deleteConcessionari(@PathVariable(name = "id") Long idpk_con) {
		concessionariServiceImpl.deleteConcessionari(idpk_con);
	}
	
	
	@DeleteMapping("/concessionari/nom/{nom}")
	@PreAuthorize("hasAnyAuthority('ADMIN','USER')")
	public void deleteCon(@PathVariable(name = "nom") String nom) {
		concessionariServiceImpl.deleteCon(nom);
	}

}