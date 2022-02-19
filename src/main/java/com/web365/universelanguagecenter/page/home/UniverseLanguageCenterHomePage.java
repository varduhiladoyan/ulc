package com.web365.universelanguagecenter.page.home;
import static com.web365.universelanguagecenter.page.home.UniverseLanguageCenterHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universelanguagecenter.page.base.UniverseLanguageCenterBasePage;

public class UniverseLanguageCenterHomePage extends UniverseLanguageCenterBasePage {
	
	public UniverseLanguageCenterHomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = HOME_PAGE_XPATH)
	public WebElement homePage;
	
	@FindBy(xpath = HOME_LOGO_XPATH)
	public WebElement homeLogo;
	
	@FindBy(xpath = UNIVERSE_TEXT_XPATH)
	public WebElement universeText;


	public UniverseLanguageCenterHomePage homePageClick() {
		homePage.click();
		return new UniverseLanguageCenterHomePage(this.driver);
	}
	
	public UniverseLanguageCenterHomePage homeLogoClick() {
		homeLogo.click();
		return new UniverseLanguageCenterHomePage(this.driver);
	}
}
