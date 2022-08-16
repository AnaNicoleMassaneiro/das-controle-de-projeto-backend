package com.das.controlePedidos.requests;

import javax.validation.constraints.NotEmpty;

public class ClientPostRequestBody {
    @NotEmpty(message = "The client name cannot be empty")
    public String name;
    public String cpf;
    public String sobrenome;
}
