package com.das.controlePedidos.mapper;

import com.das.controlePedidos.domain.Client;
import com.das.controlePedidos.domain.Client.ClientBuilder;
import com.das.controlePedidos.requests.ClientPostRequestBody;
import com.das.controlePedidos.requests.ClientPutRequestBody;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-25T09:46:55-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class ClientMapperImpl extends ClientMapper {

    @Override
    public Client toClient(ClientPostRequestBody productPostRequestBody) {
        if ( productPostRequestBody == null ) {
            return null;
        }

        ClientBuilder client = Client.builder();

        client.cpf( productPostRequestBody.cpf );
        client.name( productPostRequestBody.name );
        client.sobrenome( productPostRequestBody.sobrenome );

        return client.build();
    }

    @Override
    public Client toClient(ClientPutRequestBody productPostRequestBody) {
        if ( productPostRequestBody == null ) {
            return null;
        }

        ClientBuilder client = Client.builder();

        client.id( productPostRequestBody.getId() );
        client.cpf( productPostRequestBody.getCpf() );
        client.name( productPostRequestBody.getName() );
        client.sobrenome( productPostRequestBody.getSobrenome() );

        return client.build();
    }
}
