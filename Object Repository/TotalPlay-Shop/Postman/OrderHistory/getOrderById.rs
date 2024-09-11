<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>getOrderById</name>
   <tag></tag>
   <elementGuidId>d2c3e13b-cb91-4359-a3e6-9b1d68e98535</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>b925045a-a008-40f2-9980-e9290e1a2750</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${GlobalVariable.Authorization}</value>
      <webElementGuid>20007557-d245-4097-be2e-f614110a58f1</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.3.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${URL}/s/${GlobalVariable.SITEID}/dw/shop/v24_5/content/order?isTracking=true&amp;orderId=00021405</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.URL</defaultValue>
      <description></description>
      <id>fa3e6d38-c41d-4ef5-bcc2-f0fb518c3555</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.SITEID</defaultValue>
      <description></description>
      <id>60ae8043-8595-4e84-b213-c2fcc997a56f</id>
      <masked>false</masked>
      <name>SITEID</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

WS.verifyElementPropertyValue(response, '_v', &quot;23.1&quot;)
WS.verifyElementPropertyValue(response, '_type', &quot;content&quot;)
WS.verifyElementPropertyValue(response, 'id', &quot;order&quot;)
WS.verifyElementPropertyValue(response, 'name', &quot;order&quot;)
WS.verifyElementPropertyValue(response, 'c_result.order_no', &quot;00021405&quot;)
WS.verifyElementPropertyValue(response, 'c_result.sfccCustomerNumber', &quot;00016003&quot;)
WS.verifyElementPropertyValue(response, 'c_result.brmId', &quot;0190063890&quot;)
WS.verifyElementPropertyValue(response, 'c_result.corporate_name', &quot;Odara&quot;)
WS.verifyElementPropertyValue(response, 'c_result.creationDate', &quot;2024-09-06T01:01:30&quot;)
WS.verifyElementPropertyValue(response, 'c_result.totalCost', 241.74)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].product_total', &quot;237.00&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipment_id', &quot;00021405-A&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipment_total', &quot;0.00&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address._type', &quot;order_address&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.address1', &quot;Guanajuato&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.city', &quot;Ciudad de Mexico&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.country_code', &quot;MX&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.first_name', &quot;César Gerardo&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.full_name', &quot;César Gerardo González Waldo&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.id', &quot;df3247a375e36c72f05df221b7&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.last_name', &quot;Waldo&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.phone', &quot;5579660270&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.postal_code', &quot;01089&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.second_name', &quot;González&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.c_alias', &quot;CasaWaldo&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.c_delegation', &quot;Alvaro Obregon&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.c_isBilling', &quot;false&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.c_isContact', &quot;false&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.c_isShipping', &quot;false&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.c_latitude', &quot;19.3384161&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.c_longitude', &quot;-99.2019722&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.c_nExt', &quot;48&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.c_nInt', &quot;3&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.c_neighborhood', &quot;Ermita Tizapan&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.c_references', &quot;Dejar en la puerta color gris&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.c_rfc', &quot;XAXX010101000&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.c_state', &quot;CDMX&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.c_streetName', &quot;Guanajuato&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.c_streetNumber', &quot;3&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.c_etiqueta.home', true)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.c_etiqueta.company', false)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_address.c_etiqueta.other', false)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_method._type', &quot;shipping_method&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_method.id', &quot;2020&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_method.name', &quot;ODARA-PROFESSIONAL&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].shipping_total', 0)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].service_cost', &quot;4.74&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_canCancel', true)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_shopId', &quot;2020&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_shopName', &quot;ODARA-PROFESSIONAL&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_shopContact', &quot;5621441345&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_productItems[0].total_price_without_discount', 237)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_productItems[0].total_price_with_discount', 237)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_productItems[0].product_id', &quot;T1375191854&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_productItems[0].product_name', &quot;Polvo Decolorante 8 Niveles L'Oreal Multi-Technique Blond Studio 50 g&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_productItems[0].quantity', 1)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_productItems[0].product_image[0].alt', &quot;Polvo Decolorante 8 Niveles L'Oreal Multi-Techn...&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_productItems[0].product_image[0].url', &quot;https://salesforceqa.sistemastp.com.mx/dw/image/v2/BJCL_DEV/on/demandware.static/-/Sites-Standard/default/dwefff4876/images/large/c0c08f9e7c9d428e91879ee503793923.jpg?sw=192&amp;sh=192&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_productItems[0].product_image[0].title', &quot;Polvo Decolorante 8 Niveles L'Oreal Multi-Techn...&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_productItems[0].is_cancelled', false)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_productItems[0].promotions', &quot;&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_productItems[0].c_isOnDemandStoreItem', false)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_paymentInstruments[0].masked_number', &quot;4547&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_paymentInstruments[0].amount', 241.74)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_paymentInstruments[0].payment_method_id', &quot;CREDIT_CARD&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_paymentInstruments[0].card_holder', &quot;Test Dev&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_shipmentStatus.currrentStatus', &quot;Revisando tu pedido&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_shipmentStatus.estimatedDelivery', &quot;Llega entre el 08 de septiembre - 11 de septiembre&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_shipmentStatus.information.stage1', &quot;Revisando tu pedido&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_shipmentStatus.information.stage2', &quot;En preparación&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_shipmentStatus.information.stage3', &quot;En camino&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_shipmentStatus.information.stage4', &quot;Entregado&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_shipmentStatus.information.stage5', &quot;Cancelado&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_shipmentStatus.information.stage6', &quot;Devueltos&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_shipmentStatus.packageDetails.packageName', &quot;ODARA-PROFESSIONAL&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_shipmentStatus.packageDetails.driverName', &quot; &quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_shipmentStatus.packageDetails.driverNumber', &quot;&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_shipmentStatus.packageDetails.sellerNumber', &quot;5621441345&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].trackingLedger[0].bookingId', &quot;00021405-A&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].trackingLedger[0].originChannel', &quot;TIENDA&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].trackingLedger[0].requestedBy', &quot;CUSTOMER&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].trackingLedger[0].prevStatus', &quot;&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].trackingLedger[0].prevStatusTech', &quot;&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].trackingLedger[0].newStatus', &quot;Revisando tu pedido&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].trackingLedger[0].newStatusTech', &quot;WAITING_ACCEPTANCE&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].trackingLedger[0].updateDate', &quot;2024-09-06T01:01:35&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].orderPlacedChannel', &quot;Delivery&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].proveedor', &quot;&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].estimatedDeliveryTime', &quot;90&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].productCost', &quot;0.00&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].order_total', &quot;241.74&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipments[0].c_savingsTotal', &quot;0.00&quot;)
WS.verifyElementPropertyValue(response, 'c_result.productCost', &quot;237.00&quot;)
WS.verifyElementPropertyValue(response, 'c_result.customerEmail', &quot;cesar.waldo93@gmail.com&quot;)
WS.verifyElementPropertyValue(response, 'c_result.c_formatedShippingTotalGrossPrice', &quot;0.0&quot;)
WS.verifyElementPropertyValue(response, 'c_result.comment', null)

WS.verifyElementPropertyValue(response, 'c_result.multistoreStoreDetails.ID', &quot;2020&quot;)
WS.verifyElementPropertyValue(response, 'c_result.multistoreStoreDetails.address1', &quot;Cerrada Prolongación Navajos #171 MZ 5 LT 23, Tlalcoligia, C.P. 14430, Tlalpan, CDMX&quot;)
WS.verifyElementPropertyValue(response, 'c_result.multistoreStoreDetails.address2', &quot;&quot;)
WS.verifyElementPropertyValue(response, 'c_result.multistoreStoreDetails.city', &quot;Ciudad de México&quot;)
WS.verifyElementPropertyValue(response, 'c_result.multistoreStoreDetails.countryCode', &quot;Mexico&quot;)
WS.verifyElementPropertyValue(response, 'c_result.multistoreStoreDetails.email', &quot;aloaeza@odara.mx&quot;)
WS.verifyElementPropertyValue(response, 'c_result.multistoreStoreDetails.fax', &quot;&quot;)
WS.verifyElementPropertyValue(response, 'c_result.multistoreStoreDetails.latitude', 19.273752)
WS.verifyElementPropertyValue(response, 'c_result.multistoreStoreDetails.longitude', -)
WS.verifyElementPropertyValue(response, 'c_result.multistoreStoreDetails.name', &quot;ODARA-PROFESSIONAL&quot;)
WS.verifyElementPropertyValue(response, 'c_result.multistoreStoreDetails.phone', &quot;5621441345&quot;)
WS.verifyElementPropertyValue(response, 'c_result.multistoreStoreDetails.postalCode', &quot;14430&quot;)
WS.verifyElementPropertyValue(response, 'c_result.multistoreStoreDetails.stateCode', &quot;\n    &quot;)
WS.verifyElementPropertyValue(response, 'c_result.multistoreStoreDetails.storeEvents', null)
WS.verifyElementPropertyValue(response, 'c_result.multistoreStoreDetails.storeHours', null)
WS.verifyElementPropertyValue(response, 'c_result.multistoreStoreDetails.logo', &quot;https://salesforceqa.sistemastp.com.mx/on/demandware.static/-/Sites/default/dw6dff0dac/images/seller/202081072.8228689662&quot;)
WS.verifyElementPropertyValue(response, 'c_result.status', &quot;en proceso&quot;)
WS.verifyElementPropertyValue(response, 'c_result.order_total', &quot;241.74&quot;)
WS.verifyElementPropertyValue(response, 'c_result.c_formatedserviceChargeTotalGrossPrice', &quot;4.74&quot;)
WS.verifyElementPropertyValue(response, 'c_result.c_shipmentNote', &quot;&quot;)
WS.verifyElementPropertyValue(response, 'c_result.c_serviceCharge', &quot;4.74&quot;)
WS.verifyElementPropertyValue(response, 'c_result.c_formatedServiceCharge', &quot;4.74&quot;)
WS.verifyElementPropertyValue(response, 'c_result.c_savingsTotal', &quot;0.00&quot;)


WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
