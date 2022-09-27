package com.das.controlePedidos.mapper;
import com.das.controlePedidos.domain.Product;
import com.das.controlePedidos.requests.ProductPostRequestBody;
import com.das.controlePedidos.requests.ProductPutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class ProductMapper {
    public static final ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    public abstract Product toProduct(ProductPostRequestBody productPostRequestBody);

    public abstract Product toProduct(ProductPutRequestBody productPostRequestBody);

}
