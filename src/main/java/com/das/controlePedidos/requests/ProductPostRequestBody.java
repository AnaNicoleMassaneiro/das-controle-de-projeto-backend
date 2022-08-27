package com.das.controlePedidos.requests;

import javax.validation.constraints.NotEmpty;

public class ProductPostRequestBody {
    public Long id;
    @NotEmpty(message = "descricao name cannot be empty")
    public String descricao;
}
