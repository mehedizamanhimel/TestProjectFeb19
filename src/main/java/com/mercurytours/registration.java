package com.mercurytours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class registration {

	public WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void beforeTest() {
	driver.get("http://way2automation.com/way2auto_jquery/index.php");
	}
	
	@Test
	public void waytoAutomationRegistration() throws InterruptedException {
		driver.findElement(By.name("name")).sendKeys("mehedi");
		driver.findElement(By.name("phone")).sendKeys("asdfasdf");
		
		
		driver.findElement(By.name("email")).sendKeys("asdfsdafkkj");
		Select selectCountry = new Select(driver.findElement(By.name("country")));
		selectCountry.selectByValue("Bangladesh");
		driver.findElement(By.name("city")).sendKeys("afsdfasefwer");
		driver.findElement(By.xpath("(//INPUT[@type='text'])[4]")).sendKeys("wersfdfsd");
		driver.findElement(By.xpath("(//INPUT[@type='password'])[2]")).sendKeys("wersfdfsd");
		driver.findElement(By.xpath("(//INPUT[@type='submit'])[2]")).click();
		String emailMessage = driver.findElement(By.name("email")).getAttribute("title");
		System.out.println("tooltip is"+emailMessage);		
		
		Actions MouseAction = new Actions(driver);
		MouseAction.moveToElement(driver.findElement(By.xpath("(//INPUT[@type='submit'])[2]"))).doubleClick();
		Thread.sleep(4000);
		driver.close();
		
	}
}
