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

WebUI.navigateToUrl('https://cim-operations-uat.m2pfintech.com/signin')

WebUI.setText(findTestObject('Page_Operations Dashboard/input_Email Address_email'), 'pratik.jain@m2pfintech.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/input_Password_password'), 
    'cvW8qx4B2o1WegCEDy41Xg==')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/button_Login'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/button_New Merchant'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/div_Select'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/div_Sole Trader'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/a_Submit'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/div_Primary Contact_mat-select-trigger ng-t_e4ed5c'))

WebUI.waitForElementVisible(findTestObject('Page_Operations Dashboard/span_Owner'), 15)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/span_Owner'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/div_Title'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/span_MR'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/input_Title_name'), 
    'Primary')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/input__email'), 'visakh.v2@indiumsoft.com')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/input__phone_number'), 
    '54109569')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/div__mat-select-arrow ng-tns-c90-10'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/span_230'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/input__address_line'), 
    'fasfsdff')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/div__mat-select-value-7'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/span_PORT LOUIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/div__mat-select-value-9'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/span_CASSIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/div__mat-select-value-11'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/span_CASSIS 1'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/div__mat-select-value-13'))

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/span_Mauritius'), 5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/span_Mauritius'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/button_Save'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/div_P'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/button_Logout'))

WebUI.waitForElementVisible(findTestObject('Page_Operations Dashboard/button_Logout'), 15)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Login/Page_Operations Dashboard/button_Logout'))

