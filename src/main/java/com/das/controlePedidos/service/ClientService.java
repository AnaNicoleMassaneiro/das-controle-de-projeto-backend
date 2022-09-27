package com.das.controlePedidos.service;

import com.das.controlePedidos.domain.Client;
import com.das.controlePedidos.exception.BadRequestException;
import com.das.controlePedidos.mapper.ClientMapper;
import com.das.controlePedidos.repository.ClientRepository;
import com.das.controlePedidos.requests.ClientPostRequestBody;
import com.das.controlePedidos.requests.ClientPutRequestBody;
import javassist.tools.rmi.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;

    public List<Client> listAll() {
        return clientRepository.findAll();
    }

    public Client findByIdOrThrowBadRequestException(long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Client not Found"));
    }

    public Client findByCpf(String cpf) {
        return clientRepository.findByCpf(cpf)
                .orElseThrow(() -> new BadRequestException("Client não encontrado - CPF: " + cpf));
    }

    @Transactional
    public Client save(ClientPostRequestBody clientPostRequestBody) {
        return clientRepository.save(ClientMapper.INSTANCE.toClient(clientPostRequestBody));
    }

    public void delete(long id) {
        clientRepository.delete(findByIdOrThrowBadRequestException(id));
    }

    public void replace(ClientPutRequestBody clientPutRequestBody) {
        Client savedClient = findByIdOrThrowBadRequestException(clientPutRequestBody.getId());
        Client client = ClientMapper.INSTANCE.toClient(clientPutRequestBody);
        client.setId(savedClient.getId());
        clientRepository.save(client);
    }
}
