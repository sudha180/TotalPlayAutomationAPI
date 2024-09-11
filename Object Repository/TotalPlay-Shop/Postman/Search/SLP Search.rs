<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>SLP Search</name>
   <tag></tag>
   <elementGuidId>98570653-5b20-4926-b573-504a01f4673b</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJ2ZXIiOiIxLjAiLCJqa3UiOiJzbGFzL3Byb2QvYmpjbF9kZXYiLCJraWQiOiI0NGVmM2ZkMy0xZTQ3LTRkMmEtOGJiNC0xZjFiNDJlZjUxY2QiLCJ0eXAiOiJqd3QiLCJjbHYiOiJKMi4zLjQiLCJhbGciOiJFUzI1NiJ9.eyJhdXQiOiJHVUlEIiwic2NwIjoic2ZjYy5zaG9wcGVyLW15YWNjb3VudC5iYXNrZXRzIHNmY2Muc2hvcHBlci1kaXNjb3Zlcnktc2VhcmNoIHNmY2Muc2hvcHBlci1teWFjY291bnQuYWRkcmVzc2VzIHNmY2Muc2hvcHBlci1wcm9kdWN0cyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnJ3IHNmY2Muc2hvcHBlci1teWFjY291bnQucGF5bWVudGluc3RydW1lbnRzIHNmY2Muc2hvcHBlci1jdXN0b21lcnMubG9naW4gc2ZjYy5zaG9wcGVyLXN0b3JlcyBzZmNjLnNob3BwZXItbXlhY2NvdW50Lm9yZGVycyBzZmNjLnNob3BwZXItYmFza2V0cy1vcmRlcnMgc2ZjYy5zaG9wcGVyLWN1c3RvbWVycy5yZWdpc3RlciBzZmNjLnNob3BwZXItbXlhY2NvdW50LmFkZHJlc3Nlcy5ydyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnByb2R1Y3RsaXN0cy5ydyBzZmNjLnNob3BwZXItcHJvZHVjdGxpc3RzIHNmY2Muc2hvcHBlci1wcm9tb3Rpb25zIHNmY2Muc2hvcHBlci1iYXNrZXRzLW9yZGVycy5ydyBzZmNjLnNob3BwZXItZ2lmdC1jZXJ0aWZpY2F0ZXMgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5wYXltZW50aW5zdHJ1bWVudHMucncgc2ZjYy5zaG9wcGVyLXByb2R1Y3Qtc2VhcmNoIHNmY2Muc2hvcHBlci1teWFjY291bnQucHJvZHVjdGxpc3RzIHNmY2Muc2hvcHBlci1jYXRlZ29yaWVzIHNmY2Muc2hvcHBlci1teWFjY291bnQiLCJzdWIiOiJjYy1zbGFzOjpiamNsX2Rldjo6c2NpZDo1ZDI1ZjVmYS01YTRmLTQ2YjUtYTIxMS04NzU1NDJjODVhYzE6OnVzaWQ6NDRmZjM1NjEtNWYyMy00ZTdlLTljNzAtNjBlZTcwNjNkNDBlIiwiY3R4Ijoic2xhcyIsImlzcyI6InNsYXMvcHJvZC9iamNsX2RldiIsImlzdCI6MSwiZG50IjoiMCIsImF1ZCI6ImNvbW1lcmNlY2xvdWQvcHJvZC9iamNsX2RldiIsIm5iZiI6MTcwODMyMzM5Miwic3R5IjoiVXNlciIsImlzYiI6InVpZG86ZWNvbTo6dXBuOmdvcGkudmVtdWxhQGtvZ25pdmVyYS5jb206OnVpZG46R29waWtyaXNobmEgNDQ3NDYgMjYvMDUvMjAyMzo6Z2NpZDphYmxicEt4SGtabEhjUmx1d1drV1lZeHJCSjo6cmNpZDphYmNqSGRld2VYcmZ2SnZtSDFGUVBBTml6dDo6Y2hpZDpUUC1TSE9QIiwiZXhwIjoxNzA4MzI1MjIyLCJpYXQiOjE3MDgzMjM0MjIsImp0aSI6IkMyQy0xMzExNTYzNTcwMTc4NzUxMTg1MDI5NDk5NTM1NDU4NDczMCJ9.6b-DdSyp4quR2ZnjCLdh2khmLsQq0Rw7NL2m_PCp4s-Jx7ANvye3IQFughGwOJRPfu3lAdIhqQssoyuIlnGufg</value>
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
      <webElementGuid>7491c3ea-1a4d-44ba-8a5c-9a21edc27f9e</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.3.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${GlobalVariable.URL}/s/${GlobalVariable.SITEID}/dw/shop/v23_2/search_suggestion?q=liverpool&amp;page=slp&amp;count=10</restUrl>
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
      <id>a49e6694-03cd-4080-834f-d92770c9865c</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.SITEID</defaultValue>
      <description></description>
      <id>d6b9ceb1-8150-4e76-a55e-ffaa83a548a7</id>
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
WS.verifyElementPropertyValue(response, 'stores[0].name', &quot;Liverpool Mutli-Store&quot;)
WS.verifyElementPropertyValue(response, 'stores[0].corporateName', &quot;Liverpool&quot;)
WS.verifyElementPropertyValue(response, 'stores[0].ondemandEDD', &quot;90 Min&quot;)
WS.verifyElementPropertyValue(response, 'stores[0].multiStoreEDD', &quot;6 - 11 días&quot;)
WS.verifyElementPropertyValue(response, 'stores[0].image', &quot;https://salesforceqa.sistemastp.com.mx/on/demandware.static/-/Sites/default/dwbf3449aa/images/seller/200578452.46922417705&quot;)
WS.verifyElementPropertyValue(response, 'stores[0].productsCount', 39)
WS.verifyElementPropertyValue(response, 'stores[0].link', &quot;/dw/shop/v23_2/product_search?pcpPage=true&amp;refine_1=c_miraklShopID=2005&amp;count=30&quot;)
WS.verifyElementPropertyValue(response, 'stores[0].linkType', &quot;PCP&quot;)
WS.verifyElementPropertyValue(response, 'stores[0].corporateColorCode', &quot;14700&quot;)
WS.verifyElementPropertyValue(response, 'stores[0].verticalType', &quot;MultiStore&quot;)
WS.verifyElementPropertyValue(response, 'stores[0].storeOpen', false)
WS.verifyElementPropertyValue(response, 'stores[0].products[0].productId', &quot;T1439105436&quot;)
WS.verifyElementPropertyValue(response, 'stores[0].products[0].productName', &quot;SAMSUNG Odyssey G7 1000R Monitor de juegos de panel VA con retroiluminación LED Full HD curvo de 32 pulgadas (LC32G75TQSWXXL) (NVIDIA G Sync, tiempo de respuesta: 1 ms, frecuencia de actualización de 240 Hz)&quot;)
WS.verifyElementPropertyValue(response, 'stores[0].products[0].link', &quot;/dw/shop/v23_1/content/seller-pdp?sellerID=2005&amp;c_productid=T1439105436&quot;)
WS.verifyElementPropertyValue(response, 'stores[0].products[0].linkType', &quot;PDP&quot;)
WS.verifyElementPropertyValue(response, 'categories[0].id', &quot;SF_50&quot;)
WS.verifyElementPropertyValue(response, 'categories[0].name', &quot;Liverpool&quot;)
WS.verifyElementPropertyValue(response, 'categories[0].link', &quot;/dw/shop/v23_2/product_search?pcpPage=true&amp;refine_1=c_miraklShopID=2005&amp;refine_2=cgid=SF_50&amp;count=30&quot;)
WS.verifyElementPropertyValue(response, 'categories[0].linkType', &quot;PCP&quot;)
WS.verifyElementPropertyValue(response, 'categories[0].parentCategoryName', &quot;TotalPlayShop&quot;)
WS.verifyElementPropertyValue(response, 'products[0].productId', &quot;T2100004383&quot;)
WS.verifyElementPropertyValue(response, 'products[0].productName', &quot;acer monitor de panel HD TN de 19,5 pulgadas (V206HQL) (Tiempo de respuesta: 5 ms, frecuencia de actualización de 60 Hz)&quot;)
WS.verifyElementPropertyValue(response, 'products[0].link', &quot;/dw/shop/v23_1/content/seller-pdp?sellerID=2005&amp;c_productid=T2100004383&quot;)
WS.verifyElementPropertyValue(response, 'products[0].linkType', &quot;PDP&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
