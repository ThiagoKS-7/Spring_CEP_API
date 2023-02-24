<p align="center">
  <a href="" rel="noopener">
 <img width=200px height=200px src="https://i.imgur.com/6wj0hh6.jpg" alt="Project logo"></a>
</p>

<h3 align="center">Project Title</h3>

<div align="center">

[![Status](https://img.shields.io/badge/status-active-success.svg)]()
[![GitHub Issues](https://img.shields.io/github/issues/kylelobo/The-Documentation-Compendium.svg)](https://github.com/kylelobo/The-Documentation-Compendium/issues)
[![GitHub Pull Requests](https://img.shields.io/github/issues-pr/kylelobo/The-Documentation-Compendium.svg)](https://github.com/kylelobo/The-Documentation-Compendium/pulls)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](/LICENSE)

</div>

---

<p align="center">
API de consultas de CEP com Spring Boot,Swagger, JUnit5 e Cucumber
</p>

## 📝 Table of Contents

- [About](#about)
- [Getting Started](#getting_started)
- [Built Using](#built_using)
- [Authors](#authors)

## 🧐 About <a name = "about"></a>

Seu desafio é construir uma API REST de consulta de endereço e cálculo de frete para
um determinado CEP. O contrato da API deve ser conforme especificado abaixo:


Para a busca do endereço do CEP, você deve consultar a API VIA CEP, conforme a
documentação https://viacep.com.br/. O valor do frete é fixo de acordo com as regiões
do Brasil: Sudeste (R$ 7,85), Centro-Oeste (R$ 12,50), Nordeste (R$ 15,98), Sul (R$
17,30) e Norte (R$ 20,83). O CEP é obrigatório e pode ser passado com ou sem máscara
na entrada e se o CEP não for encontrado uma mensagem informativa deve ser retornada
para o cliente.
Requisitos para o desenvolvimento:
Java 11
Spring boot
API REST Template
Documentação Swagger
Testes unitários JUnit5
Testes automatizados utilizando cucumber
Você deve criar um repositório publico no GIT e colocar o projeto nele. Lembre-se de
utilizar as regras de controle de versionamento!

## 🏁 Getting Started <a name = "getting_started"></a>

Essas instruções vão lhe  mostrar como ter uma copia do projeto rodando localmente na sua máquina.

### Prerequisites

- Java 11 instalado

### Installing

sudo apt install maven

mvn clean install

mvn spring-boot:run

## 🔧 Running the tests <a name = "tests"></a>

mvn clean test

## ⛏️ Built Using <a name = "built_using"></a>

- [JUnit5](https://junit.org/junit5/) - TDD
- [Cucumber](https://cucumber.io/) - BDD
- [Swagger](https://swagger.io/) - Docs
- [Spring_Boot](https://spring.io/) - Server Framework
= [Java](https://www.java.com/pt-BR/) - Main language

## ✍️ Authors <a name = "authors"></a>

- [@ThiagoKS-7](https://github.com/ThiagoKS-7) - Idea & Initial work
