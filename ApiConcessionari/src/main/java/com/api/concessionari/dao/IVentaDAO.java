package com.api.concessionari.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.concessionari.dto.Venta;

public interface IVentaDAO extends JpaRepository <Venta, Long> {

}
