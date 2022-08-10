package com.api.concessionari.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.concessionari.dto.Perfil;

public interface IPerfilDAO extends JpaRepository <Perfil, Long> {

}
