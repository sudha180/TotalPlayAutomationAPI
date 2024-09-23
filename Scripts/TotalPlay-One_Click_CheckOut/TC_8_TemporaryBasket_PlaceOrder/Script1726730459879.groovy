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

WebUI.callTestCase(findTestCase('TotalPlay-One_Click_CheckOut/TC_1_LoginInterface'), [:], FailureHandling.STOP_ON_FAILURE)

TemporaryBasket = WS.sendRequest(findTestObject('One_Click_CheckOut/temporary basket/createTemporaryBasket', [('URL') : GlobalVariable.URL
            , ('SITEID') : GlobalVariable.SITEID]))

CustomKeywords.'totalplay.Common.printResponseinText'(TemporaryBasket)

WS.verifyResponseStatusCode(TemporaryBasket, 200)

c_result_basket_id = 'c_result.basket_id'

c_result_order_total = 'c_result.order_total'

String TemporaryBasketId = WS.getElementPropertyValue(TemporaryBasket, c_result_basket_id)

GlobalVariable.temporary_basket_id = TemporaryBasketId

println(GlobalVariable.temporary_basket_id)

String TemporaryBasketIdOrderTotal = WS.getElementPropertyValue(TemporaryBasket, c_result_order_total)

GlobalVariable.temporary_basket_order_total = TemporaryBasketIdOrderTotal

println(GlobalVariable.temporary_basket_order_total)

SubmitPayment = WS.sendRequest(findTestObject('One_Click_CheckOut/temporary basket/submit payment temporary basket credit card', 
        [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID, ('temporary_basket_id') : GlobalVariable.temporary_basket_id
            , ('temporary_basket_order_total') : GlobalVariable.temporary_basket_order_total]))

CustomKeywords.'totalplay.Common.printResponseinText'(SubmitPayment)

WS.verifyResponseStatusCode(SubmitPayment, 200)

Temporary_PreAuth = WS.sendRequest(findTestObject('One_Click_CheckOut/temporary basket/preauth temporary basket', [('URL') : GlobalVariable.URL
            , ('SITEID') : GlobalVariable.SITEID, ('temporary_basket_id') : GlobalVariable.temporary_basket_id]))

CustomKeywords.'totalplay.Common.printResponseinText'(Temporary_PreAuth)

WS.verifyResponseStatusCode(Temporary_PreAuth, 200)

PlaceOrder = WS.sendRequest(findTestObject('One_Click_CheckOut/temporary basket/Place order', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID
            , ('temporary_basket_id') : GlobalVariable.temporary_basket_id]))

CustomKeywords.'totalplay.Common.printResponseinText'(PlaceOrder)

WS.verifyResponseStatusCode(PlaceOrder, 200)

_v='_v'
adjusted_shipping_total_tax='adjusted_shipping_total_tax'
agent_basket='agent_basket'
resource_state = '_resource_state'
adjusted_merchandize_total_tax = 'adjusted_merchandize_total_tax'
billing_address_type = 'billing_address._type'
billing_address_address1 = 'billing_address.address1'
billing_address_city = 'billing_address.city'
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
 
channel_type = 'channel_type'
 
creation_date = 'creation_date'
 
currency = 'currency'
 
customer_info_type = 'customer_info._type'
 
customer_info_customer_id = 'customer_info.customer_id'
 
customer_info_customer_no = 'customer_info.customer_no'
 
customer_info_email = 'customer_info.email'
  
last_modified = 'last_modified'
 
notes = 'notes'
 
notes_link = 'notes.link'
 
notes_type = 'notes._type'
order_no= 'order_no'
order_token= 'order_token'
order_total = 'order_total'
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
shipments_0_shipping_address_second_name	=	 'shipments[0].shipping_address.second_name'
shipments_0_shipping_address_c_alias	=	 'shipments[0].shipping_address.c_alias'
shipments_0_shipping_address_c_delegation	=	 'shipments[0].shipping_address.c_delegation'
shipments_0_shipping_address_c_isBilling	=	 'shipments[0].shipping_address.c_isBilling'
shipments_0_shipping_address_c_isContact	=	 'shipments[0].shipping_address.c_isContact'
shipments_0_shipping_address_c_isShipping	=	 'shipments[0].shipping_address.c_isShipping'
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
shipments_0_shipping_method_id	=	 'shipments[0].shipping_method.id'
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, _v)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, _v)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, adjusted_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, adjusted_shipping_total_tax)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, agent_basket)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_type)
 
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
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_second_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_second_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_c_alias)
 
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
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_c_nInt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_c_nInt)
 
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
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, billing_address_c_streetNumber)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, billing_address_c_streetNumber)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, channel_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, channel_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, creation_date)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, creation_date)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, currency)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, customer_info_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, customer_info_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, customer_info_customer_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, customer_info_customer_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, customer_info_customer_no)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, customer_info_customer_no)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, customer_info_email)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, customer_info_email)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, last_modified)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, last_modified)
  
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, last_modified)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, last_modified)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, notes_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, notes_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, notes_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, notes_link)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PlaceOrder, order_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, order_no)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, order_no)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, order_token)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, order_token)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0__type)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments_0_adjusted_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments_0_adjusted_shipping_total_tax)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PlaceOrder, shipments_0_gift)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments_0_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments_0_product_sub_total)
CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments_0_product_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipment_id)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PlaceOrder, shipments_0_shipment_total)

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

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_second_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_second_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_alias)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_delegation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_delegation)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_isBilling)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_isBilling)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_isContact)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_isContact)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_isShipping)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_isShipping)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_latitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_nExt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_nExt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_nInt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_nInt)

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

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_address_c_streetNumber)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_address_c_streetNumber)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_method__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_method__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PlaceOrder, shipments_0_shipping_method_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PlaceOrder, shipments_0_shipping_method_id)

