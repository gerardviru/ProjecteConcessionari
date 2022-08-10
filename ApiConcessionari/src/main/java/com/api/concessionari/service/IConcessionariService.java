package com.api.concessionari.service;

import java.util.List;

import com.api.concessionari.dto.Concessionari;

public interface IConcessionariService {

	// Listar todo
		public List<Concessionari> listarConcessionari();
		
		// Get by id
		public Concessionari getById(Long IDPK_CON);

		// Add
		public Concessionari addNewConcessionari(Concessionari concessionari);

		// Update
		public Concessionari updateConcessionari(Concessionari concessionari);

		// Delete
		public void deleteConcessionari(Long IDPK_CON);
}
