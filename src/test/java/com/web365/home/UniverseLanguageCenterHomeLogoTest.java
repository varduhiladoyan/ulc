package com.web365.home;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.UniverseLanguageCenterBaseTest;
import com.web365.universelanguagecenter.page.home.UniverseLanguageCenterHomePage;

public class UniverseLanguageCenterHomeLogoTest extends UniverseLanguageCenterBaseTest {

	@Test
	public void ulcLogoTest() throws InterruptedException {
		System.out.println("Test Case ID Home3");
		System.out.println("verify the ulcLogo returns to new home page");
		
		UniverseLanguageCenterHomePage home = new UniverseLanguageCenterHomePage(driver);
		System.out.println("Navigate to universelanguagecenter.am");
		home = home.homePageClick();
		System.out.println("1. Go to home page");
		home = home.homeLogoClick();
		System.out.println("2. Click on ulc logo");
		Assert.assertTrue(home.universeText.isDisplayed());
	}
}