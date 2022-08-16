package com.das.controlePedidos.controller;

import com.das.controlePedidos.domain.Client;
import com.das.controlePedidos.requests.ClientPostRequestBody;
import com.das.controlePedidos.service.ClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("client")
@Log4j2
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> list() {
        return (ResponseEntity<List<Client>>) ResponseEntity.ok(clientService.listAll());
    }

    @PostMapping
    public ResponseEntity<Client> save(@RequestBody @Valid ClientPostRequestBody clientPostRequestBody) {
        return new ResponseEntity<>(clientService.save(clientPostRequestBody), HttpStatus.CREATED);
    }
}
