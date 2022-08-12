package com.api.concessionari.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.concessionari.dto.Persona;

public interface IPersonaDAO extends JpaRepository <Persona, Long> {


}
