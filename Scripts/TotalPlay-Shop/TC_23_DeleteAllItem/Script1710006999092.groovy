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
 
WebUI.callTestCase(findTestCase('TotalPlay-Shop/TC_1_InterfaceLogin'), [:], FailureHandling.STOP_ON_FAILURE)
 
AddToCart = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Cart/AddProductToBasket', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID
	, ('basketID') : GlobalVariable.basketID]))
 
DeleteAllItem_Response  = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Cart/Delete All items from Basket', [('URL') : GlobalVariable.URL
			, ('SITEID') : GlobalVariable.SITEID, ('basketID') : GlobalVariable.basketID]))
 
WS.verifyResponseStatusCode(DeleteAllItem_Response,200)
 
agent_basket = 'agent_basket'
basket_id = 'basket_id'
channel_type = 'channel_type'
creation_date =  'creation_date'
currency = 'currency'
customer_id = 'customer_info.customer_id'
customer_no = 'customer_info.customer_no'
email = 'customer_info.email'
last_modified = 'last_modified'
link = 'notes.link'
order_total = 'order_total'
 
 
product_sub_total = 'product_sub_total'
product_total = 'product_total'
 
 
 
 
shipment_id = 'shipments[0].shipment_id'
shipment_total = 'shipments[0].shipment_total'
shipping_method_type = 'shipments[0].shipping_method._type'
shipping_method_id = 'shipments[0].shipping_method.id'
shipping_method_name = 'shipments[0].shipping_method.name'
c_storePickupEnabled = 'shipments[0].shipping_method.c_storePickupEnabled'
shipping_status = 'shipments[0].shipping_status'
shipping_total = 'shipments[0].shipping_total'
shipping_total_tax = 'shipments[0].shipping_total_tax'
shipping_items_item_id = 'shipping_items[0].item_id'
shipping_items_item_text = 'shipping_items[0].item_text'
 
price = 'shipping_items[0].price'
price_after_item_discount = 'shipping_items[0].price_after_item_discount'
tax_basis = 'shipping_items[0].tax_basis'
tax_class_id = 'shipping_items[0].tax_class_id'
 
c_corporateImgUrl = 'c_corporateImgUrl'
c_isLock = 'c_isLock'
c_lockTime = 'c_lockTime'
c_isMiraklOrder = 'c_isMiraklOrder'
c_miraklShippingZoneCode = 'c_miraklShippingZoneCode'
 
c_seller_id = 'c_seller_id'
c_SellerList_name = 'c_SellerList[0].name'
c_SellerList_corporateImgURL = 'c_SellerList[0].corporateImgURL'
c_SellerList_corporateColorCode = 'c_SellerList[0].corporateColorCode'
c_SellerList_productsCount = 'c_SellerList[0].productsCount'
c_SellerList_productID = 'c_SellerList[0].cartItems[0].productID'
c_SellerList_sellerId = 'c_SellerList[0].cartItems[0].sellerId'
c_SellerList_isOnDemandStoreItem = 'c_SellerList[0].cartItems[0].isOnDemandStoreItem'
c_SellerList_alt = 'c_SellerList[0].cartItems[0].productImage[0].alt'
c_SellerList_url = 'c_SellerList[0].cartItems[0].productImage[0].url'
c_SellerList_title = 'c_SellerList[0].cartItems[0].productImage[0].title'
c_SellerList_quantity = 'c_SellerList[0].cartItems[0].quantity'
c_SellerList_name1 = 'c_SellerList[0].cartItems[0].name'
 
c_preferredAddress = 'c_preferredAddress'
c_corporateColorCode = 'c_corporateColorCode'
c_OnDemandStoreOpenHours = 'c_OnDemandStoreOpenHours'
c_savingsTotal = 'c_savingsTotal'
c_formatedOrderTotal = 'c_formatedOrderTotal'
c_formatedProductTotal = 'c_formatedProductTotal'
 
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(DeleteAllItem_Response, agent_basket)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, agent_basket)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, basket_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, basket_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, channel_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, channel_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, creation_date)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, creation_date)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, currency)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, customer_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, customer_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, customer_no)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, customer_no)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, email)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, email)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, last_modified)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, last_modified)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, link)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject' (DeleteAllItem_Response, order_total)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, order_total)
 
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject' (DeleteAllItem_Response, product_sub_total)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, product_sub_total)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject' (DeleteAllItem_Response, product_total)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, product_total)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, shipment_id)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(DeleteAllItem_Response, shipment_total)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, shipment_total)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, shipping_method_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, shipping_method_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, shipping_method_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, shipping_method_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, shipping_method_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, shipping_method_name)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject' (DeleteAllItem_Response, c_storePickupEnabled)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_storePickupEnabled)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, shipping_status)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, shipping_status)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(DeleteAllItem_Response, shipping_total)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, shipping_total)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject' (DeleteAllItem_Response, shipping_total_tax)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, shipping_total_tax)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, shipping_items_item_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, shipping_items_item_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, shipping_items_item_text)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, shipping_items_item_text)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(DeleteAllItem_Response, price)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, price)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(DeleteAllItem_Response, price_after_item_discount)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, price_after_item_discount)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(DeleteAllItem_Response, tax_basis)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, tax_basis)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, tax_class_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, tax_class_id)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, c_corporateImgUrl)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_corporateImgUrl)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(DeleteAllItem_Response, c_isLock)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_isLock)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, c_lockTime)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_lockTime)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(DeleteAllItem_Response, c_isMiraklOrder)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_isMiraklOrder)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, c_miraklShippingZoneCode)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_miraklShippingZoneCode)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, c_seller_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_seller_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, c_SellerList_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_SellerList_name)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, c_SellerList_corporateImgURL)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_SellerList_corporateImgURL)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, c_SellerList_corporateColorCode)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_SellerList_corporateColorCode)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(DeleteAllItem_Response,c_SellerList_productsCount)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_SellerList_productsCount)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, c_SellerList_productID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_SellerList_productID)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, c_SellerList_sellerId)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_SellerList_sellerId)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(DeleteAllItem_Response, c_SellerList_isOnDemandStoreItem)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_SellerList_isOnDemandStoreItem)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, c_SellerList_alt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_SellerList_alt)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, c_SellerList_url)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_SellerList_url)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, c_SellerList_title)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_SellerList_title)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, c_SellerList_quantity)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_SellerList_quantity)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, c_SellerList_name1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_SellerList_name1)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, c_preferredAddress)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_preferredAddress)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, c_OnDemandStoreOpenHours)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_OnDemandStoreOpenHours)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(DeleteAllItem_Response, c_savingsTotal)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_savingsTotal)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, c_formatedOrderTotal)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_formatedOrderTotal)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, c_formatedProductTotal)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, c_formatedProductTotal)
 
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(DeleteAllItem_Response, billing_address__type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(DeleteAllItem_Response, billing_address__type)
 