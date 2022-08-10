package com.api.concessionari.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.concessionari.dto.Client;

public interface IClientDAO extends JpaRepository <Client, Long> {

}
