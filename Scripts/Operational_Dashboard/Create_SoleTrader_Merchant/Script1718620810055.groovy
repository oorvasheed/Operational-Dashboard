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

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/button_New Merchant'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_Sole Trader'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div_Sole Trader'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/a_Submit'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div_Primary Contact_mat-select-arrow ng-tns-c90-3'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_Owner'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div_Merchant Representative_mat-select-arro_1c7c35'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_MR'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/input_Title_name'), 
    'Primary')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/input__email'), 
    'visakh.v2@indiumsoft.com')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/input__phone_number'), 
    '54321230')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div__mat-select-arrow ng-tns-c90-10'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_230'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/input__address_line'), 
    'fdsafs')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div__mat-select-arrow ng-tns-c90-13'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_PORT LOUIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div__mat-select-trigger ng-tns-c90-15'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_CASSIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div__mat-select-value-11'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_CASSIS 1'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div__mat-select-value-13'))

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/span_Mauritius'), 5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_Mauritius'))

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/button_Save'), 5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/button_Save'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/button_Next Steps'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/input_Business Details_business_name'), 
    'bakers choice')

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/span_Locality'), 5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div__mat-select-value-15'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_Individual'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/input__gst'), 
    'N1278493021234')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/input_VAT Registration Number_gst_address_line_1'), 
    'dsafsdfsaf')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div_District'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_PORT LOUIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_CASSIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div__mat-select-value-21'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_CASSIS 1'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div__mat-select-value-23'))

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/span_Mauritius'), 0)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_Mauritius'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/button_Save'))

WebUI.delay(10)

WebUI.click(findTestObject('Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/button_Next Steps_Business_Details'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div_Business Contact Details_mat-select-value-25'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_Owner'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/input_Title_name'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/input_Title_name'), 
    'cakesbiscuits')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/input__last_name'), 
    'V')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div_Phone Number_mat-select-trigger ng-tns-c90-83'))

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/span_Mauritius'), 5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_Mauritius'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/input_Email_residential_address_line_1'), 
    'fsad')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div_District'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_PORT LOUIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div__mat-select-value-33'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_CASSIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div__mat-select-value-35'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_CASSIS 1'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/button_Save'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/button_Next Steps_Business_Contact_details'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div_Settlement Bank Details_mat-select-value-39'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_ABC BANKING CORPORATION'))

WebUI.sendKeys(findTestObject('Page_Operations Dashboard/input__acc_no'), '2786544542')

WebUI.sendKeys(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/input__reEnter_acc_no'), 
    '2786544542')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/input__acc_holder_name'), 
    'sardhar')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div_Branch_mat-select-value-15'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_MUR'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/button_Save_Settlement_Bank_Details'))

WebUI.delay(5)

WebUI.click(findTestObject('Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/button_Next Steps_Settlement_Bank_Details'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/button_Add New Document'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div_Add New Identifier_mat-select-value-3'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_Business Registration Card'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_Documents Sole Trader'))

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/h2_Add New Identifier'), 5)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/input_Documents Sole Trader_ID Number'), 
    'card')

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/div_Drag And Drop Files Here'), 0)

WebUI.uploadFile(findTestObject('Page_Operations Dashboard/button_Upload File'), 'C:\\Users\\I1675\\Downloads\\dummy.pdf')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/button_Save_Business_Document'))

WebUI.delay(5)

WebUI.click(findTestObject('Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/button_Next Steps_Business_Documents'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/button_Add New Document_KYC'))

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/div_Add New Identifier_mat-select-trigger n_1df9e8'), 5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div_Add New Identifier_mat-select-trigger n_1df9e8'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_Identity Documents'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div_Documents - KYC - Sole Trader_mat-selec_8dbf92'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_National Identity Card'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div_Documents - KYC - Sole Trader-Sub Type__173058'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/span_National ID - Recto'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/input_Documents - KYC - Sole Trader-Sub Typ_3d47b4'), 
    'NIC')

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/div_Documents'), 5)

WebUI.uploadFile(findTestObject('Page_Operations Dashboard/button_Upload File'), 'C:\\Users\\I1675\\Downloads\\dummy.pdf')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/button_Save_KYC_Document'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/button_Add New Document (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/h2_Add New Identifier_Reviewer_Documents'), 
    0)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div_Add New Identifier_mat-select-value-11'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/mat-option_VAT Certificate'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/input_Documents - Additional_ID Number'), 
    'VAT')

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/div_Documents_Reviewer_Document'), 
    0)

WebUI.uploadFile(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/button_Upload File_Reviewer_Document'), 
    'C:\\Users\\I1675\\Downloads\\dummy.pdf')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/button_Save_Reviewer_Document'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Merchant/Page_Operations Dashboard/button_Submit For Review'))

