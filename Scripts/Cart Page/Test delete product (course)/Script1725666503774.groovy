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

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl(GlobalVariable.urlLogin)
//
//WebUI.setText(findTestObject('Login Page/input_email'), GlobalVariable.email)
//
//WebUI.setEncryptedText(findTestObject('Login Page/input_password'), GlobalVariable.password)
//
//WebUI.sendKeys(findTestObject('Login Page/input_password'), Keys.chord(Keys.ENTER))
//
//WebUI.click(findTestObject('Home Page/Card Product/button add cart'))
//
//WebUI.click(findTestObject('Home Page/Card Product/button add to cart2'))
//
//WebUI.click(findTestObject('Home Page/Card Product/button add to cart3'))

WebUI.click(findTestObject('Home Page/notif cart'))

WebUI.click(findTestObject('Cart Page/Product List/delete product1'))

WebUI.verifyElementText(findTestObject('Home Page/notif cart'), '2')

WebUI.click(findTestObject('Cart Page/Product List/delete all'))

WebUI.verifyElementText(findTestObject('Home Page/notif cart'), '0')

WebUI.verifyElementText(findTestObject('Cart Page/Product List/cart is empty'), 'Cart is empty')

WebUI.click(findTestObject('Cart Page/Product List/button back to home'))



