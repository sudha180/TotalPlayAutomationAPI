<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Food_Add to cart</name>
   <tag></tag>
   <elementGuidId>7b8fa150-daa0-4d79-be95-5d5826d56caf</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJ2ZXIiOiIxLjAiLCJqa3UiOiJzbGFzL3Byb2QvYmpjbF9kZXYiLCJraWQiOiJmMDQ0YjJjMi1iNWYwLTQwNWMtOGU2OS02ZGFiZDY3Mjg5NzEiLCJ0eXAiOiJqd3QiLCJjbHYiOiJKMi4zLjQiLCJhbGciOiJFUzI1NiJ9.eyJhdXQiOiJHVUlEIiwic2NwIjoic2ZjYy5zaG9wcGVyLW15YWNjb3VudC5iYXNrZXRzIHNmY2Muc2hvcHBlci1kaXNjb3Zlcnktc2VhcmNoIHNmY2Muc2hvcHBlci1teWFjY291bnQuYWRkcmVzc2VzIHNmY2Muc2hvcHBlci1wcm9kdWN0cyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnJ3IHNmY2Muc2hvcHBlci1teWFjY291bnQucGF5bWVudGluc3RydW1lbnRzIHNmY2Muc2hvcHBlci1jdXN0b21lcnMubG9naW4gc2ZjYy5zaG9wcGVyLXN0b3JlcyBzZmNjLnNob3BwZXItbXlhY2NvdW50Lm9yZGVycyBzZmNjLnNob3BwZXItYmFza2V0cy1vcmRlcnMgc2ZjYy5zaG9wcGVyLWN1c3RvbWVycy5yZWdpc3RlciBzZmNjLnNob3BwZXItbXlhY2NvdW50LmFkZHJlc3Nlcy5ydyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnByb2R1Y3RsaXN0cy5ydyBzZmNjLnNob3BwZXItcHJvZHVjdGxpc3RzIHNmY2Muc2hvcHBlci1wcm9tb3Rpb25zIHNmY2Muc2hvcHBlci1iYXNrZXRzLW9yZGVycy5ydyBzZmNjLnNob3BwZXItZ2lmdC1jZXJ0aWZpY2F0ZXMgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5wYXltZW50aW5zdHJ1bWVudHMucncgc2ZjYy5zaG9wcGVyLXByb2R1Y3Qtc2VhcmNoIHNmY2Muc2hvcHBlci1teWFjY291bnQucHJvZHVjdGxpc3RzIHNmY2Muc2hvcHBlci1jYXRlZ29yaWVzIHNmY2Muc2hvcHBlci1teWFjY291bnQiLCJzdWIiOiJjYy1zbGFzOjpiamNsX2Rldjo6c2NpZDo1ZDI1ZjVmYS01YTRmLTQ2YjUtYTIxMS04NzU1NDJjODVhYzE6OnVzaWQ6NGQwNTc3ZTctODM4NC00MDk2LWIxOWUtNTJmODlkMGRmM2JmIiwiY3R4Ijoic2xhcyIsImlzcyI6InNsYXMvcHJvZC9iamNsX2RldiIsImlzdCI6MSwiZG50IjoiMCIsImF1ZCI6ImNvbW1lcmNlY2xvdWQvcHJvZC9iamNsX2RldiIsIm5iZiI6MTcxMTYxMzAxNSwic3R5IjoiVXNlciIsImlzYiI6InVpZG86ZWNvbTo6dXBuOnFhLnRvdGFscGxheSswMTAwOTg3MTA1QGdtYWlsLmNvbTo6dWlkbjpSaWNhcmRvIENvcm9uYSBDcnV6OjpnY2lkOmFibGVvVWxyQTF4ckFSbWJrMmxhWVlrYkkwOjpyY2lkOmFjblJiV3F1akhDcGc5b3E2VjJoa3VUYVNXOjpjaGlkOlRQLUZPT0QiLCJleHAiOjE3MTE2MTQ4NDUsImlhdCI6MTcxMTYxMzA0NSwianRpIjoiQzJDLTEzMTE1NjM1NzAxNzg3NTExODUwMjk0MDQ3NDYwNDYzNjEzNyJ9.m92qXOQMnshQPVggXrJCXmCtIBr6V7u2zOFcF6IIFsk3T0H-0QVQIRb3S3ah6JTPitp34-Dq3s0UEiCJOBlhVA</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;[\n    {\n        \&quot;product_id\&quot;: \&quot;${GlobalVariable.Product_ID}\&quot;,\n        \&quot;quantity\&quot;: 1.00,\n        \&quot;c_comment\&quot;: \&quot;Hello World\&quot;\n    }\n]&quot;,
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
      <webElementGuid>1fd253c5-397f-4c43-b9e2-9497b8325b0e</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${GlobalVariable.Authorization}</value>
      <webElementGuid>50ace0a3-f1d4-4dd8-8181-1fc25141de18</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${GlobalVariable.URL}/s/TP-FOOD/dw/shop/v24_5/baskets/${GlobalVariable.FoodBasketId}/items?sellerId=${GlobalVariable.SellerId1}&amp;isHomo=true</restUrl>
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
      <id>f555862b-9370-4fe5-a651-e4326e3f3feb</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.basketID</defaultValue>
      <description></description>
      <id>39e55bc3-36ad-45b6-ac29-de61adeea522</id>
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


WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)

WS.verifyElementPropertyValue(response, '_v', &quot;24.5&quot;)
WS.verifyElementPropertyValue(response, '_type', &quot;basket&quot;)
WS.verifyElementPropertyValue(response, '_resource_state', &quot;1c09497a9314cd596ba41554f236f8a4055dc788076b02030ef992379d666d98&quot;)
WS.verifyElementPropertyValue(response, 'adjusted_merchandize_total_tax', 0.00)
WS.verifyElementPropertyValue(response, 'adjusted_shipping_total_tax', 0.00)
WS.verifyElementPropertyValue(response, 'agent_basket', false)
WS.verifyElementPropertyValue(response, 'basket_id', &quot;7749ddea9165503247ce00aeed&quot;)
WS.verifyElementPropertyValue(response, 'billing_address._type', &quot;order_address&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.address1', &quot;Alejandro Dumas&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.city', &quot;Ciudad de Mexico&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.country_code', &quot;MX&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.first_name', &quot;CESAR&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.full_name', &quot;CESAR GERARDO WALDO GONZALEZ&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.id', &quot;f7c6e43758ae25dcb1f32c71e4&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.last_name', &quot;GERARDO WALDO GONZALEZ&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.phone', &quot;5579660270&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.postal_code', &quot;11500&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_alias', &quot;CasaWaldoP&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_delegation', &quot;Miguel Hidalgo&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_label', &quot;{\&quot;home\&quot;:true,\&quot;company\&quot;:false,\&quot;other\&quot;:false}&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_latitude', &quot;19.338216&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_longitude', &quot;-99.201142&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_nExt', &quot;107&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_neighborhood', &quot;Polanco&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_references', &quot;Llamar al llegar&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_rfc', &quot;XAXA010101111&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_state', &quot;CDMX&quot;)
WS.verifyElementPropertyValue(response, 'billing_address.c_streetName', &quot;Alejandro Dumas&quot;)
WS.verifyElementPropertyValue(response, 'channel_type', &quot;storefront&quot;)
WS.verifyElementPropertyValue(response, 'creation_date', &quot;2024-07-23T11:33:26.877Z&quot;)
WS.verifyElementPropertyValue(response, 'currency', &quot;MXN&quot;)
WS.verifyElementPropertyValue(response, 'customer_info._type', &quot;customer_info&quot;)
WS.verifyElementPropertyValue(response, 'customer_info.customer_id', &quot;acTAcwrTj6ECo7V8WDIa5leqor&quot;)
WS.verifyElementPropertyValue(response, 'customer_info.customer_no', &quot;00012002&quot;)
WS.verifyElementPropertyValue(response, 'customer_info.email', &quot;cesar.waldo93@gmail.com&quot;)
WS.verifyElementPropertyValue(response, 'last_modified', &quot;2024-07-24T07:19:17.808Z&quot;)
WS.verifyElementPropertyValue(response, 'merchandize_total_tax', 0.00)
WS.verifyElementPropertyValue(response, 'notes._type', &quot;simple_link&quot;)
WS.verifyElementPropertyValue(response, 'notes.link', &quot;https://salesforceqa.sistemastp.com.mx/s/TP-FOOD/dw/shop/v24_5/baskets/7749ddea9165503247ce00aeed/notes?isHomo=true&amp;sellerId=4158&quot;)
WS.verifyElementPropertyValue(response, 'order_total', 50.00)
WS.verifyElementPropertyValue(response, 'payment_instruments[0]._type', &quot;order_payment_instrument&quot;)
WS.verifyElementPropertyValue(response, 'payment_instruments[0].amount', 10.00)
WS.verifyElementPropertyValue(response, 'payment_instruments[0].payment_instrument_id', &quot;0194f5d286a3b66ca7c7fc8c14&quot;)
WS.verifyElementPropertyValue(response, 'payment_instruments[0].payment_method_id', &quot;TP_CREDIT&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0]._type', &quot;product_item&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].adjusted_tax', 0.00)
WS.verifyElementPropertyValue(response, 'product_items[0].base_price', 10.00)
WS.verifyElementPropertyValue(response, 'product_items[0].bonus_product_line_item', false)
WS.verifyElementPropertyValue(response, 'product_items[0].gift', false)
WS.verifyElementPropertyValue(response, 'product_items[0].inventory_id', &quot;inventory_m_food_mirakl&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].item_id', &quot;b6c6581fa4b2be7f8df450d2db&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].item_text', &quot;Salsa Roja&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].price', 10.00)
WS.verifyElementPropertyValue(response, 'product_items[0].price_after_item_discount', 10.00)
WS.verifyElementPropertyValue(response, 'product_items[0].price_after_order_discount', 10.00)
WS.verifyElementPropertyValue(response, 'product_items[0].product_id', &quot;C1615243382&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].product_name', &quot;Salsa Roja&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].quantity', 1)
WS.verifyElementPropertyValue(response, 'product_items[0].shipment_id', &quot;me&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].tax', 0.00)
WS.verifyElementPropertyValue(response, 'product_items[0].tax_basis', 10.00)
WS.verifyElementPropertyValue(response, 'product_items[0].tax_class_id', &quot;product_zero_tax&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].tax_rate', 0)
WS.verifyElementPropertyValue(response, 'product_items[0].c_comment', &quot;Hello World&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_fromStoreId', &quot;4158&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklChannels', &quot;[\&quot;INIT\&quot;]&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklEarliestDeliveryDays', 1.0)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklLatestDeliveryDays', 2.0)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklLeadTimeToShip', &quot;2&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklLineShippingPrice', &quot;0&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklOperatorProductId', &quot;C1615243382&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklShippingTaxes', &quot;[{\&quot;amount\&quot;:0,\&quot;type\&quot;:\&quot;product_zero_tax\&quot;,\&quot;isTaxRate\&quot;:true,\&quot;rate\&quot;:0}]&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_miraklTaxes', &quot;[{\&quot;amount\&quot;:0,\&quot;type\&quot;:\&quot;product_zero_tax\&quot;,\&quot;isTaxRate\&quot;:true,\&quot;rate\&quot;:0}]&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_noOfPersons', 1)
WS.verifyElementPropertyValue(response, 'product_items[0].c_offerId', &quot;541107&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_offerSalesPrice', 10.0)
WS.verifyElementPropertyValue(response, 'product_items[0].c_offerState', &quot;Nuevo&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_offerStateCode', &quot;11&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_shopId', &quot;4158&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_shopName', &quot;La Casa De Toño Polanco&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_priceWithComplement', 10.0)
WS.verifyElementPropertyValue(response, 'product_items[0].c_imagesData.large[0].alt', &quot;Salsa Roja&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_imagesData.large[0].url', &quot;&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_imagesData.large[0].title', &quot;Salsa Roja&quot;)
WS.verifyElementPropertyValue(response, 'product_items[0].c_description', &quot;Salsa&quot;)

WS.verifyElementPropertyValue(response, 'product_sub_total', 50.00)
WS.verifyElementPropertyValue(response, 'product_total', 50.00)
WS.verifyElementPropertyValue(response, 'shipments[0]._type', &quot;shipment&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].adjusted_merchandize_total_tax', 0.00)
WS.verifyElementPropertyValue(response, 'shipments[0].adjusted_shipping_total_tax', 0.00)
WS.verifyElementPropertyValue(response, 'shipments[0].gift', false)
WS.verifyElementPropertyValue(response, 'shipments[0].merchandize_total_tax', 0.00)
WS.verifyElementPropertyValue(response, 'shipments[0].product_sub_total', 50.00)
WS.verifyElementPropertyValue(response, 'shipments[0].product_total', 50.00)
WS.verifyElementPropertyValue(response, 'shipments[0].shipment_id', &quot;me&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipment_total', 50.00)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address._type', &quot;order_address&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.address1', &quot;Alejandro Dumas&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.city', &quot;Ciudad de Mexico&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.country_code', &quot;MX&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.first_name', &quot;CESAR&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.full_name', &quot;CESAR GERARDO WALDO GONZALEZ&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.id', &quot;144b7d6f3e721dc3cffd11527e&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.last_name', &quot;GERARDO WALDO GONZALEZ&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.phone', &quot;5579660270&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.postal_code', &quot;11500&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_alias', &quot;CasaWaldoP&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_delegation', &quot;Miguel Hidalgo&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_label', &quot;{\&quot;home\&quot;:true,\&quot;company\&quot;:false,\&quot;other\&quot;:false}&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_latitude', &quot;19.338216&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_longitude', &quot;-99.201142&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_nExt', &quot;107&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_neighborhood', &quot;Polanco&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_references', &quot;Llamar al llegar&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_rfc', &quot;XAXA010101111&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_state', &quot;CDMX&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_address.c_streetName', &quot;Alejandro Dumas&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_method', '')
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_method._type', &quot;shipping_method&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_method.description', &quot;pickup&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_method.id', &quot;pickup&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_method.name', &quot;pickup&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_method.shipping_promotions[0]._type', &quot;shipping_promotion&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_method.shipping_promotions[0].callout_msg', &quot;40 OFF&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_method.shipping_promotions[0].link', &quot;https://salesforceqa.sistemastp.com.mx/s/TP-FOOD/dw/shop/v24_5/promotions/b8c65f6d5149abae4808c15ffe?isHomo=true&amp;sellerId=4158&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_method.shipping_promotions[0].promotion_id', &quot;40 OFF&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_method.shipping_promotions[0].promotion_name', &quot;40 OFF&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_status', &quot;not_shipped&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_total', 0.00)
WS.verifyElementPropertyValue(response, 'shipments[0].shipping_total_tax', 0.00)
WS.verifyElementPropertyValue(response, 'shipments[0].tax_total', 0.00)
WS.verifyElementPropertyValue(response, 'shipments[0].c_serviceCharge', 0.0)
WS.verifyElementPropertyValue(response, 'shipments[0].c_shippingRates', &quot;[\&quot;{\\\&quot;shipCost\\\&quot;:172,\\\&quot;idCotizacion\\\&quot;:\\\&quot;PICK000000010377\\\&quot;}\&quot;]&quot;)
WS.verifyElementPropertyValue(response, 'shipments[0].c_totalShippingCost', 206.48)
WS.verifyElementPropertyValue(response, 'shipping_items[0]._type', &quot;shipping_item&quot;)
WS.verifyElementPropertyValue(response, 'shipping_items[0].adjusted_tax', 0.00)
WS.verifyElementPropertyValue(response, 'shipping_items[0].base_price', 0.00)
WS.verifyElementPropertyValue(response, 'shipping_total', 0.00)
WS.verifyElementPropertyValue(response, 'shipping_total_tax', 0.00)
WS.verifyElementPropertyValue(response, 'taxation', &quot;net&quot;)
WS.verifyElementPropertyValue(response, 'tax_rounded_at_group', false)
WS.verifyElementPropertyValue(response, 'tax_total', 0.00)
WS.verifyElementPropertyValue(response, 'temporary_basket', false)
WS.verifyElementPropertyValue(response, 'c_currentCorporate', &quot;LaCasaDeToño&quot;)
WS.verifyElementPropertyValue(response, 'c_forceDeleteOndemand', false)
WS.verifyElementPropertyValue(response, 'c_isLock', true)
WS.verifyElementPropertyValue(response, 'c_isMiraklOrder', true)
WS.verifyElementPropertyValue(response, 'c_lockTime', &quot;2024-07-23T11:36:47.622Z&quot;)

WS.verifyElementPropertyValue(response, 'c_miraklShippingZoneCode', &quot;MX&quot;)
WS.verifyElementPropertyValue(response, 'c_pickerExpressShipment', &quot;{\&quot;shipCost\&quot;:172,\&quot;idCotizacion\&quot;:\&quot;PICK000000010377\&quot;}&quot;)
WS.verifyElementPropertyValue(response, 'c_seller_id', &quot;4158&quot;)
WS.verifyElementPropertyValue(response, 'c_serviceChargeTotalGrossPrice', 0.0)
WS.verifyElementPropertyValue(response, 'c_savingsTotal', 0.0)
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
