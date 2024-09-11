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
//AddProductbasket = WS.sendRequest(findTestObject('TotalPlay-Food/AddProductToBasket', [('URL') : GlobalVariable.URL, ('basketID') : GlobalVariable.basketID]))
//
//WS.verifyResponseStatusCode(AddProductbasket, 200)

AddProductbasket = WS.sendRequest(findTestObject('TotalPlay-Food/Food_Add to cart', [('URL') : GlobalVariable.URL, ('basketID') : GlobalVariable.basketID, ('SellerId1') : GlobalVariable.SellerId1]))


CustomKeywords.'totalplay.Common.printResponseinText'(AddProductbasket)

getAddress = WS.sendRequest(findTestObject('TotalPlay-Food/GetAddresses', [('URL') : GlobalVariable.URL, ('sla_customerId') : GlobalVariable.sla_customerId
			, ('shop_auth_token') : GlobalVariable.shop_auth_token]))
id = 'data[0].c_crm_address_id'

GlobalVariable.crm_address_id = WS.getElementPropertyValue(getAddress,id )
WS.verifyResponseStatusCode(getAddress, 200)

AddAddressToCart = WS.sendRequest(findTestObject('TotalPlay-Food/add address to cart', [('URL') : GlobalVariable.URL, ('basketID') : GlobalVariable.basketID]))

CustomKeywords.'totalplay.Common.printResponseinText'(AddAddressToCart)

/*
_resource_state =  '_resource_state'
adjusted_merchandize_total_tax = 'adjusted_merchandize_total_tax'
adjusted_shipping_total_tax = 'adjusted_shipping_total_tax'
agent_basket = 'agent_basket'
basket_id = 'basket_id'
billing_address_type = 'billing_address._type'
billing_address = 'billing_address'
billing_address_city = 'billing_address.city'
billing_address_address1 = 'billing_address.address1'
billing_address_country_code = 'billing_address.country_code'
billing_address_full_name = 'billing_address.full_name'
billing_address_first_name = 'billing_address.first_name'
billing_address_last_name = 'billing_address.last_name'
billing_address_id = 'billing_address.id'
billing_address_phone = 'billing_address.phone'
billing_address_postal_code = 'billing_address.postal_code'
billing_address_c_alias = 'billing_address.c_alias'
billing_address_c_latitude = 'billing_address.c_latitude'
billing_address_c_longitude = 'billing_address.c_longitude'
channel_type = 'channel_type'
currency = 'currency'
customer_info = 'customer_info'
creation_date = 'creation_date'
customer_info_customer_no = 'customer_info.customer_no'
customer_info_type = 'customer_info._type'
customer_info_customer_id = 'customer_info.customer_id'
customer_info_email = 'customer_info.email'
last_modified = 'last_modified'
notes = 'notes'
merchandize_total_tax = 'merchandize_total_tax'
notes_type = 'notes._type'
notes_link = 'notes.link'
order_total = 'order_total'
product_items_adjusted_tax = 'product_items[0].adjusted_tax'
product_items = 'product_items'
product_items_type = 'product_items[0]._type'
product_items_bonus_product_line_item = 'product_items[0].bonus_product_line_item'
product_items_base_price = 'product_items[0].base_price'
product_items_gift = 'product_items[0].gift'
product_items_inventory_id = 'product_items[0].inventory_id'
product_items_item_id = 'product_items[0].item_id'
product_items_item_text = 'product_items[0].item_text'
product_items_price = 'product_items[0].price'
product_items_price_after_item_discount = 'product_items[0].price_after_item_discount'
product_items_product_id = 'product_items[0].product_id'
product_items_price_after_order_discount = 'product_items[0].price_after_order_discount'
product_items_product_name = 'product_items[0].product_name'
product_items_shipment_id = 'product_items[0].shipment_id'
product_items_quantity = 'product_items[0].quantity'
product_items_tax = 'product_items[0].tax'
product_items_tax_basis = 'product_items[0].tax_basis'
product_items_tax_class_id = 'product_items[0].tax_class_id'
product_items_tax_rate = 'product_items[0].tax_rate'
product_items_c_fromStoreId = 'product_items[0].c_fromStoreId'
product_items_c_miraklChannels = 'product_items[0].c_miraklChannels'
product_items_c_miraklOperatorProductId = 'product_items[0].c_miraklOperatorProductId'
product_items_c_miraklShippingTaxes = 'product_items[0].c_miraklShippingTaxes'
product_items_c_miraklTaxes = 'product_items[0].c_miraklTaxes'
product_items_c_offerId = 'product_items[0].c_offerId'
product_items_c_offerSalesPrice = 'product_items[0].c_offerSalesPrice'
product_items_c_offerState = 'product_items[0].c_offerState'
product_items_c_shopName = 'product_items[0].c_shopName'
product_items_c_totalPrice = 'product_items[0].c_totalPrice'
product_items_c_imagesData_large = 'product_items[0].c_imagesData.large'
product_items_c_imagesData = 'product_items[0].c_imagesData'
product_items_c_imagesData_large_alt = 'product_items[0].c_imagesData.large[0].alt'
product_items_c_imagesData_large_url = 'product_items[0].c_imagesData.large[0].url'
product_items_c_description = 'product_items[0].c_description'
product_items_c_imagesData_large_title = 'product_items[0].c_imagesData.large[0].title'
product_sub_total = 'product_sub_total'
product_total = 'product_total'
shipments = 'shipments'
shipments_type = 'shipments[0]._type'
shipments_adjusted_merchandize_total_tax = 'shipments[0].adjusted_merchandize_total_tax'
shipments_adjusted_shipping_total_tax = 'shipments[0].adjusted_shipping_total_tax'
shipments_gift = 'shipments[0].gift'
shipments_merchandize_total_tax = 'shipments[0].merchandize_total_tax'
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
shipments_shipping_address_c_alias = 'shipments[0].shipping_address.c_alias'
shipments_shipping_address_postal_code = 'shipments[0].shipping_address.postal_code'
shipments_shipping_address_c_latitude = 'shipments[0].shipping_address.c_latitude'
shipments_shipping_address_c_longitude = 'shipments[0].shipping_address.c_longitude'
shipments_shipping_method = 'shipments[0].shipping_method'
shipments_shipping_method_type = 'shipments[0].shipping_method._type'
shipments_shipping_method_description = 'shipments[0].shipping_method.description'
shipments_shipping_method_id = 'shipments[0].shipping_method.id'
shipments_shipping_method_name = 'shipments[0].shipping_method.name'
shipments_shipping_method_shipping_promotions = 'shipments[0].shipping_method.shipping_promotions'
shipments_shipping_method_shipping_promotions_type = 'shipments[0].shipping_method.shipping_promotions[0]._type'
shipments_shipping_method_shipping_promotions_link = 'shipments[0].shipping_method.shipping_promotions[0].link'
shipments_shipping_method_shipping_promotions_callout_msg = 'shipments[0].shipping_method.shipping_promotions[0].callout_msg'
shipments_shipping_method_shipping_promotions_promotion_id = 'shipments[0].shipping_method.shipping_promotions[0].promotion_id'
shipments_shipping_method_shipping_promotions_promotion_name = 'shipments[0].shipping_method.shipping_promotions[0].promotion_name'
shipments_shipping_method_c_estimatedArrivalTime = 'shipments[0].shipping_method.c_estimatedArrivalTime'
shipments_shipping_method_c_storePickupEnabled = ' shipments[0].shipping_method.c_storePickupEnabled'
shipments_shipping_status = 'shipments[0].shipping_status'
shipments_shipping_total = 'shipments[0].shipping_total'
shipments_tax_total = 'shipments[0].tax_total'
shipments_shipping_total_tax = 'shipments[0].shipping_total_tax'
shipments_c_serviceCharge = 'shipments[0].c_serviceCharge'
shipments_c_totalShippingCost = 'shipments[0].c_totalShippingCost'
shipping_items = 'shipping_items'
shipping_items_type = 'shipping_items[0]._type'
shipping_items_adjusted_tax = 'shipping_items[0].adjusted_tax'
shipping_items_base_price = 'shipping_items[0].base_price'
shipping_items_item_id = 'shipping_items[0].item_id'
shipping_items_item_text = 'shipping_items[0].item_text'
shipping_items_price = 'shipping_items[0].price'
shipping_items_price_after_item_discount = 'shipping_items[0].price_after_item_discount'
shipping_items_shipment_id = 'shipping_items[0].shipment_id'
shipping_items_tax = 'shipping_items[0].tax'
shipping_items_tax_basis = 'shipping_items[0].tax_basis'
shipping_items_tax_class_id = 'shipping_items[0].tax_class_id'
shipping_items_tax_rate = 'shipping_items[0].tax_rate'
shipping_total = 'shipping_total'
taxation = 'taxation'
shipping_total_tax = 'shipping_total_tax'
tax_total = 'tax_total'
c_commentToCart = 'c_commentToCart'
c_currentCorporate = 'c_currentCorporate'
c_isLock = 'c_isLock'
c_isMiraklOrder = 'c_isMiraklOrder'
c_lockTime = 'c_lockTime'
c_miraklSH02Response = 'c_miraklSH02Response'
c_miraklShippingZoneCode = 'c_miraklShippingZoneCode'
c_seller_id = 'c_seller_id'
c_pickerExpressShipment = 'c_pickerExpressShipment'
c_serviceChargeTotalGrossPrice = 'c_serviceChargeTotalGrossPrice'
c_corporateImgUrl = 'c_corporateImgUrl'



CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,_resource_state)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,adjusted_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart,adjusted_shipping_total_tax)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddAddressToCart,agent_basket)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,basket_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,billing_address_type)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart,billing_address)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,billing_address_city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,billing_address_address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,billing_address_country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,billing_address_full_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,billing_address_first_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,billing_address_last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,billing_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,billing_address_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,billing_address_postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,billing_address_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,billing_address_c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,billing_address_c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,channel_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,currency)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart,customer_info)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,creation_date)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,customer_info_customer_no)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,customer_info_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,customer_info_customer_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,customer_info_email)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,last_modified)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart,notes)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,merchandize_total_tax)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,notes_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,notes_link)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart,order_total)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,product_items_adjusted_tax)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart,product_items)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_type)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddAddressToCart,product_items_bonus_product_line_item)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,product_items_base_price)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddAddressToCart,product_items_gift)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_inventory_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_item_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_item_text)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,product_items_price)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,product_items_price_after_item_discount)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_product_id)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,product_items_price_after_order_discount)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_product_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_shipment_id)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,product_items_quantity)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,product_items_tax)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,product_items_tax_basis)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_tax_class_id)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,product_items_tax_rate)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_c_fromStoreId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_c_miraklChannels)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_c_miraklOperatorProductId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_c_miraklShippingTaxes)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_c_miraklTaxes)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_c_offerId)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,product_items_c_offerSalesPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_c_offerState)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_c_shopName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_c_totalPrice)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart,product_items_c_imagesData_large)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart,product_items_c_imagesData)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_c_imagesData_large_alt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_c_imagesData_large_url)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_c_description)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,product_items_c_imagesData_large_title)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,product_sub_total)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,product_total)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart,shipments)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_type)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,shipments_adjusted_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart,shipments_adjusted_shipping_total_tax)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddAddressToCart,shipments_gift)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,shipments_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,shipments_product_sub_total)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,shipments_product_total)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipment_id)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart,shipments_shipment_total)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart,shipments_shipping_address)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_address_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_address_address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_address_city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_address_country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_address_first_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_address_full_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_address_last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_address_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_address_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_address_postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_address_c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_address_c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart,shipments_shipping_method)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_method_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_method_description)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_method_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_method_name)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart,shipments_shipping_method_shipping_promotions)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_method_shipping_promotions_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_method_shipping_promotions_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_method_shipping_promotions_callout_msg)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_method_shipping_promotions_promotion_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_method_shipping_promotions_promotion_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_method_c_estimatedArrivalTime)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddAddressToCart,shipments_shipping_method_c_storePickupEnabled)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_shipping_status)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,shipments_shipping_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart,shipments_tax_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart,shipments_shipping_total_tax)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_c_serviceCharge)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipments_c_totalShippingCost)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart,shipping_items)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipping_items_type)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart,shipping_items_adjusted_tax)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,shipping_items_base_price)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipping_items_item_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipping_items_item_text)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,shipping_items_price)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,shipping_items_price_after_item_discount)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipping_items_shipment_id)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart,shipping_items_tax)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,shipping_items_tax_basis)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,shipping_items_tax_class_id)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart,shipping_items_tax_rate)
CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart,shipping_total)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,taxation)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart,shipping_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart,tax_total)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,c_commentToCart)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,c_currentCorporate)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,c_isLock)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,c_isMiraklOrder)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,c_lockTime)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,c_miraklSH02Response)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,c_miraklShippingZoneCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,c_seller_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,c_pickerExpressShipment)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,c_serviceChargeTotalGrossPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart,c_corporateImgUrl)
*/


_v	=	 '_v'
_type	=	 '_type'
_resource_state	=	 '_resource_state'
_flash_0__type	=	 '_flash[0]._type'
_flash_0_type	=	 '_flash[0].type'
_flash_0_message	=	 '_flash[0].message'
_flash_0_path	=	 '_flash[0].path'
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
product_items_0_shipment_id	=	 'product_items[0].shipment_id'
product_items_0_tax	=	 'product_items[0].tax'
product_items_0_tax_basis	=	 'product_items[0].tax_basis'
product_items_0_tax_class_id	=	 'product_items[0].tax_class_id'
product_items_0_tax_rate	=	 'product_items[0].tax_rate'
product_items_0_c_fromStoreId	=	 'product_items[0].c_fromStoreId'
product_items_0_c_miraklChannels	=	 'product_items[0].c_miraklChannels'
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
product_items_0_c_imagesData_large_0_alt	=	 'product_items[0].c_imagesData.large[0].alt'
product_items_0_c_imagesData_large_0_url	=	 'product_items[0].c_imagesData.large[0].url'
product_items_0_c_imagesData_large_0_title	=	 'product_items[0].c_imagesData.large[0].title'
product_items_0_c_description	=	 'product_items[0].c_description'
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
shipments_0_shipping_method_name	=	 'shipments[0].shipping_method.name'
shipments_0_shipping_method_c_estimatedArrivalTime	=	 'shipments[0].shipping_method.c_estimatedArrivalTime'
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
shipping_items_0_tax	=	 'shipping_items[0].tax'
shipping_items_0_tax_basis	=	 'shipping_items[0].tax_basis'
shipping_items_0_tax_class_id	=	 'shipping_items[0].tax_class_id'
shipping_items_0_tax_rate	=	 'shipping_items[0].tax_rate'
shipping_total	=	 'shipping_total'
shipping_total_tax	=	 'shipping_total_tax'
taxation	=	 'taxation'
tax_total	=	 'tax_total'
c_currentCorporate	=	 'c_currentCorporate'
c_forceDeleteOndemand	=	 'c_forceDeleteOndemand'
c_pickerExpressShipment	=	 'c_pickerExpressShipment'

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, _v)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, _v)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, _type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, _type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, _resource_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, _resource_state)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, _flash_0__type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, _flash_0__type)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, _flash_0_type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, _flash_0_type)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, _flash_0_message)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, _flash_0_message)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, _flash_0_path)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, _flash_0_path)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, adjusted_merchandize_total_tax)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, adjusted_shipping_total_tax)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddAddressToCart, agent_basket)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, basket_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, basket_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_address1)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_city)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_country_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_first_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_full_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_full_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_last_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_phone)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_postal_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_c_alias)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_c_delegation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_c_delegation)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_c_delegation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_c_delegation)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_c_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_c_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_c_latitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_c_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_c_nExt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_c_nExt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_c_neighborhood)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_c_neighborhood)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_c_references)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_c_references)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_c_rfc)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_c_rfc)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_c_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_c_state)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, billing_address_c_streetName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, billing_address_c_streetName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, channel_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, channel_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, customer_info__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, customer_info__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, customer_info_customer_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, customer_info_customer_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, customer_info_customer_no)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, customer_info_customer_no)

//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, customer_info_email)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, customer_info_email)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, last_modified)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, last_modified)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, merchandize_total_tax)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, notes__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, notes__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, notes_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, notes_link)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, order_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0__type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, product_items_0_adjusted_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, product_items_0_base_price)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddAddressToCart, product_items_0_bonus_product_line_item)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddAddressToCart, product_items_0_gift)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0_inventory_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0_inventory_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0_item_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0_item_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0_item_text)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0_item_text)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, product_items_0_price)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, product_items_0_price_after_item_discount)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, product_items_0_price_after_order_discount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0_product_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0_product_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0_product_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0_product_name)

CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart, product_items_0_quantity)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0_shipment_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, product_items_0_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, product_items_0_tax_basis)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0_tax_class_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0_tax_class_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, product_items_0_tax_rate)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0_c_fromStoreId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0_c_fromStoreId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0_c_miraklChannels)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0_c_miraklChannels)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0_c_miraklOperatorProductId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0_c_miraklOperatorProductId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0_c_miraklShippingTaxes)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0_c_miraklShippingTaxes)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0_c_miraklTaxes)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0_c_miraklTaxes)

CustomKeywords.'totalplay.Common.getNumValueofObject'(AddAddressToCart, product_items_0_c_noOfPersons)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0_c_offerId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0_c_offerId)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, product_items_0_c_offerSalesPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0_c_offerState)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0_c_offerState)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0_c_offerStateCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0_c_offerStateCode)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0_c_shopId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0_c_shopId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0_c_shopName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0_c_shopName)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, product_items_0_c_total_crossed_price)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, product_items_0_c_priceWithComplement)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0_c_imagesData_large_0_alt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0_c_shopName)

//CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(AddAddressToCart, product_items_0_c_imagesData_large_0_url)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0_c_imagesData_large_0_title)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0_c_imagesData_large_0_title)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, product_items_0_c_description)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, product_items_0_c_description)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, product_sub_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, product_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0__type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, shipments_0_adjusted_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, shipments_0_adjusted_shipping_total_tax)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddAddressToCart, shipments_0_gift)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, shipments_0_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, shipments_0_product_sub_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, shipments_0_product_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipment_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, shipments_0_shipment_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address_address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address_address1)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address_city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address_city)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address_country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address_country_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address_first_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address_full_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address_full_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address_last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address_last_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address_phone)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address_postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address_postal_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address_c_alias)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address_c_delegation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address_c_delegation)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address_c_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address_c_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address_c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address_c_latitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address_c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address_c_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address_c_nExt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address_c_nExt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address_c_neighborhood)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address_c_neighborhood)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address_c_references)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address_c_references)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address_c_rfc)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address_c_rfc)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address_c_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address_c_state)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_address_c_streetName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_address_c_streetName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_method__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_method__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_method_description)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_method_description)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_method_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_method_name)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_method_c_estimatedArrivalTime)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_method_c_estimatedArrivalTime)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddAddressToCart, shipments_0_shipping_method_c_storePickupEnabled)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipments_0_shipping_status)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipments_0_shipping_status)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, shipments_0_shipping_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, shipments_0_shipping_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, shipments_0_tax_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipping_items_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipping_items_0__type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, shipping_items_0_adjusted_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, shipping_items_0_base_price)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipping_items_0_item_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipping_items_0_item_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipping_items_0_item_text)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipping_items_0_item_text)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, shipping_items_0_price)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, shipping_items_0_price_after_item_discount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipping_items_0_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipping_items_0_shipment_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, shipping_items_0_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, shipping_items_0_tax_basis)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, shipping_items_0_tax_class_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, shipping_items_0_tax_class_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, shipping_items_0_tax_rate)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, shipping_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, shipping_total_tax)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, taxation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, taxation)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(AddAddressToCart, tax_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, c_currentCorporate)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, c_currentCorporate)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(AddAddressToCart, c_forceDeleteOndemand)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(AddAddressToCart, c_pickerExpressShipment)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(AddAddressToCart, c_pickerExpressShipment)
