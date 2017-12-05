package com.pagepobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class Father {
	
	public Father(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how = How.XPATH, using = "//a[@data-title=\"Our Passion\"]")
	public WebElement passionLink;

	public void SetTextBoxText (String property1, String text) 
	{
		
		
		
		// wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(keys);
		
	}
}
