package com.api.concessionari.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.concessionari.dto.Provincia;

public interface IProvinciaDAO extends JpaRepository <Provincia, Long> {
	
	List<Provincia> findProvinciaByConcessionariId(Integer IDPK_PROV);
}
