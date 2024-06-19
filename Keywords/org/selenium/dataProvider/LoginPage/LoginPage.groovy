package org.selenium.dataProvider.LoginPage

import org.openqa.selenium.remote.RemoteWebDriver
import org.selenium.dataProvider.base.LoginBase


public class LoginPage extends LoginBase {
	
	//RemoteWebDriver driver = null;
	public void loginPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	//locators
	
	//Actions
	
	public LoginPage enterUsername(String username) {		
		driver.findElementById("user_name").sendKeys(username);	
		return this;	
	}
	
	public LoginPage enterPassword(String password) {
		driver.findElementById("user_password").sendKeys(password);
		return this;
	}
	
	public DashBoardPage clickLogin() {
		driver.findElementById("sysverb_login").click();
		return new DashBoardPage();
	}
	
	public void login(String Username, String pass) {
		enterUsername(Username);
		enterPassword(pass);
		clickLogin();
	}
}
