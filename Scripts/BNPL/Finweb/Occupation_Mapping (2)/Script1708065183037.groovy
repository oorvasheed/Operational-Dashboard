import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.nio.channels.SelectableChannel as SelectableChannel
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.console.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByXPath as ByXPath
import org.openqa.selenium.StaleElementReferenceException as StaleElementReferenceException
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cim-uat.finflux.io/sign-in?redirectURL=%2Fleads')

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Version uat-24.01.01-01 b8eec48_username'), 
    'navishas')

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Username_password'), 'Admin@1234')

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/button_Sign in'))

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Reports_mat-button-wrapper'), 
    5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Reports_mat-button-wrapper'))

WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/div_Loan Application'))

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/input_BNPLCC_mat-input-19'), '000000000003130')

WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Search'))

WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Navigate To Loan Application'))

WebUI.delay(4, FailureHandling.OPTIONAL)

//WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Edit_Emp_Details'))
WebDriver driver = DriverFactory.getWebDriver()

Object excelData = ExcelFactory.getExcelDataWithDefaultSheet('C:/Users/I1675/Downloads/Occupation_Mapping.xlsx', 'Sheet1', 
    true)

//change the path when its run in another local system
for (int row = 1; row <= excelData.getRowNumbers(); row++) {
    
	String occType = excelData.getValue('Occupation_Type', row)
	
	String businessType = excelData.getValue('Business_Type', row)

    String empType = excelData.getValue('Employer_Type', row)

    String indType = excelData.getValue('Industry_Type', row)

    String secType = excelData.getValue('Sector_Type', row)

    String jobType = excelData.getValue('Job_Type', row)

    String jobTitles = excelData.getValue('Job_Titles', row)

    try {
        
		WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'), 
            10, FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'), 
            FailureHandling.OPTIONAL)

        WebUI.delay(2)

        List<WebElement> options = driver.findElements(By.xpath('/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span'))

        boolean occFound = false

        for (WebElement option : options) {
            if (option.getText().contains(occType)) {
                option.click()

                occFound = true

                System.out.println(('Success: Occupation \'' + occType) + '\' is selected')

                break
            }
        }
        
        WebUI.delay(2)

        WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Business_Type_Select'))
		
		List<WebElement> options0 = driver.findElements(By.xpath('/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span'))
		
		boolean bustypeFound = false
		
		for(WebElement option0 : options0) {
			if(option0.getText().contains(businessType)) {
				option0.click()
				bustypeFound = true
				System.out.println(('Success: Business Type \'' + businessType) + '\' is selected')
				break
			}
		}

        WebUI.delay(2)

        WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Employer_Select'), FailureHandling.OPTIONAL)

        List<WebElement> options1 = driver.findElements(By.xpath('/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span'))

        boolean empFound = false

        for (WebElement option1 : options1) {
            if (option1.getText().contains(empType)) {
                    ((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option1)

                option1.click()

                empFound = true

                System.out.println(('Success: Employer \'' + empType) + '\' is selected')

                break
            }
        }
        
        if (!(empFound)) {
            
			System.out.println(('Error: emp \'' + empType) + '\' not found in Employer Type dropdown')
        }
        
        WebUI.delay(2)

        WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Industry_select'), FailureHandling.OPTIONAL)

        WebUI.delay(2)

        List<WebElement> options2 = driver.findElements(By.xpath('/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span'))

        boolean indFound = false

        for (WebElement option2 : options2) {
            if (option2.getText().contains(indType)) {
                    ((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option2)

                option2.click()

                indFound = true

                System.out.println(('Success: Industry \'' + indType) + '\' is selected')

                break
            }
        }
        
        if (!(indFound)) {
            System.out.println(('Error: Industry \'' + indType) + '\' not found in Industry Type dropdown')
        }
        
        WebUI.delay(2)

        WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Sector_Arrow_Select'))

        WebUI.delay(2)

        List<WebElement> options3 = driver.findElements(By.xpath('/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span'))

        boolean sectorFound = false

        for (WebElement option3 : options3) {
            if (option3.getText().contains(secType)) {
                    ((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option3)

                option3.click()

                sectorFound = true

                System.out.println(('Success: Sector \'' + secType) + '\' is selected')

                break
            }
        }
        
        if (!(sectorFound)) {
            System.out.println(('Error: Sector \'' + secType) + '\' not found in Sector Type dropdown')
        }
        
        WebUI.delay(2)

        WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Job_Type_Select'))

        List<WebElement> options4 = driver.findElements(By.xpath('/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span'))

        boolean jobFound = false

        for (WebElement option4 : options4) {
            if (option4.getText().contains(jobType)) {
                    ((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option4)

                option4.click()

                jobFound = true

                System.out.println(('Success: JobType \'' + jobType) + '\' is selected')

                break
            }
        }
        
        if (!(indFound)) {
            System.out.println(('Error: JobType \'' + jobType) + '\' not found in Job Type dropdown')
        }
        
        WebUI.delay(2)

        WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Job_Titles_Select'))

        List<WebElement> options5 = driver.findElements(By.xpath('/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span'))

        boolean jobtitleFound = false

        for (WebElement option5 : options5) {
            if (option5.getText().contains(jobTitles)) {
                    ((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option5)

                option5.click()

                jobtitleFound = true

                System.out.println(('Success: JobTitle \'' + jobTitles) + '\' is selected')

                //WebUI.refresh()

                break
            }
        }
        
        if (!(jobtitleFound)) {
            System.out.println(('Error: JobTitles \'' + jobTitles) + '\' not found in Job Title dropdown')
        } 
		
		
		/*   WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Employer_Select'))

            WebUI.delay(2, FailureHandling.OPTIONAL)

            List<WebElement> options2 = driver.findElements(By.xpath("//div[@class='cdk-overlay-pane']/div/div"))

            for (WebElement option1 : options2) {
                if (option1.getText().contains(employerType)) {
                    option1.click()

                    option1Found = true

                    WebUI.delay(2, FailureHandling.OPTIONAL)

                    System.out.println(('Success: Company \'' + employerType) + '\' is selected')

                    WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/span_Job Type'), 
                        0)

                    break;
                    
                    WebUI.delay(2, FailureHandling.OPTIONAL)
                }
            }
            
            WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Industry_select'))

            WebUI.delay(2, FailureHandling.OPTIONAL)

            List<WebElement> options3 = driver.findElements(By.xpath("//div[@class='cdk-overlay-pane']/div/div"))

            for (WebElement option2 : options3) {
                if (option2.getText().contains(industryType)) {
                    option2.click()

                    option2Found = true

                    WebUI.delay(2, FailureHandling.OPTIONAL)

                    System.out.println(('Success: Industry \'' + industryType) + '\' is selected')

                    WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/span_Job Type'), 
                        0)

                    break;
                }
            } 
            /*
			/* WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_Employm_Detail'))

                    WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Rs_mat-input-6_Basic_Inc'), 
                        '12000')

                    WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/Variable Allowance'), 
                        0)

                    WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_income_Details'), 
                        5, FailureHandling.OPTIONAL)

                    WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_income_Details'))

                    WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_Exp_Details'), 
                        5)

                    WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_Exp_Details'))

                    WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/mat-label_Upload new document_Emp_Details'), 
                        0)

                    WebUI.delay(2, FailureHandling.OPTIONAL)

                    WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Supported formats .png, .jpg, .jpeg, .pdf (Max. 5 MB)'), 
                        0)

                    WebUI.delay(2, FailureHandling.OPTIONAL)

                    WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/p_Select from uploaded documents_Emp_Details'), 
                        0)

                    WebUI.delay(2, FailureHandling.OPTIONAL)

                    WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Drag And Drop Files Here_Empy_Details'), 
                        0)

                    WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Save'), 
                        5, FailureHandling.OPTIONAL)

                    WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Save'))

                    WebUI.delay(10, FailureHandling.OPTIONAL)

                    WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Activity Complete_Emp_Details'))

                    WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Skip Task (1)'), 
                        5, FailureHandling.OPTIONAL)

                    WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Skip Task (1)'))

                    WebUI.delay(3, FailureHandling.OPTIONAL)

                    WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_MCIBArrears'), 
                        0)

                    WebUI.delay(2, FailureHandling.OPTIONAL)

                    WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_CustomerType'), 
                        0)

                    WebUI.delay(2, FailureHandling.OPTIONAL)

                    WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_intercept'), 
                        0)

                    WebUI.delay(2, FailureHandling.OPTIONAL)

                    WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_RentalIncome'), 
                        0)

                    WebUI.delay(2, FailureHandling.OPTIONAL)

                    WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_fixedAlowance'), 
                        0)

                    WebUI.delay(2, FailureHandling.OPTIONAL)

                    WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_business'), 
                        0)

                    WebUI.delay(2, FailureHandling.OPTIONAL)

                    WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_count'), 
                        0)

                    WebUI.delay(2, FailureHandling.OPTIONAL)

                    String occupationCode = WebUI.getText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_OccupationCod'), 
                        FailureHandling.STOP_ON_FAILURE)

                    System.out.println('The Occupation Code is: ' + occupationCode)
					*/
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

