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

public class Fruits{
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".//path")
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.play.letcode.in");
		driver.findElement(By.xpath("//")).click(); //clicks workspace
		driver.findElement(By.xpath("//")).click(); //clicks checkbox option
		
		List<WebElement> allFruits = driver.findElements(By.tagName("tagname"));
		
		for(WebElement fruits : allFruits) {
			
			 driver.findElement(By.xpath("")).click;	
		}
		String bananaSelected = driver.findElement(By.xpath("")).getText();
		if(bananaSelected.isSelected()) {
			
			System.out.println("Banana is selected")
			
		}else driver.findElement(By.xpath("checkbox xpath")).click;
	}
	
}