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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

public class AlertsConcepts{
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./path")
		ChromeDriver driver = new ChromeDriver()
		driver.manage.timeout.implicitlyWait(10,TimeUnit.SECONDS)
		//simple Alert
		driver.findElement(By.id("")).click()
		Alert alert =driver.switchTo.alert(); //to print the alert text
		String text = alert.getText() 
		System.out.println(text)
		alert.accept()
		
		//Confirm Alert
		driver.switchTo().alert();
		String alert2 = alert.getText()
		System.out.println(alert2)
		alert.accept()/alert.dismiss
		
		//prompt alert
		driver.switchTo.alert()
		alert.sendKeys("Visakh")
		alert.accept()
		String alert3 = alert.getText()
		System.out.println(alert3)	
		
	}
	
}