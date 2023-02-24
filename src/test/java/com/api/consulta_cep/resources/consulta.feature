Feature: the CEP consultation can be made
  Scenario: client makes call to POST /v1/consulta-endereco
    When user calls /v1/consulta-endereco
    Then user receives status code of 400
    And user receives CEP response