$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DadosDoVeiculo.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Author: moiseschiaretto@gmail.com"
    },
    {
      "line": 2,
      "value": "# language: en"
    }
  ],
  "line": 4,
  "name": "Wizard Dados do Veiculo",
  "description": "",
  "id": "wizard-dados-do-veiculo",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@WizardVehicleData"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Inserir Dados do Veiculo",
  "description": "",
  "id": "wizard-dados-do-veiculo;inserir-dados-do-veiculo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "acessar o frame Enter Vehicle Data igual a doze campos",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "permitir preencher ou selecionar os dados dos campos do veículo",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "clicar o frame Enter Vehicle Data igual a zero campos",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "clicar no botao Next para o sistema redirecionar para o frame Enter Insurant Data",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 12,
  "name": "Inserir Dados do Seguro",
  "description": "",
  "id": "wizard-dados-do-veiculo;inserir-dados-do-seguro",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "acessar o frame Enter Insurant Data igual a sete campos",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "permitir preencher ou selecionar os dados dos campos do seguro",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "clicar o frame Enter Insurant Data igual a zero campos",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "clicar no botao Next para o sistema redirecionar para o frame Enter Produt Data",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 18,
  "name": "Inserir Dados do Produto",
  "description": "",
  "id": "wizard-dados-do-veiculo;inserir-dados-do-produto",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "acessar o frame Enter Product Data igual a seis campos",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "preencher ou selecionar os dados dos campos do produto",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "clicar o frame Enter Product Data igual a zero campos",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "clicar no botao Next para o sistema redirecionar para o frame Select Price Option",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 24,
  "name": "Selecionar Opcao Preco",
  "description": "",
  "id": "wizard-dados-do-veiculo;selecionar-opcao-preco",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "acessar o frame Select Price Option igual a um campo",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "selecionar a opcao de preco do produto",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "clicar o frame Select Price Option igual a zero campos",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "clicar no botao Next para o sistema redirecionar para o frame Send Quote",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 30,
  "name": "Inserir Dados de envio da Cotacao",
  "description": "",
  "id": "wizard-dados-do-veiculo;inserir-dados-de-envio-da-cotacao",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "acessar o frame Send Quote igual a quatro campos",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "preencher ou selecionar os dados dos campos de envio da cotacao",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "clicar o frame Send Quote igual a zero campos",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "clicar no botao Send para enviar os dados e exibir a mensagem de alerta de confirmacao de envio",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});