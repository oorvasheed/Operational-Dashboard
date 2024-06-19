package org.selenium.dataProvider.base

import java.util.concurrent.TimeUnit

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.remote.RemoteWebDriver
import org.selenium.dataProvider.ExcelSheet.utils.ExcelSheet
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod
import org.testng.annotations.DataProvider




















public class LoginBase {
	
	protected RemoteWebDriver driver = null;
	
	@DataProvider(name = "excel")
	public String[][] dataProvider() {
		String[][] excelData = ExcelSheet.getExcelData("TC001Login");
		return excelData;
	}
	
	@BeforeMethod
	public void startApp() {
		String URL = "https://dev66365.service-now.com/";
		System.setProperty("webdriver.chrome.driver","C:/Users/I1675/.katalon/packages/Katalon_Studio_Windows_64-9.1.0/Katalon_Studio_Windows_64-9.1.0/configuration/resources/drivers/Chromedriver/chromedriver.exe")
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
