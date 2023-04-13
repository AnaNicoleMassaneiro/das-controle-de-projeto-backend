package com.das.controlePedidos.mapper;

import com.das.controlePedidos.domain.Request;
import com.das.controlePedidos.domain.Request.RequestBuilder;
import com.das.controlePedidos.requests.RequestPostRequestBody;
import com.das.controlePedidos.requests.RequestPutRequestBody;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-26T17:24:13-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class RequestMapperImpl extends RequestMapper {

    @Override
    public Request toRequest(RequestPostRequestBody requestPostRequestBody) {
        if ( requestPostRequestBody == null ) {
            return null;
        }

        RequestBuilder request = Request.builder();

        request.id_product( requestPostRequestBody.getId_product() );
        request.data( requestPostRequestBody.getData() );
        request.id_client( requestPostRequestBody.getId_client() );
        request.qtd( requestPostRequestBody.getQtd() );

        return request.build();
    }

    @Override
    public Request toRequest(RequestPutRequestBody requestPostRequestBody) {
        if ( requestPostRequestBody == null ) {
            return null;
        }

        RequestBuilder request = Request.builder();

        request.data( requestPostRequestBody.getData() );
        request.id_client( requestPostRequestBody.getId_client() );

        return request.build();
    }
}
