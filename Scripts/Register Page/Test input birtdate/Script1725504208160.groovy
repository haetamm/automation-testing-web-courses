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

//WebUI.sendKeys(findTestObject('Register Page/birthdate/input birthdate'), '12/09/2024') // gogle chrome
WebUI.setText(findTestObject('Register Page/birthdate/input birthdate'), '2024-09-12') // firefox


//WebUI.sendKeys(findTestObject('Register Page/birthdate/input birthdate'), '2024-12-09')
WebUI.verifyElementText(findTestObject('Register Page/birthdate/error the minimum age to register is 5 years'), 'The minimum age to register is 5 years.')

//WebUI.sendKeys(findTestObject('Register Page/birthdate/input birthdate'), '12/11/1997') // google chrome 
WebUI.setText(findTestObject('Register Page/birthdate/input birthdate'), '1996-12-11') // firefox


