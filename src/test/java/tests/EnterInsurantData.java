package tests;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elements.Elemento;
import elements.Time;

public class EnterInsurantData {
			
	WebDriver driver;
	// Construtor que será chamado automaticamente assim que o objeto da classe for criado
	public EnterInsurantData () {
		this.driver =  ObjectWebDriver.getInstance().getDriver();
	}
	
	@Given("^acessar o frame Enter Insurant Data igual a sete campos$")
	public void acessarOFrameEnterInsurantDataIgualASeteCampos() throws Throwable {
		// Selecionar o EnterInsurantData = 7 campos para preencher
		// Guia EnterInsurantData >> String id, String xpath, String validar, WebDriver driver
		Elemento.GuiaId("enterinsurantdata", "//*[@id=\"enterinsurantdata\"]//span[@class = \"counter\"]", "7", driver);
		Time.wait(1);
		
		/*
		driver.findElement(By.id("enterinsurantdata")).click();
		Assert.assertEquals("7",
				driver.findElement(By.xpath("//*[@id=\"enterinsurantdata\"]//span[@class = \"counter\"]")).getText());
		*/

	}

	@When("^permitir preencher ou selecionar os dados dos campos do seguro$")
	public void permitirPreencherOuSelecionarOsDadosDosCamposDoSeguro() throws Throwable {
		// Popular os campos
		// First Name >> (String path, String valor, String validar, WebDriver driver)
		Elemento.CampoId("firstname", "Moises", driver);

		// Last Name >> (String path, String valor, String validar, WebDriver driver)
		Elemento.CampoId("lastname", "Chiaretto", driver);

		// Date of Birth >> (String path, String valor, String validar, WebDriver driver)
		Elemento.CampoId("birthdate", "05/15/1990", driver);

		// Gender >> (String path, WebDriver driver)
		Elemento.RadioXPath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span", driver);

		// Street Address >> (String path, String valor, String validar, WebDriver driver)
		// Elemento.CampoId("streetaddress", "Rua X, 123", driver);

		// Country > >> (String path, String valor, String validar, WebDriver driver)
		Elemento.SelecaoId("country", "//option[contains(., 'Brazil')]", "Brazil", driver);

		// Zip Code >> (String path, String valor, String validar, WebDriver driver)
		Elemento.CampoId("zipcode", "123456", driver);

		// City >> (String path, String valor, String validar, WebDriver driver)
		Elemento.CampoId("city", "Curitiba", driver);

		// Occupation >> (String path, String valor, String validar, WebDriver driver)
		Elemento.SelecaoId("occupation", "//option[contains(., 'Employee')]", "Employee", driver);

		// Hobbies >> (String path, WebDriver driver)
		Elemento.FlagXPath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[5]", driver);

		// Website >> (String path, String valor, String validar, WebDriver driver)
		Elemento.CampoId("website", "https://www.google.com", driver);

		// Upload do Arquivo / Picture >>(String campo, String botao, String path,
		// WebDriver driver)
		File file = new File("src/test/resources/picture/fusca.jpg");
		String absolutePath = file.getAbsolutePath();
			Elemento.UploadArquivoId("picture", "open", absolutePath, driver);
		Time.wait(1);
	}

	@Then("^clicar o frame Enter Insurant Data igual a zero campos$")
	public void clicarOFrameEnterInsurantDataIgualAZeroCampos() throws Throwable {
		// Selecionar o EnterInsurantData = 0 campos para preencher
		// Guia EnterInsurantData >> String id, String xpath, String validar, WebDriver driver
		Elemento.GuiaId("enterinsurantdata", "//*[@id=\"enterinsurantdata\"]//span[@class = \"counter zero\"]", "0", driver);
		Time.wait(1);
	}

	@Then("^clicar no botao Next para o sistema redirecionar para o frame Enter Produt Data$")
	public void clicarNoBotaoNextParaOSistemaRedirecionarParaOFrameEnterProdutData() throws Throwable {
		// BTN Next
		driver.findElement(By.id("nextenterproductdata")).click();
		Time.wait(1);

		// Selecionar o Enter Product Data = 6 campos para preencher
		// Guia Enter Product Data >> String id, String xpath, String validar, WebDriver driver
		Elemento.GuiaId("enterproductdata", "//*[@id=\"enterproductdata\"]//span[@class = \"counter\"]", "6", driver);
		Time.wait(1);
	}

}
