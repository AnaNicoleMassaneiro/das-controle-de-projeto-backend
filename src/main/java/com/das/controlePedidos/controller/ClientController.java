package com.das.controlePedidos.controller;

import com.das.controlePedidos.domain.Client;
import com.das.controlePedidos.domain.Product;
import com.das.controlePedidos.requests.ClientPostRequestBody;
import com.das.controlePedidos.requests.ClientPutRequestBody;
import com.das.controlePedidos.service.ClientService;
import com.das.controlePedidos.service.RequestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

    import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("client")
@Log4j2
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:61222")
public class ClientController {
    private final ClientService clientService;
    private final RequestService requestService;

    @GetMapping
    public ResponseEntity<List<Client>> list() {
        return (ResponseEntity<List<Client>>) ResponseEntity.ok(clientService.listAll());
    }

    @GetMapping(path = "search/{id}")
    public ResponseEntity<Client> findById(@PathVariable long id) {
        return ResponseEntity.ok(clientService.findByIdOrThrowBadRequestException(id));
    }

    @GetMapping(path = "/{cpf}")
    public ResponseEntity<Client> findByCpf(@PathVariable String cpf) {
        return ResponseEntity.ok(clientService.findByCpf(cpf));
    }

    @PostMapping
    public ResponseEntity<Client> save(@RequestBody @Valid ClientPostRequestBody clientPostRequestBody) throws Exception {
        try {
            return new ResponseEntity<>(clientService.save(clientPostRequestBody), HttpStatus.CREATED);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) throws Exception {
        if (!requestService.findById(id)) {
            clientService.delete(id);
        } else {
            throw new Exception("esse cliente nao pode ser excluido pois tem registro em seu nome");
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<Void> replace(@RequestBody ClientPutRequestBody animePutRequestBody) {
        clientService.replace(animePutRequestBody);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
