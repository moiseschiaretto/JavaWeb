## Projeto "bdd_test"

- Autor Moisés Ademir Chiaretto
  
- Descrição das explicações de cada item da 'estrutura do projeto "bdd_test" desenvolvido'.
  
- **Java com Selenium WebDriver, Cucumber (BDD com a linguagem Gherkin) e o TDD (métodos) com o código Java.**

![08_Selenium_Webdriver](https://github.com/moiseschiaretto/JavaWeb/assets/84775466/1dbd267d-18bf-4aaf-b9ec-caf1516f9bc8)

![06_Cucumber](https://github.com/moiseschiaretto/JavaWeb/assets/84775466/3faf7828-419d-4811-bb34-40dd36ddb338)

![07_Java](https://github.com/moiseschiaretto/JavaWeb/assets/84775466/22e317e3-2911-404a-a5f6-c7decf1e24ab)
 

## Estrutura do Projeto "bdd_test"


```     .
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
        |                    |     |____AutoDriver.java
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



**Documentação em construção...**
