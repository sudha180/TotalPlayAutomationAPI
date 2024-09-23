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
 
AddCart = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Cart/AddProductToBasket', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID
			, ('basketID') : GlobalVariable.basketID]))
 
//KeywordUtil.logInfo(AddCart)
//CustomKeywords.'totalplay.Common.printResponseinText'(AddCart)
//WS.verifyResponseStatusCode(AddCart, 200)
GetAddress = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Address/Get Customer Address', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID
			, ('sla_customerId') : GlobalVariable.sla_customerId]))
 
WS.verifyResponseStatusCode(GetAddress, 200)
 
SetBillingShipment_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Checkout/Set Billing and Shipment', [('URL') : GlobalVariable.URL
			, ('SITEID') : GlobalVariable.SITEID, ('basketID') : GlobalVariable.basketID]))
 
//CustomKeywords.'totalplay.Common.printResponseinText'(SetBillingShipment_Response)
WS.verifyResponseStatusCode(SetBillingShipment_Response, 200)
 
Method_TP_Credit = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Checkout/Submit Payment Method-TP-Credit', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID
			, ('basketID') : GlobalVariable.basketID, ('orderTotal') : GlobalVariable.orderTotal]))
 
WS.verifyResponseStatusCode(Method_TP_Credit, 200)
 
 
/*_type = '_type'
_resource_state = '_resource_state'
adjusted_shipping_total_tax = 'adjusted_shipping_total_tax'
adjusted_merchandize_total_tax = 'adjusted_merchandize_total_tax'
agent_basket = 'agent_basket'
basket_id = 'basket_id'
billing_address = 'billing_address'
billing_address_type = 'billing_address._type'
billing_address_address1 = 'billing_address.address1'
billing_address_city = 'billing_address.city'
billing_address_company_name = 'billing_address.company_name'
billing_address_country_code = 'billing_address.country_code'
billing_address_first_name = 'billing_address.first_name'
billing_address_full_name = 'billing_address.full_name'
billing_address_id = 'billing_address.id'
billing_address_phone = 'billing_address.phone'
billing_address_last_name = 'billing_address.last_name'
billing_address_postal_code = 'billing_address.postal_code'
billing_address_c_alias = 'billing_address.c_alias'
billing_address_c_delegation = 'billing_address.c_delegation'
billing_address_c_latitude = 'billing_address.c_latitude'
billing_address_c_label = 'billing_address.c_label'
billing_address_c_nExt = 'billing_address.c_nExt'
billing_address_c_nInt = 'billing_address.c_nInt'
billing_address_c_neighborhood = 'billing_address.c_neighborhood'
billing_address_c_references = 'billing_address.c_references'
billing_address_c_rfc = 'billing_address.c_rfc'
billing_address_c_state = 'billing_address.c_state'
billing_address_c_streetName = 'billing_address.c_streetName'
billing_address_c_streetNumber = 'billing_address.c_streetNumber'
creation_date = 'creation_date'
currency = 'currency'
customer_info_customer_id = 'customer_info.customer_id'
customer_info = 'customer_info'
customer_info_customer_no = 'customer_info.customer_no'
customer_info_email = 'customer_info.email'
last_modified = 'last_modified'
merchandize_total_tax = 'merchandize_total_tax'
notes = 'notes'
notes_type = 'notes._type'
notes_link = 'notes.link'
payment_instruments = 'payment_instruments'
order_total = 'order_total'
payment_instruments_type = 'payment_instruments[0]._type'
payment_instruments_amount = 'payment_instruments[0].amount'
payment_instruments_payment_card = 'payment_instruments[0].payment_card'
payment_instruments_payment_card_type = 'payment_instruments[0].payment_card._type'
payment_instruments_payment_card_card_type = 'payment_instruments[0].payment_card.card_type'
payment_instruments_payment_card_credit_card_expired = 'payment_instruments[0].payment_card.credit_card_expired'
payment_instruments_payment_card_expiration_month = 'payment_instruments[0].payment_card.expiration_month'
payment_instruments_payment_card_expiration_year = 'payment_instruments[0].payment_card.expiration_year'
payment_instruments_payment_card_holder = 'payment_instruments[0].payment_card.holder'
payment_instruments_payment_method_id = 'payment_instruments[0].payment_method_id'
payment_instruments_payment_instrument_id= 'payment_instruments[0].payment_instrument_id'
product_items = 'product_items'
product_items_type = 'product_items[0]._type'
product_items_adjusted_tax = 'product_items[0].adjusted_tax'
product_items_base_price = 'product_items[0].base_price'
product_items_gift = 'product_items[0].gift'
product_items_inventory_id = 'product_items[0].inventory_id'
product_items_bonus_product_line_item = 'product_items[0].bonus_product_line_item'
product_items_item_id = 'product_items[0].item_id'
product_items_item_text = 'product_items[0].item_text'
product_items_price  = 'product_items[0].price'
product_items_price_after_item_discount = 'product_items[0].price_after_item_discount'
product_items_product_id = 'product_items[0].product_id'
product_items_product_name = 'product_items[0].product_name'
product_items_quantity = 'product_items[0].quantity'
product_items_shipment_id = 'product_items[0].shipment_id'
product_items_tax = 'product_items[0].tax'
product_items_tax_basis = 'product_items[0].tax_basis'
product_items_tax_class_id = 'product_items[0].tax_class_id'
product_items_tax_rate = 'product_items[0].tax_rate'
product_items_c_fromStoreId = 'product_items[0].c_fromStoreId'
product_items_c_isOnDemandStoreItem = 'product_items[0].c_isOnDemandStoreItem'
product_items_c_miraklChannels = 'product_items[0].c_miraklChannels'
product_items_c_miraklEarliestDeliveryDays = 'product_items[0].c_miraklEarliestDeliveryDays'
product_items_c_miraklLatestDeliveryDays = 'product_items[0].c_miraklLatestDeliveryDays'
product_items_c_miraklLeadTimeToShip = 'product_items[0].c_miraklLeadTimeToShip'
product_items_c_miraklLineShippingPrice = 'product_items[0].c_miraklLineShippingPrice'
product_items_c_miraklOperatorProductId = 'product_items[0].c_miraklOperatorProductId'
product_items_c_miraklShippingTaxes = 'product_items[0].c_miraklShippingTaxes'
product_items_c_miraklTaxes = 'product_items[0].c_miraklTaxes'
product_items_c_offerListPrice = 'product_items[0].c_offerListPrice'
product_items_c_offerId = 'product_items[0].c_offerId'
product_items_c_offerSalesPrice = 'product_items[0].c_offerSalesPrice'
product_items_c_offerStateCode = 'product_items[0].c_offerStateCode'
product_items_c_offerState = 'product_items[0].c_offerState'
product_items_c_productImage = 'product_items[0].c_productImage'
product_items_c_shopId = 'product_items[0].c_shopId'
product_items_c_shopName = 'product_items[0].c_shopName'
product_total = 'product_total'
product_sub_total = 'product_sub_total'
shipments_merchandize_total_tax = 'shipments[0].merchandize_total_tax'
shipments_product_sub_total = 'shipments[0].product_sub_total'
shipments_product_total = 'shipments[0].product_total'
shipments_shipment_id = 'shipments[0].shipment_id'
shipments_shipment_total = 'shipments[0].shipment_total'
shipments_shipping_address = 'shipments[0].shipping_address'
shipments_shipping_address_type = 'shipments[0].shipping_address._type'
shipments_shipping_address_address1 = 'shipments[0].shipping_address.address1'
shipments_shipping_address_city = 'shipments[0].shipping_address.city'
shipments_shipping_address_company_name = 'shipments[0].shipping_address.company_name'
shipments_shipping_address_country_code = 'shipments[0].shipping_address.country_code'
shipments_shipping_address_first_name = 'shipments[0].shipping_address.first_name'
shipments_shipping_address_id = 'shipments[0].shipping_address.id'
shipments_shipping_address_full_name = 'shipments[0].shipping_address.full_name'
shipments_shipping_address_last_name = 'shipments[0].shipping_address.last_name'
shipments_shipping_address_phone = 'shipments[0].shipping_address.phone'
shipments_shipping_address_postal_code = 'shipments[0].shipping_address.postal_code'
shipments_shipping_address_c_alias = 'shipments[0].shipping_address.c_alias'
shipments_shipping_address_c_delegation = 'shipments[0].shipping_address.c_delegation'
shipments_shipping_address_c_isBilling = 'shipments[0].shipping_address.c_isBilling'
shipments_shipping_address_c_isContact = 'shipments[0].shipping_address.c_isContact'
shipments_shipping_address_c_isShipping = 'shipments[0].shipping_address.c_isShipping'
shipments_shipping_address_c_label = 'shipments[0].shipping_address.c_label'
shipments_shipping_address_c_latitude = 'shipments[0].shipping_address.c_latitude'
shipments_shipping_address_c_nExt = 'shipments[0].shipping_address.c_nExt'
shipments_shipping_address_c_longitude = 'shipments[0].shipping_address.c_longitude'
shipments_shipping_address_c_nInt = 'shipments[0].shipping_address.c_nInt'
shipments_tax_total = 'shipments[0].tax_total'
shipments_c_packageSize = 'shipments[0].c_packageSize'
shipments_c_shippingRates = 'shipments[0].c_shippingRates'
shipments_c_serviceCharge = 'shipments[0].c_serviceCharge'
shipments_c_totalShippingCost = 'shipments[0].c_totalShippingCost'
shipping_items_item_id = 'shipping_items[0].item_id'
shipping_items_price = 'shipping_items[0].price'
shipping_items_price_after_item_discount = 'shipping_items[0].price_after_item_discount'
shipping_items_item_text = 'shipping_items[0].item_text'
shipping_items_shipment_id = 'shipping_items[0].shipment_id'
shipping_items_tax = 'shipping_items[0].tax'
shipping_items_tax_class_id = 'shipping_items[0].tax_class_id'
shipping_items_tax_basis= 'shipping_items[0].tax_basis'
shipping_items_tax_rate = 'shipping_items[0].tax_rate'
shipping_total = 'shipping_total'
shipping_total_tax = 'shipping_total_tax'
taxation = 'taxation'
tax_total = 'tax_total'
c_corporateImgUrl = 'c_corporateImgUrl'
c_currentCorporate = 'c_currentCorporate'
c_currentMultiStoreID = 'c_currentMultiStoreID'
c_miraklSH02Response = 'c_miraklSH02Response'
c_lockTime = 'c_lockTime'
c_isMiraklOrder = 'c_isMiraklOrder'
c_formatedProductTotal = 'c_formatedProductTotal'
c_formatedOrderTotal = 'c_formatedOrderTotal'
c_incomplete = 'c_incomplete'
c_storeDeliveryType = 'c_storeDeliveryType'
c_serviceChargeTotalGrossPrice = 'c_serviceChargeTotalGrossPrice'
c_seller_id = 'c_seller_id'
c_serviceChargeTotalGrossPrice = 'c_serviceChargeTotalGrossPrice'
c_storeDeliveryType = 'c_storeDeliveryType'
c_formatedProductTotal = 'c_formatedProductTotal'
c_incomplete = 'c_incomplete'
c_formatedOrderTotal = 'c_formatedOrderTotal'*/
 
_v	=	 '_v'
_type	=	 '_type'
_resource_state	=	 '_resource_state'
adjusted_merchandize_total_tax	=	 'adjusted_merchandize_total_tax'
adjusted_shipping_total_tax	=	 'adjusted_shipping_total_tax'
agent_basket	=	 'agent_basket'
basket_id	=	 'basket_id'
billing_address__type	=	 'billing_address._type'
billing_address_address1	=	 'billing_address.address1'
billing_address_city	=	 'billing_address.city'
billing_address_country_code	=	 'billing_address.country_code'
billing_address_first_name	=	 'billing_address.first_name'
billing_address_full_name	=	 'billing_address.full_name'
billing_address_id	=	 'billing_address.id'
billing_address_last_name	=	 'billing_address.last_name'
billing_address_phone	=	 'billing_address.phone'
billing_address_postal_code	=	 'billing_address.postal_code'
billing_address_second_name	=	 'billing_address.second_name'
billing_address_c_alias	=	 'billing_address.c_alias'
billing_address_c_delegation	=	 'billing_address.c_delegation'
billing_address_c_label	=	 'billing_address.c_label'
billing_address_c_latitude	=	 'billing_address.c_latitude'
billing_address_c_longitude	=	 'billing_address.c_longitude'
billing_address_c_nExt	=	 'billing_address.c_nExt'
billing_address_c_nInt	=	 'billing_address.c_nInt'
billing_address_c_neighborhood	=	 'billing_address.c_neighborhood'
billing_address_c_references	=	 'billing_address.c_references'
billing_address_c_rfc	=	 'billing_address.c_rfc'
billing_address_c_state	=	 'billing_address.c_state'
billing_address_c_streetName	=	 'billing_address.c_streetName'
billing_address_c_streetNumber	=	 'billing_address.c_streetNumber'
channel_type	=	 'channel_type'
creation_date	=	 'creation_date'
currency	=	 'currency'
customer_info__type	=	 'customer_info._type'
customer_info_customer_id	=	 'customer_info.customer_id'
customer_info_customer_no	=	 'customer_info.customer_no'
customer_info_email	=	 'customer_info.email'
last_modified	=	 'last_modified'
merchandize_total_tax	=	 'merchandize_total_tax'
notes__type	=	 'notes._type'
notes_link	=	 'notes.link'
order_total	=	 'order_total'
payment_instruments_0___type	=	 'payment_instruments[0]._type'
payment_instruments_0__amount	=	 'payment_instruments[0].amount'
payment_instruments_0__payment_instrument_id	=	 'payment_instruments[0].payment_instrument_id'
payment_instruments_0__payment_method_id	=	 'payment_instruments[0].payment_method_id'
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
product_items_0__c_miraklEarliestDeliveryDays	=	 'product_items[0].c_miraklEarliestDeliveryDays'
product_items_0__c_miraklLatestDeliveryDays	=	 'product_items[0].c_miraklLatestDeliveryDays'
product_items_0__c_miraklLeadTimeToShip	=	 'product_items[0].c_miraklLeadTimeToShip'
product_items_0__c_miraklLineShippingPrice	=	 'product_items[0].c_miraklLineShippingPrice'
product_items_0__c_miraklOperatorProductId	=	 'product_items[0].c_miraklOperatorProductId'
product_items_0__c_offerId	=	 'product_items[0].c_offerId'
product_items_0__c_offerListPrice	=	 'product_items[0].c_offerListPrice'
product_items_0__c_offerSalesPrice	=	 'product_items[0].c_offerSalesPrice'
product_items_0__c_offerState	=	 'product_items[0].c_offerState'
product_items_0__c_offerStateCode	=	 'product_items[0].c_offerStateCode'
product_items_0__c_packageItemObject	=	 'product_items[0].c_packageItemObject'
product_items_0__c_shopId	=	 'product_items[0].c_shopId'
product_items_0__c_shopName	=	 'product_items[0].c_shopName'
product_items_0__c_total_crossed_price	=	 'product_items[0].c_total_crossed_price'
product_sub_total	=	 'product_sub_total'
product_total	=	 'product_total'
shipments_0___type	=	 'shipments[0]._type'
shipments_0__adjusted_merchandize_total_tax	=	 'shipments[0].adjusted_merchandize_total_tax'
shipments_0__adjusted_shipping_total_tax	=	 'shipments[0].adjusted_shipping_total_tax'
shipments_0__gift	=	 'shipments[0].gift'
shipments_0__merchandize_total_tax	=	 'shipments[0].merchandize_total_tax'
shipments_0__product_sub_total	=	 'shipments[0].product_sub_total'
shipments_0__product_total	=	 'shipments[0].product_total'
shipments_0__shipment_id	=	 'shipments[0].shipment_id'
shipments_0__shipment_total	=	 'shipments[0].shipment_total'
shipments_0__shipping_address__type	=	 'shipments[0].shipping_address._type'
shipments_0__shipping_address_address1	=	 'shipments[0].shipping_address.address1'
shipments_0__shipping_address_city	=	 'shipments[0].shipping_address.city'
shipments_0__shipping_address_country_code	=	 'shipments[0].shipping_address.country_code'
shipments_0__shipping_address_first_name	=	 'shipments[0].shipping_address.first_name'
shipments_0__shipping_address_full_name	=	 'shipments[0].shipping_address.full_name'
shipments_0__shipping_address_id	=	 'shipments[0].shipping_address.id'
shipments_0__shipping_address_last_name	=	 'shipments[0].shipping_address.last_name'
shipments_0__shipping_address_phone	=	 'shipments[0].shipping_address.phone'
shipments_0__shipping_address_postal_code	=	 'shipments[0].shipping_address.postal_code'
shipments_0__shipping_address_second_name	=	 'shipments[0].shipping_address.second_name'
shipments_0__shipping_address_c_alias	=	 'shipments[0].shipping_address.c_alias'
shipments_0__shipping_address_c_delegation	=	 'shipments[0].shipping_address.c_delegation'
shipments_0__shipping_address_c_isBilling	=	 'shipments[0].shipping_address.c_isBilling'
shipments_0__shipping_address_c_isContact	=	 'shipments[0].shipping_address.c_isContact'
shipments_0__shipping_address_c_isShipping	=	 'shipments[0].shipping_address.c_isShipping'
shipments_0__shipping_address_c_label	=	 'shipments[0].shipping_address.c_label'
shipments_0__shipping_address_c_latitude	=	 'shipments[0].shipping_address.c_latitude'
shipments_0__shipping_address_c_longitude	=	 'shipments[0].shipping_address.c_longitude'
shipments_0__shipping_address_c_nExt	=	 'shipments[0].shipping_address.c_nExt'
shipments_0__shipping_address_c_nInt	=	 'shipments[0].shipping_address.c_nInt'
shipments_0__shipping_address_c_neighborhood	=	 'shipments[0].shipping_address.c_neighborhood'
shipments_0__shipping_address_c_references	=	 'shipments[0].shipping_address.c_references'
shipments_0__shipping_address_c_rfc	=	 'shipments[0].shipping_address.c_rfc'
shipments_0__shipping_address_c_streetName	=	 'shipments[0].shipping_address.c_streetName'
shipments_0__shipping_address_c_streetNumber	=	 'shipments[0].shipping_address.c_streetNumber'
shipments_0__shipping_method__type	=	 'shipments[0].shipping_method._type'
shipments_0__shipping_method_id	=	 'shipments[0].shipping_method.id'
shipments_0__shipping_method_name	=	 'shipments[0].shipping_method.name'
shipments_0__shipping_method_price	=	 'shipments[0].shipping_method.price'
shipments_0__shipping_method_c_storePickupEnabled	=	 'shipments[0].shipping_method.c_storePickupEnabled'
shipments_0__shipping_status	=	 'shipments[0].shipping_status'
shipments_0__shipping_total	=	 'shipments[0].shipping_total'
shipments_0__shipping_total_tax	=	 'shipments[0].shipping_total_tax'
shipments_0__tax_total	=	 'shipments[0].tax_total'
shipments_0__c_isDigital	=	 'shipments[0].c_isDigital'
shipments_0__c_serviceCharge	=	 'shipments[0].c_serviceCharge'
shipments_0__c_totalShippingCost	=	 'shipments[0].c_totalShippingCost'
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
c_isMiraklOrder	=	 'c_isMiraklOrder'
c_lockTime	=	 'c_lockTime'
c_miraklShippingZoneCode	=	 'c_miraklShippingZoneCode'
c_multiStoreEDD	=	 'c_multiStoreEDD'
c_preferedShipment	=	 'c_preferedShipment'
c_seller_id	=	 'c_seller_id'
c_serviceChargeTotalGrossPrice	=	 'c_serviceChargeTotalGrossPrice'
c_incomplete	=	 'c_incomplete'
c_formatedOrderTotal	=	 'c_formatedOrderTotal'
c_formatedProductTotal	=	 'c_formatedProductTotal'
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, _v)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, _v)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, _type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, _type)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, _resource_state)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, _resource_state)
 
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, adjusted_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, adjusted_shipping_total_tax)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Method_TP_Credit, agent_basket)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address__type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_address1)
 
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_city)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_company_name)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_company_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_country_code)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_first_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_first_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_full_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_full_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_last_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_phone)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_postal_code)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_second_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_second_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_c_alias)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_c_delegation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_c_delegation)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_c_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_c_label)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_c_latitude)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_c_longitude)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_c_nExt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_c_nExt)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_c_nInt)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_c_nInt)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_c_neighborhood)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_c_neighborhood)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_c_references)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_c_references)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_c_rfc)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_c_rfc)
//
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_c_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_c_state)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_c_streetName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_c_streetName)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_c_streetNumber)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_c_streetNumber)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, channel_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, channel_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, creation_date)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, creation_date)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, currency)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, customer_info__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, customer_info__type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, customer_info_customer_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, customer_info_customer_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, customer_info_customer_no)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, customer_info_customer_no)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, customer_info_email)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, customer_info_email)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, last_modified)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, last_modified)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, merchandize_total_tax)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, last_modified)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, last_modified)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, notes__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, notes__type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, notes_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, notes_link)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, order_total)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, payment_instruments_0___type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, payment_instruments_0___type)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, payment_instruments_0__amount)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, payment_instruments_0__payment_instrument_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, payment_instruments_0__payment_instrument_id)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Method_TP_Credit, payment_instruments_0__payment_method_id)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, product_items_0___type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, product_items_0___type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, product_items_0__inventory_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, product_items_0__inventory_id)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, product_items_0__price)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, product_items_0__item_text)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, product_items_0__item_text)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, product_items_0__adjusted_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, product_items_0__base_price)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, product_items_0__product_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, product_items_0__product_id)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(Method_TP_Credit, product_items_0__quantity)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, product_items_0__shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, product_items_0__shipment_id)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Method_TP_Credit, product_items_0__bonus_product_line_item)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Method_TP_Credit, product_items_0__gift)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, product_items_0__tax_basis)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, product_items_0__tax_rate)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, product_items_0__price_after_item_discount)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, product_items_0__price_after_order_discount)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, product_items_0__tax_class_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, product_items_0__tax_class_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, product_items_0__c_fromStoreId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, product_items_0__c_fromStoreId)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Method_TP_Credit, product_items_0__c_individualDelivery)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Method_TP_Credit, product_items_0__c_isOnDemandStoreItem)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, product_items_0__c_miraklLatestDeliveryDays)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, product_items_0__c_miraklEarliestDeliveryDays)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, product_items_0__c_offerId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, product_items_0__c_offerId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, product_items_0__c_miraklOperatorProductId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, product_items_0__c_miraklOperatorProductId)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, product_items_0__c_offerListPrice)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, product_items_0__c_offerSalesPrice)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, product_items_0__c_offerState)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, product_items_0__c_offerState)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, product_items_0__c_offerStateCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, product_items_0__c_offerStateCode)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, product_items_0__c_shopId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, product_items_0__c_shopId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, product_items_0__c_shopName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, product_items_0__c_shopName)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, product_items_0__c_total_crossed_price)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, product_items_0__c_packageItemObject)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, product_items_0__c_packageItemObject)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, product_items_0__c_miraklLeadTimeToShip)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, product_items_0__c_miraklLeadTimeToShip)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, product_items_0__c_miraklLineShippingPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, product_items_0__c_miraklLineShippingPrice)
 
 
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, product_sub_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, product_total)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0___type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0___type)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, shipments_0__adjusted_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, shipments_0__adjusted_shipping_total_tax)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Method_TP_Credit, shipments_0__gift)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, shipments_0__merchandize_total_tax)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, shipments_0__product_sub_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, shipments_0__product_total)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipment_id)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, shipments_0__shipment_total)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address__type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_address1)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_city)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_country_code)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_first_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_first_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_full_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_full_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_last_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_phone)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_postal_code)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_second_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_second_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_c_alias)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_c_delegation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_c_delegation)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_c_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_c_label)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Method_TP_Credit, shipments_0__shipping_address_c_isBilling)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Method_TP_Credit, shipments_0__shipping_address_c_isContact)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Method_TP_Credit, shipments_0__shipping_address_c_isShipping)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_c_latitude)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_c_longitude)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_c_nExt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_c_nExt)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_c_nInt)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_c_nInt)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, billing_address_c_neighborhood)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, billing_address_c_neighborhood)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_c_references)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_c_references)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_c_rfc)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_c_rfc)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0_shipping_address_c_state)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0_shipping_address_c_state)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_c_streetName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_c_streetName)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_address_c_streetNumber)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_address_c_streetNumber)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_method_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_method_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_method_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_method_name)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_method__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_method__type)
 
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Method_TP_Credit, shipments_0__shipping_method_c_storePickupEnabled)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipments_0__shipping_status)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipments_0__shipping_status)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, shipments_0__shipping_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, shipments_0__shipping_total_tax)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, shipments_0__tax_total)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipping_items_0___type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipping_items_0___type)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, shipping_items_0__adjusted_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, shipping_items_0__base_price)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipping_items_0__item_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipping_items_0__item_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipping_items_0__item_text)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipping_items_0__item_text)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, shipping_items_0__price)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, shipping_items_0__price_after_item_discount)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipping_items_0__shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipping_items_0__shipment_id)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, shipping_items_0__tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, shipping_items_0__tax_basis)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, shipping_items_0__tax_class_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, shipping_items_0__tax_class_id)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, shipping_items_0__tax_rate)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, shipping_total)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, shipping_total_tax)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Method_TP_Credit, shipments_0__c_isDigital)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, shipments_0__c_serviceCharge)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, shipments_0__c_totalShippingCost)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, taxation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, taxation)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Method_TP_Credit, tax_rounded_at_group)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, tax_total)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Method_TP_Credit, temporary_basket)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, c_corporateImgUrl)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, c_corporateImgUrl)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, c_currentCorporate)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, c_currentCorporate)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, c_currentMultiStoreID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, c_currentMultiStoreID)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, c_preferedShipment)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, c_preferedShipment)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, c_seller_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, c_seller_id)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Method_TP_Credit, c_isLock)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, c_lockTime)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, c_lockTime)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, c_multiStoreEDD)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, c_multiStoreEDD)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Method_TP_Credit, c_isMiraklOrder)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Method_TP_Credit, c_serviceChargeTotalGrossPrice)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, c_miraklShippingZoneCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, c_miraklShippingZoneCode)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Method_TP_Credit, c_incomplete)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, c_formatedOrderTotal)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, c_formatedOrderTotal)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Method_TP_Credit, c_formatedProductTotal)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Method_TP_Credit, c_formatedProductTotal)
 