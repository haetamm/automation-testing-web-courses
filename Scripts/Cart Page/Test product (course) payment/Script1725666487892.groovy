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

WebUI.click(findTestObject('Cart Page/Product List/input select product1'))

WebUI.verifyElementText(findTestObject('Cart Page/Order Detail/qty order detail'), '1')

WebUI.click(findTestObject('Cart Page/Product List/input select all'))

WebUI.verifyElementText(findTestObject('Cart Page/Order Detail/qty order detail'), '3')

//String priceProduct1Text = WebUI.getText(findTestObject('Cart Page/Product List/price product1'))
//
//String priceProduct2Text = WebUI.getText(findTestObject('Cart Page/Product List/price product2'))
//
//String priceProduct3Text = WebUI.getText(findTestObject('Cart Page/Product List/price product3'))
//
//WebUI.comment('Price Product 1: ' + priceProduct1Text)
//
//WebUI.comment('Price Product 2: ' + priceProduct2Text)
//
//WebUI.comment('Price Product 3: ' + priceProduct3Text)
//
//double priceProduct1 = convertPrice(priceProduct1Text)
//
//double priceProduct2 = convertPrice(priceProduct2Text)
//
//double priceProduct3 = convertPrice(priceProduct3Text)
//
//double expectedTotalPrice = (priceProduct1 + priceProduct2) + priceProduct3
//
//String totalPriceText = WebUI.getText(findTestObject('Cart Page/Order Detail/total price'))
//
//double actualTotalPrice = convertPrice(totalPriceText)
//
//WebUI.verifyEqual(actualTotalPrice, expectedTotalPrice ) 

WebUI.click(findTestObject('Cart Page/Order Detail/button checkout'))

WebUI.click(findTestObject('Cart Page/button payment'))

WebUI.delay(5)

WebUI.switchToWindowIndex(1)

String currentUrl = WebUI.getUrl()

boolean isCorrectUrl = WebUI.verifyMatch(currentUrl, 'https://app.sandbox.midtrans.com/snap/v4/.*', true)

if (isCorrectUrl) {
    println('Successfully redirected to Midtrans')
} else {
    println('Failed')
}


//double convertPrice(String priceText) {
//	if (priceText == null || priceText.trim().isEmpty()) {
//		throw new IllegalArgumentException("Harga produk tidak boleh kosong.");
//	}
//	
//	// Menghapus "Rp", tanda titik (.) dan koma (,)
//	return Double.parseDouble(priceText.replaceAll("[Rp,.]", "").trim());
//}

