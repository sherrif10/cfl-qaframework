package org.cfl.qaframework.automation;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertNotNull;

import org.cfl.qaframework.RunTest;
import org.cfl.qaframework.automation.page.HomePage;
import org.cfl.qaframework.automation.page.LoginPage;
import org.cfl.qaframework.automation.test.TestBase;

public class LoginSteps extends TestBase {
	
	private LoginPage loginPage;

	public LoginSteps(){
		
	}
	
	@After(RunTest.HOOK.LOGIN)
	public void destroy() {
		quit();
	}
	
	@Before(RunTest.HOOK.LOGIN)
	public void setLoginPage() {
		loginPage = new LoginPage(getWebDriver());
	}
	
	@Given("User visits login page")
	public void visitLoginPage() throws Exception {
		loginPage.go();
	}
	
	@When("User enters {string} username")
	public void anyUsername(String username) throws InterruptedException {
		if(username.equals("admin")){
			if(!username.trim().equals(loginPage.getUsername())){
				username = loginPage.getUsername();
			}
		}
		loginPage.enterUsername(username);
	}
	
	@And("User enters {string} password")
	public void anyPassword(String password) throws InterruptedException {
		loginPage.enterPassword(password);
	}
	
	@And("User Logs in")
	public void userLogsIn() throws InterruptedException {
		Thread.sleep(100);
		loginPage.getLoginButton().click();
		Thread.sleep(100);
	}
	
	@Then("System Evaluates Login {string}")
	public void evaluateLogin(String status) throws InterruptedException {
		Thread.sleep(100);
		HomePage homePage = new HomePage(loginPage);
		if (status.trim().endsWith("true")) {
			assertNotNull(homePage.getLogOutLink());
		} else if (status.trim().endsWith("false")) {
			assertNotNull(loginPage.getLoginButton());
		}
	}
}
