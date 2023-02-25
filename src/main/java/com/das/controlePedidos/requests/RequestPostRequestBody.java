package com.das.controlePedidos.requests;

import com.das.controlePedidos.domain.Client;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class RequestPostRequestBody {
    public Date data;
    public Long idClient;
    public Long qtd;
    public Long idProduct;
}
