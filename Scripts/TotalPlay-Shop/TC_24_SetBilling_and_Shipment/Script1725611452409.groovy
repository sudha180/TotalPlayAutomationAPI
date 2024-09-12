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

AddToCart_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Cart/AddProductToBasket', [('URL') : GlobalVariable.URL
            , ('SITEID') : GlobalVariable.SITEID, ('basketID') : GlobalVariable.basketID]))

CustomKeywords.'totalplay.Common.printResponseinText'(AddToCart_Response)

WS.verifyResponseStatusCode(AddToCart_Response, 200)

GlobalVariable.address_id = 'crm_default_address'

UpdateAddress_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Address/Update Customer Address', [('URL') : GlobalVariable.URL
            , ('SITEID') : GlobalVariable.SITEID, ('sla_customerId') : GlobalVariable.sla_customerId]))

CustomKeywords.'totalplay.Common.printResponseinText'(UpdateAddress_Response)

WS.verifyResponseStatusCode(UpdateAddress_Response, 200)

GetAddress = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Address/Get Customer Address', [('URL') : GlobalVariable.URL
            , ('SITEID') : GlobalVariable.SITEID, ('sla_customerId') : GlobalVariable.sla_customerId]))

CustomKeywords.'totalplay.Common.printResponseinText'(GetAddress)

Address_Id = 'data[0].address_id'

String address_id = WS.getElementPropertyValue(GetAddress, Address_Id)

println(address_id)

id = 'data[0].c_crm_address_id'

crmaddress_id = WS.getElementPropertyValue(GetAddress, id)

println(crmaddress_id)

GlobalVariable.crm_address = crmaddress_id

println(GlobalVariable.crm_address)

SetBilling_Response =WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Checkout/Set Billing and Shipment', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID
          , ('basketID') : GlobalVariable.basketID]))

CustomKeywords.'totalplay.Common.printResponseinText'(SetBilling_Response)

WS.verifyResponseStatusCode(SetBilling_Response, 200)


//_type	=	 '_type'
//_resource_state	=	 '_resource_state'
//_flash_0_type	=	 '_flash[0].type'
//_flash_0_message	=	 '_flash[0].message'
//_flash_0_path	=	 '_flash[0].path'
adjusted_merchandize_total_tax	=	 'adjusted_merchandize_total_tax'
adjusted_shipping_total_tax	=	 'adjusted_shipping_total_tax'
agent_basket	=	 'agent_basket'
basket_id	=	 'basket_id'
billing_address__type	=	 'billing_address._type'
//billing_address_type = 'billing_address._type'
billing_address_address1	=	 'billing_address.address1'
billing_address_city	=	 'billing_address.city'
billing_address_company_name	=	 'billing_address.company_name'
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
customer_info	=	 'customer_info'
customer_info__type	=	 'customer_info._type'
customer_info_customer_id	=	 'customer_info.customer_id'
customer_info_customer_no	=	 'customer_info.customer_no'
customer_info_email	=	 'customer_info.email'
last_modified	=	 'last_modified'
merchandize_total_tax	=	 'merchandize_total_tax'
notes	=	 'notes'
notes__type	=	 'notes._type'
notes_link	=	 'notes.link'
order_total='order_total'
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
product_items_0_c_individualDelivery	=	 'product_items[0].c_individualDelivery'
product_items_0_c_isOnDemandStoreItem	=	 'product_items[0].c_isOnDemandStoreItem'
product_items_0_c_miraklChannels	=	 'product_items[0].c_miraklChannels'
product_items_0_c_miraklLeadTimeToShip	=	 'product_items[0].c_miraklLeadTimeToShip'
product_items_0_c_miraklOperatorProductId	=	 'product_items[0].c_miraklOperatorProductId'
product_items_0_c_miraklShippingTaxes	=	 'product_items[0].c_miraklShippingTaxes'
product_items_0_c_miraklTaxes	=	 'product_items[0].c_miraklTaxes'
product_items_0_c_offerId	=	 'product_items[0].c_offerId'
product_items_0_c_offerListPrice	=	 'product_items[0].c_offerListPrice'
product_items_0_c_offerSalesPrice	=	 'product_items[0].c_offerSalesPrice'
product_items_0_c_offerState	=	 'product_items[0].c_offerState'
product_items_0_c_offerStateCode	=	 'product_items[0].c_offerStateCode'
product_items_0_c_productImage	=	 'product_items[0].c_productImage'
product_items_0_c_productImage_0_alt	=	 'product_items[0].c_productImage[0].alt'
product_items_0_c_productImage_0_url	=	 'product_items[0].c_productImage[0].url'
product_items_0_c_productImage_0_title	=	 'product_items[0].c_productImage[0].title'
product_items_0_c_shopId	=	 'product_items[0].c_shopId'
product_items_0_c_shopName	=	 'product_items[0].c_shopName'
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
shipments_0_shipping_address	=	 'shipments[0].shipping_address'
shipments_0_shipping_address__type	=	 'shipments[0].shipping_address._type'
shipments_0_shipping_address_address1	=	 'shipments[0].shipping_address.address1'
shipments_0_shipping_address_city	=	 'shipments[0].shipping_address.city'
shipments_0_shipping_address_company_name	=	 'shipments[0].shipping_address.company_name'
shipments_0_shipping_address_country_code	=	 'shipments[0].shipping_address.country_code'
shipments_0_shipping_address_first_name	=	 'shipments[0].shipping_address.first_name'
shipments_0_shipping_address_full_name	=	 'shipments[0].shipping_address.full_name'
shipments_0_shipping_address_id	=	 'shipments[0].shipping_address.id'
shipments_0_shipping_address_last_name	=	 'shipments[0].shipping_address.last_name'
shipments_0_shipping_address_phone	=	 'shipments[0].shipping_address.phone'
shipments_0_shipping_address_postal_code	=	 'shipments[0].shipping_address.postal_code'
shipments_0_shipping_address_second_name	=	 'shipments[0].shipping_address.second_name'
shipments_0_shipping_address_c_alias	=	 'shipments[0].shipping_address.c_alias'
shipments_0_shipping_address_c_delegation	=	 'shipments[0].shipping_address.c_delegation'
shipments_0_shipping_address_c_label	=	 'shipments[0].shipping_address.c_label'
shipments_0_shipping_address_c_latitude	=	 'shipments[0].shipping_address.c_latitude'
shipments_0_shipping_address_c_longitude	=	 'shipments[0].shipping_address.c_longitude'
shipments_0_shipping_address_c_nExt	=	 'shipments[0].shipping_address.c_nExt'
shipments_0_shipping_address_c_nInt	=	 'shipments[0].shipping_address.c_nInt'
shipments_0_shipping_address_c_neighborhood	=	 'shipments[0].shipping_address.c_neighborhood'
shipments_0_shipping_address_c_references	=	 'shipments[0].shipping_address.c_references'
shipments_0_shipping_address_c_rfc	=	 'shipments[0].shipping_address.c_rfc'
shipments_0_shipping_address_c_state	=	 'shipments[0].shipping_address.c_state'
shipments_0_shipping_address_c_streetName	=	 'shipments[0].shipping_address.c_streetName'
shipments_0_shipping_address_c_streetNumber	=	 'shipments[0].shipping_address.c_streetNumber'
shipments_0_shipping_method__type	=	 'shipments[0].shipping_method._type'
shipments_0_shipping_method_description	=	 'shipments[0].shipping_method.description'
shipments_0_shipping_method_description	=	 'shipments[0].shipping_method.description'
shipments_0_shipping_method_id	=	 'shipments[0].shipping_method.id'
shipments_0_shipping_method_name	=	 'shipments[0].shipping_method.name'
shipments_0_shipping_method_shipping_promotions	=	 'shipments[0].shipping_method.shipping_promotions'
shipments_0_shipping_method_shipping_promotions_0__type	=	 'shipments[0].shipping_method.shipping_promotions[0]._type'
shipments_0_shipping_method_shipping_promotions_0_link	=	 'shipments[0].shipping_method.shipping_promotions[0].link'
shipments_0_shipping_method_shipping_promotions_0_promotion_id	=	 'shipments[0].shipping_method.shipping_promotions[0].promotion_id'
shipments_0_shipping_method_shipping_promotions_0_promotion_name	=	 'shipments[0].shipping_method.shipping_promotions[0].promotion_name'
shipments_0_shipping_method_shipping_promotions_1__type	=	 'shipments[0].shipping_method.shipping_promotions[1]._type'
shipments_0_shipping_method_shipping_promotions_1_link	=	 'shipments[0].shipping_method.shipping_promotions[1].link'
shipments_0_shipping_method_shipping_promotions_1_promotion_id	=	 'shipments[0].shipping_method.shipping_promotions[1].promotion_id'
shipments_0_shipping_method_shipping_promotions_1_promotion_name	=	 'shipments[0].shipping_method.shipping_promotions[1].promotion_name'
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
shipping_items_0_tax	=	 'shipping_items[0].tax'
shipping_items_0_tax_basis	=	 'shipping_items[0].tax_basis'
shipping_items_0_tax_class_id	=	 'shipping_items[0].tax_class_id'
shipping_items_0_tax_rate	=	 'shipping_items[0].tax_rate'
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
c_TypeOfShipment	=	 'c_TypeOfShipment'


_v	=	 '_v'
/*_type	=	 '_type'
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
_v = '_v'
//_type = '_type'*/

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, _v)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, _v)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, _type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, _type)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, _resource_state)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, _resource_state)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, _flash_0_type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, _flash_0_type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, adjusted_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, adjusted_shipping_total_tax)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetBilling_Response, agent_basket)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_address1)



CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_city)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_company_name)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_company_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_country_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_first_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_full_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_full_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_last_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_phone)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_postal_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_second_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_second_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_c_alias)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_c_delegation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_c_delegation)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_c_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_c_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_c_latitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_c_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_c_nExt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_c_nExt)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_c_nInt)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_c_nInt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_c_neighborhood)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_c_neighborhood)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_c_references)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_c_references)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_c_rfc)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_c_rfc)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_c_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_c_state)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_c_streetName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_c_streetName)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, billing_address_c_streetNumber)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_c_streetNumber)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, channel_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, channel_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, creation_date)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, creation_date)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, currency)


CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, customer_info__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, customer_info__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, customer_info_customer_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, customer_info_customer_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, customer_info_customer_no)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, customer_info_customer_no)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, customer_info_email)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, customer_info_email)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, last_modified)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, last_modified)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, merchandize_total_tax)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, last_modified)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, last_modified)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, notes__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, notes__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, notes_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, notes_link)

//CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, order_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, product_items_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, product_items_0__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, product_items_0_inventory_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, product_items_0_inventory_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, product_items_0_price)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, product_items_0_item_text)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, product_items_0_item_text)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, product_items_0_adjusted_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, product_items_0_base_price)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, product_items_0_product_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, product_items_0_product_id)

CustomKeywords.'totalplay.Common.getNumValueofObject'(SetBilling_Response, product_items_0_quantity)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, product_items_0_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, product_items_0_shipment_id)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetBilling_Response, product_items_0_bonus_product_line_item)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetBilling_Response, product_items_0_gift)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, product_items_0_tax_basis)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, product_items_0_tax_rate)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, product_items_0_price_after_item_discount)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, product_items_0_price_after_order_discount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, product_items_0_tax_class_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, product_items_0_tax_class_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, product_items_0_c_fromStoreId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, product_items_0_c_fromStoreId)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetBilling_Response, product_items_0_c_individualDelivery)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetBilling_Response, product_items_0_c_isOnDemandStoreItem)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, product_items_0_c_offerId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, product_items_0_c_offerId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, product_items_0_c_miraklOperatorProductId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, product_items_0_c_miraklOperatorProductId)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, product_items_0_c_offerListPrice)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, product_items_0_c_offerSalesPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, product_items_0_c_offerState)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, product_items_0_c_offerState)


CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, product_items_0_c_offerStateCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, product_items_0_c_offerStateCode)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, product_items_0_c_productImage_0_alt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, product_items_0_c_productImage_0_alt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, product_items_0_c_productImage_0_url)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, product_items_0_c_productImage_0_url)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, product_items_0_c_productImage_0_title)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, product_items_0_c_productImage_0_title)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, product_items_0_c_shopId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, product_items_0_c_shopId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, product_items_0_c_shopName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, product_items_0_c_shopName)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, product_sub_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, product_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0__type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, shipments_0_adjusted_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, shipments_0_adjusted_shipping_total_tax)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetBilling_Response, shipments_0_gift)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, shipments_0_merchandize_total_tax)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, shipments_0_product_sub_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, shipments_0_product_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipment_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, shipments_0_shipment_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_address1)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_city)


CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_country_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_first_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_full_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_full_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_last_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_phone)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_postal_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_second_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_second_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_c_alias)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_c_delegation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_c_delegation)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_c_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_c_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_c_latitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_c_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_c_nExt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_c_nExt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_c_nInt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_c_nInt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_c_neighborhood)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, billing_address_c_neighborhood)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_c_references)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_c_references)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_c_rfc)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_c_rfc)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_c_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_c_state)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_c_streetName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_c_streetName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_address_c_streetNumber)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_address_c_streetNumber)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_method_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_method_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_method_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_method_name)


//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_method_shipping_promotions_0__type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_method_shipping_promotions_0__type)


CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetBilling_Response, shipments_0_shipping_method_c_onlinePickupEnabled)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetBilling_Response, shipments_0_shipping_method_c_storePickupEnabled)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipments_0_shipping_status)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipments_0_shipping_status)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, shipments_0_shipping_total)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, shipments_0_shipping_total_tax)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, shipments_0_tax_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipping_items_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipping_items_0__type)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, shipping_items_0_adjusted_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, shipping_items_0_base_price)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipping_items_0_item_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipping_items_0_item_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipping_items_0_item_text)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipping_items_0_item_text)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, shipping_items_0_price)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, shipping_items_0_price_after_item_discount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipping_items_0_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipping_items_0_shipment_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, shipping_items_0_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, shipping_items_0_tax_basis)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, shipping_items_0_tax_class_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, shipping_items_0_tax_class_id)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, shipping_items_0_tax_rate)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, shipping_total)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, shipping_total_tax)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, taxation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, taxation)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetBilling_Response, tax_rounded_at_group)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SetBilling_Response, tax_total)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetBilling_Response, temporary_basket)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, c_corporateImgUrl)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, c_corporateImgUrl)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, c_currentCorporate)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, c_currentCorporate)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, c_currentMultiStoreID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, c_currentMultiStoreID)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, c_preferedShipment)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, c_preferedShipment)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, c_seller_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, c_seller_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, c_TypeOfShipment)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, c_TypeOfShipment)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SetBilling_Response, c_isLock)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, c_lockTime)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, c_lockTime)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SetBilling_Response, c_multiStoreEDD)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SetBilling_Response, c_multiStoreEDD)




