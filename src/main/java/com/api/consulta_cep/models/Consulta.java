package com.api.consulta_cep.models;

public class Consulta {
    public String cep;

	public Consulta() {
		
	}

	public Consulta(String cep) {
		this.cep = cep;
	}

    public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
}
