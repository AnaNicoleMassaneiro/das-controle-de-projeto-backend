package com.das.controlePedidos.requests;

import com.das.controlePedidos.domain.Client;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Getter
@Setter
public class RequestPostRequestBody {
    public Date data;
    public Long idClient;
}
