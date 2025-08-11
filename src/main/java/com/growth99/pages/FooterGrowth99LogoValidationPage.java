package com.growth99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.growth99.utils.WebUtils;

public class FooterGrowth99LogoValidationPage {

	WebDriver driver;
	WebUtils webUtils;
	public FooterGrowth99LogoValidationPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		webUtils =  new WebUtils(driver);
	}

	@FindBy (xpath="//a[@href='https://growth99.com/']")
	WebElement footerGrowth99Logo;

	public void validateFooterGrowth99Logo() {
		String style = webUtils.getAttribute(footerGrowth99Logo, "href");
		System.out.println(style);
		webUtils.isImageValid(style, "FooterGrowth99 Logo");
		webUtils.captureScreenshot("footerGrowth99logoDesktop");

	}
	public void validateFooterGrowth99LogoOnIphone() {
		String style = webUtils.getAttribute(footerGrowth99Logo, "style");
		System.out.println(style);
		webUtils.isImageValid(style, "FooterGrowth99 Logo");
		webUtils.captureScreenshot("FooterGrowth99iphone");

	}
	public void validateFooterGrowth99LogoOnIpad() {
		String style = webUtils.getAttribute(footerGrowth99Logo, "style");
		System.out.println(style);
		webUtils.isImageValid(style, "FooterGrowth99 Logo");
		webUtils.captureScreenshot("FooterGrowth99ipad");

	}


}