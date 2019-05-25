package GIM.TestProjectFeb19;

import java.io.IOException;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.dynamic.loading.ByteArrayClassLoader.ChildFirst;
import util.RandomGenerator;
import util.properties_test;

public class App 
{
	public properties_test testData;
	public RandomGenerator rand = new RandomGenerator();
	public WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void beforeTest() throws IOException {
		testData = new properties_test();
		driver.get("http://www.way2automation.com/protractor-angularjs-practice-website.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testOne() {
		System.out.println("random mobile number is: "+rand.randomMobileNumberGenerator());
		System.out.println("random string is: "+rand.randomeString());
		System.out.println("my name is: "+ testData.properties.getProperty("ami"));
		System.out.println("my wife's name is: "+ testData.properties.getProperty("tumi"));
		System.out.println("my son's name is: "+ testData.properties.getProperty("myboy"));
		System.out.println("my mom's name is: "+ testData.properties.getProperty("mymom"));
		
	}
	
	@Test
	public void switchWindow() {
		
		
		driver.findElement(By.cssSelector("#wrapper > div.container.margin-top-20 > div.row > div > ul > li:nth-child(5) > a > figure")).click();
		
		Set<String> abcd = driver.getWindowHandles();
		Iterator<String> iterator = abcd.iterator();
		//Iterator<String> iter = abcd.iterator();
		String mainWindow = iterator.next();
		String childwindow = iterator.next();
		
		driver.switchTo().window(childwindow);
		
		System.out.println(driver.switchTo().activeElement().getText());
		
		driver.findElement(By.cssSelector("body > div.ng-scope > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(1) > button")).click();
		
	}
	   
	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
