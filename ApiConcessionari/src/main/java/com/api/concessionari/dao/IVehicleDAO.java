package com.api.concessionari.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.concessionari.dto.Vehicle;

public interface IVehicleDAO extends JpaRepository <Vehicle, Long> {

}
