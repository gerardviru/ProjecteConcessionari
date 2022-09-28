package com.api.concessionari.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.concessionari.dto.Concessionari;

public interface IConcessionariDAO extends JpaRepository<Concessionari, Long> {

	public Concessionari findByNom(String nom);
	public Concessionari deleteByNom(String nom);
}
