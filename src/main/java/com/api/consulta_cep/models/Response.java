package com.api.consulta_cep.models;

public class Response {
    private String cep;
	private String rua;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private Float frete;
	private Estados est = new Estados();
	
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
		if (est.getRegiaoSul().contains(this.estado)) {
			this.frete = 17.30f;
		}
		if (est.getRegiaoNordeste().contains(this.estado)) {
			this.frete = 15.98f;
		}
		if (est.getRegiaoCentroOeste().contains(this.estado)) {
			this.frete = 12.50f;
		}
		if (est.getRegiaoSudeste().contains(this.estado)) {
			this.frete = 7.85f;
		}
		if (est.getRegiaoNorte().contains(this.estado)) {
			this.frete = 20.83f;
		}
	}	
}
