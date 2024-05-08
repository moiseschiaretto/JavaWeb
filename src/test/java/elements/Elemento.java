package elements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Elemento {
		
		public static void SelecaoId (String path, String valor, String validar, WebDriver driver) {
			driver.findElement(By.id(path)).click();
			driver.findElement(By.xpath(valor)).click();
			Assert.assertEquals(validar, driver.findElement(By.id(path)).getAttribute("value"));
		}
		
		public static void SelecaoXPath (String path, String valor, String validar, WebDriver driver) {
			driver.findElement(By.xpath(path)).click();
			driver.findElement(By.xpath(valor)).click();
			Assert.assertEquals(validar, driver.findElement(By.xpath(path)).getAttribute("value"));
		}
		
		public static void FlagXPath (String path, WebDriver driver) {
			driver.findElement(By.xpath(path)).click();
			Assert.assertTrue(driver.findElement(By.xpath(path)).isEnabled());
		}
				
		public static void CampoId (String path, String valor, WebDriver driver) {
			driver.findElement(By.id(path)).clear();
			driver.findElement(By.id(path)).click();
			driver.findElement(By.id(path)).sendKeys(valor);
			Assert.assertEquals(valor, driver.findElement(By.id(path)).getAttribute("value"));
		}
		
		public static void GuiaId (String idguia, String path, String validar, WebDriver driver) {
			driver.findElement(By.id(idguia)).click();
			Assert.assertEquals(validar, driver.findElement(By.xpath(path)).getText());
		}
		
		public static void RadioXPath (String path, WebDriver driver) {
			driver.findElement(By.xpath(path)).click();
			Assert.assertTrue(driver.findElement(By.xpath(path)).isEnabled());
		}
		
		public static void UploadArquivoId (String campo, String botao, String path, WebDriver driver) throws AWTException {
			driver.findElement(By.id(campo)).clear();
			driver.findElement(By.id(botao)).click();
			Time.wait(2);
					
			String pathpicture = (path);
			StringSelection stringSelection = new StringSelection(pathpicture);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Time.wait(2);	
			
			
		}

}
