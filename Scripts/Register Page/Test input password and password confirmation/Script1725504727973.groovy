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

WebUI.setText(findTestObject('Object Repository/Register Page/password and password confirmation/input password'), '        ')

WebUI.verifyElementText(findTestObject('Object Repository/Register Page/password and password confirmation/error invalid password format'), 
    'The Password must have at least 8 characters, including one uppercase letter, one number, and one special character.')

WebUI.setText(findTestObject('Object Repository/Register Page/password and password confirmation/input password'), 'P_1psd')

WebUI.verifyElementText(findTestObject('Object Repository/Register Page/password and password confirmation/error invalid password format'), 
    'The Password must have at least 8 characters, including one uppercase letter, one number, and one special character.')

WebUI.setText(findTestObject('Object Repository/Register Page/password and password confirmation/input password'), 'Password_123')

WebUI.setText(findTestObject('Object Repository/Register Page/password and password confirmation/input confirmation password'), 
    'Password_1234')

WebUI.verifyElementText(findTestObject('Object Repository/Register Page/password and password confirmation/error confirm password dont match'), 
    'Confirm Password must match the password field.')

WebUI.setText(findTestObject('Object Repository/Register Page/password and password confirmation/input confirmation password'), 
    'Password_123')

