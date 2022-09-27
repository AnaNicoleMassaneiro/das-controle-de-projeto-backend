package com.das.controlePedidos.requests;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

public class ClientPostRequestBody {
    @NotEmpty(message = "Campo nome nao pode ser vazio")
    public String name;
    @NotEmpty(message = "Campo CPF não pode ser nulo e tem que ser válido")
    @CPF(message = "O CPF é inválido")
    @Column(unique=true, name = "cpf")
    public String cpf;
    public String sobrenome;
}
