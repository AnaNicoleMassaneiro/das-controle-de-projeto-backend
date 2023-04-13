package com.das.controlePedidos.requests;

import javax.validation.constraints.NotEmpty;

public class ProductPostRequestBody {
    @NotEmpty(message = "descricao name cannot be empty")
    public String descricao;
}
