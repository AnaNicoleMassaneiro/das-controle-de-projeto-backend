package com.das.controlePedidos.mapper;

import com.das.controlePedidos.domain.Product;
import com.das.controlePedidos.domain.Product.ProductBuilder;
import com.das.controlePedidos.requests.ProductPostRequestBody;
import com.das.controlePedidos.requests.ProductPutRequestBody;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-25T09:46:55-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl extends ProductMapper {

    @Override
    public Product toProduct(ProductPostRequestBody productPostRequestBody) {
        if ( productPostRequestBody == null ) {
            return null;
        }

        ProductBuilder product = Product.builder();

        product.id( productPostRequestBody.id );
        product.descricao( productPostRequestBody.descricao );

        return product.build();
    }

    @Override
    public Product toProduct(ProductPutRequestBody productPostRequestBody) {
        if ( productPostRequestBody == null ) {
            return null;
        }

        ProductBuilder product = Product.builder();

        product.id( productPostRequestBody.getId() );
        product.descricao( productPostRequestBody.getDescricao() );

        return product.build();
    }
}
