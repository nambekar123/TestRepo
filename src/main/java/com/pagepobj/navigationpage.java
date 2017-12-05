package com.pagepobj;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class navigationpage {

	public navigationpage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//a[@data-title=\"Our Passion\"]")
	public WebElement passionLink;

	@FindBy(how = How.XPATH, using = "//a[@data-title=\"Welcome\"]")
	public WebElement Welcome;

	@FindBy(how = How.XPATH, using = "//a[@data-title=\"Menu\"]")
	public WebElement Menu;

	@FindBy(how = How.XPATH, using = "//a[@data-title=\"Let's Talk Tea\"]")
	public WebElement LetsTalkTea;
	
	@FindBy(how = How.XPATH, using = "//a[@data-title=\"Check Out\"]")
	public WebElement CheckOut;
	
	@FindBy(how = How.ID, using = "email")
	public WebElement email;
	
	@FindBy(how = How.ID, using = "name")
	public WebElement name;
	
	
}
