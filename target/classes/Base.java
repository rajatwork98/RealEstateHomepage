package Resources;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Base {

	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver()
	{


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rkuma395\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//execute in chrome driver
		return driver;	
	}
}
