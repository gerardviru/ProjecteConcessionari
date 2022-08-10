package com.api.concessionari.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.concessionari.dto.Rol;

public interface IRolDAO extends JpaRepository <Rol, Long> {

}
