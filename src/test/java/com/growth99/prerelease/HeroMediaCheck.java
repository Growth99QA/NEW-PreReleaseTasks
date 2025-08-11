package com.growth99.prerelease;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.growth99.base.BaseClass;
import com.growth99.pages.HeroMediaCheckPage;


public class HeroMediaCheck extends BaseClass {

	WebDriver driver;
	public JsonNode PreReleaseDataJsonData;
	HeroMediaCheckPage HeroMediaCheckPage;


	HeroMediaCheck(){
		super();
		PreReleaseDataJsonData = getJsonData("PreReleaseData.json");
	}

	@BeforeClass
	public void setup() {
		driver=initilazeBrowserWithUrl("preRelease");
		HeroMediaCheckPage = new HeroMediaCheckPage(driver);
	}


	@Test(priority = 0)
	public void validateHeroimageandvideoloading(){
		//JsonNode testData=	PreReleaseDataJsonData.get("validateHeroimageandvideoloading");
		HeroMediaCheckPage.validateHeroMedialoading();
		driver.manage().window().setSize(new Dimension(390, 840)); // iPhone 12 size
		HeroMediaCheckPage.validateHeroMedialoadingiphone();
		driver.manage().window().setSize(new Dimension(1024, 1366));  //ipad
		HeroMediaCheckPage.validateHeroMedialoadingipad();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
