package com.api.concessionari.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.api.concessionari.dto.Provincia;

public interface IProvinciaDAO extends JpaRepository <Provincia, Long> {
	
	public Provincia findByNom(String nom);
}
