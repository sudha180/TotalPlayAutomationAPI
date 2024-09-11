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

crm_add = 'data[0].c_crm_address_id'
GlobalVariable.crm_address = WS.getElementPropertyValue(GetAddress, crm_add)

WS.verifyResponseStatusCode(GetAddress, 200)

SetBillingShipment_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Checkout/Set Billing and Shipment', [('URL') : GlobalVariable.URL
            , ('SITEID') : GlobalVariable.SITEID, ('basketID') : GlobalVariable.basketID]))

CustomKeywords.'totalplay.Common.printResponseinText'(SetBillingShipment_Response)
WS.verifyResponseStatusCode(SetBillingShipment_Response, 200)

MethodCreditCard = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Checkout/Submit Payment Method-Credit Card', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID
            , ('basketID') : GlobalVariable.basketID]))

WS.verifyResponseStatusCode(SetBillingShipment_Response, 200)

_type = '_type'
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
shipping_items_ax_basis= 'shipping_items[0].tax_basis'
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