package BaseContainer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	public WebDriver driver;
	public Properties config = new Properties();
	public Properties locator = new Properties();
	public FileInputStream file;
	String ProjectLocation = System.getProperty("user.dir");
	
	
	@BeforeTest
	public void Setup() throws InterruptedException {	
		
		//Launching/Setup Browser
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		
		//URL & Data File Configuration Setup
		try {
			file = new FileInputStream(ProjectLocation + "\\src\\main\\resources\\PropertyFiles\\config.properties");
		}catch(FileNotFoundException FNFE) {
			FNFE.printStackTrace();
		}
		
		//Loading the Configured File
		try {
			config.load(file);
		}catch(IOException FNIO) {
			FNIO.printStackTrace();
		}
		
		//Locators File Configuration
		try {
			file = new FileInputStream(ProjectLocation + "\\src\\main\\resources\\PropertyFiles\\locator.properties");
		}catch(FileNotFoundException FNFE) {
			FNFE.printStackTrace();
		}
		
		//Loading the Configured File
		try {
			locator.load(file);
		}catch(IOException FNIO) {
			FNIO.printStackTrace();
		}
		
		
		//Application Launching
		driver.get(config.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.xpath(locator.getProperty("StartPractising"))).click();
		Thread.sleep(1000);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();	
	}
}
