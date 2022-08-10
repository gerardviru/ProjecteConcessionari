package com.api.concessionari.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.concessionari.dto.Treballador;

public interface ITreballadorDAO extends JpaRepository <Treballador, Long> {

}
