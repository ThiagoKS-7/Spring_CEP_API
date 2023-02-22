package com.api.consulta_cep.interfaces;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.api.consulta_cep.models.Response;


@FeignClient(url= "https://viacep.com.br/ws/" , name = "viacep")
public interface CepService {
	
	@GetMapping("{cep}/json")
    Response buscaEnderecoPorCep(@PathVariable("cep") String cep);
}

