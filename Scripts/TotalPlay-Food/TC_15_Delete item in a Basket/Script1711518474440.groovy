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

AddProductToBAsket = WS.sendRequest(findTestObject('TotalPlay-Food/Food_Add to cart', [('URL') : GlobalVariable.URL, ('basketID') : GlobalVariable.basketID, ('SellerId1') : GlobalVariable.SellerId1]))

CustomKeywords.'totalplay.Common.printResponseinText'(AddProductToBAsket)

WS.verifyResponseStatusCode(AddProductToBAsket, 200)

product_productItemId = 'product_items[0].item_id'

GlobalVariable.Item_id = WS.getElementPropertyValue(AddProductToBAsket, product_productItemId)

println(GlobalVariable.Item_id)

DeleteItem = DeleteItemInBasket = WS.sendRequest(findTestObject('TotalPlay-Food/deleteItemInBasket'))

WS.verifyResponseStatusCode(DeleteItem, 200)

//
//product_items_item_id = 'product_items[0].item_id'
//
//String ItemId = WS.getElementPropertyValue(DeleteItemInBasket, product_items_item_id)
//
//if(GlobalVariable.Item_id == ItemId)
//{
//	println('ItemDeleted')
//}
//else {
//	println('Something Went Wrong')
//}