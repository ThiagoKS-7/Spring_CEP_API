<p align="center">
  <a href="" rel="noopener">
 <img width=200px height=200px src="https://user-images.githubusercontent.com/83460816/221190949-881b5ec6-86fb-4b24-befd-e906226c76ea.png" alt="Project logo"></a>
</p>


<h3 align="center">Spring Boot CEP REST API</h3>

<div align="center">

[![Status](https://img.shields.io/badge/status-done-violet.svg)]()
[![GitHub Issues](https://img.shields.io/github/issues/ThiagoKS-7/Spring_CEP_API.svg)](https://github.com/ThiagoKS-7/Spring_CEP_API/issues)
[![GitHub Pull Requests](https://img.shields.io/github/issues-pr/ThiagoKS-7/Spring_CEP_API.svg)](https://github.com/ThiagoKS-7/Spring_CEP_API/pulls)
[![License](https://img.shields.io/badge/license-GNUv3-blue.svg)](/LICENSE)

</div>
<details>
 <summary style="font-size:30px; font-weight:bold"><img src="https://media.giphy.com/media/VgCDAzcKvsR6OM0uWg/giphy.gif" width="50"> <h3>Frete das Regiões:</h3></summary>
<br/>
<br/> 
<h3>SUDESTE:</h3>
<img height=400px src="https://user-images.githubusercontent.com/83460816/221192343-768d6b02-505d-4e58-9f13-30b48f1c1ed1.png" alt="Sudeste">
<br/>
<br/>
<h3>NORTE:</h3>
<img height=400px src="https://user-images.githubusercontent.com/83460816/221193155-43843a86-e2fd-440b-8d5e-a244d76f85dd.png" alt="Norte">
<br/>
<br/>
<h3>SUL:</h3>
<img height=400px src="https://user-images.githubusercontent.com/83460816/221197105-817df27f-7db8-4f7a-95e6-de8ad550ea24.png" alt="Sul">
<br/>
<br/>
<h3>NORDESTE:</h3>
<img height=400px src="https://user-images.githubusercontent.com/83460816/221197262-64c65827-cae4-44ca-8978-08132f4e0889.png" alt="Nordeste">
<br/>
<br/>
<h3>CENTRO-OESTE:</h3>
<img height=400px src="https://user-images.githubusercontent.com/83460816/221198944-ad452c9f-03d5-4586-86f4-15bdef3636d6.png" alt="Centro-oeste">
</details>


<details>
  <summary style="font-size:30px; font-weight:bold"><img src="https://media.giphy.com/media/VgCDAzcKvsR6OM0uWg/giphy.gif" width="50"> <h3>Retorno Swagger:</h3></summary>
<br/>
<br/> 
  
  
  ```javascript
{
    "swagger": "2.0",
    "info": {
        "description": "Documentação da API REST de consulta de CEP",
        "title": "SPRING CEP REST API",
        "contact": {
            "name": "Thiago Kasper de Souza",
            "email": "thiagokasper101@gmail.com"
        }
    },
    "host": "localhost:8080",
    "basePath": "/",
    "tags": [
        {
            "name": "consulta-cep-controller",
            "description": "Consulta Cep Controller"
        }
    ],
    "paths": {
        "/v1/consulta-endereco": {
            "post": {
                "tags": [
                    "consulta-cep-controller"
                ],
                "summary": "post",
                "operationId": "postUsingPOST",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "consulta",
                        "description": "consulta",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/Consulta"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/ResponseEntity"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        }
    },
    "definitions": {
        "Consulta": {
            "type": "object",
            "properties": {
                "cep": {
                    "type": "string"
                }
            },
            "title": "Consulta"
        },
        "ResponseEntity": {
            "type": "object",
            "properties": {
                "body": {
                    "type": "object"
                },
                "statusCode": {
                    "type": "string",
                    "enum": [
                        "ACCEPTED",
                        "ALREADY_REPORTED",
                        "BAD_GATEWAY",
                        "BAD_REQUEST",
                        "BANDWIDTH_LIMIT_EXCEEDED",
                        "CHECKPOINT",
                        "CONFLICT",
                        "CONTINUE",
                        "CREATED",
                        "DESTINATION_LOCKED",
                        "EXPECTATION_FAILED",
                        "FAILED_DEPENDENCY",
                        "FORBIDDEN",
                        "FOUND",
                        "GATEWAY_TIMEOUT",
                        "GONE",
                        "HTTP_VERSION_NOT_SUPPORTED",
                        "IM_USED",
                        "INSUFFICIENT_SPACE_ON_RESOURCE",
                        "INSUFFICIENT_STORAGE",
                        "INTERNAL_SERVER_ERROR",
                        "I_AM_A_TEAPOT",
                        "LENGTH_REQUIRED",
                        "LOCKED",
                        "LOOP_DETECTED",
                        "METHOD_FAILURE",
                        "METHOD_NOT_ALLOWED",
                        "MOVED_PERMANENTLY",
                        "MOVED_TEMPORARILY",
                        "MULTIPLE_CHOICES",
                        "MULTI_STATUS",
                        "NETWORK_AUTHENTICATION_REQUIRED",
                        "NON_AUTHORITATIVE_INFORMATION",
                        "NOT_ACCEPTABLE",
                        "NOT_EXTENDED",
                        "NOT_FOUND",
                        "NOT_IMPLEMENTED",
                        "NOT_MODIFIED",
                        "NO_CONTENT",
                        "OK",
                        "PARTIAL_CONTENT",
                        "PAYLOAD_TOO_LARGE",
                        "PAYMENT_REQUIRED",
                        "PERMANENT_REDIRECT",
                        "PRECONDITION_FAILED",
                        "PRECONDITION_REQUIRED",
                        "PROCESSING",
                        "PROXY_AUTHENTICATION_REQUIRED",
                        "REQUESTED_RANGE_NOT_SATISFIABLE",
                        "REQUEST_ENTITY_TOO_LARGE",
                        "REQUEST_HEADER_FIELDS_TOO_LARGE",
                        "REQUEST_TIMEOUT",
                        "REQUEST_URI_TOO_LONG",
                        "RESET_CONTENT",
                        "SEE_OTHER",
                        "SERVICE_UNAVAILABLE",
                        "SWITCHING_PROTOCOLS",
                        "TEMPORARY_REDIRECT",
                        "TOO_EARLY",
                        "TOO_MANY_REQUESTS",
                        "UNAUTHORIZED",
                        "UNAVAILABLE_FOR_LEGAL_REASONS",
                        "UNPROCESSABLE_ENTITY",
                        "UNSUPPORTED_MEDIA_TYPE",
                        "UPGRADE_REQUIRED",
                        "URI_TOO_LONG",
                        "USE_PROXY",
                        "VARIANT_ALSO_NEGOTIATES"
                    ]
                },
                "statusCodeValue": {
                    "type": "integer",
                    "format": "int32"
                }
            },
            "title": "ResponseEntity"
        }
    }
}
```
</details>
<details>
  <summary style="font-size:30px; font-weight:bold"><img src="https://media.giphy.com/media/VgCDAzcKvsR6OM0uWg/giphy.gif" width="50"> <h3>ROTAS:</h3></summary>
<br/>
<br/> 
  
  
 ```
 curl --location --request GET 'http://localhost:8080/v2/api-docs'
  
  
  
curl --location --request POST 'localhost:8080/v1/consulta-endereco' \
--header 'Content-Type: application/json' \
--data-raw '{ 
    "cep":"72874-555" 
}'
  
 ```
</details>
ROTAS:



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
<br>
<br>
![image](https://user-images.githubusercontent.com/83460816/221191223-0bde7716-ea61-491f-873c-38f925f70ea8.png)


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
- [Java](https://www.java.com/pt-BR/) - Main language

## ✍️ Authors <a name = "authors"></a>

- [@ThiagoKS-7](https://github.com/ThiagoKS-7) - Idea & Initial work
