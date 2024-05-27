package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseContainer.TestBase;

public class LoginTest extends TestBase {
	
	@Test(priority = 0)
	public void SingleCheckBox() {			
		driver.findElement(By.xpath(locator.getProperty("CheckBoxDemo"))).click();
		driver.findElement(By.xpath(locator.getProperty("SinDefaultUncheck"))).click();
	}
			
	@Test(priority = 1)
	public void SelFirstOpt() {			
		driver.findElement(By.xpath(locator.getProperty("CheckBoxSelected"))).click();
		driver.findElement(By.xpath(locator.getProperty("SelectFirstOpt"))).click();
	}
	
	@Test(priority = 2)
	public void SelSecondOpt() {
		driver.findElement(By.xpath(locator.getProperty("SelectSecondOpt"))).click();
	}
	
	@Test(priority = 3)
	public void SelThirdOpt() {
		driver.findElement(By.xpath(locator.getProperty("SelectThirdOpt"))).click();
	}
	
	@Test(priority = 4)
	public void SelFourthOpt() {
		driver.findElement(By.xpath(locator.getProperty("SelectFourthOpt"))).click();
	}
	
	@Test(priority = 5)
	public void UncheckAllOpt() throws InterruptedException {
		driver.findElement(By.cssSelector(locator.getProperty("UncheckAll"))).click();
		Thread.sleep(1000);
	}
	
	@Test(priority = 6)
	public void CheckAllOpt() {
		driver.findElement(By.xpath(locator.getProperty("CheckAll"))).click();
	}			
	

}
