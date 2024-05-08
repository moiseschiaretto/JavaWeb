package tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elements.Elemento;
import elements.Time;

public class SendQuote {
	
	WebDriver driver;
	// Construtor que será chamado automaticamente assim que o objeto da classe for criado
	public SendQuote () {
		this.driver =  ObjectWebDriver.getInstance().getDriver();
	}
	
	@Given("^acessar o frame Send Quote igual a quatro campos$")
	public void acessar_o_frame_Send_Quote_igual_a_quatro_campos() throws Throwable {
		// Selecionar o Select Price Option = 4 Campos para preencher
		// Guia Send Quote >> String path, String valor, String validar, WebDriver driver
		Elemento.GuiaId("sendquote", "//*[@id=\"sendquote\"]//span[@class = \"counter\"]", "4", driver);
		Time.wait(1);
	}

	@When("^preencher ou selecionar os dados dos campos de envio da cotacao$")
	public void preencher_ou_selecionar_os_dados_dos_campos_de_envio_da_cotacao() throws Throwable {
		// E-Mail >> (String path, String valor, String validar, WebDriver driver)
		Elemento.CampoId("email", "test@gmail.com", driver);
		
		// Phone >> (String path, String valor, String validar, WebDriver driver)
		Elemento.CampoId("phone", "4199997777", driver);
		
		// Username >> (String path, String valor, String validar, WebDriver driver)
		Elemento.CampoId("username", "MoisesChiaretto", driver);
		
		// Password >> (String path, String valor, String validar, WebDriver driver)
		Elemento.CampoId("password", "Moises123", driver);
		
		// Confirm Password >> (String path, String valor, String validar, WebDriver driver)
		Elemento.CampoId("confirmpassword", "Moises123", driver);
		
		// Comments >> (String path, String valor, String validar, WebDriver driver)
		Elemento.CampoId("Comments", "Cliente Gold", driver);
			
	}

	@When("^clicar o frame Send Quote igual a zero campos$")
	public void clicar_o_frame_Send_Quote_igual_a_zero_campos() throws Throwable {
		// Selecionar o Select Price Option = 4 Campos para preencher
		// Guia Send Quote >> String path, String valor, String validar, WebDriver driver
		Elemento.GuiaId("sendquote", "//*[@id=\"sendquote\"]//span[@class = \"counter zero\"]", "0", driver);
		Time.wait(1);
	}

	@Then("^clicar no botao Send para enviar os dados e exibir a mensagem de alerta de confirmacao de envio$")
	public void clicar_no_botao_Send_para_enviar_os_dados_e_exibir_a_mensagem_de_alerta_de_confirmacao_de_envio() throws Throwable {
		// BTN Send
		driver.findElement(By.id("sendemail")).click();
		Time.wait(10);
		
		// Assert da Modal de MSG de Confirmacao de Envio
		String msgConfirmacao = driver.findElement(By.xpath("/html/body/div[4]/h2")).getText();
		Assert.assertEquals("Sending e-mail success!", msgConfirmacao);
					
		// BTN OK - Modal de MSG de Confirmacao de Envio
		driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();
		Time.wait(5);
		
		//driver.close();
		//driver.quit();
				
	}

}
