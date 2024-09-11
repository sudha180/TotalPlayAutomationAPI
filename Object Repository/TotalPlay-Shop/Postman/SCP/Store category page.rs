<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Store category page</name>
   <tag></tag>
   <elementGuidId>9f116a41-e0a3-4706-8567-a64721b7ce29</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJ2ZXIiOiIxLjAiLCJqa3UiOiJzbGFzL3Byb2QvYmpjbF9kZXYiLCJraWQiOiI0NGVmM2ZkMy0xZTQ3LTRkMmEtOGJiNC0xZjFiNDJlZjUxY2QiLCJ0eXAiOiJqd3QiLCJjbHYiOiJKMi4zLjQiLCJhbGciOiJFUzI1NiJ9.eyJhdXQiOiJHVUlEIiwic2NwIjoic2ZjYy5zaG9wcGVyLW15YWNjb3VudC5iYXNrZXRzIHNmY2Muc2hvcHBlci1kaXNjb3Zlcnktc2VhcmNoIHNmY2Muc2hvcHBlci1teWFjY291bnQuYWRkcmVzc2VzIHNmY2Muc2hvcHBlci1wcm9kdWN0cyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnJ3IHNmY2Muc2hvcHBlci1teWFjY291bnQucGF5bWVudGluc3RydW1lbnRzIHNmY2Muc2hvcHBlci1jdXN0b21lcnMubG9naW4gc2ZjYy5zaG9wcGVyLXN0b3JlcyBzZmNjLnNob3BwZXItbXlhY2NvdW50Lm9yZGVycyBzZmNjLnNob3BwZXItYmFza2V0cy1vcmRlcnMgc2ZjYy5zaG9wcGVyLWN1c3RvbWVycy5yZWdpc3RlciBzZmNjLnNob3BwZXItbXlhY2NvdW50LmFkZHJlc3Nlcy5ydyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnByb2R1Y3RsaXN0cy5ydyBzZmNjLnNob3BwZXItcHJvZHVjdGxpc3RzIHNmY2Muc2hvcHBlci1wcm9tb3Rpb25zIHNmY2Muc2hvcHBlci1iYXNrZXRzLW9yZGVycy5ydyBzZmNjLnNob3BwZXItZ2lmdC1jZXJ0aWZpY2F0ZXMgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5wYXltZW50aW5zdHJ1bWVudHMucncgc2ZjYy5zaG9wcGVyLXByb2R1Y3Qtc2VhcmNoIHNmY2Muc2hvcHBlci1teWFjY291bnQucHJvZHVjdGxpc3RzIHNmY2Muc2hvcHBlci1jYXRlZ29yaWVzIHNmY2Muc2hvcHBlci1teWFjY291bnQiLCJzdWIiOiJjYy1zbGFzOjpiamNsX2Rldjo6c2NpZDo1ZDI1ZjVmYS01YTRmLTQ2YjUtYTIxMS04NzU1NDJjODVhYzE6OnVzaWQ6YzdjZjE0ZDUtMmY0Mi00MGNkLTlhYTktZGUxNjhhYmE1ZGQ5IiwiY3R4Ijoic2xhcyIsImlzcyI6InNsYXMvcHJvZC9iamNsX2RldiIsImlzdCI6MSwiYXVkIjoiY29tbWVyY2VjbG91ZC9wcm9kL2JqY2xfZGV2IiwibmJmIjoxNzA4MDAxMDM1LCJzdHkiOiJVc2VyIiwiaXNiIjoidWlkbzplY29tOjp1cG46Z29waS52ZW11bGFAa29nbml2ZXJhLmNvbTo6dWlkbjpHb3Bpa3Jpc2huYSA0NDc0NiAyNi8wNS8yMDIzOjpnY2lkOmFid1hCSHhIY1l4YnNSa0t3WWtHWVlrZWxJOjpyY2lkOmFiY2pIZGV3ZVhyZnZKdm1IMUZRUEFOaXp0OjpjaGlkOlRQLVNIT1AiLCJleHAiOjE3MDgwMDI4NjUsImlhdCI6MTcwODAwMTA2NSwianRpIjoiQzJDLTEzMTE1NjM1NzAxNzg3NTExODUwMjQwMzQxNTQzMTI3ODc0OCJ9._e5E0Q3924MBOh98nPvaxXpAnf5oXsrjG_9ZvqrV4gtc1K0MWaf0B5TEJ8DvAc9dRxuACO_jYiKh3tBfbN5pTQ</value>
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
      <webElementGuid>6e7578f1-9453-4107-bf17-1d1933c0afc8</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.3.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${GlobalVariable.URL}/s/${GlobalVariable.SITEID}/dw/shop/v23_1/content/seller-category-page?page=1&amp;storeType=${GlobalVariable.storeType}</restUrl>
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
      <id>c3f52bf0-41db-440f-9ec1-d60cd8356019</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.SITEID</defaultValue>
      <description></description>
      <id>b08bbf5a-6d8e-4d02-aac5-7e326dcff4fa</id>
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
WS.verifyElementPropertyValue(response, 'id', &quot;seller-category-page&quot;)
WS.verifyElementPropertyValue(response, 'name', &quot;seller category page&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].name', &quot;Dormimundo&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].image', &quot;https://salesforceqa.sistemastp.com.mx/on/demandware.static/-/Sites/default/dw747d39d5/images/seller/201722794.07912362178&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].ondemandEDD', &quot;90 Min&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].corporateColorCode', &quot;41ADF5&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].multiStoreEDD', &quot;1 - 9 días&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].link', &quot;/dw/shop/v23_2/product_search?pcpPage=true&amp;refine_1=c_miraklShopID=4879&amp;count=30&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].linkType', &quot;PCP&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].products[0].name', &quot;Colchón Dormimundo Queen Medellín Confort Medio 40 cm&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].products[0].ID', &quot;T219396245&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].products[0].sellerId', &quot;2017&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].products[0].corporateName', &quot;Dormimundo&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].products[0].productType', &quot;master&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].products[0].productImage', &quot;https://salesforceqa.sistemastp.com.mx/dw/image/v2/BJCL_DEV/on/demandware.static/-/Sites-Standard/default/dwd12c2ac0/images/large/7d0d499076134258b0a0370f52e18c4c.jpg?sw=480&amp;sh=480&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].products[0].price.type', &quot;range&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].products[0].price.min.sales.value', 6699.43)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].products[0].price.min.sales.currency', &quot;MXN&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].products[0].price.min.sales.formatted', &quot;$6,699.43&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].products[0].price.min.sales.decimalPrice', &quot;6699.43&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].products[0].price.max.sales.value', 13398.87)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].products[0].price.max.sales.formatted', &quot;$13,398.87&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].products[0].price.max.sales.decimalPrice', &quot;13398.87&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].products[0].price.max.sales.currency', &quot;MXN&quot;)
WS.verifyElementPropertyValue(response, 'c_result.stores[0].products[0].isVariant', false)
WS.verifyElementPropertyValue(response, 'c_result.stores_count', 3)
WS.verifyElementPropertyValue(response, 'c_result.overall_stores_count', 4)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
