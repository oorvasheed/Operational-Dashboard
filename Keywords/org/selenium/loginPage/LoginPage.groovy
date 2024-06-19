package org.selenium.loginPage

import org.openqa.selenium.remote.RemoteWebDriver
import org.selenium.loginbase.LoginBase

public class LoginPage extends LoginBase {

	public LoginPage(RemoteWebDriver driver) {

		this.driver = driver;
	}

	//RemoteWebDriver driver = null;

	//locators

	//actions

	public LoginPage enterUsername(String username) {
		driver.findElementById("user_name").sendKeys(username);
		return this;
	}

	public LoginPage enterPassword(String password) {
		driver.findElementById("user_password").sendKeys(password);
		return this;
	}

	public DashboardPage loginButton() {
		driver.findElementById("sysverb_login").click();
		return new DashboardPage();
	}

	public void login(String userName, String pass) {

		enterUsername(userName);
		enterPassword(pass)
		loginButton()
	}
}
