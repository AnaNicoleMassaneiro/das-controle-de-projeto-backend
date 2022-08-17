package com.das.controlePedidos.mapper;
import com.das.controlePedidos.domain.Client;
import com.das.controlePedidos.requests.ClientPostRequestBody;
import com.das.controlePedidos.requests.ClientPutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class ClientMapper {
    public static final ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    public abstract Client toClient(ClientPostRequestBody animePostRequestBody);

    public abstract Client toClient(ClientPutRequestBody animePostRequestBody);

}
