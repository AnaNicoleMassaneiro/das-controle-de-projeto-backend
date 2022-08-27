package com.das.controlePedidos.mapper;

import com.das.controlePedidos.domain.Product;
import com.das.controlePedidos.domain.Product.ProductBuilder;
import com.das.controlePedidos.requests.ProductPostRequestBody;
import com.das.controlePedidos.requests.ProductPutRequestBody;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-27T13:56:34-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl extends ProductMapper {

    @Override
    public Product toProduct(ProductPostRequestBody animePostRequestBody) {
        if ( animePostRequestBody == null ) {
            return null;
        }

        ProductBuilder product = Product.builder();

        product.id( animePostRequestBody.id );
        product.descricao( animePostRequestBody.descricao );

        return product.build();
    }

    @Override
    public Product toProduct(ProductPutRequestBody animePostRequestBody) {
        if ( animePostRequestBody == null ) {
            return null;
        }

        ProductBuilder product = Product.builder();

        product.id( animePostRequestBody.getId() );
        product.descricao( animePostRequestBody.getDescricao() );

        return product.build();
    }
}
