package com.api.consulta_cep.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.consulta_cep.interfaces.CepService;
import com.api.consulta_cep.models.Response;

import com.api.consulta_cep.models.Consulta;

@RestController
@RequestMapping("v1/")
public class ConsultaCepController {

    @Autowired
	private CepService cepService;

	@PostMapping("/consulta-endereco")
	public ResponseEntity post(@RequestBody Consulta consulta) {
        try {
            consulta.cep = consulta.cep.replaceAll("\\.","");
            consulta.cep = consulta.cep.replaceAll("-", "");
            Response endereco = cepService.buscaEnderecoPorCep(consulta.cep);
            return ResponseEntity.ok().body(endereco); 

        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Erro! Nenhum endereço encontrado, verifique o CEP digitado.");
        }
	}
}
