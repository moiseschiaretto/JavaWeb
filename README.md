## Projeto "bdd_test"

- Autor Moisés Ademir Chiaretto
  
- Descrição das explicações de cada item da 'estrutura do projeto "bdd_test" desenvolvido'.
  
- **Java com Selenium WebDriver, Cucumber (BDD com a linguagem Gherkin) e o TDD (métodos) com o código Java.**

![08_Selenium_Webdriver](https://github.com/moiseschiaretto/JavaWeb/assets/84775466/1dbd267d-18bf-4aaf-b9ec-caf1516f9bc8)

![06_Cucumber](https://github.com/moiseschiaretto/JavaWeb/assets/84775466/3faf7828-419d-4811-bb34-40dd36ddb338)

![07_Java](https://github.com/moiseschiaretto/JavaWeb/assets/84775466/22e317e3-2911-404a-a5f6-c7decf1e24ab)
 

## Estrutura do Projeto "bdd_test"


```

bdd_test
  |
  |-----pom.xml
  |-----.gitgnore
  |-----README.md
  |
  |_____src
  |      |____test
  |            |____java
  |                    |____bdd
  |                    |     |____RunScenarios.java
  |                    |     |____DadosDoVeiculo.feature
  |                    |
  |                    |____driver
  |                    |     |____AutoDriver.java
  |                    |     |____AutoEnumDriver.java
  |                    |
  |                    |____elements
  |                    |     |____Elemento.java
  |                    |     |____Time.java
  |                    |
  |                    |____tests
  |                    |     |____EnterInsurantData.java
  |                    |     |____EnterProductData.java
  |                    |     |____EnterVehicleData.java
  |                    |     |____ObjectWebDriver.java
  |                    |     |____SelectPriceOption.java
  |                    |     |____SendQuote.java
  |
  |_____src
  |      |____test
  |            |____resources
  |                    |____chromedriver_124
  |                    |     |____chromedriver.exe
  |                    |        
  |                    |____geckodriver_0340
  |                    |     |____geckodriver.exe


```

## Arquivo "pom.xml"

- Este arquivo contém todas as dependências do projeto, do **Apache Maven**, site do repositório de dependências:

- https://mvnrepository.com/

![09_Apache_Maven](https://github.com/moiseschiaretto/JavaWeb/assets/84775466/8cde13f8-6a79-4ca2-b4d5-13fe6e384164)


- Dependências do **Arquivo "pom.xml":**

    - Framework Cucumber para utilizar a linguagem **Gherkin e escrever o BDD.**

        - FrameWork Cucumber também com o plugin instalado em: **Menu Help, opção Eclipse Marketplace, Guia Search, Find = "Cucumber" (ver imagem abaixo).**
     
        - Selecionar o **"Cucumber Eclipse Plugin versão"** e clicar no botão **"Install".**
     
    ![03_Instalar_Plugin_Cucumber](https://github.com/moiseschiaretto/JavaWeb/assets/84775466/afb2be50-e135-4dc3-93e0-780167dfd69f)

 
    - JUnit para a **execução do BDD e do TDD (código Java).**
 
    - Selenium WebDriver para **acessar o browser e a URL especificada no código Java.**


![01_IMG_POM_XML](https://github.com/moiseschiaretto/JavaWeb/assets/84775466/6b49dcee-9e84-4c4d-b486-7d5b53fb138e)


![02_IMG_POM_XML](https://github.com/moiseschiaretto/JavaWeb/assets/84775466/49cb27e0-b3f6-43ee-a02a-213816aa306b)


## Arquivo do BDD "DadosDoVeinculo.feature"

- Este arquivo contém o BDD do projeto escrito na linguagem Gherkin com o framework Cucumber.

- Caminho deste arquivo no repositório Github:

	**/src/test/java/bdd/DadosDoVeiculo.feature**

```

# Author: Moisés Chiaretto
# language: en
@WizardVehicleData
Feature: Wizard Dados do Veiculo

  Scenario: Inserir Dados do Veiculo
    Given acessar o frame Enter Vehicle Data igual a doze campos
    When permitir preencher ou selecionar os dados dos campos do veículo
    And clicar o frame Enter Vehicle Data igual a zero campos
    Then clicar no botao Next para o sistema redirecionar para o frame Enter Insurant Data

  Scenario: Inserir Dados do Seguro
    Given acessar o frame Enter Insurant Data igual a sete campos
    When permitir preencher ou selecionar os dados dos campos do seguro
    Then clicar o frame Enter Insurant Data igual a zero campos
    And clicar no botao Next para o sistema redirecionar para o frame Enter Produt Data

  Scenario: Inserir Dados do Produto
    Given acessar o frame Enter Product Data igual a seis campos
    When preencher ou selecionar os dados dos campos do produto
    And clicar o frame Enter Product Data igual a zero campos
    Then clicar no botao Next para o sistema redirecionar para o frame Select Price Option

  Scenario: Selecionar Opcao Preco
    Given acessar o frame Select Price Option igual a um campo
    When selecionar a opcao de preco do produto
    And clicar o frame Select Price Option igual a zero campos
    Then clicar no botao Next para o sistema redirecionar para o frame Send Quote

  Scenario: Inserir Dados de envio da Cotacao
    Given acessar o frame Send Quote igual a quatro campos
    When preencher ou selecionar os dados dos campos de envio da cotacao
    And clicar o frame Send Quote igual a zero campos
    Then clicar no botao Send para enviar os dados e exibir a mensagem de alerta de confirmacao de envio

```

## Arquivo "RunScenarios.java"

- Contém o código para a execução do BDD e do TDD.

- Caminho o arquivo "RunScenarios.java" no repositório Github:

	**/src/test/java/bdd/RunScenarios.java**

- Caminho para os arquivos de testes com o TDD (métodos do BDD) no Github:

	**/src/test/java/tests**

```

// Arquivo "RunScenarios.java"

package bdd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/bdd",
		// plugin = {"pretty", "html:target/report-html"},
		monochrome = true,
		// snippets = SnippetType.CAMELCASE,
		dryRun = true,
		strict = false
		
		)

public class RunScenarios {

}

```


**Documentação em construção...**
