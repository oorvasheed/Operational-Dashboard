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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.console.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByXPath as ByXPath
import org.openqa.selenium.support.ui.Select as Select
import org.openqa.selenium.StaleElementReferenceException as StaleElementReferenceException
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory

Mobile.startApplication('C:\\Users\\I1675\\Downloads\\Mo_Finas_v1.0.6.23_06Mar_Android _BNPL.apk', true)

Mobile.tap(findTestObject('Object Repository/Split_Pay/android.widget.Button - Know More'), 0)

Mobile.tap(findTestObject('Object Repository/Split_Pay/android.widget.Button - Proceed'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Split_Pay/android.widget.CheckBox'), 10, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Split_Pay/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_2'), 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_3'), 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_4'), 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Accept  Continue_1(1)'), 0)

Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.RadioButton_Emp_Details_Currently_Employed_Yes'), 
			10, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Split_Pay/android.widget.RadioButton_Emp_Details_Currently_Employed_Yes'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Split_Pay/android.widget.RadioButton_Emp_Contractual'), 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button_Emp_Details_Next'), 0, FailureHandling.STOP_ON_FAILURE)
		
Mobile.tap(findTestObject('Split_Pay/android.widget.RadioButton_Type Of Company_Private'), 0)

Mobile.delay(1, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button_Next_Type_Of_Company'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('null'), 'William Rich Ltd', 
    0)

Mobile.pressBack()

Mobile.tap(findTestObject('Split_Pay/android.widget.RadioButton_Industry_Food_Accommodation'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button_Next_Industry'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Split_Pay/android.widget.RadioButton_Accommodation_Sector'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button_Next_Sector'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Split_Pay/android.widget.RadioButton_JobType'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button_Next_Job_Type'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Split_Pay/android.widget.RadioButton_Job_Title'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button_Next_Job_Title'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Split_Pay/android.widget.EditText - Years in Occupation'), '7', 0)

Mobile.delay(1, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button_Next_Years_In_Occupation'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Split_Pay/android.widget.RadioButton_Level_Of_Edu'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button_Next_Level_of_Edu'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Split_Pay/android.widget.EditText - 0.0_Basic_Income'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Split_Pay/android.widget.EditText - 0.0_Basic_Income'), '10000', 0)

Mobile.clearText(findTestObject('Split_Pay/android.widget.EditText - 0.0_Fixed_Allowance'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Split_Pay/android.widget.EditText - 0.0_Fixed_Allowance'), '200', 0)

Mobile.clearText(findTestObject('Split_Pay/android.widget.EditText - 0.0_Variable_Allowance'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Split_Pay/android.widget.EditText - 0.0_Variable_Allowance'), '400', 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Proceed_Monthly_Income'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Split_Pay/android.widget.TextView - Upload_Salary_Slip'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Split_Pay/android.widget.TextView - Upload PDF_Salary_Slip'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(172, 684, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - Proceed_Salary_Slip'), 10, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Proceed_Salary_Slip'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Split_Pay/android.widget.RadioButton_PEP_Not_Applicable'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Expense-Rent(If any)')

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Confirm_Confirm_Application'), 0, FailureHandling.STOP_ON_FAILURE)

