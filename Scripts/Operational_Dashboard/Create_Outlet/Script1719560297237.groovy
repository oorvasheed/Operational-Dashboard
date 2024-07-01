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

WebUI.navigateToUrl('https://cim-operations-uat.m2pfintech.com/merchant-detail/workflow/ROqnRqxg7c')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_New Merchant'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Outlet'))

WebUI.setText(findTestObject('Page_Operations Dashboard/input_Parent Merchant ID_rc_select_1'), 'gamm')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_GAMM corp  -  EsHmFC1wHC'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/a_Submit'))

WebUI.waitForElementPresent(findTestObject('Page_Operations Dashboard/div_Primary Contact Details ( Outlet )_mat-_f8dc78'), 
    10)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Primary Contact Details ( Outlet )_mat-_f8dc78'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Owner'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Merchant Representative_mat-select-value-3'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Title_name'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Title_name'), 
    Name)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__email'), 
    Email)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__phone_number'), 
    '56719110')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__mat-select-value-5'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_230'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__address_line'), 
    'fsafdfa')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__mat-select-value-7'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_PORT LOUIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__mat-select-value-9'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_CASSIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__mat-select-value-11'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_CASSIS 1'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__mat-select-value-13'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Mauritius'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Next Steps'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Outlet Details_mat-select-value-15'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Face To Face'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__business_name'), 
    'bakers choice')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__doing_business_as'), 
    '51623899001881')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__gst_address_line_1'), 
    'fasfdsfd')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__mat-select-value-17'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_PORT LOUIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__mat-select-value-19'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_CASSIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__mat-select-value-21'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_CASSIS 1'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__goods_and_services_description'), 
    'packers and movers')

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/span_Nature of Business (As per BRN)_1'), 5)

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/span_Min Transaction Value'), 5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Next Steps'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Settlement Bank Details_mat-select-value-25'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_ABC BANKING CORPORATION'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__acc_no'), 
    '2786544542')

WebUI.setEncryptedText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__reEnter_acc_no'), 
    'AliWARMYmU+bi2fW8/HXfw==')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__acc_holder_name'), 
    'sardhar')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Branch_mat-select-value-27'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_MUR'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Next Steps'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Add New Document'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Add New Identifier_mat-select-value-29'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Business Registration Card'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Documents Outlet_ID Number'), 
    'card')

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/div_Drag And Drop Files Here'), 5)

WebUI.uploadFile(findTestObject('Page_Operations Dashboard/button_Upload File'), 'C:\\Users\\I1675\\Downloads\\dummy (1).pdf')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Next Steps'))

