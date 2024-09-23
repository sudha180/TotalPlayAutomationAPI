<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>submit payment temporary basket credit card</name>
   <tag></tag>
   <elementGuidId>8264d038-d3db-4f53-84f1-9da786502cae</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;amount\&quot; : ${GlobalVariable.temporary_basket_order_total},\n  \&quot;payment_card\&quot; : {\&quot;card_type\&quot;:\&quot;Visa\&quot;},\n  \&quot;payment_method_id\&quot; : \&quot;CREDIT_CARD\&quot;,\n  \&quot;c_IDCard\&quot;: \&quot;39710\&quot;\n}&quot;,
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
      <webElementGuid>d31dcf48-feec-4c2b-8266-b3eee36963c1</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${GlobalVariable.Authorization}</value>
      <webElementGuid>b19c285c-0816-4073-a24e-c4ef5cece883</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.6.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${GlobalVariable.URL}/s/${GlobalVariable.SITEID}/dw/shop/v24_5/baskets/${GlobalVariable.temporary_basket_id}/payment_instruments</restUrl>
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
      <id>0e23b11c-fff4-4ea9-af64-e7db1ccf1f0b</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.SITEID</defaultValue>
      <description></description>
      <id>9090752b-b809-443b-87e7-dbe3a96073fe</id>
      <masked>false</masked>
      <name>SITEID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.temporary_basket_id</defaultValue>
      <description></description>
      <id>f33f6630-5f3a-4527-b7c8-be7b6b7ad86e</id>
      <masked>false</masked>
      <name>temporary_basket_id</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.temporary_basket_order_total</defaultValue>
      <description></description>
      <id>1b0660fe-6e9d-4202-ae67-144265c78c30</id>
      <masked>false</masked>
      <name>temporary_basket_order_total</name>
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
WS.verifyElementPropertyValue(response, '_v', &quot;24.5&quot;)
WS.verifyElementPropertyValue(response, '_type', &quot;basket&quot;)
WS.verifyElementPropertyValue(response, '_resource_state', &quot;5bb80b030e49d696de6bfe5f8a74d8e0bd53184835bc93e2407ccaba34ea61e6&quot;)
WS.verifyElementPropertyValue(response, 'adjusted_merchandize_total_tax', 0.00)
WS.verifyElementPropertyValue(response, 'adjusted_shipping_total_tax', 0.00)
WS.verifyElementPropertyValue(response, 'agent_basket', false)
WS.verifyElementPropertyValue(response, 'basket_id', &quot;b332f5c29f1ff940e1da3ffb45&quot;)
WS.verifyElementPropertyValue(response, 'billing_address._type', &quot;order_address&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.address1', &quot;Guanajuato&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.city', &quot;Ciudad de Mexico&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.country_code', &quot;MX&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.first_name', &quot;César Gerardo&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.full_name', &quot;César Gerardo González Waldo&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.id', &quot;2b14cad42a34399888a64ae2ed&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.last_name', &quot;Waldo&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.phone', &quot;5579660270&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.postal_code', &quot;01089&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.second_name', &quot;González&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_alias', &quot;CasaWaldo&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_delegation', &quot;Alvaro Obregon&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_label', &quot;{\&quot;home\&quot;:true,\&quot;company\&quot;:false,\&quot;other\&quot;:false}&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_latitude', &quot;19.3384161&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_longitude', &quot;-99.2019722&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_nExt', &quot;48&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_nInt', &quot;3&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_neighborhood', &quot;Ermita Tizapan&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_references', &quot;Dejar en la puerta color gris&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_rfc', &quot;XAXX010101000&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_state', &quot;CDMX&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_streetName', &quot;Guanajuato&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_streetNumber', &quot;3&quot;)
WS.verifyElementPropertyValue(response, 'channel_type', &quot;storefront&quot;)
WS.verifyElementPropertyValue(response, 'creation_date', &quot;2024-09-17T10:54:09.365Z&quot;)
WS.verifyElementPropertyValue(response, 'currency', &quot;MXN&quot;)
WS.verifyElementPropertyValue(response, 'customer_info._type', &quot;customer_info&quot;)
WS.verifyElementPropertyValue(response, 'customer_info.customer_id', &quot;abQjLTqlSN7FRLHocyzQDPWuHU&quot;)
WS.verifyElementPropertyValue(response, 'customer_info.customer_no', &quot;00016003&quot;)
WS.verifyElementPropertyValue(response, 'customer_info.email', &quot;cesar.waldo93@gmail.com&quot;)
WS.verifyElementPropertyValue(response, 'last_modified', &quot;2024-09-17T10:54:52.147Z&quot;)
WS.verifyElementPropertyValue(response, 'merchandize_total_tax', 0.00)
WS.verifyElementPropertyValue(response, 'order_total', 508.98)
WS.verifyElementPropertyValue(response, 'payment_instruments[0]._type', &quot;order_payment_instrument&quot;)
WS.verifyElementPropertyValue(response, 'payment_instruments[0].amount', 508.98)
WS.verifyElementPropertyValue(response, 'payment_instruments[0].payment_card._type', &quot;payment_card&quot;)
WS.verifyElementPropertyValue(response, 'payment_instruments[0].payment_card.card_type', &quot;Visa&quot;)
WS.verifyElementPropertyValue(response, 'payment_instruments[0].payment_card.credit_card_expired', false)
WS.verifyElementPropertyValue(response, 'payment_instruments[0].payment_instrument_id', &quot;35e88a69779642ce3e0c367e81&quot;)
WS.verifyElementPropertyValue(response, 'payment_instruments[0].payment_method_id', &quot;CREDIT_CARD&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0]._type', &quot;product_item&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].adjusted_tax', 0.00)
WS.verifyElementPropertyValue(response, 'product_items[0].base_price', 499.00)
WS.verifyElementPropertyValue(response, 'product_items[0].bonus_product_line_item', false)
WS.verifyElementPropertyValue(response, 'product_items[0].gift', false)
WS.verifyElementPropertyValue(response, 'product_items[0].inventory_id', &quot;inventory_m_shop_mirakl&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].item_id', &quot;cdc00f38ee6338aab5d4041588&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].item_text', &quot;Mochila Vinkel para Dama Negro&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].price', 499.00)
WS.verifyElementPropertyValue(response, 'product_items[0].price_after_item_discount', 499.00)
WS.verifyElementPropertyValue(response, 'product_items[0].price_after_order_discount', 499.00)
WS.verifyElementPropertyValue(response, 'product_items[0].product_id', &quot;T47167736&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].product_name', &quot;Mochila Vinkel para Dama Negro&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].quantity', 1)
WS.verifyElementPropertyValue(response, 'product_items[0].shipment_id', &quot;me&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].tax', 0.00)
WS.verifyElementPropertyValue(response, 'product_items[0].tax_basis', 499.00)
WS.verifyElementPropertyValue(response, 'product_items[0].tax_class_id', &quot;product_zero_tax&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].tax_rate', 0.0)
WS.verifyElementPropertyValue(response, 'product_items[0].c_fromStoreId', &quot;2029&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_individualDelivery', false)
WS.verifyElementPropertyValue(response, 'product_items[0].c_isOnDemandStoreItem', false)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklChannels', &quot;[\&quot;INIT\&quot;]&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklEarliestDeliveryDays', 1.0)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklLatestDeliveryDays', 2.0)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklLeadTimeToShip', &quot;1&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklLineShippingPrice', &quot;10&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklOperatorProductId', &quot;T47167736&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklShippingTaxes', &quot;[{\&quot;amount\&quot;:0,\&quot;type\&quot;:\&quot;product_zero_tax\&quot;,\&quot;isTaxRate\&quot;:true,\&quot;rate\&quot;:0}]&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklTaxes', &quot;[{\&quot;amount\&quot;:0,\&quot;type\&quot;:\&quot;product_zero_tax\&quot;,\&quot;isTaxRate\&quot;:true,\&quot;rate\&quot;:0}]&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_offerId', &quot;149425&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_offerListPrice', 699.99)
WS.verifyElementPropertyValue(response, 'product_items[0].c_offerSalesPrice', 499.0)
WS.verifyElementPropertyValue(response, 'product_items[0].c_offerState', &quot;Nuevo&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_offerStateCode', &quot;11&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_shopId', &quot;2029&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_shopName', &quot;Waldo´s&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_total_crossed_price', 699.99)
WS.verifyElementPropertyValue(response, 'product_sub_total', 499.00)
WS.verifyElementPropertyValue(response, 'product_total', 499.00)
WS.verifyElementPropertyValue(response, 'shipments[0]._type', &quot;shipment&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].adjusted_merchandize_total_tax', 0.00)
WS.verifyElementPropertyValue(response, 'shipments[0].adjusted_shipping_total_tax', 0.00)
WS.verifyElementPropertyValue(response, 'shipments[0].gift', false)
WS.verifyElementPropertyValue(response, 'shipments[0].merchandize_total_tax', 0.00)
WS.verifyElementPropertyValue(response, 'shipments[0].product_sub_total', 499.00)
WS.verifyElementPropertyValue(response, 'shipments[0].product_total', 499.00)
WS.verifyElementPropertyValue(response, 'shipments[0].shipment_id', &quot;me&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipment_total', 508.98)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address._type', &quot;order_address&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.address1', &quot;Guanajuato&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.city', &quot;Ciudad de Mexico&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.country_code', &quot;MX&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.first_name', &quot;César Gerardo&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.full_name', &quot;César Gerardo González Waldo&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.id', &quot;d112f46e8f03c111b80ea90ff0&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.last_name', &quot;Waldo&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.phone', &quot;5579660270&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.postal_code', &quot;01089&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.second_name', &quot;González&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_alias', &quot;CasaWaldo&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_delegation', &quot;Alvaro Obregon&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_isBilling', &quot;false&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_isContact', &quot;false&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_isShipping', &quot;false&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_latitude', &quot;19.3384161&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_longitude', &quot;-99.2019722&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_nExt', &quot;48&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_nInt', &quot;3&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_neighborhood', &quot;Ermita Tizapan&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_references', &quot;Dejar en la puerta color gris&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_rfc', &quot;XAXX010101000&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_state', &quot;CDMX&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_streetName', &quot;Guanajuato&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_streetNumber', &quot;3&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_method._type', &quot;shipping_method&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_method.id', &quot;digitallyShipped&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_method.name', &quot;Digital Delivery&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_method.price', 0.00)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_method.c_storePickupEnabled', false)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_status', &quot;not_shipped&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_total', 0.00)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_total_tax', 0.00)
WS.verifyElementPropertyValue(response, 'shipments[0].tax_total', 0.00)
WS.verifyElementPropertyValue(response, 'shipments[0].c_isDigital', true)
WS.verifyElementPropertyValue(response, 'shipments[0].c_serviceCharge', 9.98)
WS.verifyElementPropertyValue(response, 'shipments[0].c_totalShippingCost', 0.0)
WS.verifyElementPropertyValue(response, 'shipping_items[0]._type', &quot;shipping_item&quot;)
WS.verifyElementPropertyValue(response, 'shipping_items[0].adjusted_tax', 0.00)
WS.verifyElementPropertyValue(response, 'shipping_items[0].base_price', 0.00)
WS.verifyElementPropertyValue(response, 'shipping_items[0].item_id', &quot;747c1ee9724dfd90fc5d459c39&quot;)
WS.verifyElementPropertyValue(response, 'shipping_items[0].item_text', &quot;Shipping&quot;)
WS.verifyElementPropertyValue(response, 'shipping_items[0].price', 0.00)
WS.verifyElementPropertyValue(response, 'shipping_items[0].price_after_item_discount', 0.00)
WS.verifyElementPropertyValue(response, 'shipping_items[0].shipment_id', &quot;me&quot;)
WS.verifyElementPropertyValue(response, 'shipping_items[0].tax', 0.00)
WS.verifyElementPropertyValue(response, 'shipping_items[0].tax_basis', 0.00)
WS.verifyElementPropertyValue(response, 'shipping_items[0].tax_class_id', &quot;product_zero_tax&quot;)
WS.verifyElementPropertyValue(response, 'shipping_items[0].tax_rate', 0.0)
WS.verifyElementPropertyValue(response, 'shipping_total', 0.00)
WS.verifyElementPropertyValue(response, 'shipping_total_tax', 0.00)
WS.verifyElementPropertyValue(response, 'taxation', &quot;net&quot;)
WS.verifyElementPropertyValue(response, 'tax_rounded_at_group', false)
WS.verifyElementPropertyValue(response, 'tax_total', 0.00)
WS.verifyElementPropertyValue(response, 'temporary_basket', true)
WS.verifyElementPropertyValue(response, 'c_currentCorporate', &quot;0190063890Waldos&quot;)
WS.verifyElementPropertyValue(response, 'c_currentMultiStoreID', &quot;2029&quot;)
WS.verifyElementPropertyValue(response, 'c_isLock', true)
WS.verifyElementPropertyValue(response, 'c_isMiraklOrder', true)
WS.verifyElementPropertyValue(response, 'c_lockTime', &quot;2024-09-17T10:55:52.133Z&quot;)
WS.verifyElementPropertyValue(response, 'c_seller_id', &quot;2029&quot;)
WS.verifyElementPropertyValue(response, 'c_serviceChargeTotalGrossPrice', 9.98)
WS.verifyElementPropertyValue(response, 'c_incomplete', false)
WS.verifyElementPropertyValue(response, 'c_formatedOrderTotal', &quot;508.98&quot;)
WS.verifyElementPropertyValue(response, 'c_formatedProductTotal', &quot;499.00&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
