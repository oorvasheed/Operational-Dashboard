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

WebUI.navigateToUrl('https://www.instagram.com/direct/inbox/')

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Customers'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Add New Customer'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/button_Individual'))

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Basic Information_mat-input-60'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Middle Name_mat-input-62'), 'qa')

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Last Name_mat-input-63'), '1/24/2006')

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_Date Of Birth_mat-select-value-93'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Male (1)'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_Gender_mat-select-value-95'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Married (1)'))

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Marital Status_mat-input-64'), 
    '51209473')

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Identifier Selection_mat-input-68'), 
    'R1106824600386')

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_Would you like to add advance details_m_15add7'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_External ID_mat-select-value-101'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Non-Staff'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_Client Type_mat-select-value-103'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Individual'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_Client Classification_mat-select-value-105'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Hindu'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Create'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Okay'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Add New Lead (1)'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/button_Register for BNPL'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Create Lead (1)'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_Loan Accounts'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_BNPLCC'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Create New Line'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_Charges_mat-select-value-121'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_CIM-BNPL'))

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Rs_mat-input-78'), '2000')

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_The amount must be between 1500 and 5_0a88dd'), 
    '1/24/2024')

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Next'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_Repaid every_mat-select-value-123'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Months'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Based on day'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_Day_mat-select-value-125'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_first'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_first_mat-select-value-127'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Wednesday'))

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Repaid every_mat-input-80'), 
    '2')

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Next'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Based on billing day_mat-radio-outer-circle'))

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Repaid every_mat-input-81'), 
    '2')

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_Repaid every_mat-select-value-129'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Months'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Based on day'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_Day_mat-select-value-131'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_first'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_first_mat-select-value-133'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Wednesday'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Next'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Create_1'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Close'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Add_mat-expansion-indicator ng-tns-c20_198289'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Add_mat-expansion-indicator ng-tns-c20_198289'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Add_mat-expansion-indicator ng-tns-c20_c0097c'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Add_mat-expansion-indicator ng-tns-c20_c0097c'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Risk Factors_mat-expansion-indicator n_11242a'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Risk Factors_mat-expansion-indicator n_11242a'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/button_Add'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_Add New Address_mat-select-value-135'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Residential Address'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Own_mat-radio-outer-circle'))

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Ownership Type is required_mat-input-82'), 
    '2/36 cassis 3')

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Landmark_mat-input-85'), '11305')

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Address line one_mat-input-83'), 
    'cassis 3')

