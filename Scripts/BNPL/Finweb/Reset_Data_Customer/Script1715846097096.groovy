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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cim-uat.finflux.io/leads')

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Customer/Page_Finweb - Brancho/span_Customers'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Customer/Page_Finweb - Brancho/p_JAYSON RUNGASAMY'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Customer/Page_Finweb - Brancho/span_Add_mat-expansion-indicator ng-tns-c20_5a259f'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Customer/Page_Finweb - Brancho/svg'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Customer/Page_Finweb - Brancho/button_Delete'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Customer/Page_Finweb - Brancho/mat-icon_more_vert'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Customer/Page_Finweb - Brancho/button_Update'))

WebUI.clearText(findTestObject('Object Repository/Finweb_Windows/Customer/Page_Finweb - Brancho/input_Old Mobile Number 55003006_mobileNumber'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Customer/Page_Finweb - Brancho/input_Old Mobile Number 55003006_mobileNumber'), 
    '55003001')

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Customer/Page_Finweb - Brancho/span_Update'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Customer/Page_Finweb - Brancho/span_Close'))

