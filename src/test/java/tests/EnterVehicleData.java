package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elements.Elemento;
import elements.Time;

public class EnterVehicleData {

	WebDriver driver;
	// Construtor que será chamado automaticamente assim que o objeto da classe for criado
	public EnterVehicleData () {
		this.driver =  ObjectWebDriver.getInstance().getDriver();
	}
		
	@Given("^acessar o frame Enter Vehicle Data igual a doze campos$")
	public void acessarOFrameEnterVehicleDataIgualADozeCampos() throws Throwable {
		// Selecionar o EnterVehicleData = 12 Campos para preencher
		// Guia EnterVehicleData >> String id, String path, String validar, WebDriver driver
		Elemento.GuiaId("entervehicledata", "//*[@id=\"entervehicledata\"]//span[@class = \"counter\"]", "12", driver);
		Time.wait(1);
	}

	@When("^permitir preencher ou selecionar os dados dos campos do veículo$")
	public void permitirPreencherOuSelecionarOsDadosDosCamposDoVeículo() throws Throwable {
		// Popular os Campos
		// Make >> (String path, String valor, String validar, WebDriver driver)
		Elemento.SelecaoId("make", "//option[contains(., 'Volkswagen')]", "Volkswagen", driver);
		
		// Model >> (String path, String valor, String validar, WebDriver driver)
		Elemento.SelecaoId("model", "//option[contains(., 'Scooter')]", "Scooter", driver);
				
		// Cylinder Capacity [ccm] >> (String path, String valor, WebDriver driver)
		Elemento.CampoId("cylindercapacity", "500", driver);
				
		// Engine Performance [kW] >> (String path, String valor, WebDriver driver)
		Elemento.CampoId("engineperformance", "2000", driver);
		
		// Date of Manufacture >> (String path, String valor, WebDriver driver)
		Elemento.CampoId("dateofmanufacture", "05/10/2021", driver);
						
		// Number of Seats >> (String path, String valor, String validar, WebDriver driver)
		Elemento.SelecaoXPath("//form[@id=\"insurance-form\"]//select[@id = \"numberofseats\" and @name=\"Number of Seats\"]//option[@value=\"7\"]", "//option[contains(., \"7\")]", "7", driver);
						
		// Right Hand Drive >> (String path, WebDriver driver)
		Elemento.RadioXPath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/p/label[1]/span", driver);
		
		// Number of Seats >> (String path, String valor, String validar, WebDriver driver)
		Elemento.SelecaoXPath("//form[@id=\"insurance-form\"]//select[@id = \"numberofseatsmotorcycle\" and @name=\"Number of Seats Motorcycle\"]//option[@value=\"2\"]", "//option[contains(., \"2\")]", "2", driver);
		
		// Fuel Type >> (String path, String valor, String validar, WebDriver driver)
		Elemento.SelecaoId("fuel", "//option[contains(., 'Gas')]", "Gas", driver);
		
		// Payload [kg] >> (String path, String valor, WebDriver driver)
		Elemento.CampoId("payload", "1000", driver);
				
		// Total Weight [kg] (String path, String valor, WebDriver driver)
		Elemento.CampoId("totalweight", "50000", driver);
		
		// List Price [$] >> (String path, String valor, WebDriver driver)
		Elemento.CampoId("listprice", "100000", driver);
		
		// License Plate Number >> (String path, String valor, WebDriver driver)
		Elemento.CampoId("licenseplatenumber", "0123456789", driver);
		
		// Annual Mileage [mi] >> (String path, String valor, WebDriver driver)
		Elemento.CampoId("annualmileage", "100000", driver);
	}
	
	@Then("^clicar o frame Enter Vehicle Data igual a zero campos$")
	public void clicar_o_frame_Enter_Vehicle_Data_igual_a_zero_campos() throws Throwable {
		// Selecionar o EnterVehicleData = 0 Campos para preencher
		// Guia EnterVehicleData >> String path, String valor, String validar, WebDriver driver
		Elemento.GuiaId("entervehicledata", "//*[@id=\"entervehicledata\"]//span[@class = \"counter zero\"]", "0", driver);
		Time.wait(1);
	}

	@Then("^clicar no botao Next para o sistema redirecionar para o frame Enter Insurant Data$")
	public void clicarNoBotaoNextParaOSistemaRedirecionarParaOFrameEnterInsurantData() throws Throwable {
		// BTN Next
		driver.findElement(By.id("nextenterinsurantdata")).click();
		Time.wait(1);
		
		// Selecionar o EnterInsurantData = 7 Campos para preencher
		// Guia EnterInsurantData >> String path, String valor, String validar, WebDriver driver
		Elemento.GuiaId("enterinsurantdata", "//*[@id=\"enterinsurantdata\"]//span[@class = \"counter\"]", "7", driver);
		Time.wait(1);
	}

}
