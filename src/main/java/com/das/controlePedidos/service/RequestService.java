package com.das.controlePedidos.service;

import com.das.controlePedidos.domain.Request;
import com.das.controlePedidos.exception.BadRequestException;
import com.das.controlePedidos.mapper.RequestMapper;
import com.das.controlePedidos.repository.RequestRepository;
import com.das.controlePedidos.requests.RequestPostRequestBody;
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
    public Request save(List<RequestPostRequestBody> requestPostRequestBody) {
        requestPostRequestBody.forEach(a -> {
            requestRepository.save(RequestMapper.INSTANCE.toRequest(a));
        });

        return null;
    }

    public boolean findById(Long id) {
        return requestRepository.findById(id).isPresent();
    }

    public void delete(long id) {
        requestRepository.delete(findByIdOrThrowBadRequestException(id));
    }

}
