package com.das.controlePedidos.repository;

import com.das.controlePedidos.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
