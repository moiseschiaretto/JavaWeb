package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elements.Elemento;
import elements.Time;

public class EnterProductData {
	
	WebDriver driver;
	// Construtor que será chamado automaticamente assim que o objeto da classe for criado
	public EnterProductData () {
		this.driver =  ObjectWebDriver.getInstance().getDriver();
	}
	
	@Given("^acessar o frame Enter Product Data igual a seis campos$")
	public void acessarOFrameEnterProductDataIgualASeisCampos() throws Throwable {
		// Selecionar o Enter Product Data = 6 campos para preencher
		// Guia Enter Product Data >> String path, String valor, String validar, WebDriver driver
		Elemento.GuiaId("enterproductdata", "//*[@id=\"enterproductdata\"]//span[@class = \"counter\"]", "6", driver);
		Time.wait(1);
	}

	@When("^preencher ou selecionar os dados dos campos do produto$")
	public void preencherOuSelecionarOsDadosDosCamposDoProduto() throws Throwable {
	    
		// Date of Start Data >> (String path, String valor, String validar, WebDriver driver)
		Elemento.CampoId("startdate", "12/31/2021", driver);
		
		// Insurance Sum [$] >  >> (String path, String valor, String validar, WebDriver driver)
		Elemento.SelecaoId("insurancesum", "//option[contains(., ' 3.000.000,00')]", "3000000", driver);
		
		// Merit Rating >  >> (String path, String valor, String validar, WebDriver driver)
		Elemento.SelecaoId("meritrating", "//option[contains(., 'Bonus 3')]", "Bonus 3", driver);		
		
		// Damage Insurance >  >> (String path, String valor, String validar, WebDriver driver)
		Elemento.SelecaoId("damageinsurance", "//option[contains(., 'Partial Coverage')]", "Partial Coverage", driver);		
						
		// Optional Products >> (String path, WebDriver driver)
		Elemento.FlagXPath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[2]/span", driver);
					
		// Courtesy Car >  >> (String path, String valor, String validar, WebDriver driver)
		Elemento.SelecaoId("courtesycar", "//option[contains(., 'Yes')]", "Yes", driver);		

	}

	@When("^clicar o frame Enter Product Data igual a zero campos$")
	public void clicarOFrameEnterProductDataIgualAZeroCampos() throws Throwable {
		// Selecionar o Enter Product Data = 0 campos para preencher
		// Guia Enter Product Data >> String path, String valor, String validar, WebDriver driver
		Elemento.GuiaId("enterproductdata", "//*[@id=\"enterproductdata\"]//span[@class = \"counter zero\"]", "0", driver);
		Time.wait(1);
	}

	@Then("^clicar no botao Next para o sistema redirecionar para o frame Select Price Option$")
	public void clicarNoBotaoNextParaOSistemaRedirecionarParaOFrameSelectPriceOption() throws Throwable {
		// BTN Next
		driver.findElement(By.id("nextselectpriceoption")).click();
		Time.wait(1);
		
		// Selecionar o Select Price Option = 6 campos para preencher
		// Guia Select Price Option >> String path, String valor, String validar, WebDriver driver
		Elemento.GuiaId("selectpriceoption", "//*[@id=\"selectpriceoption\"]//span[@class = \"counter\"]", "1", driver);
		Time.wait(1);
	}
	

}
