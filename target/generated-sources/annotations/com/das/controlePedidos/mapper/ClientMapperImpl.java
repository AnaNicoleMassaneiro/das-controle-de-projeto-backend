package com.das.controlePedidos.mapper;

import com.das.controlePedidos.domain.Client;
import com.das.controlePedidos.domain.Client.ClientBuilder;
import com.das.controlePedidos.requests.ClientPostRequestBody;
import com.das.controlePedidos.requests.ClientPutRequestBody;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-17T13:45:22-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class ClientMapperImpl extends ClientMapper {

    @Override
    public Client toClient(ClientPostRequestBody animePostRequestBody) {
        if ( animePostRequestBody == null ) {
            return null;
        }

        ClientBuilder client = Client.builder();

        client.cpf( animePostRequestBody.cpf );
        client.name( animePostRequestBody.name );
        client.sobrenome( animePostRequestBody.sobrenome );

        return client.build();
    }

    @Override
    public Client toClient(ClientPutRequestBody animePostRequestBody) {
        if ( animePostRequestBody == null ) {
            return null;
        }

        ClientBuilder client = Client.builder();

        client.id( animePostRequestBody.getId() );
        client.cpf( animePostRequestBody.getCpf() );
        client.name( animePostRequestBody.getName() );
        client.sobrenome( animePostRequestBody.getSobrenome() );

        return client.build();
    }
}
