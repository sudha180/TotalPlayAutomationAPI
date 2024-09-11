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

WebUI.callTestCase(findTestCase('TotalPlay-Food/TC_1_Login_Service'), [:], FailureHandling.STOP_ON_FAILURE)

AddProductbasket = WS.sendRequest(findTestObject('TotalPlay-Food/AddProductToBasket', [('URL') : GlobalVariable.URL, ('basketID') : GlobalVariable.basketID]))

WS.verifyResponseStatusCode(AddProductbasket, 200)

getAddress = WS.sendRequest(findTestObject('TotalPlay-Food/GetAddresses', [('URL') : GlobalVariable.URL, ('sla_customerId') : GlobalVariable.sla_customerId
            , ('shop_auth_token') : GlobalVariable.shop_auth_token]))

WS.verifyResponseStatusCode(getAddress, 200)

AddAddressToCart = WS.sendRequest(findTestObject('TotalPlay-Food/add address to cart', [('URL') : GlobalVariable.URL, ('basketID') : GlobalVariable.basketID]))

WS.verifyResponseStatusCode(AddAddressToCart, 200)

SetPayment_instruments = WS.sendRequest(findTestObject('TotalPlay-Food/SetPayment_instruments - Credit Card', [('URL') : GlobalVariable.URL
            , ('basketID') : GlobalVariable.FoodBasketId, ('shop_auth_token') : GlobalVariable.shop_auth_token, ('orderTotal') : GlobalVariable.orderTotal]))

WS.verifyResponseStatusCode(SetPayment_instruments, 200)

PreAuth = WS.sendRequest(findTestObject('TotalPlay-Food/Pre-Auth', [('URL') : GlobalVariable.URL, ('basketID') : GlobalVariable.basketID]))

WS.verifyResponseStatusCode(PreAuth, 200)

shipmentID = '[0].shipmentID'

paymentStatus = '[0].paymentStatus'

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PreAuth, shipmentID)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PreAuth, shipmentID)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PreAuth, paymentStatus)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PreAuth, paymentStatus)

