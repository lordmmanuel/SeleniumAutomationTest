package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseContainer.TestBase;

public class LoginTest extends TestBase {
	
	@Test(priority = 0)
	public void SingleCheckBox() {			
		driver.findElement(By.xpath("//a[contains(text(),'Check Box Demo')]")).click();
		driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/label[2]/input[1]")).click();
	}
			
	@Test(priority = 1)
	public void SelFirstOpt() {			
		driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/label[1]")).click();
	}
	
	@Test(priority = 2)
	public void SelSecondOpt() {
		driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[2]/label[1]/input[1]")).click();
	}
	
	@Test(priority = 3)
	public void SelThirdOpt() {
		driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[3]/label[1]/input[1]")).click();
	}
	
	@Test(priority = 4)
	public void SelFourthOpt() {
		driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[4]/label[1]/input[1]")).click();
	}
	
	@Test(priority = 5)
	public void UncheckAllOpt() throws InterruptedException {
		driver.findElement(By.cssSelector("#check1")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority = 6)
	public void CheckAllOpt() {
		driver.findElement(By.xpath("//input[@id='check1']")).click();
	}			
	

}
