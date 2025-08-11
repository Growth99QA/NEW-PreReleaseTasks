package com.growth99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.growth99.utils.WebUtils;

public class HeroMediaCheckPage {

	WebDriver driver;
	WebUtils webUtils;

	public HeroMediaCheckPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		webUtils =  new WebUtils(driver);
	}

	@FindBy (xpath="//div[@class='elementor-background-video-container lzl-ed lzl-cached']")
	WebElement heroimage;
	
	public void validateHeroMedialoading() {
		webUtils.validateHeroMedia(By.xpath("//div[@class='elementor-background-video-container lzl-ed lzl-cached']"),null);
		webUtils.captureScreenshot("desktop");
	}

	public void validateHeroMedialoadingiphone() {
		webUtils.validateHeroMedia(By.xpath("//div[@class='elementor-background-video-container lzl-ed lzl-cached']"),null);
		webUtils.captureScreenshot("iphone");
	}

	public void validateHeroMedialoadingipad() {
		webUtils.validateHeroMedia(By.xpath("//div[@class='elementor-background-video-container lzl-ed lzl-cached']"),null);
		webUtils.captureScreenshot("ipad");
	}

}
