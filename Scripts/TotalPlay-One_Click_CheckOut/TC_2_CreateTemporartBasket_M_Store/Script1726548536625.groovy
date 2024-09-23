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


_v	=	 '_v'
_type	=	 '_type'
key_property	=	 'key_property'
object_type	=	 'object_type'
c_result_basket_id	=	 'c_result.basket_id'
c_result_crm_address_id	=	 'c_result.crm_address_id'
c_result_productVerticalType	=	 'c_result.productVerticalType'
c_result_customer__type	=	 'c_result.customer._type'
c_result_customer_customer_id	=	 'c_result.customer.customer_id'
c_result_customer_customer_no	=	 'c_result.customer.customer_no'
c_result_customer_email	=	 'c_result.customer.email'
c_result_order_total	=	 'c_result.order_total'
c_result_product_items_0__type	=	 'c_result.product_items[0]._type'
c_result_product_items_0_adjusted_tax	=	 'c_result.product_items[0].adjusted_tax'
c_result_product_items_0_base_price	=	 'c_result.product_items[0].base_price'
c_result_product_items_0_bonus_product_line_item	=	 'c_result.product_items[0].bonus_product_line_item'
c_result_product_items_0_gift	=	 'c_result.product_items[0].gift'
c_result_product_items_0_inventory_id	=	 'c_result.product_items[0].inventory_id'
c_result_product_items_0_item_id	=	 'c_result.product_items[0].item_id'
c_result_product_items_0_item_text	=	 'c_result.product_items[0].item_text'
c_result_product_items_0_price	=	 'c_result.product_items[0].price'
c_result_product_items_0_price_after_item_discount	=	 'c_result.product_items[0].price_after_item_discount'
c_result_product_items_0_price_after_order_discount	=	 'c_result.product_items[0].price_after_order_discount'
c_result_product_items_0_product_id	=	 'c_result.product_items[0].product_id'
c_result_product_items_0_product_name	=	 'c_result.product_items[0].product_name'
c_result_product_items_0_quantity	=	 'c_result.product_items[0].quantity'
c_result_product_items_0_shipment_id	=	 'c_result.product_items[0].shipment_id'
c_result_product_items_0_tax	=	 'c_result.product_items[0].tax'
c_result_product_items_0_tax_basis	=	 'c_result.product_items[0].tax_basis'
c_result_product_items_0_tax_class_id	=	 'c_result.product_items[0].tax_class_id'
c_result_product_items_0_tax_rate	=	 'c_result.product_items[0].tax_rate'
c_result_product_items_0_c_fromStoreId	=	 'c_result.product_items[0].c_fromStoreId'
c_result_product_items_0_c_individualDelivery	=	 'c_result.product_items[0].c_individualDelivery'
c_result_product_items_0_c_isOnDemandStoreItem	=	 'c_result.product_items[0].c_isOnDemandStoreItem'
c_result_product_items_0_c_miraklChannels	=	 'c_result.product_items[0].c_miraklChannels'
c_result_product_items_0_c_miraklLeadTimeToShip	=	 'c_result.product_items[0].c_miraklLeadTimeToShip'
c_result_product_items_0_c_miraklOperatorProductId	=	 'c_result.product_items[0].c_miraklOperatorProductId'
c_result_product_items_0_c_miraklShippingTaxes	=	 'c_result.product_items[0].c_miraklShippingTaxes'
c_result_product_items_0_c_miraklTaxes	=	 'c_result.product_items[0].c_miraklTaxes'
c_result_product_items_0_c_offerId	=	 'c_result.product_items[0].c_offerId'
c_result_product_items_0_c_offerListPrice	=	 'c_result.product_items[0].c_offerListPrice'
c_result_product_items_0_c_offerSalesPrice	=	 'c_result.product_items[0].c_offerSalesPrice'
c_result_product_items_0_c_offerState	=	 'c_result.product_items[0].c_offerState'
c_result_product_items_0_c_offerStateCode	=	 'c_result.product_items[0].c_offerStateCode'
c_result_product_items_0_c_productImage_0_alt	=	 'c_result.product_items[0].c_productImage[0].alt'
c_result_product_items_0_c_productImage_0_url	=	 'c_result.product_items[0].c_productImage[0].url'
c_result_product_items_0_c_productImage_0_title	=	 'c_result.product_items[0].c_productImage[0].title'
c_result_product_items_0_c_shopId	=	 'c_result.product_items[0].c_shopId'
c_result_product_items_0_c_shopName	=	 'c_result.product_items[0].c_shopName'
c_result_product_items_0_c_total_crossed_price	=	 'c_result.product_items[0].c_total_crossed_price'
c_result_applicable_payment_methods_0__type	=	 'c_result.applicable_payment_methods[0]._type'
c_result_applicable_payment_methods_0_cards_0__type	=	 'c_result.applicable_payment_methods[0].cards[0]._type'
c_result_applicable_payment_methods_0_cards_0_card_type	=	 'c_result.applicable_payment_methods[0].cards[0].card_type'
c_result_applicable_payment_methods_0_cards_0_checksum_verification_enabled	=	 'c_result.applicable_payment_methods[0].cards[0].checksum_verification_enabled'
c_result_applicable_payment_methods_0_cards_0_name	=	 'c_result.applicable_payment_methods[0].cards[0].name'
c_result_applicable_payment_methods_0_description	=	 'c_result.applicable_payment_methods[0].description'
c_result_applicable_payment_methods_0_id	=	 'c_result.applicable_payment_methods[0].id'
c_result_applicable_payment_methods_0_name	=	 'c_result.applicable_payment_methods[0].name'
c_result_applicable_payment_methods_0_payment_processor_id	=	 'c_result.applicable_payment_methods[0].payment_processor_id'
c_result_applicable_payment_methods_0_c_isDefault	=	 'c_result.applicable_payment_methods[0].c_isDefault'
c_result_applicable_payment_methods_1__type	=	 'c_result.applicable_payment_methods[1]._type'
c_result_applicable_payment_methods_1_id	=	 'c_result.applicable_payment_methods[1].id'
c_result_applicable_payment_methods_1_name	=	 'c_result.applicable_payment_methods[1].name'
c_result_applicable_payment_methods_1_payment_processor_id	=	 'c_result.applicable_payment_methods[1].payment_processor_id'
c_result_applicable_payment_methods_1_c_creditBalance	=	 'c_result.applicable_payment_methods[1].c_creditBalance'
c_result_applicable_payment_methods_1_c_isDefault	=	 'c_result.applicable_payment_methods[1].c_isDefault'
c_result_applicable_payment_methods_1_c_insufficientBalance	=	 'c_result.applicable_payment_methods[1].c_insufficientBalance'
c_result_applicable_payment_methods_1_c_inActive	=	 'c_result.applicable_payment_methods[1].c_inActive'
c_result_applicable_payment_methods_1_c_QRCode	=	 'c_result.applicable_payment_methods[1].c_QRCode'
c_result_applicable_payment_methods_1_c_Lineacredito	=	 'c_result.applicable_payment_methods[1].c_Lineacredito'
c_result_shipment_0__type	=	 'c_result.shipment[0]._type'
c_result_shipment_0_adjusted_merchandize_total_tax	=	 'c_result.shipment[0].adjusted_merchandize_total_tax'
c_result_shipment_0_adjusted_shipping_total_tax	=	 'c_result.shipment[0].adjusted_shipping_total_tax'
c_result_shipment_0_gift	=	 'c_result.shipment[0].gift'
c_result_shipment_0_merchandize_total_tax	=	 'c_result.shipment[0].merchandize_total_tax'
c_result_shipment_0_product_sub_total	=	 'c_result.shipment[0].product_sub_total'
c_result_shipment_0_product_total	=	 'c_result.shipment[0].product_total'
c_result_shipment_0_shipment_id	=	 'c_result.shipment[0].shipment_id'
c_result_shipment_0_shipment_total	=	 'c_result.shipment[0].shipment_total'
c_result_shipment_0_shipping_address__type	=	 'c_result.shipment[0].shipping_address._type'
c_result_shipment_0_shipping_address_address1	=	 'c_result.shipment[0].shipping_address.address1'
c_result_shipment_0_shipping_address_city	=	 'c_result.shipment[0].shipping_address.city'
c_result_shipment_0_shipping_address_country_code	=	 'c_result.shipment[0].shipping_address.country_code'
c_result_shipment_0_shipping_address_first_name	=	 'c_result.shipment[0].shipping_address.first_name'
c_result_shipment_0_shipping_address_full_name	=	 'c_result.shipment[0].shipping_address.full_name'
c_result_shipment_0_shipping_address_id	=	 'c_result.shipment[0].shipping_address.id'
c_result_shipment_0_shipping_address_last_name	=	 'c_result.shipment[0].shipping_address.last_name'
c_result_shipment_0_shipping_address_phone	=	 'c_result.shipment[0].shipping_address.phone'
c_result_shipment_0_shipping_address_postal_code	=	 'c_result.shipment[0].shipping_address.postal_code'
c_result_shipment_0_shipping_address_second_name	=	 'c_result.shipment[0].shipping_address.second_name'
c_result_shipment_0_shipping_address_c_alias	=	 'c_result.shipment[0].shipping_address.c_alias'
c_result_shipment_0_shipping_address_c_delegation	=	 'c_result.shipment[0].shipping_address.c_delegation'
c_result_shipment_0_shipping_address_c_latitude	=	 'c_result.shipment[0].shipping_address.c_latitude'
c_result_shipment_0_shipping_address_c_longitude	=	 'c_result.shipment[0].shipping_address.c_longitude'
c_result_shipment_0_shipping_address_c_nExt	=	 'c_result.shipment[0].shipping_address.c_nExt'
c_result_shipment_0_shipping_address_c_nInt	=	 'c_result.shipment[0].shipping_address.c_nInt'
c_result_shipment_0_shipping_address_c_neighborhood	=	 'c_result.shipment[0].shipping_address.c_neighborhood'
c_result_shipment_0_shipping_address_c_references	=	 'c_result.shipment[0].shipping_address.c_references'
c_result_shipment_0_shipping_address_c_rfc	=	 'c_result.shipment[0].shipping_address.c_rfc'
c_result_shipment_0_shipping_address_c_state	=	 'c_result.shipment[0].shipping_address.c_state'
c_result_shipment_0_shipping_address_c_streetName	=	 'c_result.shipment[0].shipping_address.c_streetName'
c_result_shipment_0_shipping_address_c_streetNumber	=	 'c_result.shipment[0].shipping_address.c_streetNumber'
c_result_shipment_0_shipping_status	=	 'c_result.shipment[0].shipping_status'
c_result_shipment_0_shipping_total	=	 'c_result.shipment[0].shipping_total'
c_result_shipment_0_shipping_total_tax	=	 'c_result.shipment[0].shipping_total_tax'
c_result_shipment_0_tax_total	=	 'c_result.shipment[0].tax_total'
c_result_billing_address__type	=	 'c_result.billing_address._type'
c_result_billing_address_address1	=	 'c_result.billing_address.address1'
c_result_billing_address_city	=	 'c_result.billing_address.city'
c_result_billing_address_country_code	=	 'c_result.billing_address.country_code'
c_result_billing_address_first_name	=	 'c_result.billing_address.first_name'
c_result_billing_address_full_name	=	 'c_result.billing_address.full_name'
c_result_billing_address_id	=	 'c_result.billing_address.id'
c_result_billing_address_last_name	=	 'c_result.billing_address.last_name'
c_result_billing_address_phone	=	 'c_result.billing_address.phone'
c_result_billing_address_postal_code	=	 'c_result.billing_address.postal_code'
c_result_billing_address_second_name	=	 'c_result.billing_address.second_name'
c_result_billing_address_c_alias	=	 'c_result.billing_address.c_alias'
c_result_billing_address_c_delegation	=	 'c_result.billing_address.c_delegation'
c_result_billing_address_c_latitude	=	 'c_result.billing_address.c_latitude'
c_result_billing_address_c_longitude	=	 'c_result.billing_address.c_longitude'
c_result_billing_address_c_nExt	=	 'c_result.billing_address.c_nExt'
c_result_billing_address_c_nInt	=	 'c_result.billing_address.c_nInt'
c_result_billing_address_c_neighborhood	=	 'c_result.billing_address.c_neighborhood'
c_result_billing_address_c_references	=	 'c_result.billing_address.c_references'
c_result_billing_address_c_rfc	=	 'c_result.billing_address.c_rfc'
c_result_billing_address_c_state	=	 'c_result.billing_address.c_state'
c_result_billing_address_c_streetName	=	 'c_result.billing_address.c_streetName'
c_result_billing_address_c_streetNumber	=	 'c_result.billing_address.c_streetNumber'


CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, _v)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, _v)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, _type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, _type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, key_property)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, key_property)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, object_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, object_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_basket_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_basket_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_crm_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_crm_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_productVerticalType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_productVerticalType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_customer__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_customer__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_customer_customer_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_customer_customer_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_customer_customer_no)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_customer_customer_no)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_customer_email)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_customer_email)

CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_order_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0__type)

CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_product_items_0_adjusted_tax)
CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_product_items_0_base_price)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(TemporaryBasket, c_result_product_items_0_bonus_product_line_item)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(TemporaryBasket, c_result_product_items_0_gift)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_inventory_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_inventory_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_item_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_item_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_item_text)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_item_text)

CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_product_items_0_price)
CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_product_items_0_price_after_item_discount)
CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_product_items_0_price_after_order_discount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_product_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_product_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_product_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_product_name)

CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_product_items_0_quantity)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_shipment_id)

CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_product_items_0_tax)
CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_product_items_0_tax_basis)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_tax_class_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_tax_class_id)

CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_product_items_0_tax_rate)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_c_fromStoreId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_c_fromStoreId)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(TemporaryBasket, c_result_product_items_0_c_individualDelivery)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(TemporaryBasket, c_result_product_items_0_c_isOnDemandStoreItem)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_c_miraklChannels)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_c_miraklChannels)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_c_miraklLeadTimeToShip)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_c_miraklLeadTimeToShip)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_c_miraklOperatorProductId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_c_miraklOperatorProductId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_c_miraklShippingTaxes)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_c_miraklShippingTaxes)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_c_miraklTaxes)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_c_miraklTaxes)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_c_offerId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_c_offerId)

CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_product_items_0_c_offerListPrice)
CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_product_items_0_c_offerSalesPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_c_offerState)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_c_offerState)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_c_offerStateCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_c_offerStateCode)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_c_productImage_0_alt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_c_productImage_0_alt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_c_productImage_0_url)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_c_productImage_0_url)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_c_productImage_0_title)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_c_productImage_0_title)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_c_shopId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_c_shopId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_product_items_0_c_shopName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_product_items_0_c_shopName)

CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_product_items_0_c_total_crossed_price)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_applicable_payment_methods_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_applicable_payment_methods_0__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_applicable_payment_methods_0_cards_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_applicable_payment_methods_0_cards_0__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_applicable_payment_methods_0_cards_0_card_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_applicable_payment_methods_0_cards_0_card_type)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(TemporaryBasket, c_result_applicable_payment_methods_0_cards_0_checksum_verification_enabled)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_applicable_payment_methods_0_cards_0_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_applicable_payment_methods_0_cards_0_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_applicable_payment_methods_0_description)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_applicable_payment_methods_0_description)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_applicable_payment_methods_0_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_applicable_payment_methods_0_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_applicable_payment_methods_0_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_applicable_payment_methods_0_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_applicable_payment_methods_0_payment_processor_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_applicable_payment_methods_0_payment_processor_id)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(TemporaryBasket, c_result_applicable_payment_methods_0_c_isDefault)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_applicable_payment_methods_1__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_applicable_payment_methods_1__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_applicable_payment_methods_1_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_applicable_payment_methods_1_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_applicable_payment_methods_1_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_applicable_payment_methods_1_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_applicable_payment_methods_1_payment_processor_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_applicable_payment_methods_1_payment_processor_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_applicable_payment_methods_1_c_creditBalance)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_applicable_payment_methods_1_c_creditBalance)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(TemporaryBasket, c_result_applicable_payment_methods_1_c_isDefault)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(TemporaryBasket, c_result_applicable_payment_methods_1_c_insufficientBalance)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(TemporaryBasket, c_result_applicable_payment_methods_1_c_inActive)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_applicable_payment_methods_1_c_QRCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_applicable_payment_methods_1_c_QRCode)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_applicable_payment_methods_1_c_Lineacredito)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_applicable_payment_methods_1_c_Lineacredito)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0__type)

CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_shipment_0_adjusted_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_shipment_0_adjusted_shipping_total_tax)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(TemporaryBasket, c_result_shipment_0_gift)

CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_shipment_0_merchandize_total_tax)
CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_shipment_0_product_sub_total)
CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_shipment_0_product_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipment_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipment_id)

CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_shipment_0_shipment_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_address1)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_city)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_country_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_first_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_full_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_full_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_last_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_phone)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_postal_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_second_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_second_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_alias)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_delegation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_delegation)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_latitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_nExt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_nExt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_nInt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_nInt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_neighborhood)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_neighborhood)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_references)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_references)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_rfc)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_rfc)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_state)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_streetName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_streetName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_streetNumber)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_address_c_streetNumber)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_shipment_0_shipping_status)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_shipment_0_shipping_status)

CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_shipment_0_shipping_total)
CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_shipment_0_shipping_total_tax)
CustomKeywords.'totalplay.Common.getNumValueofObject'(TemporaryBasket, c_result_shipment_0_tax_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_address1)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_city)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_country_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_first_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_full_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_full_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_last_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_phone)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_postal_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_second_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_second_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_c_alias)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_c_delegation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_c_delegation)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_c_latitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_c_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_c_nExt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_c_nExt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_c_nInt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_c_nInt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_c_neighborhood)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_c_neighborhood)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_c_references)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_c_references)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_c_rfc)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_c_rfc)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_c_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_c_state)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_c_streetName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_c_streetName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(TemporaryBasket, c_result_billing_address_c_streetNumber)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(TemporaryBasket, c_result_billing_address_c_streetNumber)