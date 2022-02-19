package com.web365.universelanguagecenter.page.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UniverseLanguageCenterBasePage {
protected WebDriver driver;
	
	public UniverseLanguageCenterBasePage   (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver,this);
     
}
}