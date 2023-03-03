package com.das.controlePedidos.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "id_product", referencedColumnName = "id", table = "product")
    private Long id_product;

    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date data;

    @JoinColumn(name = "id_client", referencedColumnName = "id", table = "client")
    private Long id_client;

    private Long qtd;

}
