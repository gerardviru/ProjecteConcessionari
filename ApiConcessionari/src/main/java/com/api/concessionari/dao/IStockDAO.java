package com.api.concessionari.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.concessionari.dto.Stock;

public interface IStockDAO extends JpaRepository <Stock, Long> {

}
