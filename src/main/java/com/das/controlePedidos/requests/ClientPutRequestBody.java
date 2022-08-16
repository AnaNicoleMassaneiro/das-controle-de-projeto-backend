package com.das.controlePedidos.requests;
import lombok.Data;

@Data
public class ClientPutRequestBody {
    private Long id;
    public String name;
    public String cpf;
    public String sobrenome;
}
