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

OrderHistory = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/OrderHistory/OrderHistory', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID
            , ('Authorization') : GlobalVariable.Authorization]))

WS.verifyResponseStatusCode(OrderHistory, 200)

order_no = 'c_result.orders[0].order_no'

GlobalVariable.OrderNo = WS.getElementPropertyValue(OrderHistory, order_no)

println(GlobalVariable.OrderNo)

getOrderByID = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/OrderHistory/getOrderById', [('URL') : GlobalVariable.URL
            , ('SITEID') : GlobalVariable.SITEID]))

CustomKeywords.'totalplay.Common.printResponseinText'(getOrderByID)

WS.verifyResponseStatusCode(getOrderByID, 200)

_v = '_v'

_type = '_type'

id = 'id'

name = 'name'

c_result_order_no = 'c_result.order_no'

c_result_sfccCustomerNumber = 'c_result.sfccCustomerNumber'

c_result_brmId = 'c_result.brmId'

c_result_corporate_name = 'c_result.corporate_name'

c_result_creationDate = 'c_result.creationDate'

c_result_totalCost = 'c_result.totalCost'

c_result_shipments_0_product_total = 'c_result.shipments[0].product_total'

c_result_shipments_0_shipment_id = 'c_result.shipments[0].shipment_id'

c_result_shipments_0_shipment_total = 'c_result.shipments[0].shipment_total'

c_result_shipments_0_shipping_address__type = 'c_result.shipments[0].shipping_address._type'

c_result_shipments_0_shipping_address_address1 = 'c_result.shipments[0].shipping_address.address1'

c_result_shipments_0_shipping_address_city = 'c_result.shipments[0].shipping_address.city'

c_result_shipments_0_shipping_address_country_code = 'c_result.shipments[0].shipping_address.country_code'

c_result_shipments_0_shipping_address_first_name = 'c_result.shipments[0].shipping_address.first_name'

c_result_shipments_0_shipping_address_full_name = 'c_result.shipments[0].shipping_address.full_name'

c_result_shipments_0_shipping_address_id = 'c_result.shipments[0].shipping_address.id'

c_result_shipments_0_shipping_address_last_name = 'c_result.shipments[0].shipping_address.last_name'

c_result_shipments_0_shipping_address_phone = 'c_result.shipments[0].shipping_address.phone'

c_result_shipments_0_shipping_address_postal_code = 'c_result.shipments[0].shipping_address.postal_code'

c_result_shipments_0_shipping_address_second_name = 'c_result.shipments[0].shipping_address.second_name'

c_result_shipments_0_shipping_address_c_alias = 'c_result.shipments[0].shipping_address.c_alias'

c_result_shipments_0_shipping_address_c_delegation = 'c_result.shipments[0].shipping_address.c_delegation'

c_result_shipments_0_shipping_address_c_isBilling = 'c_result.shipments[0].shipping_address.c_isBilling'

c_result_shipments_0_shipping_address_c_isContact = 'c_result.shipments[0].shipping_address.c_isContact'

c_result_shipments_0_shipping_address_c_isShipping = 'c_result.shipments[0].shipping_address.c_isShipping'

c_result_shipments_0_shipping_address_c_latitude = 'c_result.shipments[0].shipping_address.c_latitude'

c_result_shipments_0_shipping_address_c_longitude = 'c_result.shipments[0].shipping_address.c_longitude'

c_result_shipments_0_shipping_address_c_nExt = 'c_result.shipments[0].shipping_address.c_nExt'

c_result_shipments_0_shipping_address_c_nInt = 'c_result.shipments[0].shipping_address.c_nInt'

c_result_shipments_0_shipping_address_c_neighborhood = 'c_result.shipments[0].shipping_address.c_neighborhood'

c_result_shipments_0_shipping_address_c_references = 'c_result.shipments[0].shipping_address.c_references'

c_result_shipments_0_shipping_address_c_rfc = 'c_result.shipments[0].shipping_address.c_rfc'

c_result_shipments_0_shipping_address_c_state = 'c_result.shipments[0].shipping_address.c_state'

c_result_shipments_0_shipping_address_c_streetName = 'c_result.shipments[0].shipping_address.c_streetName'

c_result_shipments_0_shipping_address_c_streetNumber = 'c_result.shipments[0].shipping_address.c_streetNumber'

c_result_shipments_0_shipping_address_c_etiqueta_home = 'c_result.shipments[0].shipping_address.c_etiqueta.home'

c_result_shipments_0_shipping_address_c_etiqueta_company = 'c_result.shipments[0].shipping_address.c_etiqueta.company'

c_result_shipments_0_shipping_address_c_etiqueta_other = 'c_result.shipments[0].shipping_address.c_etiqueta.other'

c_result_shipments_0_shipping_method__type = 'c_result.shipments[0].shipping_method._type'

c_result_shipments_0_shipping_method_id = 'c_result.shipments[0].shipping_method.id'

c_result_shipments_0_shipping_method_name = 'c_result.shipments[0].shipping_method.name'

c_result_shipments_0_shipping_total = 'c_result.shipments[0].shipping_total'

c_result_shipments_0_service_cost = 'c_result.shipments[0].service_cost'

c_result_shipments_0_c_canCancel = 'c_result.shipments[0].c_canCancel'

c_result_shipments_0_c_shopId = 'c_result.shipments[0].c_shopId'

c_result_shipments_0_c_shopName = 'c_result.shipments[0].c_shopName'

c_result_shipments_0_c_shopContact = 'c_result.shipments[0].c_shopContact'

c_result_shipments_0_c_productItems_0_total_price_without_discount = 'c_result.shipments[0].c_productItems[0].total_price_without_discount'

c_result_shipments_0_c_productItems_0_total_price_with_discount = 'c_result.shipments[0].c_productItems[0].total_price_with_discount'

c_result_shipments_0_c_productItems_0_product_id = 'c_result.shipments[0].c_productItems[0].product_id'

c_result_shipments_0_c_productItems_0_product_name = 'c_result.shipments[0].c_productItems[0].product_name'

c_result_shipments_0_c_productItems_0_quantity = 'c_result.shipments[0].c_productItems[0].quantity'

c_result_shipments_0_c_productItems_0_product_image_0_alt = 'c_result.shipments[0].c_productItems[0].product_image[0].alt'

c_result_shipments_0_c_productItems_0_product_image_0_url = 'c_result.shipments[0].c_productItems[0].product_image[0].url'

c_result_shipments_0_c_productItems_0_product_image_0_title = 'c_result.shipments[0].c_productItems[0].product_image[0].title'

c_result_shipments_0_c_productItems_0_is_cancelled = 'c_result.shipments[0].c_productItems[0].is_cancelled'

c_result_shipments_0_c_productItems_0_promotions = 'c_result.shipments[0].c_productItems[0].promotions'

c_result_shipments_0_c_productItems_0_c_isOnDemandStoreItem = 'c_result.shipments[0].c_productItems[0].c_isOnDemandStoreItem'

c_result_shipments_0_c_paymentInstruments_0_masked_number = 'c_result.shipments[0].c_paymentInstruments[0].masked_number'

c_result_shipments_0_c_paymentInstruments_0_amount = 'c_result.shipments[0].c_paymentInstruments[0].amount'

c_result_shipments_0_c_paymentInstruments_0_payment_method_id = 'c_result.shipments[0].c_paymentInstruments[0].payment_method_id'

c_result_shipments_0_c_paymentInstruments_0_card_holder = 'c_result.shipments[0].c_paymentInstruments[0].card_holder'

c_result_shipments_0_c_shipmentStatus_currrentStatus = 'c_result.shipments[0].c_shipmentStatus.currrentStatus'

c_result_shipments_0_c_shipmentStatus_estimatedDelivery = 'c_result.shipments[0].c_shipmentStatus.estimatedDelivery'

c_result_shipments_0_c_shipmentStatus_information_stage1 = 'c_result.shipments[0].c_shipmentStatus.information.stage1'

c_result_shipments_0_c_shipmentStatus_information_stage2 = 'c_result.shipments[0].c_shipmentStatus.information.stage2'

c_result_shipments_0_c_shipmentStatus_information_stage3 = 'c_result.shipments[0].c_shipmentStatus.information.stage3'

c_result_shipments_0_c_shipmentStatus_information_stage4 = 'c_result.shipments[0].c_shipmentStatus.information.stage4'

c_result_shipments_0_c_shipmentStatus_information_stage5 = 'c_result.shipments[0].c_shipmentStatus.information.stage5'

c_result_shipments_0_c_shipmentStatus_information_stage6 = 'c_result.shipments[0].c_shipmentStatus.information.stage6'

c_result_shipments_0_c_shipmentStatus_packageDetails_packageName = 'c_result.shipments[0].c_shipmentStatus.packageDetails.packageName'

c_result_shipments_0_c_shipmentStatus_packageDetails_driverName = 'c_result.shipments[0].c_shipmentStatus.packageDetails.driverName'

c_result_shipments_0_c_shipmentStatus_packageDetails_driverNumber = 'c_result.shipments[0].c_shipmentStatus.packageDetails.driverNumber'

c_result_shipments_0_c_shipmentStatus_packageDetails_sellerNumber = 'c_result.shipments[0].c_shipmentStatus.packageDetails.sellerNumber'

c_result_shipments_0_trackingLedger_0_bookingId = 'c_result.shipments[0].trackingLedger[0].bookingId'

c_result_shipments_0_trackingLedger_0_originChannel = 'c_result.shipments[0].trackingLedger[0].originChannel'

c_result_shipments_0_trackingLedger_0_requestedBy = 'c_result.shipments[0].trackingLedger[0].requestedBy'

c_result_shipments_0_trackingLedger_0_prevStatus = 'c_result.shipments[0].trackingLedger[0].prevStatus'

c_result_shipments_0_trackingLedger_0_prevStatusTech = 'c_result.shipments[0].trackingLedger[0].prevStatusTech'

c_result_shipments_0_trackingLedger_0_newStatus = 'c_result.shipments[0].trackingLedger[0].newStatus'

c_result_shipments_0_trackingLedger_0_newStatusTech = 'c_result.shipments[0].trackingLedger[0].newStatusTech'

c_result_shipments_0_trackingLedger_0_updateDate = 'c_result.shipments[0].trackingLedger[0].updateDate'

c_result_shipments_0_orderPlacedChannel = 'c_result.shipments[0].orderPlacedChannel'

c_result_shipments_0_proveedor = 'c_result.shipments[0].proveedor'

c_result_shipments_0_estimatedDeliveryTime = 'c_result.shipments[0].estimatedDeliveryTime'

c_result_shipments_0_productCost = 'c_result.shipments[0].productCost'

c_result_shipments_0_order_total = 'c_result.shipments[0].order_total'

c_result_shipments_0_c_savingsTotal = 'c_result.shipments[0].c_savingsTotal'

c_result_productCost = 'c_result.productCost'

c_result_customerEmail = 'c_result.customerEmail'

c_result_c_formatedShippingTotalGrossPrice = 'c_result.c_formatedShippingTotalGrossPrice'

c_result_comment = 'c_result.comment'

c_result_multistoreStoreDetails_ID = 'c_result.multistoreStoreDetails.ID'

c_result_multistoreStoreDetails_address1 = 'c_result.multistoreStoreDetails.address1'

c_result_multistoreStoreDetails_address2 = 'c_result.multistoreStoreDetails.address2'

c_result_multistoreStoreDetails_city = 'c_result.multistoreStoreDetails.city'

c_result_multistoreStoreDetails_countryCode = 'c_result.multistoreStoreDetails.countryCode'

c_result_multistoreStoreDetails_email = 'c_result.multistoreStoreDetails.email'

c_result_multistoreStoreDetails_fax = 'c_result.multistoreStoreDetails.fax'

c_result_multistoreStoreDetails_latitude = 'c_result.multistoreStoreDetails.latitude'

c_result_multistoreStoreDetails_longitude = 'c_result.multistoreStoreDetails.longitude'

c_result_multistoreStoreDetails_name = 'c_result.multistoreStoreDetails.name'

c_result_multistoreStoreDetails_phone = 'c_result.multistoreStoreDetails.phone'

c_result_multistoreStoreDetails_postalCode = 'c_result.multistoreStoreDetails.postalCode'

c_result_multistoreStoreDetails_stateCode = 'c_result.multistoreStoreDetails.stateCode'

c_result_multistoreStoreDetails_storeEvents = 'c_result.multistoreStoreDetails.storeEvents'

c_result_multistoreStoreDetails_storeHours = 'c_result.multistoreStoreDetails.storeHours'

c_result_multistoreStoreDetails_logo = 'c_result.multistoreStoreDetails.logo'

c_result_status = 'c_result.status'

c_result_order_total = 'c_result.order_total'

c_result_c_formatedserviceChargeTotalGrossPrice = 'c_result.c_formatedserviceChargeTotalGrossPrice'

c_result_c_shipmentNote = 'c_result.c_shipmentNote'

c_result_c_serviceCharge = 'c_result.c_serviceCharge'

c_result_c_formatedServiceCharge = 'c_result.c_formatedServiceCharge'

c_result_c_savingsTotal = 'c_result.c_savingsTotal'

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, _v)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, _v)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, _type)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, _type)
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, id)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, id)
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, name)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, name)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_order_no)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_order_no)
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_sfccCustomerNumber)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_sfccCustomerNumber)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_brmId)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_brmId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_corporate_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_corporate_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_corporate_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_corporate_name)

CustomKeywords.'totalplay.Common.getNumValueofObject'(getOrderByID, c_result_totalCost)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_product_total)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_product_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipment_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipment_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipment_total)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipment_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address__type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_address1)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_address1)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_city)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_city)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_country_code)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_country_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_full_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_full_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_last_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_last_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_phone)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_phone)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_postal_code)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_postal_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_second_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_second_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_c_alias)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_c_alias)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_c_delegation)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_c_delegation)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_c_isBilling)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_c_isBilling)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_c_isContact)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_c_isContact)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_c_isShipping)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_c_isShipping)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_c_latitude)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_c_latitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_c_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_c_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_c_nExt)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_c_nExt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_c_nInt)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_c_nInt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_c_neighborhood)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_c_neighborhood)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_c_references)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_c_references)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_c_rfc)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_c_rfc)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_c_state)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_c_state)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_c_streetName)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_c_streetName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_address_c_streetNumber)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_address_c_streetNumber)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(getOrderByID, c_result_shipments_0_shipping_address_c_etiqueta_home)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(getOrderByID, c_result_shipments_0_shipping_address_c_etiqueta_company)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(getOrderByID, c_result_shipments_0_shipping_address_c_etiqueta_other)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_method__type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_method__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_method_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_method_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_shipping_method_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_shipping_method_name)

CustomKeywords.'totalplay.Common.getNumValueofObject'(getOrderByID, c_result_shipments_0_shipping_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_service_cost)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_service_cost)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(getOrderByID, c_result_shipments_0_c_canCancel)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_shopId)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_shopId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_shopName)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_shopName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_shopContact)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_shopContact)

CustomKeywords.'totalplay.Common.getNumValueofObject'(getOrderByID, c_result_shipments_0_c_productItems_0_total_price_without_discount)

CustomKeywords.'totalplay.Common.getNumValueofObject'(getOrderByID, c_result_shipments_0_c_productItems_0_total_price_with_discount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_productItems_0_product_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_productItems_0_product_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_productItems_0_product_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_productItems_0_product_name)

CustomKeywords.'totalplay.Common.getNumValueofObject'(getOrderByID, c_result_shipments_0_c_productItems_0_quantity)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_productItems_0_product_image_0_alt)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_productItems_0_product_image_0_alt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_productItems_0_product_image_0_url)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_productItems_0_product_image_0_url)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_productItems_0_product_image_0_title)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_productItems_0_product_image_0_title)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(getOrderByID, c_result_shipments_0_c_productItems_0_is_cancelled)

CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(getOrderByID, c_result_shipments_0_c_productItems_0_promotions)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(getOrderByID, c_result_shipments_0_c_productItems_0_c_isOnDemandStoreItem)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_paymentInstruments_0_masked_number)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_paymentInstruments_0_masked_number)

CustomKeywords.'totalplay.Common.getNumValueofObject'(getOrderByID, c_result_shipments_0_c_paymentInstruments_0_amount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_paymentInstruments_0_payment_method_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_paymentInstruments_0_payment_method_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_paymentInstruments_0_card_holder)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_paymentInstruments_0_card_holder)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_currrentStatus)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_currrentStatus)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_estimatedDelivery)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_estimatedDelivery)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_information_stage1)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_information_stage1)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_information_stage2)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_information_stage2)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_information_stage3)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_information_stage3)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_information_stage4)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_information_stage4)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_information_stage5)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_information_stage5)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_information_stage6)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_information_stage6)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_packageDetails_packageName)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_packageDetails_packageName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_packageDetails_driverName)

CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(getOrderByID, c_result_shipments_0_c_shipmentStatus_packageDetails_driverNumber)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_trackingLedger_0_bookingId)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_trackingLedger_0_bookingId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_trackingLedger_0_originChannel)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_trackingLedger_0_originChannel)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_trackingLedger_0_requestedBy)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_trackingLedger_0_requestedBy)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_packageDetails_sellerNumber)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_shipmentStatus_packageDetails_sellerNumber)

CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(getOrderByID, c_result_shipments_0_trackingLedger_0_prevStatus)

CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(getOrderByID, c_result_shipments_0_trackingLedger_0_prevStatusTech)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_trackingLedger_0_newStatus)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_trackingLedger_0_newStatus)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_trackingLedger_0_newStatusTech)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_trackingLedger_0_newStatusTech)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_trackingLedger_0_updateDate)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_trackingLedger_0_updateDate)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_orderPlacedChannel)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_orderPlacedChannel)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_estimatedDeliveryTime)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_estimatedDeliveryTime)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_productCost)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_productCost)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_order_total)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_order_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_shipments_0_c_savingsTotal)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_shipments_0_c_savingsTotal)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_productCost)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_productCost)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_customerEmail)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_customerEmail)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_c_formatedShippingTotalGrossPrice)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_c_formatedShippingTotalGrossPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_multistoreStoreDetails_ID)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_multistoreStoreDetails_ID)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_multistoreStoreDetails_address1)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_multistoreStoreDetails_address1)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_multistoreStoreDetails_logo)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_multistoreStoreDetails_logo)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_status)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_status)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_order_total)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_order_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_c_formatedserviceChargeTotalGrossPrice)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_c_formatedserviceChargeTotalGrossPrice)

CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(getOrderByID, c_result_c_shipmentNote)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_c_serviceCharge)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_c_serviceCharge)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_c_formatedServiceCharge)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_c_formatedServiceCharge)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(getOrderByID, c_result_c_savingsTotal)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(getOrderByID, c_result_c_savingsTotal)


