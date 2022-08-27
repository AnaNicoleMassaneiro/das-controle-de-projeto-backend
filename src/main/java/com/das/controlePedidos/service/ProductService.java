package com.das.controlePedidos.service;

import com.das.controlePedidos.domain.Product;
import com.das.controlePedidos.exception.BadRequestException;
import com.das.controlePedidos.mapper.ProductMapper;
import com.das.controlePedidos.repository.ProductRepository;
import com.das.controlePedidos.requests.ProductPostRequestBody;
import com.das.controlePedidos.requests.ProductPutRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> listAll() {
        return productRepository.findAll();
    }

    public Product findByIdOrThrowBadRequestException(long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Product not Found"));
    }

    @Transactional
    public Product save(ProductPostRequestBody productPostRequestBody) {
        return productRepository.save(ProductMapper.INSTANCE.toProduct(productPostRequestBody));
    }

    public void delete(long id) {
        productRepository.delete(findByIdOrThrowBadRequestException(id));
    }

    public void replace(ProductPutRequestBody productPutRequestBody) {
        Product savedProduct = findByIdOrThrowBadRequestException(productPutRequestBody.getId());
        Product product = ProductMapper.INSTANCE.toProduct(productPutRequestBody);
        product.setId(savedProduct.getId());
        productRepository.save(product);
    }
}
