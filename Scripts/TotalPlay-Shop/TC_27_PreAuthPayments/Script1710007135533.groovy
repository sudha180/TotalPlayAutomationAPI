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
 
AddCart = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Cart/AddProductToBasket', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID
			, ('basketID') : GlobalVariable.basketID]))
 
WS.verifyResponseStatusCode(AddCart, 200)
 
GetCustomerAdd = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Checkout/Get Customer Address', [('URL') : GlobalVariable.URL
			, ('SITEID') : GlobalVariable.SITEID, ('sla_customerId') : GlobalVariable.sla_customerId]))
 
WS.verifyResponseStatusCode(GetCustomerAdd, 200)
 
crmadd = 'data[0].c_crm_address_id'
 
GlobalVariable.crm_address = WS.getElementPropertyValue(GetCustomerAdd, crmadd)
 
setBillingAndShipping = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Checkout/Set Billing and Shipment', [('URL') : GlobalVariable.URL
			, ('SITEID') : GlobalVariable.SITEID, ('basketID') : GlobalVariable.basketID]))
 
WS.verifyResponseStatusCode(setBillingAndShipping, 200)
 
creditCard = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Checkout/Submit Payment Method-Credit Card', [('URL') : GlobalVariable.URL
			, ('SITEID') : GlobalVariable.SITEID, ('basketID') : GlobalVariable.basketID]))
 
//creditCard = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Checkout/Submit Payment Method-TP-Credit', [('URL') : GlobalVariable.URL
//	          , ('SITEID') : GlobalVariable.SITEID, ('basketID') : GlobalVariable.basketID, ('orderTotal') : GlobalVariable.orderTotal]))
CustomKeywords.'totalplay.Common.printResponseinText'(creditCard)
 
WS.verifyResponseStatusCode(creditCard, 200)
 
preAuthPayments = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Checkout/Pre-Auth Payments', [('URL') : GlobalVariable.URL
			, ('SITEID') : GlobalVariable.SITEID, ('basketID') : GlobalVariable.basketID]))
 
CustomKeywords.'totalplay.Common.printResponseinText'(preAuthPayments)
 
WS.verifyResponseStatusCode(preAuthPayments, 200)
_v='_v'
resource_state = '_resource_state'
adjusted_shipping_total_tax='adjusted_shipping_total_tax'
agent_basket='agent_basket'
billing_address_type='billing_address._type'
adjusted_merchandize_total_tax = 'adjusted_merchandize_total_tax'
 
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
 
billing_address_last_name = 'billing_address.last_name'
 
billing_address_phone = 'billing_address.phone'
 
billing_address_postal_code = 'billing_address.postal_code'
 
billing_address_second_name = 'billing_address.second_name'
 
billing_address_c_alias = 'billing_address.c_alias'
 
billing_address_c_delegation = 'billing_address.c_delegation'
 
billing_address_c_label = 'billing_address.c_label'
 
billing_address_c_latitude = 'billing_address.c_latitude'
 
billing_address_c_longitude = 'billing_address.c_longitude'
 
billing_address_c_nInt = 'billing_address.c_nInt'
 
billing_address_c_nExt = 'billing_address.c_nExt'
 
billing_address_c_neighborhood = 'billing_address.c_neighborhood'
 
billing_address_c_references = 'billing_address.c_references'
 
billing_address_c_rfc = 'billing_address.c_rfc'
 
billing_address_c_state = 'billing_address.c_state'
 
billing_address_c_streetNumber = 'billing_address.c_streetNumber'
 
billing_address_c_streetName = 'billing_address.c_streetName'
grouped_tax_items_0_type='grouped_tax_items[0]._type'
grouped_tax_items_0_tax_rate='grouped_tax_items[0].tax_rate'
grouped_tax_items_0_tax_value='grouped_tax_items[0].tax_value'
channel_type = 'channel_type'
 
creation_date = 'creation_date'
 
currency = 'currency'
 
customer_info = 'customer_info'
 
customer_info_type = 'customer_info._type'
 
customer_info_customer_id = 'customer_info.customer_id'
 
customer_info_customer_no = 'customer_info.customer_no'
 
customer_info_email = 'customer_info.email'
 
merchandize_total_tax = 'merchandize_total_tax'
 
last_modified = 'last_modified'
 
notes = 'notes'
 
notes_link = 'notes.link'
 
notes_type = 'notes._type'
 
order_total = 'order_total'
 
payment_instruments = 'payment_instruments'
 
payment_instruments_type = 'payment_instruments[0]._type'
 
payment_instruments_amount = 'payment_instruments[0].amount'
 
payment_instruments_payment_card = 'payment_instruments[0].payment_card'
 
payment_instruments_payment_card_type = 'payment_instruments[0].payment_card._type'
 
payment_instruments_payment_card_card_type = 'payment_instruments[0].payment_card.card_type'
 
payment_instruments_payment_card_credit_card_expired = 'payment_instruments[0].payment_card.credit_card_expired'
payment_instruments_payment_card_holder='payment_instruments[0].payment_card.holder'
payment_instruments_payment_card_expiration_month = 'payment_instruments[0].payment_card.expiration_month'
 
payment_instruments_payment_card_expiration_year = 'payment_instruments[0].payment_card.expiration_year'
 
payment_instruments_payment_instrument_id = 'payment_instruments[0].payment_instrument_id'
 
payment_instruments_payment_method_id = 'payment_instruments[0].payment_method_id'
 
product_items = 'product_items'
 
product_items_type = 'product_items[0]._type'
 
product_items_adjusted_tax = 'product_items[0].adjusted_tax'
 
product_items_base_price = 'product_items[0].base_price'
 
product_items_bonus_product_line_item = 'product_items[0].bonus_product_line_item'
 
product_items_bonus_product_line_item = 'product_items[0].bonus_product_line_item'
 
product_items_gift = 'product_items[0].gift'
 
product_items_inventory_id = 'product_items[0].inventory_id'
 
product_items_item_id = 'product_items[0].item_id'
 
product_items_item_text = 'product_items[0].item_text'
 
product_items_item_text = 'product_items[0].item_text'
 
product_items_price = 'product_items[0].price'
 
product_items_price_after_item_discount = 'product_items[0].price_after_item_discount'
 
product_items_price_after_order_discount = 'product_items[0].price_after_order_discount'
 
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
 
product_items_c_offerId = 'product_items[0].c_offerId'
 
product_items_c_offerListPrice = 'product_items[0].c_offerListPrice'
 
product_items_c_offerSalesPrice = 'product_items[0].c_offerSalesPrice'
 
product_items_c_offerState = 'product_items[0].c_offerState'
 
product_items_c_productImage = 'product_items[0].c_productImage'
 
product_items_c_productImage_url = 'product_items[0].c_productImage[0].url'
 
product_items_c_productImage_title = 'product_items[0].c_productImage[0].title'
product_items_c_individualDelivery='product_items[0].c_individualDelivery'
product_items_c_offerStateCode='product_items[0].c_offerStateCode'
product_items_c_shopId = 'product_items[0].c_shopId'
 
product_items_c_shopName = 'product_items[0].c_shopName'
 
product_items_c_availableQty = 'product_items[0].c_availableQty'
 
product_sub_total = 'product_sub_total'
 
product_total = 'product_total'
 
shipments = 'shipments'
 
shipments_type = 'shipments[0]._type'
 
shipments_adjusted_shipping_total_tax = 'shipments[0].adjusted_shipping_total_tax'
 
shipments_adjusted_merchandize_total_tax = 'shipments[0].adjusted_merchandize_total_tax'
 
shipments_gift = 'shipments[0].gift'
 
shipments_merchandize_total_tax = 'shipments[0].merchandize_total_tax'
 
shipments_product_sub_total = 'shipments[0].product_sub_total'
 
shipments_product_total = 'shipments[0].product_total'
 
shipments_shipment_id = 'shipments[0].shipment_id'
 
shipments_shipping_address = 'shipments[0].shipping_address'
 
shipments_shipment_total = 'shipments[0].shipment_total'
 
shipments_shipping_address_type = 'shipments[0].shipping_address._type'
 
shipments_shipping_address_address1 = 'shipments[0].shipping_address.address1'
 
shipments_shipping_address_city = 'shipments[0].shipping_address.city'
 
shipments_shipping_address_company_name = 'shipments[0].shipping_address.company_name'
 
shipments_shipping_address_country_code = 'shipments[0].shipping_address.country_code'
 
shipments_shipping_address_first_name = 'shipments[0].shipping_address.first_name'
 
shipments_shipping_address_full_name = 'shipments[0].shipping_address.full_name'
 
shipments_shipping_address_id = 'shipments[0].shipping_address.id'
 
shipments_shipping_address_last_name = 'shipments[0].shipping_address.last_name'
 
shipments_shipping_address_phone = 'shipments[0].shipping_address.phone'
 
shipments_shipping_address_postal_code = 'shipments[0].shipping_address.postal_code'
 
shipments_shipping_address_second_name = 'shipments[0].shipping_address.second_name'
 
shipments_shipping_address_c_alias = 'shipments[0].shipping_address.c_alias'
 
shipments_shipping_address_c_delegation = 'shipments[0].shipping_address.c_delegation'
 
shipments_shipping_address_c_isBilling = 'shipments[0].shipping_address.c_isBilling'
 
shipments_shipping_address_c_isContact = 'shipments[0].shipping_address.c_isContact'
 
shipments_shipping_address_c_isShipping = 'shipments[0].shipping_address.c_isShipping'
 
shipments_shipping_address_c_label = 'shipments[0].shipping_address.c_label'
 
shipments_shipping_address_c_latitude = 'shipments[0].shipping_address.c_latitude'
 
shipments_shipping_address_c_longitude = 'shipments[0].shipping_address.c_longitude'
 
shipments_shipping_address_c_nExt = 'shipments[0].shipping_address.c_nExt'
 
shipments_shipping_address_c_nInt = 'shipments[0].shipping_address.c_nInt'
 
shipments_shipping_address_c_neighborhood = 'shipments[0].shipping_address.c_neighborhood'
 
shipments_shipping_address_c_references = 'shipments[0].shipping_address.c_references'
 
shipments_shipping_address_c_rfc = 'shipments[0].shipping_address.c_rfc'
 
shipments_shipping_address_c_state = 'shipments[0].shipping_address.c_state'
 
shipments_shipping_address_c_streetName = 'shipments[0].shipping_address.c_streetName'
 
shipments_shipping_address_c_streetNumber = 'shipments[0].shipping_address.c_streetNumber'
 
shipments_shipping_method = 'shipments[0].shipping_method'
 
shipments_shipping_method_type = 'shipments[0].shipping_method._type'
 
shipments_shipping_method_description = 'shipments[0].shipping_method.description'
 
shipments_shipping_method_id = 'shipments[0].shipping_method.id'
 
shipments_shipping_method_name = 'shipments[0].shipping_method.name'
 
shipments_shipping_method_shipping_promotions = 'shipments[0].shipping_method.shipping_promotions'
 
shipments_shipping_method_shipping_promotions_type = 'shipments[0].shipping_method.shipping_promotions[0]._type'
 
shipments_shipping_method_shipping_promotions_link = 'shipments[0].shipping_method.shipping_promotions[0].link'
 
shipments_shipping_method_shipping_promotions_promotion_id = 'shipments[0].shipping_method.shipping_promotions[0].promotion_id'
 
shipments_shipping_method_shipping_promotions_promotion_name = 'shipments[0].shipping_method.shipping_promotions[0].promotion_name'
 
shipments_shipping_method_shipping_promotions_type = 'shipments[0].shipping_method.shipping_promotions[1]._type'
 
shipments_shipping_method_shipping_promotions_callout_msg = 'shipments[0].shipping_method.shipping_promotions[1].callout_msg'
 
shipments_shipping_method_shipping_promotions_link = 'shipments[0].shipping_method.shipping_promotions[1].link'
 
shipments_shipping_method_shipping_promotions_promotion_id = 'shipments[0].shipping_method.shipping_promotions[1].promotion_id'
 
shipments_shipping_method_shipping_promotions_promotion_name = 'shipments[0].shipping_method.shipping_promotions[1].promotion_name'
 
shipments_shipping_method_shipping_promotions_type = 'shipments[0].shipping_method.shipping_promotions[2]._type'
 
shipments_shipping_method_shipping_promotions_callout_msg = 'shipments[0].shipping_method.shipping_promotions[2].callout_msg'
 
shipments_shipping_method_shipping_promotions_link = 'shipments[0].shipping_method.shipping_promotions[2].link'
 
shipments_shipping_method_c_onlinePickupEnabled = 'shipments[0].shipping_method.c_onlinePickupEnabled'
 
shipments_shipping_method_c_storePickupEnabled = 'shipments[0].shipping_method.c_storePickupEnabled'
 
shipments_shipping_status = 'shipments[0].shipping_status'
 
shipments_shipping_total = 'shipments[0].shipping_total'
 
shipments_c_packageSize = 'shipments[0].c_packageSize'
 
shipments_c_serviceCharge = 'shipments[0].c_serviceCharge'
 
shipments_c_shippingRates = 'shipments[0].c_shippingRates'
 
shipments_c_totalShippingCost = 'shipments[0].c_totalShippingCost'
 
shipping_items = 'shipping_items'
 
shipping_items_type = 'shipping_items[0]._type'
 
shipping_items_item_id = 'shipping_items[0].item_id'
 
shipping_items_price = 'shipping_items[0].price'
 
shipping_items_item_text = 'shipping_items[0].item_text'
 
shipping_items_price_after_item_discount = 'shipping_items[0].price_after_item_discount'
 
shipping_items_shipment_id = 'shipping_items[0].shipment_id'
 
shipping_items_tax = 'shipping_items[0].tax'
 
shipping_items_tax_basis = 'shipping_items[0].tax_basis'
 
shipping_items_tax_class_id = 'shipping_items[0].tax_class_id'
 
shipping_items_tax_rate = 'shipping_items[0].tax_rate'
 
shipping_total = 'shipping_total'
 
shipping_total_tax = 'shipping_total_tax'
 
taxation = 'taxation'
 
tax_total = 'tax_total'
 
c_corporateImgUrl = 'c_corporateImgUrl'
 
c_currentCorporate = 'c_currentCorporate'
 
c_isLock = 'c_isLock'
 
c_isMiraklOrder = 'c_isMiraklOrder'
 
c_lockTime = 'c_lockTime'
 
c_miraklSH02Response = 'c_miraklSH02Response'
 
c_miraklShippingZoneCode = 'c_miraklShippingZoneCode'
 
c_multiStoreEDD = 'c_multiStoreEDD'
 
c_seller_id = 'c_seller_id'
 
c_serviceChargeTotalGrossPrice = 'c_serviceChargeTotalGrossPrice'
 
c_storeDeliveryType = 'c_storeDeliveryType'
 
c_shipmentPaymentStatuses = 'c_shipmentPaymentStatuses'
 
c_shipmentPaymentStatuses_shipmentID = 'c_shipmentPaymentStatuses[0].shipmentID'
 
c_shipmentPaymentStatuses_paymentStatus = 'c_shipmentPaymentStatuses[0].paymentStatus'
 
c_SellerList = 'c_SellerList'
 
c_SellerList_name = 'c_SellerList[0].name'
 
c_SellerList_corporateColorCode = 'c_SellerList[0].corporateColorCode'
 
c_SellerList_cartItems = 'c_SellerList[0].cartItems'
 
c_SellerList_cartItems_productID = 'c_SellerList[0].cartItems[0].productID'
 
c_SellerList_cartItems_sellerId = 'c_SellerList[0].cartItems[0].sellerId'
 
c_SellerList_cartItems_isOnDemandStoreItem = 'c_SellerList[0].cartItems[0].isOnDemandStoreItem'
 
c_SellerList_cartItems_productImage = 'c_SellerList[0].cartItems[0].productImage'
 
c_SellerList_cartItems_productImage_title = 'c_SellerList[0].cartItems[0].productImage[0].title'
 
c_SellerList_cartItems_productImage_alt = 'c_SellerList[0].cartItems[0].productImage[0].alt'
 
c_SellerList_cartItems_name = 'c_SellerList[0].cartItems[0].name'
 
c_preferredAddress = 'c_preferredAddress'
 
c_corporateColorCode = 'c_corporateColorCode'
 
c_OnDemandStoreOpenHours = 'c_OnDemandStoreOpenHours'
 
c_savingsTotal = 'c_savingsTotal'
 
c_formatedSavingsTotal = 'c_formatedSavingsTotal'
 
c_formatedOrderTotal = 'c_formatedOrderTotal'
 
c_formatedProductTotal = 'c_formatedProductTotal'
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, _v)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, _v)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, _type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, _type)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, _resource_state)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, _resource_state)
 
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, adjusted_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, adjusted_shipping_total_tax)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(preAuthPayments, agent_basket)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_address1)
 
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_city)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_company_name)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_company_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_country_code)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_first_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_first_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_full_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_full_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_last_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_phone)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_postal_code)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_second_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_second_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_c_alias)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_c_delegation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_c_delegation)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_c_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_c_label)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_c_latitude)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_c_longitude)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_c_nExt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_c_nExt)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_c_nInt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_c_nInt)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_c_neighborhood)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_c_neighborhood)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_c_references)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_c_references)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_c_rfc)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_c_rfc)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_c_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_c_state)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_c_streetName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_c_streetName)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, billing_address_c_streetNumber)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_c_streetNumber)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, channel_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, channel_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, creation_date)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, creation_date)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, currency)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, customer_info_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, customer_info_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, customer_info_customer_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, customer_info_customer_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, customer_info_customer_no)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, customer_info_customer_no)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, customer_info_email)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, customer_info_email)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, last_modified)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, last_modified)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, merchandize_total_tax)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, last_modified)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, last_modified)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, notes_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, notes_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, notes_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, notes_link)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, order_total)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, payment_instruments_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, payment_instruments_type)
 
//CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, payment_instruments_amount)
//CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, grouped_tax_items_0_tax_value)
//CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, grouped_tax_items_0_tax_rate)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, payment_instruments_payment_card_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, payment_instruments_payment_card_type)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, grouped_tax_items_0_type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, grouped_tax_items_0_type)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(preAuthPayments, payment_instruments_payment_card_credit_card_expired)
CustomKeywords.'totalplay.Common.getNumValueofObject'(preAuthPayments, payment_instruments_payment_card_expiration_month)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(preAuthPayments, payment_instruments_payment_card_expiration_year)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, payment_instruments_payment_card_holder)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, payment_instruments_payment_card_holder)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, payment_instruments_payment_instrument_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, payment_instruments_payment_instrument_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, payment_instruments_payment_method_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, payment_instruments_payment_method_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, payment_instruments_payment_card_card_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, payment_instruments_payment_card_card_type)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_inventory_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_inventory_id)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_items_price)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_item_text)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_item_text)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_items_adjusted_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_items_base_price)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_product_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_product_id)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(preAuthPayments, product_items_quantity)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_shipment_id)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(preAuthPayments, product_items_bonus_product_line_item)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(preAuthPayments, product_items_gift)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_items_tax_basis)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_items_tax_rate)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_items_price_after_item_discount)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_items_price_after_order_discount)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_tax_class_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_tax_class_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_c_fromStoreId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_c_fromStoreId)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(preAuthPayments, product_items_c_individualDelivery)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(preAuthPayments, product_items_c_isOnDemandStoreItem)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_items_c_miraklLatestDeliveryDays)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_c_offerId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_c_offerId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_c_miraklOperatorProductId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_c_miraklOperatorProductId)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_items_c_offerListPrice)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_items_c_offerSalesPrice)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_c_offerState)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_c_offerState)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_c_offerStateCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_c_offerStateCode)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_c_shopId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_c_shopId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_c_shopName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_c_shopName)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_sub_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_total)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_inventory_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_inventory_id)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_items_price)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_item_text)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_item_text)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_items_adjusted_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_items_base_price)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_product_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_product_id)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(preAuthPayments, product_items_quantity)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_shipment_id)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(preAuthPayments, product_items_bonus_product_line_item)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(preAuthPayments, product_items_gift)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_items_tax_basis)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_items_tax_rate)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_items_price_after_item_discount)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_items_price_after_order_discount)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_tax_class_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_tax_class_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_c_fromStoreId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_c_fromStoreId)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(preAuthPayments, product_items_c_individualDelivery)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(preAuthPayments, product_items_c_isOnDemandStoreItem)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_items_c_miraklLatestDeliveryDays)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_c_offerId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_c_offerId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_c_miraklOperatorProductId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_c_miraklOperatorProductId)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_items_c_offerListPrice)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_items_c_offerSalesPrice)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_c_offerState)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_c_offerState)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_c_offerStateCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_c_offerStateCode)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_c_shopId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_c_shopId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, product_items_c_shopName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, product_items_c_shopName)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_sub_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, product_total)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_type)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, shipments_adjusted_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, shipments_adjusted_shipping_total_tax)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(preAuthPayments, shipments_gift)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, shipments_merchandize_total_tax)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, shipments_product_sub_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, shipments_product_total)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipment_id)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, shipments_shipment_total)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_address1)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_city)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_country_code)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_first_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_first_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_full_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_full_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_last_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_phone)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_postal_code)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_second_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_second_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_c_alias)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_c_delegation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_c_delegation)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_c_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_c_label)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_c_latitude)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_c_longitude)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_c_nExt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_c_nExt)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_c_nInt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_c_nInt)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_c_neighborhood)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, billing_address_c_neighborhood)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_c_references)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_c_references)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_c_rfc)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_c_rfc)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_c_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_c_state)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_c_streetName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_c_streetName)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_address_c_streetNumber)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_address_c_streetNumber)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_method_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_method_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_method_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_method_name)
 
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_0_shipping_method_shipping_promotions_0__type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_0_shipping_method_shipping_promotions_0__type)
 
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(preAuthPayments, shipments_shipping_method_c_storePickupEnabled)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipments_shipping_status)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipments_shipping_status)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, shipments_shipping_total)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipping_items_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipping_items_type)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipping_items_item_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipping_items_item_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipping_items_item_text)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipping_items_item_text)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, shipping_items_price)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, shipping_items_price_after_item_discount)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipping_items_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipping_items_shipment_id)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, shipping_items_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, shipping_items_tax_basis)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, shipping_items_tax_class_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, shipping_items_tax_class_id)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, shipping_items_tax_rate)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, shipping_total)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, shipping_total_tax)
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(preAuthPayments, shipments_c_isDigital)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, shipments_c_serviceCharge)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, shipments_c_totalShippingCost)
 
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, taxation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, taxation)
 
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(preAuthPayments, tax_rounded_at_group)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, tax_total)
 
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(preAuthPayments, temporary_basket)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, c_corporateImgUrl)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, c_corporateImgUrl)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, c_currentCorporate)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, c_currentCorporate)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, c_savingsTotal)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, c_preferedShipment)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, c_preferedShipment)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, c_seller_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, c_seller_id)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(preAuthPayments, c_isLock)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, c_lockTime)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, c_lockTime)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, c_multiStoreEDD)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, c_multiStoreEDD)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(preAuthPayments, c_isMiraklOrder)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(preAuthPayments, c_serviceChargeTotalGrossPrice)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, c_miraklShippingZoneCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, c_miraklShippingZoneCode)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, c_formatedOrderTotal)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, c_formatedOrderTotal)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, c_SellerList_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, c_SellerList_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, c_SellerList_corporateColorCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, c_SellerList_corporateColorCode)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, c_SellerList_cartItems)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, c_SellerList_cartItems)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, c_SellerList_cartItems_productID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, c_SellerList_cartItems_productID)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, c_SellerList_cartItems_sellerId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, c_SellerList_cartItems_sellerId)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, c_SellerList_cartItems_isOnDemandStoreItem)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(preAuthPayments, c_SellerList_cartItems_isOnDemandStoreItem)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, c_SellerList_cartItems_productImage)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, c_SellerList_cartItems_productImage)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, c_SellerList_cartItems_productImage_title)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, c_SellerList_cartItems_productImage_title)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, c_SellerList_cartItems_productImage_alt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, c_SellerList_cartItems_productImage_alt)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(preAuthPayments, c_SellerList_cartItems_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(preAuthPayments, c_SellerList_cartItems_name)
 
 
 
 