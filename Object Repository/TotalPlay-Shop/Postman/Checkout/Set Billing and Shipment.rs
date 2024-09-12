<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Set Billing and Shipment</name>
   <tag></tag>
   <elementGuidId>a62c5bb7-59eb-4ded-9ceb-efc768473548</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJ2ZXIiOiIxLjAiLCJqa3UiOiJzbGFzL3Byb2QvYmpjbF9kZXYiLCJraWQiOiI0NGVmM2ZkMy0xZTQ3LTRkMmEtOGJiNC0xZjFiNDJlZjUxY2QiLCJ0eXAiOiJqd3QiLCJjbHYiOiJKMi4zLjQiLCJhbGciOiJFUzI1NiJ9.eyJhdXQiOiJHVUlEIiwic2NwIjoic2ZjYy5zaG9wcGVyLW15YWNjb3VudC5iYXNrZXRzIHNmY2Muc2hvcHBlci1kaXNjb3Zlcnktc2VhcmNoIHNmY2Muc2hvcHBlci1teWFjY291bnQuYWRkcmVzc2VzIHNmY2Muc2hvcHBlci1wcm9kdWN0cyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnJ3IHNmY2Muc2hvcHBlci1teWFjY291bnQucGF5bWVudGluc3RydW1lbnRzIHNmY2Muc2hvcHBlci1jdXN0b21lcnMubG9naW4gc2ZjYy5zaG9wcGVyLXN0b3JlcyBzZmNjLnNob3BwZXItbXlhY2NvdW50Lm9yZGVycyBzZmNjLnNob3BwZXItYmFza2V0cy1vcmRlcnMgc2ZjYy5zaG9wcGVyLWN1c3RvbWVycy5yZWdpc3RlciBzZmNjLnNob3BwZXItbXlhY2NvdW50LmFkZHJlc3Nlcy5ydyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnByb2R1Y3RsaXN0cy5ydyBzZmNjLnNob3BwZXItcHJvZHVjdGxpc3RzIHNmY2Muc2hvcHBlci1wcm9tb3Rpb25zIHNmY2Muc2hvcHBlci1iYXNrZXRzLW9yZGVycy5ydyBzZmNjLnNob3BwZXItZ2lmdC1jZXJ0aWZpY2F0ZXMgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5wYXltZW50aW5zdHJ1bWVudHMucncgc2ZjYy5zaG9wcGVyLXByb2R1Y3Qtc2VhcmNoIHNmY2Muc2hvcHBlci1teWFjY291bnQucHJvZHVjdGxpc3RzIHNmY2Muc2hvcHBlci1jYXRlZ29yaWVzIHNmY2Muc2hvcHBlci1teWFjY291bnQiLCJzdWIiOiJjYy1zbGFzOjpiamNsX2Rldjo6c2NpZDo1ZDI1ZjVmYS01YTRmLTQ2YjUtYTIxMS04NzU1NDJjODVhYzE6OnVzaWQ6YWQ4MWNhODUtZDgwMi00MzcxLWEyZjItZWVhZDA4OGY5OWZmIiwiY3R4Ijoic2xhcyIsImlzcyI6InNsYXMvcHJvZC9iamNsX2RldiIsImlzdCI6MSwiZG50IjoiMCIsImF1ZCI6ImNvbW1lcmNlY2xvdWQvcHJvZC9iamNsX2RldiIsIm5iZiI6MTcwODY2MDY1Mywic3R5IjoiVXNlciIsImlzYiI6InVpZG86ZWNvbTo6dXBuOmdvcGkudmVtdWxhQGtvZ25pdmVyYS5jb206OnVpZG46R29waWtyaXNobmEgNDQ3NDYgMjYvMDUvMjAyMzo6Z2NpZDphYnd1bzJrdWxGbWJzUnhiRVVrR1lZa1hBVjo6cmNpZDphYmNqSGRld2VYcmZ2SnZtSDFGUVBBTml6dDo6Y2hpZDpUUC1TSE9QIiwiZXhwIjoxNzA4NjYyNDgzLCJpYXQiOjE3MDg2NjA2ODMsImp0aSI6IkMyQy0xMzExNTYzNTcwMTc4NzUxMTg1MDYzMjI1NTk4NTQ5Nzk4OCJ9.oIrubA4woNan8VCyXLEXVd9PgBwXMuV-0Z41klQemrh-2THKAq5w323GhWepbO4UQDki3DX6FpeUVWF2186Dwg</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;c_crm_address_id\&quot;: \&quot;${GlobalVariable.crm_address}\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>870c56c5-8a96-4de3-abb4-b82158c5e9b4</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${GlobalVariable.Authorization}</value>
      <webElementGuid>edc68829-413e-48e4-bb15-254953f1e7a4</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.3.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>${GlobalVariable.URL}/s/${GlobalVariable.SITEID}/dw/shop/v24_5/baskets/${GlobalVariable.basketID}/billing_address?use_as_shipping=true</restUrl>
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
      <id>1d2bd24d-9d06-4072-88b6-1100943d5e27</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.SITEID</defaultValue>
      <description></description>
      <id>8c912b21-2c67-4bc6-aa1a-68d4e52e59c5</id>
      <masked>false</masked>
      <name>SITEID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.basketID</defaultValue>
      <description></description>
      <id>ea0811d1-f185-4f48-95d8-d90402d932c3</id>
      <masked>false</masked>
      <name>basketID</name>
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
WS.verifyElementPropertyValue(response, '_type', &quot;basket&quot;)
WS.verifyElementPropertyValue(response, 'agent_basket', false)
WS.verifyElementPropertyValue(response, 'basket_id', &quot;64602a83fc843eb634b5b4ee1c&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.address1', &quot;Av. San Jeronimo&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.city', &quot;Alvaro Obregón&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.company_name', &quot;TotalPlay SA&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.country_code', &quot;MX&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.first_name', &quot;Gopikrishna&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.full_name', &quot;Gopikrishna 26/05/2023 44746&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.id', &quot;e37f82c90eb8241fdb1742ba09&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.last_name', &quot;44746&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.phone', &quot;5638003099&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.postal_code', &quot;01090&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.second_name', &quot;26/05/2023&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_alias', &quot;Totalplay&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_label', &quot;{\&quot;home\&quot;:false,\&quot;company\&quot;:false,\&quot;other\&quot;:true}&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_latitude', &quot;0&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_longitude', &quot;0&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_nExt', &quot;252&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_neighborhood', &quot;null&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_references', &quot;null&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_rfc', &quot;OOMA950314CC1&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_state', &quot;DF&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_streetName', &quot;Av. San Jeronimo&quot;)
WS.verifyElementPropertyValue(response, 'channel_type', &quot;storefront&quot;)
WS.verifyElementPropertyValue(response, 'creation_date', &quot;2024-02-23T03:50:28.551Z&quot;)
WS.verifyElementPropertyValue(response, 'currency', &quot;MXN&quot;)
WS.verifyElementPropertyValue(response, 'customer_info.customer_id', &quot;abcjHdeweXrfvJvmH1FQPANizt&quot;)
WS.verifyElementPropertyValue(response, 'customer_info.customer_no', &quot;11001004&quot;)
WS.verifyElementPropertyValue(response, 'customer_info.email', &quot;rangaswamygu@gmail.com&quot;)
WS.verifyElementPropertyValue(response, 'last_modified', &quot;2024-02-23T04:01:54.988Z&quot;)
WS.verifyElementPropertyValue(response, 'notes.link', &quot;https://salesforceqa.sistemastp.com.mx/s/TP-SHOP/dw/shop/v23_1/baskets/64602a83fc843eb634b5b4ee1c/notes?use_as_shipping=true&quot;)
WS.verifyElementPropertyValue(response, 'order_total', 3774.0)
WS.verifyElementPropertyValue(response, 'payment_instruments[0].amount', 3774.00)
WS.verifyElementPropertyValue(response, 'payment_instruments[0].payment_instrument_id', &quot;4309e68b3ae9d9224e25f273ea&quot;)
WS.verifyElementPropertyValue(response, 'payment_instruments[0].payment_method_id', &quot;TP_CREDIT&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].base_price', 3700.00)
WS.verifyElementPropertyValue(response, 'product_items[0].bonus_product_line_item', false)
WS.verifyElementPropertyValue(response, 'product_items[0].gift', false)
WS.verifyElementPropertyValue(response, 'product_items[0].inventory_id', &quot;inventory_m_shop_mirakl&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].item_id', &quot;5b1dae12539d5e0de0623e4acb&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].item_text', &quot;Calentador Rápida Recuperación Primo 7 L Gas LP&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].price', 3700.00)
WS.verifyElementPropertyValue(response, 'product_items[0].price_after_item_discount', 3700.00)
WS.verifyElementPropertyValue(response, 'product_items[0].price_after_order_discount', 3700.00)
WS.verifyElementPropertyValue(response, 'product_items[0].product_id', &quot;T779023983&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].product_name', &quot;Calentador Rápida Recuperación Primo 7 L Gas LP&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].quantity', 1)
WS.verifyElementPropertyValue(response, 'product_items[0].shipment_id', &quot;me&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].tax_basis', 3700.00)
WS.verifyElementPropertyValue(response, 'product_items[0].tax', 0.00)
WS.verifyElementPropertyValue(response, 'product_items[0].c_fromStoreId', &quot;2015&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_isOnDemandStoreItem', false)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklEarliestDeliveryDays', 1.0)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklLatestDeliveryDays', 2.0)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklLeadTimeToShip', &quot;2&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklLineShippingPrice', &quot;0&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklOperatorProductId', &quot;T779023983&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklShippingTaxes', &quot;[{\&quot;amount\&quot;:0,\&quot;type\&quot;:\&quot;product_zero_tax\&quot;,\&quot;isTaxRate\&quot;:true,\&quot;rate\&quot;:0}]&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_offerId', &quot;523511&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_offerListPrice', 3700.0)
WS.verifyElementPropertyValue(response, 'product_items[0].c_offerSalesPrice', 3700.0)
WS.verifyElementPropertyValue(response, 'product_items[0].c_offerState', &quot;Nuevo&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_offerStateCode', &quot;11&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_productImage[0].alt', &quot;Calentador Rápida Recuperación Primo 7 L Gas LP&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_productImage[0].url', &quot;https://salesforceqa.sistemastp.com.mx/dw/image/v2/BJCL_DEV/on/demandware.static/-/Sites-Standard/default/dwfe846736/images/large/f150ae000d684f19a2e15d2661e88a1a.jpg?sw=144&amp;sh=144&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_productImage[0].title', &quot;Calentador Rápida Recuperación Primo 7 L Gas LP&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_shopId', &quot;2015&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_shopName', &quot;3B Ecatepec&quot;)
WS.verifyElementPropertyValue(response, 'product_sub_total', 3700.00)
WS.verifyElementPropertyValue(response, 'product_total', 3700.00)
WS.verifyElementPropertyValue(response, 'shipments[0].shipment_id', &quot;me&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipment_total', 3700.00)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.address1', &quot;Av. San Jeronimo&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.city', &quot;Alvaro Obregón&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.company_name', &quot;TotalPlay SA&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.country_code', &quot;MX&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.first_name', &quot;Gopikrishna&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.full_name', &quot;Gopikrishna 26/05/2023 44746&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.id', &quot;abc3dbac148eeeccc1ef631bfb&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.last_name', &quot;44746&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.phone', &quot;5638003099&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.postal_code', &quot;01090&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.second_name', &quot;26/05/2023&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_alias', &quot;Totalplay&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_label', &quot;{\&quot;home\&quot;:false,\&quot;company\&quot;:false,\&quot;other\&quot;:true}&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_latitude', &quot;0&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_longitude', &quot;0&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_nExt', &quot;252&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_rfc', &quot;OOMA950314CC1&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_state', &quot;DF&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_streetName', &quot;Av. San Jeronimo&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_method.description', &quot;Entregado en 3-5 dias&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_method.id', &quot;own&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_method.name', &quot;Own&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_method.c_estimatedArrivalTime', &quot;5-11 dias&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_method.c_storePickupEnabled', false)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_status', &quot;not_shipped&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_total', 0.00)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_total_tax', 0.00)
WS.verifyElementPropertyValue(response, 'shipments[0].c_packageSize', &quot;{\&quot;deliveryType\&quot;:\&quot;Own\&quot;,\&quot;products\&quot;:\&quot;T779023983,\&quot;,\&quot;weight\&quot;:30,\&quot;depth\&quot;:46,\&quot;height\&quot;:94,\&quot;width\&quot;:39}&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].c_serviceCharge', 74.0)
WS.verifyElementPropertyValue(response, 'shipments[0].c_shippingRates', &quot;0&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].c_totalShippingCost', 0.0)
WS.verifyElementPropertyValue(response, 'shipping_items[0].item_id', &quot;8eb57c0cce66ecf3d96c60d4a7&quot;)
WS.verifyElementPropertyValue(response, 'shipping_items[0].item_text', &quot;Shipping&quot;)
WS.verifyElementPropertyValue(response, 'shipping_items[0].tax_class_id', &quot;TAXDEFAULT&quot;)
WS.verifyElementPropertyValue(response, 'c_corporateImgUrl', &quot;https://salesforceqa.sistemastp.com.mx/on/demandware.static/-/Sites/default/dw0eab4717/images/seller/20157859.952931625425&quot;)
WS.verifyElementPropertyValue(response, 'c_currentCorporate', &quot;3B_Ecatepec&quot;)
WS.verifyElementPropertyValue(response, 'c_currentMultiStoreID', &quot;2015&quot;)
WS.verifyElementPropertyValue(response, 'c_isLock', true)
WS.verifyElementPropertyValue(response, 'c_isMiraklOrder', true)
WS.verifyElementPropertyValue(response, 'c_lockTime', &quot;2024-02-23T04:02:54.920Z&quot;)
WS.verifyElementPropertyValue(response, 'c_miraklShippingZoneCode', &quot;MX&quot;)
WS.verifyElementPropertyValue(response, 'c_multiStoreEDD', &quot;5 - 11 días&quot;)
WS.verifyElementPropertyValue(response, 'c_preferedShipment', &quot;{\&quot;deliveryPartnerZipCode\&quot;:\&quot;OWN_01090\&quot;,\&quot;shippingMethod\&quot;:\&quot;OWN\&quot;,\&quot;forced\&quot;:false,\&quot;state\&quot;:null}&quot;)
WS.verifyElementPropertyValue(response, 'c_seller_id', &quot;2015&quot;)
WS.verifyElementPropertyValue(response, 'c_serviceChargeTotalGrossPrice', 74.0)
WS.verifyElementPropertyValue(response, 'c_storeDeliveryType', &quot;Own&quot;)
WS.verifyElementPropertyValue(response, 'c_TypeOfShipment', &quot;MultiStore&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
