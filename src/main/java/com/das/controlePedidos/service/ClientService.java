package com.das.controlePedidos.service;

import com.das.controlePedidos.domain.Client;
import com.das.controlePedidos.mapper.ClientMapper;
import com.das.controlePedidos.repository.ClientRepository;
import com.das.controlePedidos.requests.ClientPostRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;

    public List<Client> listAll() {
        return clientRepository.findAll();
    }

    @Transactional
    public Client save(ClientPostRequestBody clientPostRequestBody) {
        return clientRepository.save(ClientMapper.INSTANCE.toClient(clientPostRequestBody));
    }
}
