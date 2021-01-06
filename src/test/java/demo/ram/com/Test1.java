package demo.ram.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void signin() {
		//WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         
		driver.get("http://automationpractice.com/index.php");
		
		System.out.println("==========================================");
		System.out.println("Applicatin URL: " + driver.getCurrentUrl());
		System.out.println("Windiow Title: " + driver.getTitle());
		System.out.println("This code is added by Project Engineer");
		System.out.println("==========================================");
		
		driver.close();
	}
}
