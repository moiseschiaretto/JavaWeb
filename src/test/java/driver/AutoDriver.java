package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoDriver {
	// Local do driver e URL
	private static final String LOCAL_CHROMEDRIVER = "src/test/resources/chromedriver_124/chromedriver.exe";
	private static final String LOCAL_GECKODRIVER = "src/test/resources/geckodriver_0340/geckodriver.exe";
	private static final String URL = "http://sampleapp.tricentis.com/101/app.php";

	private WebDriver driver;

	public WebDriver getDriver() {
		return this.driver;
	}

	public AutoDriver(AutoEnumDriver autom, String url) {

		if (url == null) {
			url = URL;
		}

		if (autom.equals(AutoEnumDriver.CHROME)) {
			System.setProperty("webdriver.chrome.driver", LOCAL_CHROMEDRIVER);
			driver = new ChromeDriver();
			ChromeOptions op = new ChromeOptions();
			op.addArguments("disable-notifications");
		} else {
			System.setProperty("webdriver.gecko.driver", LOCAL_GECKODRIVER);
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void close() {
		this.driver.close();
		this.driver.quit();
	}

}

/*
 * Este erro abaixo significa que a versão do browser foi atualizada sendo
 * necessário atualizar também a versão do driver do "chromedriver.exe".
 * 
 * Download do driver do "chromedriver.exe".
 * https://chromedriver.chromium.org/downloads
 *  
 * O Google Chrome está atualizado
 * Versão 90.0.4430.212 (Versão oficial) 64 bits
 * 
 * Cuidado ao executar os testes e ocorrer o seguinte erro:
 * 
 * org.openqa.selenium.SessionNotCreatedException: session not created: This
 * version of ChromeDriver only supports Chrome version 92 Current browser
 * version is 90.0.4430.212 with binary path C:\Program Files
 * (x86)\Google\Chrome\Application\chrome.exe Build info: version: '3.141.59',
 * revision: 'e82be7d358', time: '2018-11-14T08:17:03' System info: host:
 * 'FHMOB2500', ip: '10.224.0.117', os.name: 'Windows 10', os.arch: 'x86',
 * os.version: '10.0', java.version: '1.8.0_271' Driver info: driver.version:
 * AutoDriver
 * 
 */