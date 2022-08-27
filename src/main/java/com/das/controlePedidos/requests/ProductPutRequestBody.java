package com.das.controlePedidos.requests;
import lombok.Data;

@Data
public class ProductPutRequestBody {
    private Long id;
    public String descricao;
}
