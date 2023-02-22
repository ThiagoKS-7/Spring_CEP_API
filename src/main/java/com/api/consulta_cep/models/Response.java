package com.api.consulta_cep.models;

import java.util.ArrayList;

public class Response {
    private String cep;
	private String rua;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private Float frete;


	ArrayList<String> regNorte = new ArrayList<String>(){
        {
         add("AM");
         add("RR");
         add("AP");
         add("PA");
         add("TO");
         add("RO");
        }

    };
    ArrayList<String> regCentOeste = new ArrayList<String>(){
        {
         add("MT");
         add("MS");
         add("GO");
         add("DF");
        }

    };
    ArrayList<String> regSudeste = new ArrayList<String>(){
        {
         add("SP");
         add("RJ");
         add("ES");
         add("MG");
        }

    };
    ArrayList<String> regSul = new ArrayList<String>(){
        {
         add("AM");
         add("RR");
         add("AP");
         add("PA");
         add("TO");
         add("RO");
        }

    };
	public Response(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
		this.setCep(cep);
		this.setRua(logradouro);
		this.setComplemento(complemento);
		this.setBairro(bairro);
		this.setCidade(localidade);
		this.setEstado(uf);
		this.setFrete();
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Float getFrete() {
		return frete;
	}
	public void setFrete() {
		this.frete = 2f;
	}
	
}
