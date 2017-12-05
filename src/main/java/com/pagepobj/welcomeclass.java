package com.pagepobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class welcomeclass {
	
	public welcomeclass(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}

}
