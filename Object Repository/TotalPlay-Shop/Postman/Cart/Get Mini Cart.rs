<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get Mini Cart</name>
   <tag></tag>
   <elementGuidId>16f01770-02cc-4ee4-a5f6-cac45a5408d6</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJ2ZXIiOiIxLjAiLCJqa3UiOiJzbGFzL3Byb2QvYmpjbF9kZXYiLCJraWQiOiI0NGVmM2ZkMy0xZTQ3LTRkMmEtOGJiNC0xZjFiNDJlZjUxY2QiLCJ0eXAiOiJqd3QiLCJjbHYiOiJKMi4zLjQiLCJhbGciOiJFUzI1NiJ9.eyJhdXQiOiJHVUlEIiwic2NwIjoic2ZjYy5zaG9wcGVyLW15YWNjb3VudC5iYXNrZXRzIHNmY2Muc2hvcHBlci1kaXNjb3Zlcnktc2VhcmNoIHNmY2Muc2hvcHBlci1teWFjY291bnQuYWRkcmVzc2VzIHNmY2Muc2hvcHBlci1wcm9kdWN0cyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnJ3IHNmY2Muc2hvcHBlci1teWFjY291bnQucGF5bWVudGluc3RydW1lbnRzIHNmY2Muc2hvcHBlci1jdXN0b21lcnMubG9naW4gc2ZjYy5zaG9wcGVyLXN0b3JlcyBzZmNjLnNob3BwZXItbXlhY2NvdW50Lm9yZGVycyBzZmNjLnNob3BwZXItYmFza2V0cy1vcmRlcnMgc2ZjYy5zaG9wcGVyLWN1c3RvbWVycy5yZWdpc3RlciBzZmNjLnNob3BwZXItbXlhY2NvdW50LmFkZHJlc3Nlcy5ydyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnByb2R1Y3RsaXN0cy5ydyBzZmNjLnNob3BwZXItcHJvZHVjdGxpc3RzIHNmY2Muc2hvcHBlci1wcm9tb3Rpb25zIHNmY2Muc2hvcHBlci1iYXNrZXRzLW9yZGVycy5ydyBzZmNjLnNob3BwZXItZ2lmdC1jZXJ0aWZpY2F0ZXMgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5wYXltZW50aW5zdHJ1bWVudHMucncgc2ZjYy5zaG9wcGVyLXByb2R1Y3Qtc2VhcmNoIHNmY2Muc2hvcHBlci1teWFjY291bnQucHJvZHVjdGxpc3RzIHNmY2Muc2hvcHBlci1jYXRlZ29yaWVzIHNmY2Muc2hvcHBlci1teWFjY291bnQiLCJzdWIiOiJjYy1zbGFzOjpiamNsX2Rldjo6c2NpZDo1ZDI1ZjVmYS01YTRmLTQ2YjUtYTIxMS04NzU1NDJjODVhYzE6OnVzaWQ6MzUwNTlmMDMtZGRkOS00ZTJlLWE2Y2MtODZkNmExYjg4OWM5IiwiY3R4Ijoic2xhcyIsImlzcyI6InNsYXMvcHJvZC9iamNsX2RldiIsImlzdCI6MSwiZG50IjoiMCIsImF1ZCI6ImNvbW1lcmNlY2xvdWQvcHJvZC9iamNsX2RldiIsIm5iZiI6MTcwODU3Mzk1OSwic3R5IjoiVXNlciIsImlzYiI6InVpZG86ZWNvbTo6dXBuOmdvcGkudmVtdWxhQGtvZ25pdmVyYS5jb206OnVpZG46R29waWtyaXNobmEgNDQ3NDYgMjYvMDUvMjAyMzo6Z2NpZDphYmtYc1VsckpLa2JrUnhlcEltcVlZeHJoSjo6cmNpZDphYmNqSGRld2VYcmZ2SnZtSDFGUVBBTml6dDo6Y2hpZDpUUC1TSE9QIiwiZXhwIjoxNzA4NTc1Nzg5LCJpYXQiOjE3MDg1NzM5ODksImp0aSI6IkMyQy0xMzExNTYzNTcwMTc4NzUxMTg1MDI5NzYzMzkyMDQ2MDk3MDYifQ.kul6O2_IeSWfj6jjMzA6SUXft87nceqfwTJ5IMAZQui2sk1iHA8zdWTTRCA8ELeGcx1FHMJQ_PfJtuNaa-TNNg</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${GlobalVariable.Authorization}</value>
      <webElementGuid>d88b64ff-22d1-4f12-b0dd-4906f231a99c</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.3.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${GlobalVariable.URL}/s/${GlobalVariable.SITEID}/dw/shop/v23_1/customers/${GlobalVariable.sla_customerId}/baskets</restUrl>
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
      <id>d9e9490f-5d36-43ed-90e2-5a8f176cdb61</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.SITEID</defaultValue>
      <description></description>
      <id>d070b9cb-896e-4521-af39-c9579af6afa5</id>
      <masked>false</masked>
      <name>SITEID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.sla_customerId</defaultValue>
      <description></description>
      <id>000cf47d-6acb-4091-b407-d35b8b5ed524</id>
      <masked>false</masked>
      <name>sla_customerId</name>
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
WS.verifyElementPropertyValue(response, 'baskets[0]._type', &quot;basket&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].basket_id', &quot;8843f4b9b648aa119bf31ba327&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].creation_date', &quot;2024-02-21T05:54:49.179Z&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].order_total', 5791.00)
WS.verifyElementPropertyValue(response, 'baskets[0].product_sub_total', 5791.00)
WS.verifyElementPropertyValue(response, 'baskets[0].product_total', 5791.00)
WS.verifyElementPropertyValue(response, 'baskets[0].shipping_total', 0.00)
WS.verifyElementPropertyValue(response, 'baskets[0].shipping_total_tax', 0.00)
WS.verifyElementPropertyValue(response, 'baskets[0].c_corporateImgUrl', &quot;https://salesforceqa.sistemastp.com.mx/on/demandware.static/-/Sites/default/dw2a6d892f/images/seller/20154146.276399421867&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].c_corporateColorCode', &quot;#FF0040&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].c_currentBasket.name', &quot;3B_Ecatepec&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].c_currentBasket.productCount', 7)
WS.verifyElementPropertyValue(response, 'baskets[0].c_currentBasket.cartItems[0].ID', &quot;9ba51254af5ce0f919635a2a45&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].c_currentBasket.cartItems[0].productID', &quot;T418613712&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].c_currentBasket.cartItems[0].isOnDemandStoreItem', true)
WS.verifyElementPropertyValue(response, 'baskets[0].c_currentBasket.cartItems[0].productImage[0].alt', &quot;Tequila Cristalino 1800 700 ml queso pluma&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].c_currentBasket.cartItems[0].productImage[0].url', &quot;https://salesforceqa.sistemastp.com.mx/dw/image/v2/BJCL_DEV/on/demandware.static/-/Sites-Standard/default/dw1bb4a2e4/images/large/b0bbb960a0114cccb8e8800e95aace9c.jpg?sw=144&amp;sh=144&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].c_currentBasket.cartItems[0].productImage[0].title', &quot;Tequila Cristalino 1800 700 ml queso pluma&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].c_currentBasket.cartItems[0].sellerId', &quot;2052&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].c_currentBasket.cartItems[0].quantity', &quot;3&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].c_currentBasket.cartItems[0].name', &quot;Tequila Cristalino 1800 700 ml queso pluma&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].c_SellerList[0].name', &quot;IUSA&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].c_SellerList[0].corporateImgURL', &quot;https://salesforceqa.sistemastp.com.mx/on/demandware.static/-/Sites/default/dw2f41611b/images/seller/201684461.56261037296&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].c_SellerList[0].corporateColorCode', &quot;&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].c_SellerList[0].productsCount', 1)
WS.verifyElementPropertyValue(response, 'baskets[0].c_SellerList[0].cartItems[0].productID', &quot;T819683132&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].c_SellerList[0].cartItems[0].sellerId', null)
WS.verifyElementPropertyValue(response, 'baskets[0].c_SellerList[0].cartItems[0].isOnDemandStoreItem', null)
WS.verifyElementPropertyValue(response, 'baskets[0].c_SellerList[0].cartItems[0].productImage[0].alt', &quot;Calentador Rápida Recuperación Primo 5 L Gas Natural&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].c_SellerList[0].cartItems[0].productImage[0].url', &quot;https://salesforceqa.sistemastp.com.mx/dw/image/v2/BJCL_DEV/on/demandware.static/-/Sites-Standard/default/dw31140fef/images/large/6852ace2821b4e6f890e748e1c1ae34b.jpg?sw=144&amp;sh=144&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].c_SellerList[0].cartItems[0].productImage[0].title', &quot;Calentador Rápida Recuperación Primo 5 L Gas Natural&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].c_SellerList[0].cartItems[0].quantity', &quot;1&quot;)
WS.verifyElementPropertyValue(response, 'baskets[0].c_SellerList[0].cartItems[0].name', &quot;Calentador Rápida Recuperación Primo 5 L Gas Natural&quot;)
WS.verifyElementPropertyValue(response, 'total', 3)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
