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

Mobile.startApplication('C:\\Users\\I1675\\Downloads\\Mo_Finas_v1.0.6.23_15May2024 (uatRelease).apk', false)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.RelativeLayout'), 0)

WebUI.delay(8, FailureHandling.OPTIONAL)

Mobile.scrollToText('Let’s Get Started')

Mobile.tap(findTestObject('Object Repository/Start Page/android.widget.Button - Lets Get Started'), 0)

Mobile.tap(findTestObject('Start Page/android.widget.Button - Accept_Continue'), 0)

Mobile.tap(findTestObject('Object Repository/Start Page/android.widget.Button - Next'), 0)

Mobile.tap(findTestObject('Start Page/android.widget.Button - Next_1'), 0)

Mobile.tap(findTestObject('Start Page/android.widget.Button-Continue(1)'), 0)

Mobile.delay(4, FailureHandling.OPTIONAL)

