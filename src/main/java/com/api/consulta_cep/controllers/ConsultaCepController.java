package com.api.consulta_cep.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/")
public class ConsultaCepController {
    @GetMapping("/consulta-endereco")
    public ResponseEntity<String> post() {
        return ResponseEntity.ok("Hello World");
    }
}
