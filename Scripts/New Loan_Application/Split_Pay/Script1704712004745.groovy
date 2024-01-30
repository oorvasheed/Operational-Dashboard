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

Mobile.tap(findTestObject('Object Repository/Split_Pay/android.widget.Button - Know More'), 0)

Mobile.tap(findTestObject('Object Repository/Split_Pay/android.widget.Button - Proceed'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Split_Pay/android.widget.CheckBox'), 10, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Split_Pay/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_2'), 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_3'), 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_4'), 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Accept  Continue_1(1)'), 0)

Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - Agree_1'), 10, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Agree_1'), 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Get Started'), 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Agree_2'), 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.Image - rightDirectionArrow'), 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Continue'), 0)

Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - No file chosen'), 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - No file chosen'), 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.ImageView-Gallery'), 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.TextView - Download'), 0)

Mobile.tapAtPosition(44, 257)

Mobile.delay(10, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Split_Pay/android.widget.ImageView_Ticke'), 0)

Mobile.delay(5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Proceed (2)'), 0)

Mobile.delay(7, FailureHandling.OPTIONAL)

