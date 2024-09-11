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

AddProductbasket = WS.sendRequest(findTestObject('TotalPlay-Food/AddProductToBasket', [('URL') : GlobalVariable.URL, ('basketID') : GlobalVariable.basketID]))

WS.verifyResponseStatusCode(AddProductbasket, 200)

getAddress = WS.sendRequest(findTestObject('TotalPlay-Food/GetAddresses', [('URL') : GlobalVariable.URL, ('sla_customerId') : GlobalVariable.sla_customerId
			, ('shop_auth_token') : GlobalVariable.shop_auth_token]))


WS.verifyResponseStatusCode(getAddress, 200)

AddAddressToCart = WS.sendRequest(findTestObject('TotalPlay-Food/add address to cart', [('URL') : GlobalVariable.URL, ('basketID') : GlobalVariable.basketID]))

WS.verifyResponseStatusCode(AddAddressToCart, 200)

SetPayment_instruments = WS.sendRequest(findTestObject('TotalPlay-Food/SetPayment_instruments - Credit Card', [('URL') : GlobalVariable.URL, ('basketID') : GlobalVariable.basketID
			, ('shop_auth_token') : GlobalVariable.shop_auth_token, ('orderTotal') : GlobalVariable.orderTotal]))

WS.verifyResponseStatusCode(SetPayment_instruments, 200)


PreAuth = WS.sendRequest(findTestObject('TotalPlay-Food/Pre-Auth', [('URL') : GlobalVariable.URL, ('basketID') : GlobalVariable.FoodBasketId]))

WS.verifyResponseStatusCode(PreAuth, 200)

PlaceOrder = WS.sendRequest(findTestObject('TotalPlay-Food/PlaceOrder', [('URL') : GlobalVariable.URL, ('shop_auth_token') : GlobalVariable.shop_auth_token
            , ('basketID') : GlobalVariable.FoodBasketId]))

CustomKeywords.'totalplay.Common.printResponseinText'(PlaceOrder)

WS.verifyResponseStatusCode(PlaceOrder, 200)


/*
_resource_state = '_resource_state'

adjusted_merchandize_total_tax = 'adjusted_merchandize_total_tax'

adjusted_shipping_total_tax = 'adjusted_shipping_total_tax'

billing_address = 'billing_address'

billing_address_type = 'billing_address._type'

billing_address_address1 = 'billing_address.address1'

billing_address_city = 'billing_address.city'

billing_address_country_code = 'billing_address.country_code'

billing_address_full_name = 'billing_address.full_name'

billing_address_first_name = 'billing_address.first_name'

billing_address_id = 'billing_address.id'

billing_address_last_name = 'billing_address.last_name'

billing_address_phone = 'billing_address.phone'

billing_address_postal_code = 'billing_address.postal_code'

billing_address_c_alias = 'billing_address.c_alias'

billing_address_c_latitude = 'billing_address.c_latitude'

billing_address_c_longitude = 'billing_address.c_longitude'

channel_type = 'channel_type'

confirmation_status = 'confirmation_status'

created_by = 'created_by'

creation_date = 'creation_date'

currency = 'currency'

customer_info = 'customer_info'

customer_info_type = 'customer_info._type'

customer_info_customer_id = 'customer_info.customer_id'

customer_info_customer_name = 'customer_info.customer_name'

customer_info_customer_no = 'customer_info.customer_no'

customer_info_email = 'customer_info.email'

customer_name = 'customer_name'

export_status = 'export_status'

guest = 'guest'

last_modified = 'last_modified'

merchandize_total_tax = 'merchandize_total_tax'

notes = 'notes'

notes_type = 'notes._type'

notes_link = 'notes.link'

order_no = 'order_no'

order_token = 'order_token'

order_total = 'order_total'

payment_status = 'payment_status'

product_total = 'product_total'

product_sub_total = 'product_sub_total'

shipments = 'shipments'

shipments0_type = 'shipments[0]._type'

shipments0_adjusted_merchandize_total_tax = 'shipments[0].adjusted_merchandize_total_tax'

shipments0_adjusted_shipping_total_tax = 'shipments[0].adjusted_shipping_total_tax'

shipments0_gift = 'shipments[0].gift'

shipments0_merchandize_total_tax = 'shipments[0].merchandize_total_tax'

shipments0_product_sub_total = 'shipments[0].product_sub_total'

shipments0_product_total = 'shipments[0].product_total'

shipments0_shipment_id = 'shipments[0].shipment_id'

shipments0_shipment_no = 'shipments[0].shipment_no'

shipments0_shipment_total = 'shipments[0].shipment_total'

shipments0_shipping_address = 'shipments[0].shipping_address'

shipments0_shipping_address_type = 'shipments[0].shipping_address._type'

shipments0_shipping_address_address1 = 'shipments[0].shipping_address.address1'

shipments0_shipping_address_city = 'shipments[0].shipping_address.city'

shipments0_shipping_address_country_code = 'shipments[0].shipping_address.country_code'

shipments0_shipping_address_first_name = 'shipments[0].shipping_address.first_name'

shipments0_shipping_address_full_name = 'shipments[0].shipping_address.full_name'

shipments0_shipping_address_id = 'shipments[0].shipping_address.id'

shipments0_shipping_address_last_name = 'shipments[0].shipping_address.last_name'

shipments0_shipping_address_phone = 'shipments[0].shipping_address.phone'

shipments0_shipping_address_postal_code = 'shipments[0].shipping_address.postal_code'

shipments0_shipping_address_c_alias = 'shipments[0].shipping_address.c_alias'

shipments0_shipping_address_c_latitude = 'shipments[0].shipping_address.c_latitude'

shipments0_shipping_address_c_longitude = 'shipments[0].shipping_address.c_longitude'

shipments0_shipping_method = 'shipments[0].shipping_method'

shipments0_shipping_method_type = 'shipments[0].shipping_method._type'

shipments0_shipping_method_description = 'shipments[0].shipping_method.description'

shipments0_shipping_method_id = 'shipments[0].shipping_method.id'

shipments0_shipping_method_name = 'shipments[0].shipping_method.name'

shipments0_shipping_method_shipping_promotions = 'shipments[0].shipping_method.shipping_promotions'

shipments0_shipping_method_shipping_promotions0_type = 'shipments[0].shipping_method.shipping_promotions[0]._type'

shipments0_shipping_method_shipping_promotions0_callout_msg = 'shipments[0].shipping_method.shipping_promotions[0].callout_msg'

shipments0_shipping_method_shipping_promotions0_link = 'shipments[0].shipping_method.shipping_promotions[0].link'

shipments0_shipping_method_shipping_promotions0_promotion_id = 'shipments[0].shipping_method.shipping_promotions[0].promotion_id'

shipments0_shipping_method_shipping_promotions0_promotion_name = 'shipments[0].shipping_method.shipping_promotions[0].promotion_name'

shipments0_shipping_method_c_estimatedArrivalTime = 'shipments[0].shipping_method.c_estimatedArrivalTime'

shipments0_shipping_method_c_storePickupEnabled = 'shipments[0].shipping_method.c_storePickupEnabled'

shipments0_shipping_status = 'shipments[0].shipping_status'

shipments0_shipping_total = 'shipments[0].shipping_total'

shipments0_shipping_total_tax = 'shipments[0].shipping_total_tax'

shipments0_tax_total = 'shipments[0].tax_total'

shipments0_c_miraklShippingLabel = 'shipments[0].c_miraklShippingLabel'

shipments0_c_shopId = 'shipments[0].c_shopId'

shipments0_c_serviceCharge = 'shipments[0].c_serviceCharge'

shipments0_c_shopName = 'shipments[0].c_shopName'

shipments0_c_totalShippingCost = 'shipments[0].c_totalShippingCost'

shipments0_c_productItems = 'shipments[0].c_productItems'

shipments0_c_productItems0_type = 'shipments[0].c_productItems[0]._type'

shipments0_c_productItems0_adjusted_tax = 'shipments[0].c_productItems[0].adjusted_tax'

shipments0_c_productItems0_base_price = 'shipments[0].c_productItems[0].base_price'

shipments0_c_productItems0_bonus_product_line_item = 'shipments[0].c_productItems[0].bonus_product_line_item'

shipments0_c_productItems0_gift = 'shipments[0].c_productItems[0].gift'

shipments0_c_productItems0_inventory_id = 'shipments[0].c_productItems[0].inventory_id'

shipments0_c_productItems0_item_id = 'shipments[0].c_productItems[0].item_id'

shipments0_c_productItems0_item_text = 'shipments[0].c_productItems[0].item_text'

shipments0_c_productItems0_price = 'shipments[0].c_productItems[0].price'

shipments0_c_productItems0_price_after_item_discount = 'shipments[0].c_productItems[0].price_after_item_discount'

shipments0_c_productItems0_price_after_order_discount = 'shipments[0].c_productItems[0].price_after_order_discount'

shipments0_c_productItems0_product_id = 'shipments[0].c_productItems[0].product_id'

shipments0_c_productItems0_product_name = 'shipments[0].c_productItems[0].product_name'

shipments0_c_productItems0_quantity = 'shipments[0].c_productItems[0].quantity'

shipments0_c_productItems0_shipment_id = 'shipments[0].c_productItems[0].shipment_id'

shipments0_c_productItems0_tax = 'shipments[0].c_productItems[0].tax'

shipments0_c_productItems0_tax_basis = 'shipments[0].c_productItems[0].tax_basis'

shipments0_c_productItems0_tax_class_id = 'shipments[0].c_productItems[0].tax_class_id'

shipments0_c_productItems0_tax_rate = 'shipments[0].c_productItems[0].tax_rate'

shipments0_c_productItems0_c_fromStoreId = 'shipments[0].c_productItems[0].c_fromStoreId'

shipments0_c_productItems0_c_miraklChannels = 'shipments[0].c_productItems[0].c_miraklChannels'

shipments0_c_productItems0_c_miraklEarliestDeliveryDays = 'shipments[0].c_productItems[0].c_miraklEarliestDeliveryDays'

shipments0_c_productItems0_c_miraklLatestDeliveryDays = 'shipments[0].c_productItems[0].c_miraklLatestDeliveryDays'

shipments0_c_productItems0_c_miraklLeadTimeToShip = 'shipments[0].c_productItems[0].c_miraklLeadTimeToShip'

shipments0_c_productItems0_c_miraklLineShippingPrice = 'shipments[0].c_productItems[0].c_miraklLineShippingPrice'

shipments0_c_productItems0_c_miraklOperatorProductId = 'shipments[0].c_productItems[0].c_miraklOperatorProductId'

shipments0_c_productItems0_c_miraklShippingTaxes = 'shipments[0].c_productItems[0].c_miraklShippingTaxes'

shipments0_c_productItems0_c_miraklTaxes = 'shipments[0].c_productItems[0].c_miraklTaxes'

shipments0_c_productItems0_c_offerId = 'shipments[0].c_productItems[0].c_offerId'

shipments0_c_productItems0_c_offerSalesPrice = 'shipments[0].c_productItems[0].c_offerSalesPrice'

shipments0_c_productItems0_c_offerState = 'shipments[0].c_productItems[0].c_offerState'

shipments0_c_productItems0_c_offerStateCode = 'shipments[0].c_productItems[0].c_offerStateCode'

shipments0_c_productItems0_c_shopId = 'shipments[0].c_productItems[0].c_shopId'

shipments0_c_productItems0_c_shopName = 'shipments[0].c_productItems[0].c_shopName'

shipments0_c_productItems0_c_imagesData = 'shipments[0].c_productItems[0].c_imagesData'

shipments0_c_productItems0_c_imagesData_large = 'shipments[0].c_productItems[0].c_imagesData.large'

shipments0_c_productItems0_c_imagesData_large0_alt = 'shipments[0].c_productItems[0].c_imagesData.large[0].alt'

shipments0_c_productItems0_c_imagesData_large0_url = 'shipments[0].c_productItems[0].c_imagesData.large[0].url'

shipments0_c_productItems0_c_imagesData_large0_title = 'shipments[0].c_productItems[0].c_imagesData.large[0].title'

shipments0_c_productItems0_c_description = 'shipments[0].c_productItems[0].c_description'

shipments0_c_productItems1_type = 'shipments[0].c_productItems[1]._type'

shipments0_c_productItems1_adjusted_tax = 'shipments[0].c_productItems[1].adjusted_tax'

shipments0_c_productItems1_base_price = 'shipments[0].c_productItems[1].base_price'

shipments0_c_productItems1_bonus_product_line_item = 'shipments[0].c_productItems[1].bonus_product_line_item'

shipments0_c_productItems1_gift = 'shipments[0].c_productItems[1].gift'

shipments0_c_productItems1_inventory_id = 'shipments[0].c_productItems[1].inventory_id'

shipments0_c_productItems1_item_id = 'shipments[0].c_productItems[1].item_id'

shipments0_c_productItems1_item_text = 'shipments[0].c_productItems[1].item_text'

shipments0_c_productItems1_price = 'shipments[0].c_productItems[1].price'

shipments0_c_productItems1_price_after_item_discount = 'shipments[0].c_productItems[1].price_after_item_discount'

shipments0_c_productItems1_price_after_order_discount = 'shipments[0].c_productItems[1].price_after_order_discount'

shipments0_c_productItems1_product_id = 'shipments[0].c_productItems[1].product_id'

shipments0_c_productItems1_product_name = 'shipments[0].c_productItems[1].product_name'

shipments0_c_productItems1_quantity = 'shipments[0].c_productItems[1].quantity'

shipments0_c_productItems1_shipment_id = 'shipments[0].c_productItems[1].shipment_id'

shipments0_c_productItems1_tax = 'shipments[0].c_productItems[1].tax'

shipments0_c_productItems1_tax_basis = 'shipments[0].c_productItems[1].tax_basis'

shipments0_c_productItems1_tax_class_id = 'shipments[0].c_productItems[1].tax_class_id'

shipments0_c_productItems1_tax_rate = 'shipments[0].c_productItems[1].tax_rate'

shipments0_c_productItems1_c_fromStoreId = 'shipments[0].c_productItems[1].c_fromStoreId'

shipments0_c_productItems1_c_miraklChannels = 'shipments[0].c_productItems[1].c_miraklChannels'

shipments0_c_productItems1_c_miraklOperatorProductId = 'shipments[0].c_productItems[1].c_miraklOperatorProductId'

shipments0_c_productItems1_c_miraklShippingTaxes = 'shipments[0].c_productItems[1].c_miraklShippingTaxes'

shipments0_c_productItems1_c_miraklTaxes = 'shipments[0].c_productItems[1].c_miraklTaxes'

shipments0_c_productItems1_c_offerId = 'shipments[0].c_productItems[1].c_offerId'

shipments0_c_productItems1_c_offerSalesPrice = 'shipments[0].c_productItems[1].c_offerSalesPrice'

shipments0_c_productItems1_c_offerState = 'shipments[0].c_productItems[1].c_offerState'

shipments0_c_productItems1_c_offerStateCode = 'shipments[0].c_productItems[1].c_offerStateCode'

shipments0_c_productItems1_c_shopId = 'shipments[0].c_productItems[1].c_shopId'

shipments0_c_productItems1_c_shopName = 'shipments[0].c_productItems[1].c_shopName'

shipments0_c_productItems1_c_imagesData = 'shipments[0].c_productItems[1].c_imagesData'

shipments0_c_productItems1_c_imagesData_large = 'shipments[0].c_productItems[1].c_imagesData.large'

shipments0_c_productItems1_c_imagesData_large0_alt = 'shipments[0].c_productItems[1].c_imagesData.large[0].alt'

shipments0_c_productItems1_c_imagesData_large0_url = 'shipments[0].c_productItems[1].c_imagesData.large[0].url'

shipments0_c_productItems1_c_imagesData_large0_title = 'shipments[0].c_productItems[1].c_imagesData.large[0].title'

shipments0_c_productItems1_c_description = 'shipments[0].c_productItems[1].c_description'

shipments0_c_paymentInstruments = 'shipments[0].c_paymentInstruments'

shipments0_c_paymentInstruments0_type = 'shipments[0].c_paymentInstruments[0]._type'

shipments0_c_paymentInstruments0_amount = 'shipments[0].c_paymentInstruments[0].amount'

shipments0_c_paymentInstruments0_payment_card = 'shipments[0].c_paymentInstruments[0].payment_card'

shipments0_c_paymentInstruments0_payment_card_type = 'shipments[0].c_paymentInstruments[0].payment_card._type'

shipments0_c_paymentInstruments0_payment_card_card_type = 'shipments[0].c_paymentInstruments[0].payment_card.card_type'

shipments0_c_paymentInstruments0_payment_card_credit_card_expired = 'shipments[0].c_paymentInstruments[0].payment_card.credit_card_expired'

shipments0_c_paymentInstruments0_payment_card_expiration_month = 'shipments[0].c_paymentInstruments[0].payment_card.expiration_month'

shipments0_c_paymentInstruments0_payment_card_expiration_year = 'shipments[0].c_paymentInstruments[0].payment_card.expiration_year'

shipments0_c_paymentInstruments0_payment_card_holder = 'shipments[0].c_paymentInstruments[0].payment_card.holder'

shipments0_c_paymentInstruments0_payment_instrument_id = 'shipments[0].c_paymentInstruments[0].payment_instrument_id'

shipments0_c_paymentInstruments0_payment_method_id = 'shipments[0].c_paymentInstruments[0].payment_method_id'

shipping_items = 'shipping_items'

shipping_items0_type = 'shipping_items[0]._type'

shipping_items0_adjusted_tax = 'shipping_items[0].adjusted_tax'

shipping_items0_base_price = 'shipping_items[0].base_price'

shipping_items0_item_id = 'shipping_items[0].item_id'

shipping_items0_item_text = 'shipping_items[0].item_text'

shipping_items0_price = 'shipping_items[0].price'

shipping_items0_price_after_item_discount = 'shipping_items[0].price_after_item_discount'

shipping_items0_shipment_id = 'shipping_items[0].shipment_id'

shipping_items0_tax = 'shipping_items[0].tax'

shipping_items0_tax_basis = 'shipping_items[0].tax_basis'

shipping_items0_tax_class_id = 'shipping_items[0].tax_class_id'

shipping_items0_tax_rate = 'shipping_items[0].tax_rate'

shipping_status = 'shipping_status'

shipping_total = 'shipping_total'

shipping_total_tax = 'shipping_total_tax'

site_id = 'site_id'

status = 'status'

taxation = 'taxation'

tax_total = 'tax_total'

c_commentToCart = 'c_commentToCart'

c_currentCorporate = 'c_currentCorporate'

c_isMiraklOrder = 'c_isMiraklOrder'

c_miraklCustomerId = 'c_miraklCustomerId'

c_miraklFraudCheckStatus = 'c_miraklFraudCheckStatus'

c_miraklOrderCreationResponse = 'c_miraklOrderCreationResponse'

c_miraklOrderValidationStatus = 'c_miraklOrderValidationStatus'

c_miraklSH02Response = 'c_miraklSH02Response'

c_miraklShippingZoneCode = 'c_miraklShippingZoneCode'

c_miraklSynchronizationStatus = 'c_miraklSynchronizationStatus'

c_seller_id = 'c_seller_id'

c_shipmentNote = 'c_shipmentNote'

c_products_count = 'c_products_count'

c_ShippingTotalGrossPrice = 'c_ShippingTotalGrossPrice'

c_onDemandstoreDetails = 'c_onDemandstoreDetails'

c_onDemandstoreDetails_ID = 'c_onDemandstoreDetails.ID'

c_onDemandstoreDetails_name = 'c_onDemandstoreDetails.name'

c_onDemandstoreDetails_image = 'c_onDemandstoreDetails.image'

c_onDemandstoreDetails_latitude = 'c_onDemandstoreDetails.latitude'

c_onDemandstoreDetails_longitude = 'c_onDemandstoreDetails.longitude'

c_onDemandstoreDetails_email = 'c_onDemandstoreDetails.email'

c_onDemandstoreDetails_storeType = 'c_onDemandstoreDetails.storeType'

c_onDemandstoreDetails_verticalType = 'c_onDemandstoreDetails.verticalType'

c_formatedShippingTotalGrossPrice = 'c_formatedShippingTotalGrossPrice'

c_formatedOrderTotal = 'c_formatedOrderTotal'

c_formatedProductTotal = 'c_formatedProductTotal'

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, _resource_state)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, adjusted_merchandize_total_tax)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, adjusted_shipping_total_tax)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_address1)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_city)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_country_code)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_full_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_last_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_phone)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_postal_code)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_c_alias)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_c_latitude)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_c_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, channel_type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, confirmation_status)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, created_by)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, creation_date)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, currency)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, customer_info)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, customer_info_type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, customer_info_customer_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, customer_info_customer_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, customer_info_customer_no)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, customer_info_email)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, customer_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, export_status)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, guest)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, last_modified)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, merchandize_total_tax)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, notes)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, notes_type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, notes_link)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, order_no)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, order_token)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, order_total)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, payment_status)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, product_total)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, product_sub_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments0_adjusted_merchandize_total_tax)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments0_adjusted_shipping_total_tax)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, shipments0_gift)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments0_merchandize_total_tax)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments0_product_sub_total)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments0_product_total)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipment_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipment_no)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments0_shipment_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments0_shipping_address)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_address_type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_address_address1)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_address_city)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_address_country_code)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_address_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_address_full_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_address_last_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_address_phone)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_address_postal_code)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_address_c_alias)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_address_c_latitude)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_address_c_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments0_shipping_method)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_method_type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_method_description)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_method_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_method_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments0_shipping_method_shipping_promotions)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_method_shipping_promotions0_type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_method_shipping_promotions0_callout_msg)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_method_shipping_promotions0_link)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_method_shipping_promotions0_promotion_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_method_shipping_promotions0_promotion_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_method_c_estimatedArrivalTime)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, shipments0_shipping_method_c_storePickupEnabled)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_shipping_status)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments0_shipping_total)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments0_shipping_total_tax)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments0_tax_total)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_miraklShippingLabel)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_shopId)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments0_c_serviceCharge)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_shopName)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments0_c_totalShippingCost)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments0_c_productItems)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments0_c_productItems0_adjusted_tax)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments0_c_productItems0_base_price)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, shipments0_c_productItems0_bonus_product_line_item)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, shipments0_c_productItems0_gift)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_inventory_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_item_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_item_text)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments0_c_productItems0_price)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments0_c_productItems0_price_after_item_discount)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments0_c_productItems0_price_after_order_discount)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_product_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_product_name)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments0_c_productItems0_quantity)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_shipment_id)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments0_c_productItems0_tax)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments0_c_productItems0_tax_basis)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_tax_class_id)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments0_c_productItems0_tax_rate)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_c_fromStoreId)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_c_miraklChannels)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments0_c_productItems0_c_miraklEarliestDeliveryDays)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments0_c_productItems0_c_miraklLatestDeliveryDays)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments0_c_productItems0_c_miraklLeadTimeToShip)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments0_c_productItems0_c_miraklLineShippingPrice)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_c_miraklOperatorProductId)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_c_miraklShippingTaxes)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_c_miraklTaxes)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_c_offerId)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments0_c_productItems0_c_offerSalesPrice)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_c_offerState)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_c_offerStateCode)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_c_shopId)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_c_shopName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments0_c_productItems0_c_imagesData)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments0_c_productItems0_c_imagesData_large)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_c_imagesData_large0_alt)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_c_imagesData_large0_url)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_c_imagesData_large0_title)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_productItems0_c_description)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments0_c_paymentInstruments)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_paymentInstruments0_type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments0_c_paymentInstruments0_amount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments0_c_paymentInstruments0_payment_card)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_paymentInstruments0_payment_card_type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_paymentInstruments0_payment_card_card_type)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, shipments0_c_paymentInstruments0_payment_card_credit_card_expired)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments0_c_paymentInstruments0_payment_card_expiration_month)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments0_c_paymentInstruments0_payment_card_expiration_year)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_paymentInstruments0_payment_card_holder)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_paymentInstruments0_payment_instrument_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments0_c_paymentInstruments0_payment_method_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipping_items)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipping_items0_type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipping_items0_adjusted_tax)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipping_items0_base_price)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipping_items0_item_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipping_items0_item_text)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipping_items0_price)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipping_items0_price_after_item_discount)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipping_items0_shipment_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipping_items0_tax)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipping_items0_tax_basis)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipping_items0_tax_class_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipping_items0_tax_rate)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipping_status)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipping_total)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipping_total_tax)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, site_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, status)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, taxation)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, tax_total)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_commentToCart)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_currentCorporate)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, c_isMiraklOrder)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_miraklCustomerId)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_miraklFraudCheckStatus)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_miraklOrderCreationResponse)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_miraklOrderValidationStatus)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_miraklSH02Response)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_miraklShippingZoneCode)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_miraklSynchronizationStatus)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_seller_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_shipmentNote)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, c_products_count)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, c_ShippingTotalGrossPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, c_onDemandstoreDetails)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_onDemandstoreDetails_ID)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_onDemandstoreDetails_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_onDemandstoreDetails_image)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, c_onDemandstoreDetails_latitude)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, c_onDemandstoreDetails_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_onDemandstoreDetails_email)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_onDemandstoreDetails_storeType)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_onDemandstoreDetails_verticalType)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_formatedShippingTotalGrossPrice)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_formatedOrderTotal)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_formatedProductTotal)
*/


_v	=	 '_v'
_type	=	 '_type'
_resource_state	=	 '_resource_state'
adjusted_merchandize_total_tax	=	 'adjusted_merchandize_total_tax'
adjusted_shipping_total_tax	=	 'adjusted_shipping_total_tax'
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
confirmation_status	=	 'confirmation_status'
created_by	=	 'created_by'
creation_date	=	 'creation_date'
currency	=	 'currency'
customer_info__type	=	 'customer_info._type'
customer_info_customer_id	=	 'customer_info.customer_id'
customer_info_customer_name	=	 'customer_info.customer_name'
customer_info_customer_no	=	 'customer_info.customer_no'
customer_info_email	=	 'customer_info.email'
customer_name	=	 'customer_name'
export_status	=	 'export_status'
grouped_tax_items_0__type	=	 'grouped_tax_items[0]._type'
grouped_tax_items_0_tax_rate	=	 'grouped_tax_items[0].tax_rate'
grouped_tax_items_0_tax_value	=	 'grouped_tax_items[0].tax_value'
guest	=	 'guest'
last_modified	=	 'last_modified'
merchandize_total_tax	=	 'merchandize_total_tax'
notes__type	=	 'notes._type'
notes_link	=	 'notes.link'
order_no	=	 'order_no'
order_token	=	 'order_token'
order_total	=	 'order_total'
payment_status	=	 'payment_status'
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
shipments_0_shipment_no	=	 'shipments[0].shipment_no'
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
shipments_0_shipping_address_c_etiqueta_home	=	 'shipments[0].shipping_address.c_etiqueta.home'
shipments_0_shipping_address_c_etiqueta_company	=	 'shipments[0].shipping_address.c_etiqueta.company'
shipments_0_shipping_address_c_etiqueta_other	=	 'shipments[0].shipping_address.c_etiqueta.other'
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
shipments_0_c_canCancel	=	 'shipments[0].c_canCancel'
shipments_0_c_canEvaluate	=	 'shipments[0].c_canEvaluate'
shipments_0_c_hasIncident	=	 'shipments[0].c_hasIncident'
shipments_0_c_hasInvoice	=	 'shipments[0].c_hasInvoice'
shipments_0_c_miraklOrderId	=	 'shipments[0].c_miraklOrderId'
shipments_0_c_miraklOrderStatus	=	 'shipments[0].c_miraklOrderStatus'
shipments_0_c_miraklShippingLabel	=	 'shipments[0].c_miraklShippingLabel'
shipments_0_c_serviceCharge	=	 'shipments[0].c_serviceCharge'
shipments_0_c_shippingRates	=	 'shipments[0].c_shippingRates'
shipments_0_c_shopId	=	 'shipments[0].c_shopId'
shipments_0_c_shopName	=	 'shipments[0].c_shopName'
shipments_0_c_totalShippingCost	=	 'shipments[0].c_totalShippingCost'

shipments_0_c_productItems_0__type	=	 'shipments[0].c_productItems[0]._type'
shipments_0_c_productItems_0_adjusted_tax	=	 'shipments[0].c_productItems[0].adjusted_tax'
shipments_0_c_productItems_0_base_price	=	 'shipments[0].c_productItems[0].base_price'
shipments_0_c_productItems_0_bonus_product_line_item	=	 'shipments[0].c_productItems[0].bonus_product_line_item'
shipments_0_c_productItems_0_gift	=	 'shipments[0].c_productItems[0].gift'
shipments_0_c_productItems_0_inventory_id	=	 'shipments[0].c_productItems[0].inventory_id'
shipments_0_c_productItems_0_item_id	=	 'shipments[0].c_productItems[0].item_id'
shipments_0_c_productItems_0_item_text	=	 'shipments[0].c_productItems[0].item_text'
shipments_0_c_productItems_0_price	=	 'shipments[0].c_productItems[0].price'
shipments_0_c_productItems_0_price_after_item_discount	=	 'shipments[0].c_productItems[0].price_after_item_discount'
shipments_0_c_productItems_0_price_after_order_discount	=	 'shipments[0].c_productItems[0].price_after_order_discount'
shipments_0_c_productItems_0_product_id	=	 'shipments[0].c_productItems[0].product_id'
shipments_0_c_productItems_0_product_name	=	 'shipments[0].c_productItems[0].product_name'
shipments_0_c_productItems_0_quantity	=	 'shipments[0].c_productItems[0].quantity'
shipments_0_c_productItems_0_shipment_id	=	 'shipments[0].c_productItems[0].shipment_id'
shipments_0_c_productItems_0_tax	=	 'shipments[0].c_productItems[0].tax'
shipments_0_c_productItems_0_tax_basis	=	 'shipments[0].c_productItems[0].tax_basis'
shipments_0_c_productItems_0_tax_class_id	=	 'shipments[0].c_productItems[0].tax_class_id'
shipments_0_c_productItems_0_tax_rate	=	 'shipments[0].c_productItems[0].tax_rate'
shipments_0_c_productItems_0_c_canOpenIncident	=	 'shipments[0].c_productItems[0].c_canOpenIncident'
shipments_0_c_productItems_0_c_fromStoreId	=	 'shipments[0].c_productItems[0].c_fromStoreId'
shipments_0_c_productItems_0_c_isOnDemandStoreItem	=	 'shipments[0].c_productItems[0].c_isOnDemandStoreItem'
shipments_0_c_productItems_0_c_mainLineItemId	=	 'shipments[0].c_productItems[0].c_mainLineItemId'
shipments_0_c_productItems_0_c_miraklChannels	=	 'shipments[0].c_productItems[0].c_miraklChannels'
shipments_0_c_productItems_0_c_miraklEarliestDeliveryDays	=	 'shipments[0].c_productItems[0].c_miraklEarliestDeliveryDays'
shipments_0_c_productItems_0_c_miraklLatestDeliveryDays	=	 'shipments[0].c_productItems[0].c_miraklLatestDeliveryDays'
shipments_0_c_productItems_0_c_miraklLeadTimeToShip	=	 'shipments[0].c_productItems[0].c_miraklLeadTimeToShip'
shipments_0_c_productItems_0_c_miraklLineShippingPrice	=	 'shipments[0].c_productItems[0].c_miraklLineShippingPrice'
shipments_0_c_productItems_0_c_miraklOperatorProductId	=	 'shipments[0].c_productItems[0].c_miraklOperatorProductId'
shipments_0_c_productItems_0_c_miraklShippingTaxes	=	 'shipments[0].c_productItems[0].c_miraklShippingTaxes'
shipments_0_c_productItems_0_c_noOfPersons	=	 'shipments[0].c_productItems[0].c_noOfPersons'
shipments_0_c_productItems_0_c_offerId	=	 'shipments[0].c_productItems[0].c_offerId'
shipments_0_c_productItems_0_c_offerSalesPrice	=	 'shipments[0].c_productItems[0].c_offerSalesPrice'
shipments_0_c_productItems_0_c_offerState	=	 'shipments[0].c_productItems[0].c_offerState'
shipments_0_c_productItems_0_c_offerStateCode	=	 'shipments[0].c_productItems[0].c_offerStateCode'
shipments_0_c_productItems_0_c_orderLineId	=	 'shipments[0].c_productItems[0].c_orderLineId'
shipments_0_c_productItems_0_c_shopId	=	 'shipments[0].c_productItems[0].c_shopId'
shipments_0_c_productItems_0_c_shopName	=	 'shipments[0].c_productItems[0].c_shopName'
shipments_0_c_productItems_0_c_total_crossed_price	=	 'shipments[0].c_productItems[0].c_total_crossed_price'
shipments_0_c_productItems_0_c_priceWithComplement	=	 'shipments[0].c_productItems[0].c_priceWithComplement'
shipments_0_c_productItems_0_c_imagesData_large_0_alt	=	 'shipments[0].c_productItems[0].c_imagesData.large[0].alt'
shipments_0_c_productItems_0_c_imagesData_large_0_url	=	 'shipments[0].c_productItems[0].c_imagesData.large[0].url'
shipments_0_c_productItems_0_c_imagesData_large_0_title	=	 'shipments[0].c_productItems[0].c_imagesData.large[0].title'

shipments_0_c_paymentInstruments_0__type	=	 'shipments[0].c_paymentInstruments[0]._type'
shipments_0_c_paymentInstruments_0_amount	=	 'shipments[0].c_paymentInstruments[0].amount'
shipments_0_c_paymentInstruments_0_payment_card__type	=	 'shipments[0].c_paymentInstruments[0].payment_card._type'
shipments_0_c_paymentInstruments_0_payment_card_card_type	=	 'shipments[0].c_paymentInstruments[0].payment_card.card_type'
shipments_0_c_paymentInstruments_0_payment_card_credit_card_expired	=	 'shipments[0].c_paymentInstruments[0].payment_card.credit_card_expired'
shipments_0_c_paymentInstruments_0_payment_card_expiration_month	=	 'shipments[0].c_paymentInstruments[0].payment_card.expiration_month'
shipments_0_c_paymentInstruments_0_payment_card_expiration_year	=	 'shipments[0].c_paymentInstruments[0].payment_card.expiration_year'
shipments_0_c_paymentInstruments_0_payment_card_holder	=	 'shipments[0].c_paymentInstruments[0].payment_card.holder'
shipments_0_c_paymentInstruments_0_payment_instrument_id	=	 'shipments[0].c_paymentInstruments[0].payment_instrument_id'
shipments_0_c_paymentInstruments_0_payment_method_id	=	 'shipments[0].c_paymentInstruments[0].payment_method_id'
shipping_items_0__type	=	 'shipping_items[0]._type'
shipping_items_0_adjusted_tax	=	 'shipping_items[0].adjusted_tax'
shipping_items_0_base_price	=	 'shipping_items[0].base_price'
shipping_items_0_item_id	=	 'shipping_items[0].item_id'
shipping_items_0_item_text	=	 'shipping_items[0].item_text'
shipping_items_0_price	=	 'shipping_items[0].price'
shipping_items_0_price_after_item_discount	=	 'shipping_items[0].price_after_item_discount'
shipping_items_0_shipment_id	=	 'shipping_items[0].shipment_id'
shipping_items_0_tax	=	 'shipping_items[0].tax'
shipping_items_0_tax_basis	=	 'shipping_items[0].tax_basis'
shipping_items_0_tax_class_id	=	 'shipping_items[0].tax_class_id'
shipping_items_0_tax_rate	=	 'shipping_items[0].tax_rate'
shipping_status	=	 'shipping_status'
shipping_total	=	 'shipping_total'
shipping_total_tax	=	 'shipping_total_tax'
site_id	=	 'site_id'
status	=	 'status'
taxation	=	 'taxation'
tax_rounded_at_group	=	 'tax_rounded_at_group'
tax_total	=	 'tax_total'
c_currentCorporate	=	 'c_currentCorporate'
c_isMiraklOrder	=	 'c_isMiraklOrder'
c_miraklCustomerId	=	 'c_miraklCustomerId'
c_miraklFraudCheckStatus	=	 'c_miraklFraudCheckStatus'


CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, _v)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, _v)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, _type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, _type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, _resource_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, _resource_state)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, adjusted_merchandize_total_tax)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, adjusted_shipping_total_tax)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_address1)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_city)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_country_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_first_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_full_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_full_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_last_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_phone)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_postal_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_c_alias)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_c_delegation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_c_delegation)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_c_delegation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_c_delegation)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_c_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_c_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_c_latitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_c_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_c_nExt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_c_nExt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_c_neighborhood)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_c_neighborhood)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_c_references)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_c_references)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_c_rfc)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_c_rfc)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_c_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_c_state)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_c_streetName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_c_streetName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, channel_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, channel_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, confirmation_status)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, confirmation_status)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, created_by)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, created_by)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, creation_date)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, creation_date)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, currency)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, customer_info__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, customer_info__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, customer_info_customer_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, customer_info_customer_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, customer_info_customer_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, customer_info_customer_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, customer_info_customer_no)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, customer_info_customer_no)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, customer_info_email)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, customer_info_email)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, customer_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, customer_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, export_status)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, export_status)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, grouped_tax_items_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, grouped_tax_items_0__type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, grouped_tax_items_0_tax_rate)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, grouped_tax_items_0_tax_value)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, guest)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, last_modified)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, last_modified)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, merchandize_total_tax)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, notes__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, notes__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, notes_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, notes_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, order_no)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, order_no)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, order_token)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, order_token)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, order_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, payment_status)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, payment_status)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, product_sub_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, product_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0__type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_adjusted_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_adjusted_shipping_total_tax)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, shipments_0_gift)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_product_sub_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_product_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipment_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_shipment_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_address1)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_city)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_country_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_first_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_full_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_full_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_last_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_phone)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_postal_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_alias)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_delegation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_delegation)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_latitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_nExt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_nExt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_neighborhood)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_neighborhood)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_references)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_references)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_rfc)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_rfc)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_state)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_streetName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_streetName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_method__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_method__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_method_description)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_method_description)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_method_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_method_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_method_c_estimatedArrivalTime)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_method_c_estimatedArrivalTime)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, shipments_0_shipping_method_c_storePickupEnabled)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_status)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_status)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_shipping_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_shipping_total_tax)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_tax_total)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, shipments_0_c_canCancel)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, shipments_0_c_canEvaluate)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, shipments_0_c_hasIncident)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, shipments_0_c_hasInvoice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_miraklOrderId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_miraklOrderId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_miraklOrderStatus)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_miraklOrderStatus)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_miraklShippingLabel)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_miraklShippingLabel)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_c_serviceCharge)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_shippingRates)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_shippingRates)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_shopId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_shopId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_shopName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_shopName)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_c_totalShippingCost)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_productItems_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_productItems_0__type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_c_productItems_0_adjusted_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_c_productItems_0_base_price)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, shipments_0_c_productItems_0_bonus_product_line_item)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, shipments_0_c_productItems_0_gift)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_productItems_0_inventory_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_productItems_0_inventory_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_productItems_0_item_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_productItems_0_item_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_productItems_0_item_text)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_productItems_0_item_text)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_c_productItems_0_price)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_c_productItems_0_price_after_item_discount)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_c_productItems_0_price_after_order_discount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_productItems_0_product_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_productItems_0_product_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_productItems_0_product_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_productItems_0_product_name)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments_0_c_productItems_0_quantity)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_productItems_0_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_productItems_0_shipment_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_c_productItems_0_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_c_productItems_0_tax_basis)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_productItems_0_tax_class_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_productItems_0_tax_class_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_c_productItems_0_tax_rate)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_productItems_0_c_fromStoreId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_productItems_0_c_fromStoreId)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, shipments_0_c_productItems_0_c_isOnDemandStoreItem)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_productItems_0_c_miraklChannels)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_productItems_0_c_miraklChannels)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_c_productItems_0_c_miraklEarliestDeliveryDays)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_c_productItems_0_c_miraklLatestDeliveryDays)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_productItems_0_c_miraklLeadTimeToShip)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_productItems_0_c_miraklLeadTimeToShip)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_productItems_0_c_miraklLineShippingPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_productItems_0_c_miraklLineShippingPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_productItems_0_c_miraklOperatorProductId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_productItems_0_c_miraklOperatorProductId)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments_0_c_productItems_0_c_noOfPersons)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_productItems_0_c_offerId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_productItems_0_c_offerId)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_c_productItems_0_c_offerSalesPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_productItems_0_c_offerState)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_productItems_0_c_offerState)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_productItems_0_c_offerStateCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_productItems_0_c_offerStateCode)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_productItems_0_c_shopId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_productItems_0_c_shopId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_productItems_0_c_shopName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_productItems_0_c_shopName)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_c_productItems_0_c_total_crossed_price)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_c_productItems_0_c_priceWithComplement)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_productItems_0_c_imagesData_large_0_alt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_productItems_0_c_imagesData_large_0_alt)

CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(PlaceOrder, shipments_0_c_productItems_0_c_imagesData_large_0_url)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_productItems_0_c_imagesData_large_0_title)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_productItems_0_c_imagesData_large_0_title)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_paymentInstruments_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_paymentInstruments_0__type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipments_0_c_paymentInstruments_0_amount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_paymentInstruments_0_payment_card__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_paymentInstruments_0_payment_card__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_paymentInstruments_0_payment_card_card_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_paymentInstruments_0_payment_card_card_type)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, shipments_0_c_paymentInstruments_0_payment_card_credit_card_expired)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments_0_c_paymentInstruments_0_payment_card_expiration_month)
CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments_0_c_paymentInstruments_0_payment_card_expiration_year)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_paymentInstruments_0_payment_card_holder)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_paymentInstruments_0_payment_card_holder)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_paymentInstruments_0_payment_instrument_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_paymentInstruments_0_payment_instrument_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_c_paymentInstruments_0_payment_method_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_c_paymentInstruments_0_payment_method_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipping_items_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipping_items_0__type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipping_items_0_adjusted_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipping_items_0_base_price)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipping_items_0_item_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipping_items_0_item_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipping_items_0_item_text)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipping_items_0_item_text)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipping_items_0_price)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipping_items_0_price_after_item_discount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipping_items_0_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipping_items_0_shipment_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipping_items_0_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipping_items_0_tax_basis)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipping_items_0_tax_class_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipping_items_0_tax_class_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipping_items_0_tax_rate)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipping_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, shipping_total_tax)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, site_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, site_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, status)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, status)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, taxation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, taxation)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, tax_rounded_at_group)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, tax_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, c_currentCorporate)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_currentCorporate)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, c_isMiraklOrder)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, c_miraklCustomerId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_miraklCustomerId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, c_miraklFraudCheckStatus)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, c_miraklFraudCheckStatus)
