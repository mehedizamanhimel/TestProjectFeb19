package pages.sampleTest.particeSite;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pages_mainPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "(//FIGURE)[2]")
	WebElement multiFOrm;
	
	@FindBy(xpath = "//A[@ui-sref='form.interests']")
	WebElement nextButton_page1;
	
	public pages_mainPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void openMultiform() {
		multiFOrm.click();
		
		
	}
	
	public void switchWindow() {
		Set<String> abcd = driver.getWindowHandles();
		Iterator<String> interate = abcd.iterator();
		
		String mainWindow = interate.next();
		String childWindow = interate.next();
		
		driver.switchTo().window(childWindow);
	}
	
	
	public void clickNext() {
		nextButton_page1.click();
	}
}
