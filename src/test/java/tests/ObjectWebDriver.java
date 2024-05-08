package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver.AutoDriver;
import driver.AutoEnumDriver;
import elements.Time;

public class ObjectWebDriver {

	private static WebDriver driver;
	private static ObjectWebDriver objectWebDriver;

	private ObjectWebDriver() {
	}

	public static ObjectWebDriver getInstance() {
		if (objectWebDriver == null) {

			// Instanciar o WebDriver e acessar o site
			AutoDriver autoDriver = new AutoDriver(AutoEnumDriver.CHROME, null);
			driver = autoDriver.getDriver();
			Time.wait(1);
			
			objectWebDriver = new ObjectWebDriver();
			
			// Assert da Tela de Tricentis
			String tituloDaTelaPerfil = driver.findElement(By.xpath(".//*[text() = 'Vehicle Insurance Application']"))
					.getText();
			assertEquals("Vehicle Insurance Application", tituloDaTelaPerfil);
			Time.wait(1);
			
		}

		return objectWebDriver;
	}

	public WebDriver getDriver() {
		return driver;
	}

}
