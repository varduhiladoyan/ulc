package com.web365.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class UniverseLanguageCenterBaseTest {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void openUniverseLanguageCenter() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Varduhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.ulc.am/?l=en-US");
		driver.manage().window().maximize();
	}
	
	
	@AfterClass
	public void browserClose() {
		driver.close();
		driver.quit();
}
}