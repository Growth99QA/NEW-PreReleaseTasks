package com.growth99.prerelease;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.JsonNode;
import com.growth99.base.BaseClass;
import com.growth99.pages.FooterGrowth99LogoValidationPage;

public class FooterGrowth99LogoValidation extends BaseClass {

	WebDriver driver;
	public JsonNode FooterGrowth99LogoValidationJsonData;
	FooterGrowth99LogoValidationPage FooterGrowth99LogoValidationPage;


	FooterGrowth99LogoValidation(){
		super();
		FooterGrowth99LogoValidationJsonData = getJsonData("FooterGrowth99LogoValidation.json");
	}

	@BeforeClass
	public void setup() {
		driver=initilazeBrowserWithUrl("preRelease");
		FooterGrowth99LogoValidationPage = new FooterGrowth99LogoValidationPage(driver);
	}

	@Test(priority = 0)
	public void validateFooterGrowth99Logo() {
		//JsonNode testData= FooterGrowth99LogoValidationJsonData.get("validateChatbotLogo");
		FooterGrowth99LogoValidationPage.validateFooterGrowth99Logo();
	}

	@Test(priority = 1)
	public void validateChatbotOnIphone() {
		//JsonNode testData= FooterGrowth99LogoValidationJsonData.get("validateChatbotLogo");
		driver.manage().window().setSize(new org.openqa.selenium.Dimension(375, 812)); // iPhone X size
		FooterGrowth99LogoValidationPage.validateFooterGrowth99LogoOnIphone();
	}
	@Test(priority = 2)
	public void validateChatbotOnIpad() {
		//JsonNode testData= FooterGrowth99LogoValidationJsonData.get("validateChatbotLogo");
		driver.manage().window().setSize(new org.openqa.selenium.Dimension(375, 812)); // iPhone X size
		FooterGrowth99LogoValidationPage.validateFooterGrowth99LogoOnIphone();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
