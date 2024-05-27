package BaseContainer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	public WebDriver driver;
	
	@BeforeTest
	public void Setup() throws InterruptedException {		
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		driver.get("https://demo.seleniumeasy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
		Thread.sleep(1000);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();	
	}
}
