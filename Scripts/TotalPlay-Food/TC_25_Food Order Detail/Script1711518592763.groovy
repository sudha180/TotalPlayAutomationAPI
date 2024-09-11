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

FoodOrderHistory = WS.sendRequest(findTestObject('TotalPlay-Food/Food Order History', [('URL') : GlobalVariable.URL]))

WS.verifyResponseStatusCode(FoodOrderHistory, 200)

order_no = 'c_result.orders[0].order_no'

GlobalVariable.OrderNo = WS.getElementPropertyValue(FoodOrderHistory, order_no)

println(GlobalVariable.OrderNo)

FoodOrderDetails = WS.sendRequest(findTestObject('TotalPlay-Food/Food Order Detail', [('URL') : GlobalVariable.URL]))

CustomKeywords.'totalplay.Common.printResponseinText'(FoodOrderDetails)

WS.verifyResponseStatusCode(FoodOrderDetails, 200)

id = 'id'

name = 'name'

c_result = 'c_result'

c_result_order_no = 'c_result.order_no'

c_result_corporate_name = 'c_result.corporate_name'

c_result_creationDate = 'c_result.creationDate'

c_result_totalCost = 'c_result.totalCost'

c_result_shipments = 'c_result.shipments'

c_result_productCost = 'c_result.productCost'

c_result_customerEmail = 'c_result.customerEmail'

c_result_c_formatedShippingTotalGrossPrice = 'c_result.c_formatedShippingTotalGrossPrice'

c_result_status = 'c_result.status'

c_result_order_total = 'c_result.order_total'

c_result_c_shipmentNote = 'c_result.c_shipmentNote'

c_result_c_serviceCharge = 'c_result.c_serviceCharge'

c_result_c_formatedServiceCharge = 'c_result.c_formatedServiceCharge'

c_result_c_savingsTotal = 'c_result.c_savingsTotal'

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory, id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory, name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodOrderHistory, c_result)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory, c_result_order_no)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory, c_result_corporate_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory, c_result_creationDate)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory, c_result_totalCost)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory, c_result_shipments)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory, c_result_productCost)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory, c_result_customerEmail)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory, c_result_c_formatedShippingTotalGrossPrice)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory, c_result_status)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory, c_result_order_total)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory, c_result_c_shipmentNote)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory, c_result_c_serviceCharge)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory, c_result_c_formatedServiceCharge)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory, c_result_c_savingsTotal)


