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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
 
WebUI.callTestCase(findTestCase('TotalPlay-Shop/TC_1_InterfaceLogin'), [:], FailureHandling.STOP_ON_FAILURE)
 
AddProduct = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Cart/AddProductToBasket', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID
			, ('basketID') : GlobalVariable.basketID]))
 
GetBasket = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Cart/Get Basket', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID
			, ('basketID') : GlobalVariable.basketID]))
 
item_id = 'product_items[0].item_id'
 
String Item_id = WS.getElementPropertyValue(GetBasket, item_id)
 
KeywordUtil.logInfo(Item_id)
 
GlobalVariable.Item_id = Item_id
 
UpdateItem_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Cart/Update item in cart', [('URL') : GlobalVariable.URL
			, ('SITEID') : GlobalVariable.SITEID, ('basketID') : GlobalVariable.basketID, ('Item_id') : GlobalVariable.Item_id]))
 
WS.verifyResponseStatusCode(UpdateItem_Response, 200)
 
 
agent_basket = 'agent_basket'
 
basket_id = 'basket_id'
 
channel_type = 'channel_type'
 
creation_date = 'creation_date'
 
currency = 'currency'
 
customer_id = 'customer_info.customer_id'
 
customer_no = 'customer_info.customer_no'
 
email = 'customer_info.email'
 
last_modified = 'last_modified'
 
link = 'notes.link'
 
order_total = 'order_total'
 
base_price = 'product_items[0].base_price'
 
bonus_product_line_item = 'product_items[0].bonus_product_line_item'
 
gift = 'product_items[0].gift'
 
inventory_id = 'product_items[0].inventory_id'
 
item_id = 'product_items[0].item_id'
 
item_text = 'product_items[0].item_text'
 
price = 'product_items[0].price'
 
price_after_item_discount = 'product_items[0].price_after_item_discount'
 
price_after_order_discount = 'product_items[0].price_after_order_discount'
 
product_id = 'product_items[0].product_id'
 
product_name = 'product_items[0].product_name'
 
quantity = 'product_items[0].quantity'
 
shipment_id = 'product_items[0].shipment_id'
 
tax_basis = 'product_items[0].tax_basis'
 
tax_class_id = 'product_items[0].tax_class_id'
 
c_fromStoreId = 'product_items[0].c_fromStoreId'
 
c_isOnDemandStoreItem = 'product_items[0].c_isOnDemandStoreItem'
 
c_miraklOperatorProductId = 'product_items[0].c_miraklOperatorProductId'
 
c_offerId = 'product_items[0].c_offerId'
 
c_offerListPrice = 'product_items[0].c_offerListPrice'
 
c_offerSalesPrice = 'product_items[0].c_offerSalesPrice'
 
c_offerState = 'product_items[0].c_offerState'
 
c_offerStateCode = 'product_items[0].c_offerStateCode'
 
alt = 'product_items[0].c_productImage[0].alt'
 
url = 'product_items[0].c_productImage[0].url'
 
title = 'product_items[0].c_productImage[0].title'
 
c_shopId = 'product_items[0].c_shopId'
 
c_shopName = 'product_items[0].c_shopName'
 
c_availableQty = 'product_items[0].c_availableQty'
 
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
 
c_corporateImgUrl = 'c_corporateImgUrl'
 
c_currentCorporate = 'c_currentCorporate'
 
c_currentMultiStoreID = 'c_currentMultiStoreID'
 
c_isLock = 'c_isLock'
 
c_lockTime = 'c_lockTime'
 
c_multiStoreEDD = 'c_multiStoreEDD'
 
c_onDemandEDD = 'c_onDemandEDD'
 
c_seller_id = 'c_seller_id'
 
c_savingsTotal = 'c_savingsTotal'
 
c_SellerList_name = 'c_SellerList[0].name'
 
c_SellerList_corporateImgURL = 'c_SellerList[0].corporateImgURL'
 
c_SellerList_productsCount = 'c_SellerList[0].productsCount'
 
c_SellerList_productID = 'c_SellerList[0].cartItems[0].productID'
 
c_SellerList_sellerId = 'c_SellerList[0].cartItems[0].sellerId'
 
c_SellerList_isOnDemandStoreItem = 'c_SellerList[0].cartItems[0].isOnDemandStoreItem'
 
c_SellerList_alt = 'c_SellerList[0].cartItems[0].productImage[0].alt'
 
c_SellerList_url = 'c_SellerList[0].cartItems[0].productImage[0].url'
 
c_SellerList_title = 'c_SellerList[0].cartItems[0].productImage[0].title'
 
c_SellerList_quantity = 'c_SellerList[0].cartItems[0].quantity'
 
c_SellerList_name1 = 'c_SellerList[0].cartItems[0].name'
 
product_items_0_c_total_crossed_price	=	 'product_items[0].c_total_crossed_price'
product_items_0_c_availableQty	=	 'product_items[0].c_availableQty'
product_sub_total	=	 'product_sub_total'
product_total	=	 'product_total'
shipments_0_adjusted_merchandize_total_tax	=	 'shipments[0].adjusted_merchandize_total_tax'
shipments_0_adjusted_shipping_total_tax	=	 'shipments[0].adjusted_shipping_total_tax'
shipments_0_gift	=	 'shipments[0].gift'
shipments_0_merchandize_total_tax	=	 'shipments[0].merchandize_total_tax'
shipments_0_product_sub_total	=	 'shipments[0].product_sub_total'
shipments_0_product_total	=	 'shipments[0].product_total'
shipments_0_shipment_id	=	 'shipments[0].shipment_id'
shipments_0_shipment_total	=	 'shipments[0].shipment_total'
shipments_0_shipping_method__type	=	 'shipments[0].shipping_method._type'
shipments_0_shipping_method_description	=	 'shipments[0].shipping_method.description'
shipments_0_shipping_method_id	=	 'shipments[0].shipping_method.id'
shipments_0_shipping_method_name	=	 'shipments[0].shipping_method.name'
shipments_0_shipping_method_c_onlinePickupEnabled	=	 'shipments[0].shipping_method.c_onlinePickupEnabled'
shipments_0_shipping_method_c_storePickupEnabled	=	 'shipments[0].shipping_method.c_storePickupEnabled'
shipments_0_shipping_status	=	 'shipments[0].shipping_status'
shipments_0_shipping_total	=	 'shipments[0].shipping_total'
shipments_0_shipping_total_tax	=	 'shipments[0].shipping_total_tax'
shipments_0_tax_total	=	 'shipments[0].tax_total'
shipping_items_0__type	=	 'shipping_items[0]._type'
shipping_items_0_adjusted_tax	=	 'shipping_items[0].adjusted_tax'
shipping_items_0_base_price	=	 'shipping_items[0].base_price'
shipping_items_0_item_id	=	 'shipping_items[0].item_id'
shipping_items_0_item_text	=	 'shipping_items[0].item_text'
shipping_items_0_price	=	 'shipping_items[0].price'
shipping_items_0_price_after_item_discount	=	 'shipping_items[0].price_after_item_discount'
shipping_items_0_shipment_id	=	 'shipping_items[0].shipment_id'
 
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(UpdateItem_Response, agent_basket)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, agent_basket)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, basket_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, basket_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, channel_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, channel_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, creation_date)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, creation_date)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, currency)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, currency)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, customer_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, customer_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, customer_no)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, customer_no)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, email)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, email)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, last_modified)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, last_modified)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, link)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, link)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, order_total)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, order_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, base_price)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, base_price)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(UpdateItem_Response, bonus_product_line_item)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, bonus_product_line_item)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(UpdateItem_Response, gift)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, gift)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, inventory_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, inventory_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, item_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, item_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, item_text)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, item_text)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, price)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, price)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, price_after_item_discount)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, price_after_item_discount)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, price_after_order_discount)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, price_after_order_discount)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, product_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, product_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, product_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, product_name)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(UpdateItem_Response, quantity)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, quantity)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, shipment_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, shipment_id)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, tax_basis)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, tax_basis)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, tax_class_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, tax_class_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_fromStoreId)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_fromStoreId)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(UpdateItem_Response, c_isOnDemandStoreItem)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_isOnDemandStoreItem)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_miraklOperatorProductId)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_miraklOperatorProductId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_offerId)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_offerId)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, c_offerListPrice)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_offerListPrice)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, c_offerSalesPrice)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_offerSalesPrice)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_offerState)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_offerState)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_offerStateCode)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_offerStateCode)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, alt)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, alt)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, url)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, url)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, title)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, title)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_shopId)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_shopId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_shopName)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_shopName)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, product_sub_total)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, product_sub_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, product_total)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, product_total)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, shipment_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, shipment_id)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, shipment_total)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, shipment_total)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, shipping_method_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, shipping_method_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, shipping_method_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, shipping_method_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, shipping_method_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, shipping_method_name)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(UpdateItem_Response, c_storePickupEnabled)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_storePickupEnabled)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, shipping_status)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, shipping_status)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(UpdateItem_Response, shipping_total)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, shipping_total)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(UpdateItem_Response, shipping_total_tax)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, shipping_total_tax)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, shipping_items_item_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, shipping_items_item_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, shipping_items_item_text)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, shipping_items_item_text)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_corporateImgUrl)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_corporateImgUrl)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_currentCorporate)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_currentCorporate)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_currentMultiStoreID)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_currentMultiStoreID)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(UpdateItem_Response, c_isLock)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_isLock)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_lockTime)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_lockTime)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_multiStoreEDD)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_multiStoreEDD)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_onDemandEDD)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_onDemandEDD)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, c_savingsTotal)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_savingsTotal)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_SellerList_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_SellerList_name)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_SellerList_corporateImgURL)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_SellerList_corporateImgURL)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(UpdateItem_Response, c_SellerList_productsCount)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_SellerList_productsCount)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_SellerList_productID)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_SellerList_productID)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_SellerList_sellerId)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_SellerList_sellerId)
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(UpdateItem_Response, c_SellerList_isOnDemandStoreItem)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_SellerList_isOnDemandStoreItem)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_SellerList_alt)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_SellerList_alt)
// 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_SellerList_url)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_SellerList_url)
// 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_SellerList_title)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_SellerList_title)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_SellerList_quantity)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_SellerList_quantity)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, c_SellerList_name1)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, c_SellerList_name1)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, product_items_0_c_total_crossed_price)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, product_sub_total)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, product_total)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, shipments_0_adjusted_merchandize_total_tax)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, shipments_0_adjusted_shipping_total_tax)
 
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, shipments_0_merchandize_total_tax)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, shipments_0_product_sub_total)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, shipments_0_product_total)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, shipments_0_shipment_total)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, shipments_0_shipping_total)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, shipments_0_shipping_total_tax)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, shipments_0_tax_total)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, shipping_items_0_adjusted_tax)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, shipping_items_0_base_price)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, shipping_items_0_price)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(UpdateItem_Response, shipping_items_0_price_after_item_discount)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(UpdateItem_Response, shipments_0_gift)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(UpdateItem_Response, shipments_0_shipping_method_c_onlinePickupEnabled)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(UpdateItem_Response, shipments_0_shipping_method_c_storePickupEnabled)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, product_items_0_c_availableQty)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, product_items_0_c_availableQty)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, shipments_0_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, shipments_0_shipment_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, shipments_0_shipping_method__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, shipments_0_shipping_method__type)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, shipments_0_shipping_method_description)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, shipments_0_shipping_method_description)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, shipments_0_shipping_method_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, shipments_0_shipping_method_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, shipments_0_shipping_method_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, shipments_0_shipping_method_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, shipments_0_shipping_status)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, shipments_0_shipping_status)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, shipping_items_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, shipping_items_0__type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, shipping_items_0_item_text)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, shipping_items_0_item_text)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateItem_Response, shipping_items_0_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateItem_Response, shipping_items_0_shipment_id)
 
 
 
 
 
 
 
 
 
 
 
getbasketnew = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Cart/Get Basket', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID
			, ('basketID') : GlobalVariable.basketID]))
 
quantity = 'product_items[0].quantity'
 
String quantity = WS.getElementPropertyValue(getbasketnew, quantity)
 
println(quantity)
if(quantity == GlobalVariable.quantity) {
	KeywordUtil.markPassed("Quantity updated")
	}
else {
	KeywordUtil.markFailed("Quantity not updated")
}