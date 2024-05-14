import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys

public class alert{
	
	
public static void main(Strin[] args) {

System.setProperty("webdriver.chrome.driver", "C:/Users/I1675/.katalon/packages/Katalon_Studio_Windows_64-9.1.0/Katalon_Studio_Windows_64-9.1.0/configuration/resources/drivers/chromedriver_win32/chromedriver.exe");

ChromeDriver driver = new ChromeDriver()

driver.switchTo().frame(1)

driver.switchTo().frame(0)

driver.findElement(By.xpath("//button[text()='Try it']")).click();

Alert alt = driver.switchTo().alert()

alt.sendKeys("Visakh")

alt.accept();

String finalText = driver.findElement(By.xpath("//p[@id='demo']")).getText();

System.out.println(finalText)

}

}


