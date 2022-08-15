package com.das.controlePedidos.repository;

import com.das.controlePedidos.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
