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

import com.api.concessionari.dto.Treballador;
import com.api.concessionari.service.TreballadorServiceImpl;


@RestController
@RequestMapping("/api")
public class TreballadorController {
	
	@Autowired
	TreballadorServiceImpl treballadorServiceImpl;
	
	
	public TreballadorController() {
	}
	
	// Get all
	@GetMapping("/treballador")
	public List<Treballador> listarTreballadors() {
		return treballadorServiceImpl.listarTreballador();
	}

	// Get treballador by id
	@GetMapping("/treballador/{id}")
	public Treballador listarPorId(@PathVariable(name = "id") Long idpk_treb) {
		return treballadorServiceImpl.getById(idpk_treb);
	}

	
	// Add Treballador
	@PostMapping("/treballador")
	public Treballador addNewTreballador(@RequestBody Treballador treballador) {
		return treballadorServiceImpl.saveTreballador(treballador);
	}
	
	// Update Treballador
	@PutMapping("/treballador/{id}")
	public Treballador updateTreballador(@PathVariable(name = "id") Long idpk_treb, @RequestBody Treballador treballador) {

		Treballador treballador_seleccionada = new Treballador();
		Treballador treballador_actualizada = new Treballador();
		
		System.out.println(treballador.toString());

		treballador_seleccionada = treballadorServiceImpl.getById(idpk_treb);

		if(treballador.getConcessionari()!= null) {
			treballador_seleccionada.setConcessionari(treballador.getConcessionari());			
		}
		if(treballador.getPersona() != null) {
			treballador_seleccionada.setPersona(treballador.getPersona());			
		}

		treballador_actualizada = treballadorServiceImpl.updateTreballador(treballador_seleccionada);
		return treballador_actualizada;
	}

	// Delete treballador
	@DeleteMapping("/treballador/{id}")
	public void deleteTreballador(@PathVariable(name = "id") Long idpk_treb) {
		treballadorServiceImpl.deleteTreballador(idpk_treb);
	}


}
