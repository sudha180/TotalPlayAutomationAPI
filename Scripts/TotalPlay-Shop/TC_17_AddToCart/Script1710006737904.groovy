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
 
AddToCart_Response= WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Cart/AddProductToBasket', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID
			, ('basketID') : GlobalVariable.basketID]))
 
 
//
//WebUI.callTestCase(findTestCase('TotalPlay-Shop/TC_1_InterfaceLogin'), [:], FailureHandling.STOP_ON_FAILURE)
//
//AddToCart_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Cart/AddProductToBasket', [('URL') : GlobalVariable.URL
//            , ('SITEID') : GlobalVariable.SITEID, ('basketID') : GlobalVariable.basketID]))
 
CustomKeywords.'totalplay.Common.printResponseinText'(AddToCart_Response)
 
WS.verifyResponseStatusCode(AddToCart_Response, 200)
 
 
/*_v		 '_v'
_type	=	 '_type'
_resource_state	=	 '_resource_state'
_flash_0__type	=	 '_flash[0]._type'
_flash_0_type	=	 '_flash[0].type'
_flash_0_message	=	 '_flash[0].message'
_flash_0_path	=	 '_flash[0].path'
adjusted_merchandize_total_tax	=	 'adjusted_merchandize_total_tax'
adjusted_shipping_total_tax	=	 'adjusted_shipping_total_tax'
 
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
 
c_miraklLeadTimeToShip = 'product_items[0].c_miraklLeadTimeToShip'
 
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
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart_Response, agent_basket)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, agent_basket)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, basket_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, basket_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, channel_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, channel_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, creation_date)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, creation_date)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, currency)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, currency)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, customer_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, customer_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, customer_no)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, customer_no)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, email)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, email)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, last_modified)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, last_modified)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, link)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, link)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, order_total)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, order_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, base_price)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, base_price)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart_Response, bonus_product_line_item)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, bonus_product_line_item)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart_Response, gift)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, gift)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, inventory_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, inventory_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, item_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, item_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, item_text)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, item_text)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, price)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, price)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, price_after_item_discount)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, price_after_item_discount)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, price_after_order_discount)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, price_after_order_discount)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, product_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, product_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, product_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, product_name)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddToCart_Response, quantity)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, quantity)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipment_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipment_id)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, tax_basis)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, tax_basis)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, tax_class_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, tax_class_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_fromStoreId)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_fromStoreId)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart_Response, c_isOnDemandStoreItem)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_isOnDemandStoreItem)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_miraklLeadTimeToShip)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_miraklLeadTimeToShip)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_miraklOperatorProductId)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_miraklOperatorProductId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_offerId)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_offerId)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, c_offerListPrice)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_offerListPrice)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, c_offerSalesPrice)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_offerSalesPrice)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_offerState)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_offerState)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_offerStateCode)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_offerStateCode)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, alt)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, alt)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, url)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, url)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, title)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, title)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_shopId)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_shopId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_shopName)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_shopName)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, product_sub_total)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, product_sub_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, product_total)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, product_total)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipment_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipment_id)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, shipment_total)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipment_total)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipping_method_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipping_method_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipping_method_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipping_method_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipping_method_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipping_method_name)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart_Response, c_storePickupEnabled)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_storePickupEnabled)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipping_status)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipping_status)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart_Response, shipping_total)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipping_total)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart_Response, shipping_total_tax)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipping_total_tax)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipping_items_item_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipping_items_item_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipping_items_item_text)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipping_items_item_text)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_corporateImgUrl)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_corporateImgUrl)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_currentCorporate)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_currentCorporate)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_currentMultiStoreID)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_currentMultiStoreID)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart_Response, c_isLock)
 
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_isLock)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_lockTime)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_lockTime)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_multiStoreEDD)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_multiStoreEDD)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_onDemandEDD)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_onDemandEDD)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_seller_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_seller_id)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart_Response, c_savingsTotal)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, _v)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, _v)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, _type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, _type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, _flash_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, _flash_0__type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, _flash_0_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, _flash_0_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, _flash_0_message)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, _flash_0_message)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, _flash_0_path)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, _flash_0_path)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, _resource_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, _resource_state)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, c_multiStoreEDD)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, c_multiStoreEDD)*/
 
_v	=	 '_v'
_type	=	 '_type'
_resource_state	=	 '_resource_state'
//_flash_0_type	=	 '_flash[0]._type'
//_flash_0__type	=	 '_flash[0].type'
//_flash_0__message	=	 '_flash[0].message'
//_flash_0__path	=	 '_flash[0].path'
adjusted_merchandize_total_tax	=	 'adjusted_merchandize_total_tax'
adjusted_shipping_total_tax	=	 'adjusted_shipping_total_tax'
agent_basket	=	 'agent_basket'
basket_id	=	 'basket_id'
 
channel_type	=	 'channel_type'
creation_date	=	 'creation_date'
currency	=	 'currency'
customer_info	=	 'customer_info'
customer_info__type	=	 'customer_info._type'
customer_info_customer_id	=	 'customer_info.customer_id'
customer_info_customer_no	=	 'customer_info.customer_no'
customer_info_email	=	 'customer_info.email'
last_modified	=	 'last_modified'
merchandize_total_tax	=	 'merchandize_total_tax'
notes__type	=	 'notes._type'
notes_link	=	 'notes.link'
 
product_items_0___type	=	 'product_items[0]._type'
product_items_0__adjusted_tax	=	 'product_items[0].adjusted_tax'
product_items_0__base_price	=	 'product_items[0].base_price'
product_items_0__bonus_product_line_item	=	 'product_items[0].bonus_product_line_item'
product_items_0__gift	=	 'product_items[0].gift'
product_items_0__inventory_id	=	 'product_items[0].inventory_id'
product_items_0__item_id	=	 'product_items[0].item_id'
product_items_0__item_text	=	 'product_items[0].item_text'
product_items_0__price	=	 'product_items[0].price'
product_items_0__price_after_item_discount	=	 'product_items[0].price_after_item_discount'
product_items_0__price_after_order_discount	=	 'product_items[0].price_after_order_discount'
product_items_0__product_id	=	 'product_items[0].product_id'
product_items_0__product_name	=	 'product_items[0].product_name'
product_items_0__quantity	=	 'product_items[0].quantity'
product_items_0__shipment_id	=	 'product_items[0].shipment_id'
product_items_0__tax	=	 'product_items[0].tax'
product_items_0__tax_basis	=	 'product_items[0].tax_basis'
product_items_0__tax_class_id	=	 'product_items[0].tax_class_id'
product_items_0__tax_rate	=	 'product_items[0].tax_rate'
product_items_0__c_fromStoreId	=	 'product_items[0].c_fromStoreId'
product_items_0__c_individualDelivery	=	 'product_items[0].c_individualDelivery'
product_items_0__c_isOnDemandStoreItem	=	 'product_items[0].c_isOnDemandStoreItem'
product_items_0__c_miraklLeadTimeToShip	=	 'product_items[0].c_miraklLeadTimeToShip'
product_items_0__c_miraklOperatorProductId	=	 'product_items[0].c_miraklOperatorProductId'
product_items_0__c_offerId	=	 'product_items[0].c_offerId'
product_items_0__c_offerListPrice	=	 'product_items[0].c_offerListPrice'
product_items_0__c_offerSalesPrice	=	 'product_items[0].c_offerSalesPrice'
product_items_0__c_offerState	=	 'product_items[0].c_offerState'
product_items_0__c_offerStateCode	=	 'product_items[0].c_offerStateCode'
product_items_0__c_productImage_0__alt	=	 'product_items[0].c_productImage[0].alt'
product_items_0__c_productImage_0__url	=	 'product_items[0].c_productImage[0].url'
product_items_0__c_productImage_0__title	=	 'product_items[0].c_productImage[0].title'
product_items_0__c_shopId	=	 'product_items[0].c_shopId'
product_items_0__c_shopName	=	 'product_items[0].c_shopName'
product_items_0__c_total_crossed_price	=	 'product_items[0].c_total_crossed_price'
 
shipments_0___type	=	 'shipments[0]._type'
shipments_0__adjusted_merchandize_total_tax	=	 'shipments[0].adjusted_merchandize_total_tax'
shipments_0__adjusted_shipping_total_tax	=	 'shipments[0].adjusted_shipping_total_tax'
shipments_0__gift	=	 'shipments[0].gift'
shipments_0__merchandize_total_tax	=	 'shipments[0].merchandize_total_tax'
shipments_0__product_sub_total	=	 'shipments[0].product_sub_total'
shipments_0__product_total	=	 'shipments[0].product_total'
shipments_0__shipment_id	=	 'shipments[0].shipment_id'
shipments_0__shipment_total	=	 'shipments[0].shipment_total'
 
shipments_0__shipping_method	=	 'shipments[0].shipping_method'
shipments_0__shipping_method__type	=	 'shipments[0].shipping_method._type'
shipments_0__shipping_method_description	=	 'shipments[0].shipping_method.description'
shipments_0__shipping_method_id	=	 'shipments[0].shipping_method.id'
shipments_0__shipping_method_name	=	 'shipments[0].shipping_method.name'
shipments_0__shipping_method_shipping_promotions_0___type	=	 'shipments[0].shipping_method.shipping_promotions[0]._type'
shipments_0__shipping_method_shipping_promotions_0__link	=	 'shipments[0].shipping_method.shipping_promotions[0].link'
shipments_0__shipping_method_shipping_promotions_0__promotion_id	=	 'shipments[0].shipping_method.shipping_promotions[0].promotion_id'
shipments_0__shipping_method_shipping_promotions_0__promotion_name	=	 'shipments[0].shipping_method.shipping_promotions[0].promotion_name'
shipments_0__shipping_method_c_onlinePickupEnabled	=	 'shipments[0].shipping_method.c_onlinePickupEnabled'
shipments_0__shipping_method_c_storePickupEnabled	=	 'shipments[0].shipping_method.c_storePickupEnabled'
shipments_0__shipping_status	=	 'shipments[0].shipping_status'
shipments_0__shipping_total	=	 'shipments[0].shipping_total'
shipments_0__shipping_total_tax	=	 'shipments[0].shipping_total_tax'
shipments_0__tax_total	=	 'shipments[0].tax_total'
shipping_items_0___type	=	 'shipping_items[0]._type'
shipping_items_0__adjusted_tax	=	 'shipping_items[0].adjusted_tax'
shipping_items_0__base_price	=	 'shipping_items[0].base_price'
shipping_items_0__item_id	=	 'shipping_items[0].item_id'
shipping_items_0__item_text	=	 'shipping_items[0].item_text'
shipping_items_0__price	=	 'shipping_items[0].price'
shipping_items_0__price_after_item_discount	=	 'shipping_items[0].price_after_item_discount'
shipping_items_0__shipment_id	=	 'shipping_items[0].shipment_id'
shipping_items_0__tax	=	 'shipping_items[0].tax'
shipping_items_0__tax_basis	=	 'shipping_items[0].tax_basis'
shipping_items_0__tax_class_id	=	 'shipping_items[0].tax_class_id'
shipping_items_0__tax_rate	=	 'shipping_items[0].tax_rate'
shipping_total	=	 'shipping_total'
shipping_total_tax	=	 'shipping_total_tax'
taxation	=	 'taxation'
tax_rounded_at_group	=	 'tax_rounded_at_group'
tax_total	=	 'tax_total'
temporary_basket	=	 'temporary_basket'
c_corporateImgUrl	=	 'c_corporateImgUrl'
c_currentCorporate	=	 'c_currentCorporate'
c_currentMultiStoreID	=	 'c_currentMultiStoreID'
c_isLock	=	 'c_isLock'
c_lockTime	=	 'c_lockTime'
c_multiStoreEDD	=	 'c_multiStoreEDD'
c_preferedShipment	=	 'c_preferedShipment'
c_seller_id	=	 'c_seller_id'
c_savingsTotal	=	 'c_savingsTotal'
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, _v)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, _v)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, _type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, _type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, _resource_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, _resource_state)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, _flash_0_type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, _flash_0_type)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, adjusted_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, adjusted_shipping_total_tax)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, _flash_0__message)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, _flash_0__message)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, _flash_0__path)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, _flash_0__path)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart_Response, agent_basket)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, basket_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, basket_id)
 
 
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, channel_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, channel_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, creation_date)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, creation_date)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, currency)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, customer_info__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, customer_info__type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, customer_info_customer_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, customer_info_customer_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, customer_info_customer_no)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, customer_info_customer_no)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, customer_info_email)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, customer_info_email)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, last_modified)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, last_modified)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, merchandize_total_tax)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, notes__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, notes__type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, notes_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, notes_link)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, product_items_0__product_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, product_items_0__product_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, product_items_0__product_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, product_items_0__product_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, product_items_0__product_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, product_items_0__product_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, product_items_0__shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, product_items_0__shipment_id)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, product_items_0__tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, product_items_0__tax_basis)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, product_items_0__tax_class_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, product_items_0__tax_class_id)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddToCart_Response, product_items_0__tax_rate)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, product_items_0__c_fromStoreId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, product_items_0__c_fromStoreId)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart_Response, product_items_0__c_individualDelivery)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart_Response, product_items_0__c_isOnDemandStoreItem)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, product_items_0__c_miraklLeadTimeToShip)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, product_items_0__c_miraklLeadTimeToShip)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, product_items_0__c_miraklOperatorProductId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, product_items_0__c_miraklOperatorProductId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, product_items_0__c_offerId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, product_items_0__c_offerId)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, product_items_0__c_offerListPrice)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, product_items_0__c_offerSalesPrice)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, product_items_0__c_offerState)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, product_items_0__c_offerState)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, product_items_0__c_offerStateCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, product_items_0__c_offerStateCode)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, product_items_0__c_productImage_0__alt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, product_items_0__c_productImage_0__alt)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, product_items_0__c_productImage_0__url)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, product_items_0__c_productImage_0__url)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, product_items_0__c_productImage_0__title)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, product_items_0__c_productImage_0__title)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, product_items_0__c_shopId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, product_items_0__c_shopId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, product_items_0__c_shopName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, product_items_0__c_shopName)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, product_items_0__c_total_crossed_price)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipments_0___type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipments_0___type)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, shipments_0__adjusted_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, shipments_0__adjusted_shipping_total_tax)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart_Response, shipments_0__gift)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, shipments_0__merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, shipments_0__product_sub_total)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, shipments_0__product_total)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipments_0__shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipments_0__shipment_id)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, shipments_0__shipment_total)
 
 
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipments_0__shipping_method__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipments_0__shipping_method__type)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipments_0__shipping_method_description)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipments_0__shipping_method_description)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipments_0__shipping_method_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipments_0__shipping_method_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipments_0__shipping_method_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipments_0__shipping_method_name)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipments_0__shipping_method_shipping_promotions_0___type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipments_0__shipping_method_shipping_promotions_0___type)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipments_0__shipping_method_shipping_promotions_0__promotion_id)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipments_0__shipping_method_shipping_promotions_0__promotion_id)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipments_0__shipping_method_shipping_promotions_0__link)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipments_0__shipping_method_shipping_promotions_0__link)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipments_0__shipping_method_shipping_promotions_0__promotion_name)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipments_0__shipping_method_shipping_promotions_0__promotion_name)
// 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart_Response, shipments_0__shipping_method_c_onlinePickupEnabled)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart_Response, shipments_0__shipping_method_c_storePickupEnabled)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipments_0__shipping_status)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipments_0__shipping_status)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, shipments_0__shipping_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, shipments_0__shipping_total_tax)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, shipments_0__tax_total)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipping_items_0___type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipping_items_0___type)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, shipping_items_0__adjusted_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, shipping_items_0__base_price)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipping_items_0__item_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipping_items_0__item_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipping_items_0__item_text)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipping_items_0__item_text)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, shipping_items_0__price)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, shipping_items_0__price_after_item_discount)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipping_items_0__shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipping_items_0__shipment_id)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, shipping_items_0__tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, shipping_items_0__tax_basis)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, shipping_items_0__tax_class_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, shipping_items_0__tax_class_id)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, shipping_items_0__tax_rate)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, shipping_total)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, shipping_total_tax)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, taxation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, taxation)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart_Response, tax_rounded_at_group)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, tax_total)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart_Response, temporary_basket)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_corporateImgUrl)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_corporateImgUrl)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_currentCorporate)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_currentCorporate)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_currentMultiStoreID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_currentMultiStoreID)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddToCart_Response, c_isLock)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddToCart_Response, c_savingsTotal)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_lockTime)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_lockTime)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_multiStoreEDD)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_multiStoreEDD)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddToCart_Response, c_seller_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddToCart_Response, c_seller_id)
 
 