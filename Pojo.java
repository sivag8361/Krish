package org.sample1;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass {
	public Pojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "i-icon-profile")
	private WebElement cli;
	@FindBy(id = "signInLink")
	private WebElement cli1;
	@FindBy(id = "mobileNoInp")
	private WebElement sen;

	public WebElement getCli() {
		return cli;
	}

	public WebElement getCli1() {
		return cli1;
	}

	public WebElement getSen() {
		return sen;
	}

}
