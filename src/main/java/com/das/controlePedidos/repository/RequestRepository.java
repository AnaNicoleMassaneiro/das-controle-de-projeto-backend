package com.das.controlePedidos.repository;

import com.das.controlePedidos.domain.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {
}
