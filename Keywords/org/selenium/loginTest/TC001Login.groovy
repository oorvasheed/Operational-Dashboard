package org.selenium.loginTest

import org.selenium.loginPage.LoginPage;
import org.selenium.loginbase.LoginBase
import org.testng.annotations.Test

import com.kms.katalon.core.annotation.Keyword


public class TC001Login extends LoginBase {

	@Keyword
	@Test
	public void loginTest() {

		//LoginPage lp = new LoginPage();

		new LoginPage(driver)
				.enterUsername("admin")
				.enterPassword("Pass123")
				.loginButton();
	}
}
