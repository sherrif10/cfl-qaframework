package org.cfl.qaframework.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * This class represents the Home page
 */
public class HomePage extends Page {

	private static final String PATH_HOME = "/Dashboard";

	public HomePage(Page page) {
		super(page);
	}

	@Override
	public String getPageUrl() {
		return PATH_HOME;
	}

	public WebElement getLogOutLink() {
		return findElement(By.id("logout-form"));
	}


}
