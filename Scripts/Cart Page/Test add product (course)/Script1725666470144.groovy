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
String titleProduct1_Home = WebUI.getText(findTestObject('Object Repository/Home Page/Card Product/title product1'))

WebUI.click(findTestObject('Object Repository/Home Page/Card Product/button add cart'))

//String titleProduct2_Home = WebUI.getText(findTestObject('Object Repository/Home Page/Card Product/title product2'))
//WebUI.click(findTestObject('Object Repository/Home Page/Card Product/button add cart'))

//String titleProduct3_Home = WebUI.getText(findTestObject('Object Repository/Home Page/Card Product/title product3'))
//WebUI.click(findTestObject('Object Repository/Home Page/Card Product/button add cart'))

// Verifikasi jumlah produk di notifikasi keranjang
WebUI.verifyElementText(findTestObject('Home Page/notif cart'), '1')

// Buka halaman Cart Page
WebUI.click(findTestObject('Object Repository/Home Page/notif cart'))

// Tangkap judul produk dari Cart Page dan verifikasi dengan judul produk di Home Page
String titleProduct1_Cart = WebUI.getText(findTestObject('Cart Page/Product List/title product1'))

WebUI.verifyMatch(titleProduct1_Cart, titleProduct1_Home, false)

