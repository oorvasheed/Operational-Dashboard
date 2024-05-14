import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction
import io.appium.java_client.touch.offset.ElementOption
import org.openqa.selenium.StaleElementReferenceException
import org.openqa.selenium.NoSuchElementException
import java.util.List
import io.appium.java_client.touch.TapOptions
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import org.openqa.selenium.Keys as Keys
import groovy.console.ui.SystemOutputInterceptor as SystemOutputInterceptor
import org.openqa.selenium.StaleElementReferenceException
import org.openqa.selenium.interactions.touch.TouchActions
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.MobileDriver
import io.appium.java_client.MobileElement
import org.openqa.selenium.By
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import io.appium.java_client.AppiumDriver


Mobile.tapAtPosition(142, 481, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Split_Pay/android.widget.Button - Proceed'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Split_Pay/android.widget.CheckBox'), 10, FailureHandling.OPTIONAL)

AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver()

Object excelData = ExcelFactory.getExcelDataWithDefaultSheet('C:/Users/I1675/Downloads/Occupation_Mapping_Mofinans.xlsx', 'Sheet1',
	true)

//change the path when its run in another local system
for (int row = 1; row <= excelData.getRowNumbers(); row++) {
	
	String currentlyEmp = excelData.getValue('Currently_Employed', row)

	/*/String occType = excelData.getValue('Occupation_Type', row)
	
	String businessType = excelData.getValue('Business_Type', row)

	String empType = excelData.getValue('Employer_Type', row)

	String indType = excelData.getValue('Industry_Type', row)

	String secType = excelData.getValue('Sector_Type', row)

	String jobType = excelData.getValue('Job_Type', row)

	String jobTitles = excelData.getValue('Job_Titles', row)/*/
	
		try {
			
			Mobile.tap(findTestObject('Object Repository/Split_Pay/android.widget.CheckBox'), 0)
			
			Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_2'), 0)
			
			Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_3'), 0)
			
			Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_4'), 0)
			
			Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Accept  Continue_1(1)'), 0)
			
			Mobile.waitForElementPresent(findTestObject('Split_Pay/androidx.recyclerview.widget.RecyclerView_List_CurrentlyEmp'),
				30, FailureHandling.OPTIONAL)
			
			Mobile.delay(20, FailureHandling.OPTIONAL)
			
			//Are you currently Employed?
			
			List<MobileElement> options = driver.findElementsByXPath("//androidx.recyclerview.widget.RecyclerView//android.widget.TextView")
			
			System.out.println("Number of options found: " + options.size())
			
			for (MobileElement option : options) {
				
				String optionText = option.getText().trim()
				System.out.println("Option text: " + optionText)
			}

			boolean optionFound = false;
			
			for (MobileElement option : options) {
				
				String optionText = option.getText().trim()
				System.out.println("Option text: " + optionText)
								
				// Check if the optionText matches "Yes" or "No"
				if (optionText.equalsIgnoreCase(currentlyEmp))
				{
					String radioButtonXPath = String.format("//android.widget.TextView[@text='%s']/../android.widget.RadioButton", currentlyEmp)
					MobileElement radioButton = driver.findElementByXPath(radioButtonXPath)
					/*/TouchAction action = new TouchAction(driver)
					WebUI.delay(3)
					action.tap(TapOptions.tapOptions().withElement(ElementOption.element(option))).perform()/*/
					radioButton.click()
					optionFound = true
					
					System.out.println(('Success: Currently Employed \'' + currentlyEmp) + '\' is selected')
					break;
				}
				
				// If neither "Yes" nor "No" option was found
				if (!optionFound) {
					System.out.println("Neither 'Yes' nor 'No' option found");
				}
				
			}
			
			
		}
		
	catch (StaleElementReferenceException e) {
		System.out.println('StaleElementReferenceException occurred: ' + e.getMessage())

		continue
	}
	catch (NoSuchElementException e) {
		System.out.println('NoSuchElementException occurred: ' + e.getMessage())

		continue
	}
}