package com.das.controlePedidos.requests;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.stereotype.Indexed;

import javax.persistence.Column;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotEmpty;

public class ClientPostRequestBody {
    @NotEmpty(message = "Campo nome nao pode ser vazio")
    public String name;
    @NotEmpty(message = "Campo CPF não pode ser nulo e tem que ser válido")
    @CPF
    @Column(unique=true, name = "cpf")
    public String cpf;
    public String sobrenome;
}
