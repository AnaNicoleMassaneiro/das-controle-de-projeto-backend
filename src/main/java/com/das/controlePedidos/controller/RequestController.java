package com.das.controlePedidos.controller;

import com.das.controlePedidos.domain.Request;
import com.das.controlePedidos.domain.ReturnRequest;
import com.das.controlePedidos.requests.RequestPostRequestBody;
import com.das.controlePedidos.service.RequestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hibernate.annotations.Any;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("request")
@Log4j2
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:61222")
public class RequestController {
    private final RequestService requestService;

    @GetMapping
    public ResponseEntity<List<Request>> list() {
        return ResponseEntity.ok(requestService.listAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Request> findById(@PathVariable long id) {
        return ResponseEntity.ok(requestService.findByIdOrThrowBadRequestException(id));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public HttpStatus save(@RequestBody @Valid List<RequestPostRequestBody> requestPostRequestBody) {
        return new ResponseEntity<>(requestService.save(requestPostRequestBody), HttpStatus.CREATED).getStatusCode();
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        requestService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping(path = "searchIdClient/{id_client}")
    public ResponseEntity<List<Object>> findByIdClient(@PathVariable long id_client) {
        return ResponseEntity.ok(requestService.findByIdClient(id_client));
    }
}
