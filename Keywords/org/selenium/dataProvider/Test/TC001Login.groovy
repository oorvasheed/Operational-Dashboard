package org.selenium.dataProvider.Test
import org.selenium.dataProvider.LoginPage.LoginPage
import org.selenium.dataProvider.base.LoginBase
import org.testng.annotations.Test

public class TC001Login extends LoginBase {
	
	
	@Test(dataProvider = "excel")
	public void loginTest(String[] data) {
		
		new LoginPage(driver)
		.enterUsername(data[0])
		.enterPassword(data[1])
		.clickLogin();
	}
	
}
