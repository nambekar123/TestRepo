package com.selenium.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pagepobj.navigationpage;

public class FirstClass {
	WebDriver driver;
	
	WebDriverWait wait;
	
	navigationpage navepageObj;
	
	@BeforeClass(alwaysRun = true)
	public void Initializetest() {
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\StudyMaterial\\Selenium\\SeleniumFramework\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		navepageObj= new navigationpage(driver);
		wait = new WebDriverWait(driver, 30);
	}

	@Test(priority = 10)
	public void LaunchURL(ITestContext context) throws InterruptedException {

		driver.navigate()
				.to("http://www.practiceselenium.com/our-passion.html");
		//Thread.sleep(5000);

		Assert.assertEquals(driver.getCurrentUrl(),
				"http://www.practiceselenium.com/our-passion.html");
	}
	
	@Test(priority = 20)
	public void ClickLetsTalkTea() throws InterruptedException {
		
		clickElement(navepageObj.LetsTalkTea);
		Assert.assertEquals(driver.getTitle(), "Let's Talk Tea");
	}

	private void clickElement(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	@Test(priority = 30)
	public void ClickMenu() throws InterruptedException {
		
		//navepageObj.Menu.click();
		clickElement(navepageObj.Menu);
		Assert.assertEquals(driver.getTitle(), "Menu");
		
	}
	
	@Test(priority=40)
	public void ClickOurPassion(){
		
		//navepageObj.passionLink.click();
		verifyText(navepageObj.passionLink,"Our Passion");	
		clickElement(navepageObj.passionLink);
		Assert.assertEquals(driver.getTitle(), "Our Passion");
	}
	

	
	@Test(priority = 50)
	public void PerformACheckOut(){
		clickElement(navepageObj.CheckOut);
		typeText(navepageObj.email, "nik@gmail.com");
		typeText(navepageObj.name, "My name is You !!");
	}
	
//	@Test(priority = 60)
//	public void VerifyTextBoxText () throws InterruptedException 
//	{	
//		//navepageObj.email.wait();
//		verifyText(navepageObj.email,"nik@gmail.com");		
//	}

	public void typeText(WebElement element, String keys) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(keys);
	}
	
	public void verifyText (WebElement element, String value)
	{
		Assert.assertEquals(element.getText(), value);
	}

	@AfterClass(alwaysRun = true)
	public void TearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
		driver = null;
	}
}
