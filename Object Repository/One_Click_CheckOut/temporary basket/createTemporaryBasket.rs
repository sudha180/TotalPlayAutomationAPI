<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>createTemporaryBasket</name>
   <tag></tag>
   <elementGuidId>3197ca27-17f9-42c5-9c4e-09fe67d7c0f6</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;// productId\u003dT10158397\u0026qty\u003d1\u0026sellerId\u003d2608 (bjcl-10)&quot;,
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
      <webElementGuid>1bba45c5-2aec-4af3-be6a-4b6e10a92d5b</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${GlobalVariable.Authorization}</value>
      <webElementGuid>682f9dbb-a146-43a3-8531-76f39f1bfca4</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.6.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${GlobalVariable.URL}/s/${GlobalVariable.SITEID}/dw/shop/v24_5/custom_objects/temporary_basket/createBasket?productId=${GlobalVariable.Product_ID}&amp;qty=1&amp;sellerId=${GlobalVariable.Seller_ID}</restUrl>
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
      <id>87553cae-2e1b-42c4-8df1-87a12733ec46</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.SITEID</defaultValue>
      <description></description>
      <id>9e2fb889-73b9-4852-bd56-e0024758b6ff</id>
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


WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)


WS.verifyElementPropertyValue(response, '_v', &quot;24.5&quot;)
WS.verifyElementPropertyValue(response, '_type', &quot;custom_object&quot;)
WS.verifyElementPropertyValue(response, 'key_property', &quot;ID&quot;)
WS.verifyElementPropertyValue(response, 'object_type', &quot;temporary_basket&quot;)
WS.verifyElementPropertyValue(response, 'c_result.basket_id', &quot;0f0339c1aab85ef163db3e43a4&quot;)
WS.verifyElementPropertyValue(response, 'c_result.crm_address_id', &quot;a4z3C0000009AgwQAE&quot;)
WS.verifyElementPropertyValue(response, 'c_result.productVerticalType', &quot;MultiStore&quot;)
WS.verifyElementPropertyValue(response, 'c_result.customer._type', &quot;customer_info&quot;)
WS.verifyElementPropertyValue(response, 'c_result.customer.customer_id', &quot;abQjLTqlSN7FRLHocyzQDPWuHU&quot;)
WS.verifyElementPropertyValue(response, 'c_result.customer.customer_no', &quot;00016003&quot;)
WS.verifyElementPropertyValue(response, 'c_result.customer.email', &quot;cesar.waldo93@gmail.com&quot;)
WS.verifyElementPropertyValue(response, 'c_result.order_total', 499)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0]._type', &quot;product_item&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].adjusted_tax', 0)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].base_price', 499)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].bonus_product_line_item', false)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].gift', false)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].inventory_id', &quot;inventory_m_shop_mirakl&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].item_id', &quot;bba3816b93b6eb7d9515fc9f61&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].item_text', &quot;Mochila Vinkel para Dama Negro&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].price', 499)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].price_after_item_discount', 499)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].price_after_order_discount', 499)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].product_id', &quot;T47167736&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].product_name', &quot;Mochila Vinkel para Dama Negro&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].quantity', 1)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].shipment_id', &quot;me&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].tax', 0)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].tax_basis', 499)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].tax_class_id', &quot;product_zero_tax&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].tax_rate', 0)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].c_fromStoreId', &quot;2029&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].c_individualDelivery', false)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].c_isOnDemandStoreItem', false)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].c_miraklChannels', &quot;[\&quot;INIT\&quot;]&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].c_miraklLeadTimeToShip', &quot;1&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].c_miraklOperatorProductId', &quot;T47167736&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].c_miraklShippingTaxes', &quot;[{\&quot;amount\&quot;:0,\&quot;type\&quot;:\&quot;product_zero_tax\&quot;,\&quot;isTaxRate\&quot;:true,\&quot;rate\&quot;:0}]&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].c_miraklTaxes', &quot;[{\&quot;amount\&quot;:0,\&quot;type\&quot;:\&quot;product_zero_tax\&quot;,\&quot;isTaxRate\&quot;:true,\&quot;rate\&quot;:0}]&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].c_offerId', &quot;149425&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].c_offerListPrice', 699.99)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].c_offerSalesPrice', 499)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].c_offerState', &quot;Nuevo&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].c_offerStateCode', &quot;11&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].c_productImage[0].alt', &quot;Mochila Vinkel para Dama Negro&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].c_productImage[0].url', &quot;https://salesforceqa.sistemastp.com.mx/dw/image/v2/BJCL_DEV/on/demandware.static/-/Sites-Standard/default/dw2e867c71/images/large/215e95bb3da94ee6bf5c2e457528bd3b.jpg?sw=144&amp;sh=144&quot;)

WS.verifyElementPropertyValue(response, 'c_result.product_items[0].c_productImage[0].title', &quot;Mochila Vinkel para Dama Negro&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].c_shopId', &quot;2029&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].c_shopName', &quot;Waldo´s&quot;)
WS.verifyElementPropertyValue(response, 'c_result.product_items[0].c_total_crossed_price', 699.99)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[0]._type', &quot;payment_method&quot;)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[0].cards[0]._type', &quot;payment_card_spec&quot;)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[0].cards[0].card_type', &quot;Visa&quot;)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[0].cards[0].checksum_verification_enabled', true)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[0].cards[0].name', &quot;Visa&quot;)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[0].cards[1]._type', &quot;payment_card_spec&quot;)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[0].cards[1].card_type', &quot;Amex&quot;)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[0].cards[1].checksum_verification_enabled', true)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[0].cards[1].name', &quot;American Express&quot;)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[0].cards[2]._type', &quot;payment_card_spec&quot;)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[0].cards[2].card_type', &quot;Mastercard&quot;)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[0].cards[2].checksum_verification_enabled', true)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[0].cards[2].name', &quot;Master Card&quot;)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[0].description', &quot;Credit Card&quot;)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[0].id', &quot;CREDIT_CARD&quot;)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[0].name', &quot;Credit Card&quot;)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[0].payment_processor_id', &quot;BAZ&quot;)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[0].c_isDefault', true)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[1]._type', &quot;payment_method&quot;)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[1].id', &quot;TP_CREDIT&quot;)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[1].name', &quot;TP CREDIT&quot;)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[1].payment_processor_id', &quot;TP_CREDIT&quot;)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[1].c_creditBalance', &quot;-2749.31&quot;)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[1].c_isDefault', false)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[1].c_insufficientBalance', true)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[1].c_inActive', false)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[1].c_QRCode', &quot;https://totalgo.totalplay.com.mx/section/cc_pay&quot;)
WS.verifyElementPropertyValue(response, 'c_result.applicable_payment_methods[1].c_Lineacredito', &quot;7718009774786247057&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0]._type', &quot;shipment&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].adjusted_merchandize_total_tax', 0)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].adjusted_shipping_total_tax', 0)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].gift', false)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].merchandize_total_tax', 0)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].product_sub_total', 499)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].product_total', 499)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipment_id', &quot;me&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipment_total', 499)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address._type', &quot;order_address&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.address1', &quot;Guanajuato&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.city', &quot;Ciudad de Mexico&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.country_code', &quot;MX&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.first_name', &quot;César Gerardo&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.full_name', &quot;César Gerardo González Waldo&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.id', &quot;98d8f34f775dbf5fa03822f1e5&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.last_name', &quot;Waldo&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.phone', &quot;5579660270&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.postal_code', &quot;01089&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.second_name', &quot;González&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.c_alias', &quot;CasaWaldo&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.c_delegation', &quot;Alvaro Obregon&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.c_latitude', &quot;19.3384161&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.c_longitude', &quot;-99.2019722&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.c_nExt', &quot;48&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.c_nInt', &quot;3&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.c_neighborhood', &quot;Ermita Tizapan&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.c_references', &quot;Dejar en la puerta color gris&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.c_rfc', &quot;XAXX010101000&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.c_state', &quot;CDMX&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.c_streetName', &quot;Guanajuato&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_address.c_streetNumber', &quot;3&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_status', &quot;not_shipped&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_total', 0)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].shipping_total_tax', 0)
WS.verifyElementPropertyValue(response, 'c_result.shipment[0].tax_total', 0)
WS.verifyElementPropertyValue(response, 'c_result.billing_address._type', &quot;order_address&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.address1', &quot;Guanajuato&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.city', &quot;Ciudad de Mexico&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.country_code', &quot;MX&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.first_name', &quot;César Gerardo&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.full_name', &quot;César Gerardo González Waldo&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.id', &quot;e54d577898de5a063dc14f07ea&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.last_name', &quot;Waldo&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.phone', &quot;5579660270&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.postal_code', &quot;01089&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.second_name', &quot;González&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.c_alias', &quot;CasaWaldo&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.c_delegation', &quot;Alvaro Obregon&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.c_latitude', &quot;19.3384161&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.c_longitude', &quot;-99.2019722&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.c_nExt', &quot;48&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.c_nInt', &quot;3&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.c_neighborhood', &quot;Ermita Tizapan&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.c_references', &quot;Dejar en la puerta color gris&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.c_rfc', &quot;XAXX010101000&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.c_state', &quot;CDMX&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.c_streetName', &quot;Guanajuato&quot;)
WS.verifyElementPropertyValue(response, 'c_result.billing_address.c_streetNumber', &quot;3&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
