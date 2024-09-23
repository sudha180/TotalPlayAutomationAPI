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
//
//AddProductbasket = WS.sendRequest(findTestObject('TotalPlay-Food/AddProductToBasket', [('URL') : GlobalVariable.URL, ('basketID') : GlobalVariable.FoodBasketId]))
//
//WS.verifyResponseStatusCode(AddProductbasket, 200)

AddProductbasket = WS.sendRequest(findTestObject('TotalPlay-Food/Food_Add to cart', [('URL') : GlobalVariable.URL, ('basketID') : GlobalVariable.basketID, ('SellerId1') : GlobalVariable.SellerId1]))

CustomKeywords.'totalplay.Common.printResponseinText'(AddProductbasket)

getAddress = WS.sendRequest(findTestObject('TotalPlay-Food/GetAddresses', [('URL') : GlobalVariable.URL, ('sla_customerId') : GlobalVariable.sla_customerId
            , ('shop_auth_token') : GlobalVariable.shop_auth_token]))

WS.verifyResponseStatusCode(getAddress, 200)

AddAddressToCart = WS.sendRequest(findTestObject('TotalPlay-Food/add address to cart', [('URL') : GlobalVariable.URL, ('basketID') : GlobalVariable.FoodBasketId]))
CustomKeywords.'totalplay.Common.printResponseinText'(AddAddressToCart)

WS.verifyResponseStatusCode(AddAddressToCart, 200)

SetPayment_instruments = WS.sendRequest(findTestObject('TotalPlay-Food/Food TP Credit', [('URL') : GlobalVariable.URL, ('basketID') : GlobalVariable.FoodBasketId
            , ('orderTotal') : GlobalVariable.orderTotal]))
CustomKeywords.'totalplay.Common.printResponseinText'(SetPayment_instruments)
WS.verifyResponseStatusCode(SetPayment_instruments, 200)

/*
_resource_state = '_resource_state'
adjusted_merchandize_total_tax = 'adjusted_merchandize_total_tax'
adjusted_shipping_total_tax = 'adjusted_shipping_total_tax'
agent_basket = 'agent_basket'
basket_id = 'basket_id'
billing_address = 'billing_address'
billing_address_type = 'billing_address._type'
billing_address_address1 = 'billing_address.address1'
billing_address_city = 'billing_address.city'
billing_address_country_code = 'billing_address.country_code'
billing_address_full_name = 'billing_address.full_name'
billing_address_first_name = 'billing_address.first_name'
billing_address_last_name = 'billing_address.last_name'
billing_address_id = 'billing_address.id'
billing_address_postal_code = 'billing_address.postal_code'
billing_address_phone = 'billing_address.phone'
billing_address_c_alias = 'billing_address.c_alias'
billing_address_c_latitude = 'billing_address.c_latitude'
billing_address_c_longitude = 'billing_address.c_longitude'
channel_type = 'channel_type'
creation_date = 'creation_date'
currency = 'currency'
customer_info = 'customer_info'
customer_info_type ='customer_info._type'
customer_info_customer_id = 'customer_info.customer_id'
customer_info_customer_no = 'customer_info.customer_no'
last_modified = 'last_modified'
customer_info_email = 'customer_info.email'
merchandize_total_tax = 'merchandize_total_tax'
notes = 'notes'
notes_type ='notes._type'
notes_link = 'notes.link'
order_total = 'order_total'
payment_instruments = 'payment_instruments'
payment_instruments_type = 'payment_instruments[0]._type'
payment_instruments_amount = 'payment_instruments[0].amount'
payment_instruments_payment_instrument_id = 'payment_instruments[0].payment_instrument_id'
payment_instruments_payment_method_id = 'payment_instruments[0].payment_method_id'
product_items = 'product_items'
product_items_type = 'product_items[0]._type'
product_items_adjusted_tax = 'product_items[0].adjusted_tax'
product_items_base_price ='product_items[0].base_price'
product_items_bonus_product_line_item = 'product_items[0].bonus_product_line_item'
product_items_gift = 'product_items[0].gift'
product_items_inventory_id = 'product_items[0].inventory_id'
product_items_item_id = 'product_items[0].item_id'
product_items_item_text = 'product_items[0].item_text'
product_items_price = 'product_items[0].price'
product_items_price_after_item_discount = 'product_items[0].price_after_item_discount'
product_items_product_id = 'product_items[0].product_id'
product_items_product_name = 'product_items[0].product_name'
product_items_quantity = 'product_items[0].quantity'
product_items_tax = 'product_items[0].tax'
product_items_shipment_id = 'product_items[0].shipment_id'
product_items_tax_class_id = 'product_items[0].tax_class_id'
product_items_tax_basis = 'product_items[0].tax_basis'
product_items_tax_rate = 'product_items[0].tax_rate'
product_items_c_fromStoreId = 'product_items[0].c_fromStoreId'
product_items_c_miraklChannels = 'product_items[0].c_miraklChannels'
product_items_c_miraklLatestDeliveryDays = 'product_items[0].c_miraklLatestDeliveryDays'
product_items_c_miraklEarliestDeliveryDays = 'product_items[0].c_miraklEarliestDeliveryDays'
product_items_c_miraklLeadTimeToShip = 'product_items[0].c_miraklLeadTimeToShip'
product_items_c_miraklLineShippingPrice = 'product_items[0].c_miraklLineShippingPrice'
product_items_c_miraklOperatorProductId = 'product_items[0].c_miraklOperatorProductId'
product_items_c_miraklShippingTaxes = 'product_items[0].c_miraklShippingTaxes'
product_items_c_miraklTaxes = 'product_items[0].c_miraklTaxes'
product_items_c_offerId = 'product_items[0].c_offerId'
product_items_c_offerSalesPrice = 'product_items[0].c_offerSalesPrice'
product_items_c_offerState = 'product_items[0].c_offerState'
product_items_c_offerStateCode = 'product_items[0].c_offerStateCode'
product_items_c_shopId = 'product_items[0].c_shopId'
product_items_c_shopName = 'product_items[0].c_shopName'
product_items_c_totalPrice = 'product_items[0].c_totalPrice'
product_sub_total = 'product_sub_total'
product_total = 'product_total'
shipments = 'shipments'
shipments_adjusted_merchandize_total_tax = 'shipments[0].adjusted_merchandize_total_tax'
shipments_type = 'shipments[0]._type'
shipments_adjusted_shipping_total_tax = 'shipments[0].adjusted_shipping_total_tax'
shipments_gift = 'shipments[0].gift'
shipments_merchandize_total_tax ='shipments[0].merchandize_total_tax'
shipments_product_sub_total = 'shipments[0].product_sub_total'
shipments_product_total = 'shipments[0].product_total'
shipments_shipment_id = 'shipments[0].shipment_id'
shipments_shipment_total = 'shipments[0].shipment_total'
shipments_shipping_address = 'shipments[0].shipping_address'
shipments_shipping_address_type = 'shipments[0].shipping_address._type'
shipments_shipping_address_address1 = 'shipments[0].shipping_address.address1'
shipments_shipping_address_city = 'shipments[0].shipping_address.city'
shipments_shipping_address_country_code = 'shipments[0].shipping_address.country_code'
shipments_shipping_address_first_name = 'shipments[0].shipping_address.first_name'
shipments_shipping_address_full_name = 'shipments[0].shipping_address.full_name'
shipments_shipping_address_id = 'shipments[0].shipping_address.id'
shipments_shipping_address_last_name = 'shipments[0].shipping_address.last_name'
shipments_shipping_address_phone = 'shipments[0].shipping_address.phone'
shipments_shipping_address_postal_code = 'shipments[0].shipping_address.postal_code'
shipments_shipping_address_c_alias = 'shipments[0].shipping_address.c_alias'
shipments_shipping_address_c_latitude = 'shipments[0].shipping_address.c_latitude'
shipments_shipping_address_c_longitude = 'shipments[0].shipping_address.c_longitude'
shipments_shipping_method = 'shipments[0].shipping_method'
shipments_shipping_method_type = 'shipments[0].shipping_method._type'
shipments_shipping_method_id  = 'shipments[0].shipping_method.id'
shipments_shipping_method_description = 'shipments[0].shipping_method.description'
shipments_shipping_method_shipping_promotions = 'shipments[0].shipping_method.shipping_promotions'
shipments_shipping_method_shipping_promotions_type = 'shipments[0].shipping_method.shipping_promotions[0]._type'
shipments_shipping_method_shipping_promotions_callout_msg = 'shipments[0].shipping_method.shipping_promotions[0].callout_msg'
shipments_shipping_method_shipping_promotions_link = 'shipments[0].shipping_method.shipping_promotions[0].link'
shipments_shipping_method_shipping_promotions_promotion_id = 'shipments[0].shipping_method.shipping_promotions[0].promotion_id'
shipments_shipping_method_shipping_promotions_promotion_name = 'shipments[0].shipping_method.shipping_promotions[0].promotion_name'
shipments_shipping_method_c_estimatedArrivalTime = 'shipments[0].shipping_method.c_estimatedArrivalTime'
shipments_shipping_method_c_storePickupEnabled = 'shipments[0].shipping_method.c_storePickupEnabled'
shipments_shipping_status = 'shipments[0].shipping_status'
shipments_shipping_total_tax = 'shipments[0].shipping_total_tax'
shipments_shipping_total = 'shipments[0].shipping_total'
shipments_tax_total = 'shipments[0].tax_total'
shipments_c_serviceCharge = 'shipments[0].c_serviceCharge'
shipping_items_type = 'shipping_items[0]._type'
shipping_items = 'shipping_items'
shipments_c_totalShippingCost = 'shipments[0].c_totalShippingCost'
shipping_items_adjusted_tax = 'shipping_items[0].adjusted_tax'
shipping_items_base_price = 'shipping_items[0].base_price'
shipping_items_item_text = 'shipping_items[0].item_text'
shipping_items_item_id = 'shipping_items[0].item_id'
shipping_items_price = 'shipping_items[0].price'
shipping_items_price_after_item_discount = 'shipping_items[0].price_after_item_discount'
shipping_items_shipment_id = 'shipping_items[0].shipment_id'
shipping_items_tax = 'shipping_items[0].tax'
shipping_items_tax_basis = 'shipping_items[0].tax_basis'
shipping_items_tax_rate = 'shipping_items[0].tax_rate'
shipping_items_tax_class_id = 'shipping_items[0].tax_class_id'
shipping_total = 'shipping_total'
shipping_total_tax = 'shipping_total_tax'
tax_total = 'tax_total'
taxation = 'taxation'
c_currentCorporate = 'c_currentCorporate'
c_commentToCart = 'c_commentToCart'
c_isLock ='c_isLock'
c_isMiraklOrder = 'c_isMiraklOrder'
c_lockTime = 'c_lockTime'
c_miraklSH02Response = 'c_miraklSH02Response'
c_miraklShippingZoneCode = 'c_miraklShippingZoneCode'
c_pickerExpressShipment = 'c_pickerExpressShipment'
c_seller_id = 'c_seller_id'
c_formatedOrderTotal = 'c_formatedOrderTotal'
c_serviceChargeTotalGrossPrice = 'c_serviceChargeTotalGrossPrice'
c_formatedOrderTotal = 'c_formatedOrderTotal'
c_formatedProductTotal = 'c_formatedProductTotal'


CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments,_resource_state)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,adjusted_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments,adjusted_shipping_total_tax)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetPayment_instruments,agent_basket)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,basket_id)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments,billing_address)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,billing_address_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,billing_address_address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,billing_address_city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,billing_address_country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,billing_address_full_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,billing_address_first_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,billing_address_last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,billing_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,billing_address_postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,billing_address_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,billing_address_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,billing_address_c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,billing_address_c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,channel_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,creation_date)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,currency)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments,customer_info)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,customer_info_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,customer_info_customer_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,customer_info_customer_no)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,last_modified)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,customer_info_email)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,merchandize_total_tax)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments,notes)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,notes_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,notes_link)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments,order_total)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments,payment_instruments)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,payment_instruments_type)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments,payment_instruments_amount)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,payment_instruments_payment_instrument_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,payment_instruments_payment_method_id)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments,product_items)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_type)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,product_items_adjusted_tax)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,product_items_base_price)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetPayment_instruments,product_items_bonus_product_line_item)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetPayment_instruments,product_items_gift)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_inventory_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_item_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_item_text)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,product_items_price)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,product_items_price_after_item_discount)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_product_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_product_name)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,product_items_quantity)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,product_items_tax)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_tax_class_id)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,product_items_tax_basis)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,product_items_tax_rate)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_c_fromStoreId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_c_miraklChannels)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,product_items_c_miraklLatestDeliveryDays)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,product_items_c_miraklEarliestDeliveryDays)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_c_miraklLeadTimeToShip)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_c_miraklLineShippingPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_c_miraklOperatorProductId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_c_miraklShippingTaxes)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_c_miraklTaxes)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_c_offerId)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,product_items_c_offerSalesPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_c_offerState)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_c_offerStateCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_c_shopId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_c_shopName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,product_items_c_totalPrice)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,product_sub_total)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,product_total)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments,shipments)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,shipments_adjusted_merchandize_total_tax)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_type)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments,shipments_adjusted_shipping_total_tax)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetPayment_instruments,shipments_gift)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,shipments_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,shipments_product_sub_total)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,shipments_product_total)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipment_id)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,shipments_shipment_total)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments,shipments_shipping_address)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_address_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_address_address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_address_city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_address_country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_address_first_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_address_full_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_address_last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_address_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_address_postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_address_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_address_c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_address_c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments,shipments_shipping_method)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_method_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_method_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_method_description)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments,shipments_shipping_method_shipping_promotions)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_method_shipping_promotions_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_method_shipping_promotions_callout_msg)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_method_shipping_promotions_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_method_shipping_promotions_promotion_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_method_shipping_promotions_promotion_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_method_c_estimatedArrivalTime)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetPayment_instruments,shipments_shipping_method_c_storePickupEnabled)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipments_shipping_status)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments,shipments_shipping_total_tax)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,shipments_shipping_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments,shipments_tax_total)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,shipments_c_serviceCharge)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipping_items_type)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments,shipping_items)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments,shipments_c_totalShippingCost)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments,shipping_items_adjusted_tax)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,shipping_items_base_price)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipping_items_item_text)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipping_items_item_id)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,shipping_items_price)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,shipping_items_price_after_item_discount)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipping_items_shipment_id)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments,shipping_items_tax)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,shipping_items_tax_basis)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments,shipping_items_tax_rate)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,shipping_items_tax_class_id)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,shipping_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments,shipping_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments,tax_total)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,taxation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,c_currentCorporate)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,c_commentToCart)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetPayment_instruments,c_isLock)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetPayment_instruments,c_isMiraklOrder)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,c_lockTime)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,c_miraklSH02Response)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,c_miraklShippingZoneCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,c_pickerExpressShipment)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,c_seller_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,c_formatedOrderTotal)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments,c_serviceChargeTotalGrossPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,c_formatedOrderTotal)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments,c_formatedProductTotal)
*/


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
billing_address_c_alias	=	 'billing_address.c_alias'
billing_address_c_delegation	=	 'billing_address.c_delegation'
billing_address_c_label	=	 'billing_address.c_label'
billing_address_c_latitude	=	 'billing_address.c_latitude'
billing_address_c_longitude	=	 'billing_address.c_longitude'
billing_address_c_nExt	=	 'billing_address.c_nExt'
billing_address_c_neighborhood	=	 'billing_address.c_neighborhood'
billing_address_c_references	=	 'billing_address.c_references'
billing_address_c_rfc	=	 'billing_address.c_rfc'
billing_address_c_state	=	 'billing_address.c_state'
billing_address_c_streetName	=	 'billing_address.c_streetName'
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
payment_instruments_0__type	=	 'payment_instruments[0]._type'
payment_instruments_0_amount	=	 'payment_instruments[0].amount'

payment_instruments_0_payment_instrument_id	=	 'payment_instruments[0].payment_instrument_id'
payment_instruments_0_payment_method_id	=	 'payment_instruments[0].payment_method_id'
product_items_0__type	=	 'product_items[0]._type'
product_items_0_adjusted_tax	=	 'product_items[0].adjusted_tax'
product_items_0_base_price	=	 'product_items[0].base_price'
product_items_0_bonus_product_line_item	=	 'product_items[0].bonus_product_line_item'
product_items_0_gift	=	 'product_items[0].gift'
product_items_0_inventory_id	=	 'product_items[0].inventory_id'
product_items_0_item_id	=	 'product_items[0].item_id'
product_items_0_item_text	=	 'product_items[0].item_text'
product_items_0_price	=	 'product_items[0].price'
product_items_0_price_after_item_discount	=	 'product_items[0].price_after_item_discount'
product_items_0_price_after_order_discount	=	 'product_items[0].price_after_order_discount'
product_items_0_product_id	=	 'product_items[0].product_id'
product_items_0_product_name	=	 'product_items[0].product_name'
product_items_0_quantity	=	 'product_items[0].quantity'
product_items_0_tax	=	 'product_items[0].tax'
product_items_0_tax_basis	=	 'product_items[0].tax_basis'
product_items_0_tax_class_id	=	 'product_items[0].tax_class_id'
product_items_0_tax_rate	=	 'product_items[0].tax_rate'
product_items_0_c_fromStoreId	=	 'product_items[0].c_fromStoreId'
product_items_0_c_miraklChannels	=	 'product_items[0].c_miraklChannels'
product_items_0_c_miraklEarliestDeliveryDays	=	 'product_items[0].c_miraklEarliestDeliveryDays'
product_items_0_c_miraklLatestDeliveryDays	=	 'product_items[0].c_miraklLatestDeliveryDays'
product_items_0_c_miraklLeadTimeToShip	=	 'product_items[0].c_miraklLeadTimeToShip'
product_items_0_c_miraklLineShippingPrice	=	 'product_items[0].c_miraklLineShippingPrice'
product_items_0_c_miraklOperatorProductId	=	 'product_items[0].c_miraklOperatorProductId'
product_items_0_c_miraklShippingTaxes	=	 'product_items[0].c_miraklShippingTaxes'
product_items_0_c_miraklTaxes	=	 'product_items[0].c_miraklTaxes'
product_items_0_c_noOfPersons	=	 'product_items[0].c_noOfPersons'
product_items_0_c_offerId	=	 'product_items[0].c_offerId'
product_items_0_c_offerSalesPrice	=	 'product_items[0].c_offerSalesPrice'
product_items_0_c_offerState	=	 'product_items[0].c_offerState'
product_items_0_c_offerStateCode	=	 'product_items[0].c_offerStateCode'
product_items_0_c_shopId	=	 'product_items[0].c_shopId'
product_items_0_c_shopName	=	 'product_items[0].c_shopName'
product_items_0_c_total_crossed_price	=	 'product_items[0].c_total_crossed_price'
product_items_0_c_priceWithComplement	=	 'product_items[0].c_priceWithComplement'
product_sub_total	=	 'product_sub_total'
product_total	=	 'product_total'
shipments_0__type	=	 'shipments[0]._type'
shipments_0_adjusted_merchandize_total_tax	=	 'shipments[0].adjusted_merchandize_total_tax'
shipments_0_adjusted_shipping_total_tax	=	 'shipments[0].adjusted_shipping_total_tax'
shipments_0_gift	=	 'shipments[0].gift'
shipments_0_merchandize_total_tax	=	 'shipments[0].merchandize_total_tax'
shipments_0_product_sub_total	=	 'shipments[0].product_sub_total'
shipments_0_product_total	=	 'shipments[0].product_total'
shipments_0_shipment_id	=	 'shipments[0].shipment_id'
shipments_0_shipment_total	=	 'shipments[0].shipment_total'
shipments_0_shipping_address__type	=	 'shipments[0].shipping_address._type'
shipments_0_shipping_address_address1	=	 'shipments[0].shipping_address.address1'
shipments_0_shipping_address_city	=	 'shipments[0].shipping_address.city'
shipments_0_shipping_address_country_code	=	 'shipments[0].shipping_address.country_code'
shipments_0_shipping_address_first_name	=	 'shipments[0].shipping_address.first_name'
shipments_0_shipping_address_full_name	=	 'shipments[0].shipping_address.full_name'
shipments_0_shipping_address_id	=	 'shipments[0].shipping_address.id'
shipments_0_shipping_address_last_name	=	 'shipments[0].shipping_address.last_name'
shipments_0_shipping_address_phone	=	 'shipments[0].shipping_address.phone'
shipments_0_shipping_address_postal_code	=	 'shipments[0].shipping_address.postal_code'
shipments_0_shipping_address_c_alias	=	 'shipments[0].shipping_address.c_alias'
shipments_0_shipping_address_c_delegation	=	 'shipments[0].shipping_address.c_delegation'
shipments_0_shipping_address_c_label	=	 'shipments[0].shipping_address.c_label'
shipments_0_shipping_address_c_latitude	=	 'shipments[0].shipping_address.c_latitude'
shipments_0_shipping_address_c_longitude	=	 'shipments[0].shipping_address.c_longitude'
shipments_0_shipping_address_c_nExt	=	 'shipments[0].shipping_address.c_nExt'
shipments_0_shipping_address_c_neighborhood	=	 'shipments[0].shipping_address.c_neighborhood'
shipments_0_shipping_address_c_references	=	 'shipments[0].shipping_address.c_references'
shipments_0_shipping_address_c_rfc	=	 'shipments[0].shipping_address.c_rfc'
shipments_0_shipping_address_c_state	=	 'shipments[0].shipping_address.c_state'
shipments_0_shipping_address_c_streetName	=	 'shipments[0].shipping_address.c_streetName'
shipments_0_shipping_method__type	=	 'shipments[0].shipping_method._type'
shipments_0_shipping_method_description	=	 'shipments[0].shipping_method.description'
shipments_0_shipping_method_id	=	 'shipments[0].shipping_method.id'
shipments_0_shipping_method_name	=	 'shipments[0].shipping_method.name'
shipments_0_shipping_method_c_estimatedArrivalTime	=	 'shipments[0].shipping_method.c_estimatedArrivalTime'
shipments_0_shipping_method_c_storePickupEnabled	=	 'shipments[0].shipping_method.c_storePickupEnabled'
shipments_0_shipping_status	=	 'shipments[0].shipping_status'
shipments_0_shipping_total	=	 'shipments[0].shipping_total'
shipments_0_shipping_total_tax	=	 'shipments[0].shipping_total_tax'
shipments_0_tax_total	=	 'shipments[0].tax_total'
shipments_0_c_serviceCharge	=	 'shipments[0].c_serviceCharge'
shipments_0_c_shippingRates	=	 'shipments[0].c_shippingRates'
shipments_0_c_totalShippingCost	=	 'shipments[0].c_totalShippingCost'
shipping_items_0__type	=	 'shipping_items[0]._type'
shipping_items_0_adjusted_tax	=	 'shipping_items[0].adjusted_tax'
shipping_items_0_base_price	=	 'shipping_items[0].base_price'
shipping_items_0_item_id	=	 'shipping_items[0].item_id'
shipping_items_0_item_text	=	 'shipping_items[0].item_text'
shipping_items_0_price	=	 'shipping_items[0].price'
shipping_items_0_price_after_item_discount	=	 'shipping_items[0].price_after_item_discount'
shipping_items_0_shipment_id	=	 'shipping_items[0].shipment_id'
shipping_items_0_tax	=	 'shipping_items[0].tax'
c_seller_id= 'c_seller_id'
c_serviceChargeTotalGrossPrice='c_serviceChargeTotalGrossPrice'
c_formatedOrderTotal='c_formatedOrderTotal'
c_formatedProductTotal='c_formatedProductTotal'


CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, _v)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, _v)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, _type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, _type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, _resource_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, _resource_state)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, adjusted_merchandize_total_tax)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, adjusted_shipping_total_tax)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetPayment_instruments, agent_basket)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, basket_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, basket_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_address1)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_city)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_country_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_first_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_full_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_full_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_last_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_phone)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_postal_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_c_alias)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_c_delegation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_c_delegation)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_c_delegation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_c_delegation)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_c_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_c_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_c_latitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_c_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_c_nExt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_c_nExt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_c_neighborhood)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_c_neighborhood)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_c_references)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_c_references)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_c_rfc)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_c_rfc)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_c_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_c_state)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, billing_address_c_streetName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, billing_address_c_streetName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, channel_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, channel_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, customer_info__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, customer_info__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, customer_info_customer_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, customer_info_customer_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, customer_info_customer_no)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, customer_info_customer_no)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, customer_info_email)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, customer_info_email)


CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, last_modified)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, last_modified)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, merchandize_total_tax)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, notes__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, notes__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, notes_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, notes_link)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, order_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, payment_instruments_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, payment_instruments_0__type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, payment_instruments_0_amount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, payment_instruments_0_payment_instrument_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, payment_instruments_0_payment_instrument_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, payment_instruments_0_payment_method_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, payment_instruments_0_payment_method_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, product_items_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, product_items_0__type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, product_items_0_adjusted_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, product_items_0_base_price)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetPayment_instruments, product_items_0_bonus_product_line_item)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetPayment_instruments, product_items_0_gift)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, product_items_0_inventory_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, product_items_0_inventory_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, product_items_0_item_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, product_items_0_item_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, product_items_0_item_text)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, product_items_0_item_text)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, product_items_0_price)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, product_items_0_price_after_item_discount)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, product_items_0_price_after_order_discount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, product_items_0_product_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, product_items_0_product_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, product_items_0_product_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, product_items_0_product_name)

CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments, product_items_0_quantity)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, product_items_0_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, product_items_0_tax_basis)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, product_items_0_tax_class_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, product_items_0_tax_class_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, product_items_0_tax_rate)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, product_items_0_c_fromStoreId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, product_items_0_c_fromStoreId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, product_items_0_c_miraklChannels)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, product_items_0_c_miraklChannels)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, product_items_0_c_miraklOperatorProductId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, product_items_0_c_miraklOperatorProductId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, product_items_0_c_miraklShippingTaxes)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, product_items_0_c_miraklShippingTaxes)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, product_items_0_c_miraklTaxes)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, product_items_0_c_miraklTaxes)

CustomKeywords.'totalplay.Common.getNumValueofObject'(SetPayment_instruments, product_items_0_c_noOfPersons)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, product_items_0_c_offerId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, product_items_0_c_offerId)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, product_items_0_c_offerSalesPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, product_items_0_c_offerState)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, product_items_0_c_offerState)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, product_items_0_c_offerStateCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, product_items_0_c_offerStateCode)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, product_items_0_c_shopId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, product_items_0_c_shopId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, product_items_0_c_shopName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, product_items_0_c_shopName)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, product_items_0_c_total_crossed_price)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, product_items_0_c_priceWithComplement)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, product_sub_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, product_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0__type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, shipments_0_adjusted_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, shipments_0_adjusted_shipping_total_tax)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetPayment_instruments, shipments_0_gift)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, shipments_0_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, shipments_0_product_sub_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, shipments_0_product_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipment_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, shipments_0_shipment_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address_address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address_address1)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address_city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address_city)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address_country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address_country_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address_first_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address_full_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address_full_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address_last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address_last_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address_phone)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address_postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address_postal_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address_c_alias)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address_c_delegation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address_c_delegation)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address_c_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address_c_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address_c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address_c_latitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address_c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address_c_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address_c_nExt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address_c_nExt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address_c_neighborhood)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address_c_neighborhood)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address_c_references)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address_c_references)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address_c_rfc)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address_c_rfc)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address_c_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address_c_state)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_address_c_streetName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_address_c_streetName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_method__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_method__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_method_description)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_method_description)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_method_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_method_name)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_method_c_estimatedArrivalTime)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_method_c_estimatedArrivalTime)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetPayment_instruments, shipments_0_shipping_method_c_storePickupEnabled)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, shipments_0_shipping_status)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, shipments_0_shipping_status)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, shipments_0_shipping_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, shipments_0_shipping_total_tax)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, c_seller_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, c_seller_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetPayment_instruments, c_serviceChargeTotalGrossPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, c_formatedOrderTotal)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, c_formatedOrderTotal)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetPayment_instruments, c_formatedProductTotal)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetPayment_instruments, c_formatedProductTotal)
