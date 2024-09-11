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

AddProductToBAsket = WS.sendRequest(findTestObject('TotalPlay-Food/AddProductToBasket', [('URL') : GlobalVariable.URL, ('basketID') : GlobalVariable.basketID]))

WS.verifyResponseStatusCode(AddProductToBAsket, 200)

product_productItemId = 'product.productItemId'
GlobalVariable.Item_id = WS.getElementPropertyValue(AddProductToBAsket, product_productItemId) 
println(GlobalVariable.Item_id )
UpdateQuantityItemInACart = WS.sendRequest(findTestObject('TotalPlay-Food/UPDATE QUANTITY ITEM IN A CART', [('URL') : GlobalVariable.URL
            , ('FoodBasketId') : GlobalVariable.FoodBasketId, ('Item_id') : GlobalVariable.Item_id]))
CustomKeywords.'totalplay.Common.printResponseinText'(UpdateQuantityItemInACart)
WS.verifyResponseStatusCode(UpdateQuantityItemInACart, 200)

product_items_item_id = 'product_items[0].item_id'

product_items_quantity = 'product_items[0].quantity'

String item_id = WS.getElementPropertyValue(UpdateQuantityItemInACart, product_items_item_id)

String quantity = WS.getElementPropertyValue(UpdateQuantityItemInACart, product_items_quantity)

if ((GlobalVariable.Item_id == item_id) && (quantity == '1')) {
    println('Quantity Updated')
} else {
    println('Quantity Not Updated')
}

