package com.das.controlePedidos.requests;

import com.das.controlePedidos.domain.Client;
import lombok.Data;

import java.util.Date;

@Data
public class RequestPutRequestBody {
    public Date data;
    public Long id_client;
}
