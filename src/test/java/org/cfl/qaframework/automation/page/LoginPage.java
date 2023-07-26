package org.cfl.qaframework.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This class represents the Login page
 */
public class LoginPage extends Page {
	
	private static final String PATH_LOGIN = "/login.htm";
	
	private static final By FIELD_USERNAME = By.id("username");
	
	private static final By FIELD_PASSWORD = By.id("password");
	
	private static final By BUTTON_SUBMIT = By.id("loginButton");
	
	static final String LOGOUT_PATH = "/logout";
	
	private String username;
	
	private String password;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		username = properties.getUsername();
		password = properties.getPassword();
	}
	 
	public String getUsername() {
		return username;
	}

	@Override
	public void go() {
		goToPage(PATH_LOGIN);
	}
	
	@Override
	public String getPageUrl() {
		return PATH_LOGIN;
	}
	
	public void enterUsername(String username) throws InterruptedException {
		setTextToFieldNoEnter(FIELD_USERNAME,username);
		Thread.sleep(100);
	}
	
	public void enterPassword(String password) throws InterruptedException {
		setTextToFieldNoEnter(FIELD_PASSWORD,password);
		Thread.sleep(100);
	}
	
	public WebElement getLoginButton() {
		return findElement(BUTTON_SUBMIT);
	}
	
	public HomePage goToHomePage() throws InterruptedException {
		go();
		enterUsername(this.username);
		enterPassword(this.password);
		Thread.sleep(100);
		clickOn(BUTTON_SUBMIT);
		return new HomePage(this);
	}

}
