package com.das.controlePedidos.service;

import com.das.controlePedidos.domain.Product;
import com.das.controlePedidos.domain.Request;
import com.das.controlePedidos.exception.BadRequestException;
import com.das.controlePedidos.mapper.ProductMapper;
import com.das.controlePedidos.mapper.RequestMapper;
import com.das.controlePedidos.repository.ProductRepository;
import com.das.controlePedidos.repository.RequestRepository;
import com.das.controlePedidos.requests.ProductPostRequestBody;
import com.das.controlePedidos.requests.ProductPutRequestBody;
import com.das.controlePedidos.requests.RequestPostRequestBody;
import com.das.controlePedidos.requests.RequestPutRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RequestService {
    private final RequestRepository requestRepository;

    public List<Request> listAll() {
        return requestRepository.findAll();
    }

    public Request findByIdOrThrowBadRequestException(long id) {
        return requestRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Request not Found"));
    }

    @Transactional
    public Request save(RequestPostRequestBody requestPostRequestBody) {
        return requestRepository.save(RequestMapper.INSTANCE.toRequest(requestPostRequestBody));
    }

    public void delete(long id) {
        requestRepository.delete(findByIdOrThrowBadRequestException(id));
    }

   // public void replace(RequestPutRequestBody requestPutRequestBody) {
     //   Request savedRequest = findByIdOrThrowBadRequestException(requestPutRequestBody.getId());
       // Request request = RequestMapper.INSTANCE.toRequest(requestPutRequestBody);
       // request.setId(savedRequest.getId());
        //requestRepository.save(request);
   // }
}
