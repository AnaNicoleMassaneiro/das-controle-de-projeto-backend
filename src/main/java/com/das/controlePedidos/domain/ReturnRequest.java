package com.das.controlePedidos.domain;

import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import java.util.Date;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnRequest {

   // private String cpf;
    private String name;
    private String sobrenome;
    private String descricao;
    private Long qtd;
}
