package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elements.Elemento;
import elements.Time;


public class SelectPriceOption {
	
	WebDriver driver;
	// Construtor que será chamado automaticamente assim que o objeto da classe for criado
	public SelectPriceOption () {
		this.driver =  ObjectWebDriver.getInstance().getDriver();
	}
	
	@Given("^acessar o frame Select Price Option igual a um campo$")
	public void acessar_o_frame_Select_Price_Option_igual_a_um_campo() throws Throwable {
		// Selecionar o SelectPriceOption = 1 Campo para selecionar
		// Guia SelectPriceOption >> String path, String valor, String validar, WebDriver driver
		Elemento.GuiaId("selectpriceoption", "//*[@id=\"selectpriceoption\"]//span[@class = \"counter\"]", "1", driver);
		Time.wait(2);
	}

	@When("^selecionar a opcao de preco do produto$")
	public void selecionar_a_opcao_de_preco_do_produto() throws Throwable {
		// SelectPriceOption = Gold >> (String path, WebDriver driver)
		Elemento.RadioXPath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[2]/span", driver);
		Time.wait(1);
	}

	@When("^clicar o frame Select Price Option igual a zero campos$")
	public void clicar_o_frame_Select_Price_Option_igual_a_zero_campos() throws Throwable {
		// Guia SelectPriceOption >> String path, String valor, String validar, WebDriver driver
		Elemento.GuiaId("selectpriceoption", "//*[@id=\"selectpriceoption\"]//span[@class = \"counter zero\"]", "0", driver);
		Time.wait(1);
	}

	@Then("^clicar no botao Next para o sistema redirecionar para o frame Send Quote$")
	public void clicar_no_botao_Next_para_o_sistema_redirecionar_para_o_frame_Send_Quote() throws Throwable {
		// BTN Next
		driver.findElement(By.id("nextsendquote")).click();
		Time.wait(1);
		
		// Selecionar o Send Quote = 4 Campos para preencher
		// Guia Send Quote >> String path, String valor, String validar, WebDriver driver
		Elemento.GuiaId("sendquote", "//*[@id=\"sendquote\"]//span[@class = \"counter\"]", "4", driver);
		Time.wait(1);
}
}
