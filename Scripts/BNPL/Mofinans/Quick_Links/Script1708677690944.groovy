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

Mobile.startApplication('C:\\Users\\I1675\\Downloads\\DKYCMo_Finas_v1.0.6.23_27Dec2023 (uatRelease).apk', true)

Mobile.tap(findTestObject('Object Repository/BNPL/android.widget.TextView - Manage Bank Account'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/BNPL/android.widget.ImageView'), 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/BNPL/android.widget.ImageView'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/BNPL/android.widget.TextView - Quick Pay'), 5)

Mobile.tap(findTestObject('Object Repository/BNPL/android.widget.TextView - Quick Pay'), 0)

Mobile.tap(findTestObject('Object Repository/BNPL/android.widget.TextView - View Details'), 0)

Mobile.tap(findTestObject('Object Repository/BNPL/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/BNPL/android.widget.TextView - Dashboard'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/BNPL/android.widget.TextView - Payment History'), 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/BNPL/android.widget.TextView - Payment History'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/BNPL/android.widget.ImageView'), 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/BNPL/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('BNPL/android.widget.TextView - Contact Us'), 0)

Mobile.tap(findTestObject('Object Repository/BNPL/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('BNPL/android.widget.TextView - Letters'), 0)

Mobile.tap(findTestObject('BNPL/android.widget.ImageView-Back'), 0)

Mobile.tap(findTestObject('BNPL/android.widget.TextView - Locate Us'), 0)

Mobile.waitForElementPresent(findTestObject('BNPL/android.widget.ImageView-Back'), 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('BNPL/android.widget.ImageView-Back'), 0)

Mobile.closeApplication()

