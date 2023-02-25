package com.das.controlePedidos.mapper;
import com.das.controlePedidos.domain.Request;
import com.das.controlePedidos.requests.RequestPostRequestBody;
import com.das.controlePedidos.requests.RequestPutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class RequestMapper {
    public static final RequestMapper INSTANCE = Mappers.getMapper(RequestMapper.class);

    public abstract Request toRequest(RequestPostRequestBody requestPostRequestBody);

    public abstract Request toRequest(RequestPutRequestBody requestPostRequestBody);

}
