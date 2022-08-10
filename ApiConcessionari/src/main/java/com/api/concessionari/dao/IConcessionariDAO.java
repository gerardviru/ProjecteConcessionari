package com.api.concessionari.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.concessionari.dto.Concessionari;

public interface IConcessionariDAO extends JpaRepository<Concessionari, Long> {

	
}
