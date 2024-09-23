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

AddToCart_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Cart/AddProductToBasket', [('URL') : GlobalVariable.URL
            , ('SITEID') : GlobalVariable.SITEID, ('basketID') : GlobalVariable.basketID]))

CustomKeywords.'totalplay.Common.printResponseinText'(AddToCart_Response)

WS.verifyResponseStatusCode(AddToCart_Response, 200)

GlobalVariable.address_id = 'crm_default_address'

UpdateAddress_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Address/Update Customer Address', [('URL') : GlobalVariable.URL
            , ('SITEID') : GlobalVariable.SITEID, ('sla_customerId') : GlobalVariable.sla_customerId]))

CustomKeywords.'totalplay.Common.printResponseinText'(UpdateAddress_Response)

WS.verifyResponseStatusCode(UpdateAddress_Response, 200)

GetAddress = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Address/Get Customer Address', [('URL') : GlobalVariable.URL
            , ('SITEID') : GlobalVariable.SITEID, ('sla_customerId') : GlobalVariable.sla_customerId]))

CustomKeywords.'totalplay.Common.printResponseinText'(GetAddress)

Address_Id = 'data[0].address_id'

String address_id = WS.getElementPropertyValue(GetAddress, Address_Id)

println(address_id)

id = 'data[0].c_crm_address_id'

crmaddress_id = WS.getElementPropertyValue(GetAddress, id)

println(crmaddress_id)

GlobalVariable.crm_address = crmaddress_id

println(GlobalVariable.crm_address)

SetBilling_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Checkout/Set Billing and Shipment', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID
            , ('basketID') : GlobalVariable.basketID]))

CustomKeywords.'totalplay.Common.printResponseinText'(SetBilling_Response)
 
WS.verifyResponseStatusCode(SetBilling_Response, 200)
 
