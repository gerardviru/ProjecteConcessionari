package com.api.concessionari.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.concessionari.dto.Usuari;

public interface IUsuariDAO extends JpaRepository <Usuari, Long> {
	Usuari findByUsername(String username);

}
