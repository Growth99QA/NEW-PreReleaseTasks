package com.growth99.prerelease;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.JsonNode;
import com.growth99.base.BaseClass;
import com.growth99.pages.FaviconValidationPage;

public class FaviconValidation extends BaseClass {

	WebDriver driver;
	public JsonNode FaviconValidation;
	FaviconValidationPage FaviconValidationPage;
	


	FaviconValidation(){
		super();
		FaviconValidation = getJsonData("FaviconValidation.json");
	}

	@BeforeClass
	public void setup() {
		driver=initilazeBrowserWithUrl("preRelease");
		FaviconValidationPage = new FaviconValidationPage(driver);
		
	}

	@Test(priority = 0)
	public void validateFavicon(){
		FaviconValidationPage.validateFaviconLogo();
		driver.manage().window().setSize(new Dimension(390, 840)); // iPhone X size
		FaviconValidationPage.validateFaviconLogoOnIphone();
		driver.manage().window().setSize(new Dimension(1024, 1366));  // iPad size
		FaviconValidationPage.validateFaviconLogoOnIpad();

	}



	@AfterClass
	public void tearDown() {
		driver.quit();
	}


}