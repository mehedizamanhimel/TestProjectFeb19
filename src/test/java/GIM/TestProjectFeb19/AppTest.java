package GIM.TestProjectFeb19;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.sampleTest.particeSite.pages_mainPage;
import util.PropertiesTwo;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	public WebDriver driver = new ChromeDriver();
	
	PropertiesTwo testData;
	pages_mainPage mainPage= new pages_mainPage(driver);
	
	@BeforeTest
	public void beforeTest() throws IOException {
		testData = new PropertiesTwo();
		driver.get("http://www.way2automation.com/protractor-angularjs-practice-website.html");
		driver.manage().window().maximize();
		
	}
	
	//@Test
	public void testOne() {
		String baseUrl = "http://demo.guru99.com/test/upload/";
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\Users\\User\\Desktop\\WP_000310.jpg");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
	}
		
	
	@Test
	public void TestTwo() {
		String abcd = testData.property.getProperty("ami");
		System.out.println(abcd);
	}
	
	@Test
	public void openForm() {
		mainPage.openMultiform();
		mainPage.switchWindow();
		mainPage.clickNext();
		
	}
	
	
}
