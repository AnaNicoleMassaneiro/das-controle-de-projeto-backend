package com.das.controlePedidos.repository;

import com.das.controlePedidos.domain.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RequestRepository extends JpaRepository<Request, Long> {
   @Query(value = "SELECT p.descricao, c.name, c.sobrenome, c.cpf, r.qtd " +
           "FROM request r inner join client c on r.id_client = c.id " +
           "inner join product p on p.id = r.id_product " +
           "WHERE r.id_client = :id_client ", nativeQuery = true)
   List<Object> searchAllRequest(@Param("id_client") Long id_client);
}
