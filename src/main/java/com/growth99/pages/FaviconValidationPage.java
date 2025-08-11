package com.growth99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.growth99.utils.WebUtils;

public class FaviconValidationPage {

	WebDriver driver;
	WebUtils webUtils;
	public FaviconValidationPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		webUtils =  new WebUtils(driver);
	}


	@FindBy (xpath="//link[contains(@rel, 'apple-touch-icon')]")
	WebElement faviconLogo;

	public boolean validateFaviconLogo() {

		String faviconUrl = faviconLogo.getDomAttribute("href");
		System.out.println("Favicon URL: " + faviconUrl);
		boolean isFaviconValid = webUtils.faviconValidation(faviconUrl);
		webUtils.captureScreenshot("faviconDesktopView");
		return isFaviconValid;
	}


	public boolean validateFaviconLogoOnIphone() {
		String faviconUrl = faviconLogo.getDomAttribute("href");
		System.out.println("Favicon URL: " + faviconUrl);
		boolean isFaviconValid = webUtils.faviconValidation(faviconUrl);
		webUtils.captureScreenshot("faviconiPhoneView");
		return isFaviconValid;

	}

	public boolean validateFaviconLogoOnIpad() {
		String faviconUrl = faviconLogo.getDomAttribute("href");
		System.out.println("Favicon URL: " + faviconUrl);
		boolean isFaviconValid = webUtils.faviconValidation(faviconUrl);
		webUtils.captureScreenshot("faviconiPadView");
		return isFaviconValid;

	}


}