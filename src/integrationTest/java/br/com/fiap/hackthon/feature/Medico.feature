Feature: Tests Api Customer

  Background:
    * url applicationUrl
    Given path '/'

  Scenario: Testando a criacao de um cliente
    And path "medico"
    And request { cpf: "084.537.660-88", name: "José Silva", email: "jose@silva.com" }
    And header Content-Type = 'application/json'
    When method POST
    Then status 404
