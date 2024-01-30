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

WebUI.navigateToUrl('https://cim-uat.finflux.io/sign-in?redirectURL=%2Fleads')

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Version uat-24.01.01-01 b8eec48_username'), 
    'navishas')

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Username_password'), 'Admin@123')

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Add New Lead'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_Register for BNPL'))

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Get Details From_firstName'), 
    'VQaTest')

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Middle Name_mat-input-5'), 'tester')

WebUI.scrollToElement(findTestObject('Finweb_Windows/Page_Finweb - Brancho/span_Gender'), 0)

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_Last Name_mat-select-arrow ng-tns-c88-21'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Male'))

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Gender_mat-input-6'), '51980254')

WebUI.scrollToElement(findTestObject('Finweb_Windows/Page_Finweb - Brancho/span_DOB'), 0)

WebUI.setText(findTestObject('Finweb_Windows/Page_Finweb - Brancho/input_Email_mat-input-8'), '11 Jul 1982')

WebUI.click(findTestObject('Finweb_Windows/Page_Finweb - Brancho/div_Marital Status'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Married'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Email_mat-input-8'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_Marital Status_mat-select-arrow ng-tns-c88-28'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_NIC'))

WebUI.setText(findTestObject('Finweb_Windows/Page_Finweb - Brancho/input_Identifier Selection_mat-input-9'), 'R1106824600386')

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Create Lead'))

WebUI.delay(8, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Finweb_Windows/Page_Finweb - Brancho/div_NAVISHA SUKURDEEP (RAMSOKUL)'), FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('BNPL/Finweb/Workflow_Stage'), [:], FailureHandling.STOP_ON_FAILURE)

