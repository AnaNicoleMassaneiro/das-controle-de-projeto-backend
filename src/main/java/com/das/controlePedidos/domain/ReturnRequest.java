package com.das.controlePedidos.domain;

import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnRequest {
    private String cpf;
    private String name;
    private String sobrenome;
    private String descricao;
    private Long qtd;
}
