<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Store Policy Details</name>
   <tag></tag>
   <elementGuidId>b8490a90-f951-409b-9452-634f09f04af5</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJ2ZXIiOiIxLjAiLCJqa3UiOiJzbGFzL3Byb2QvYmpjbF9kZXYiLCJraWQiOiI0NGVmM2ZkMy0xZTQ3LTRkMmEtOGJiNC0xZjFiNDJlZjUxY2QiLCJ0eXAiOiJqd3QiLCJjbHYiOiJKMi4zLjQiLCJhbGciOiJFUzI1NiJ9.eyJhdXQiOiJHVUlEIiwic2NwIjoic2ZjYy5zaG9wcGVyLW15YWNjb3VudC5iYXNrZXRzIHNmY2Muc2hvcHBlci1kaXNjb3Zlcnktc2VhcmNoIHNmY2Muc2hvcHBlci1teWFjY291bnQuYWRkcmVzc2VzIHNmY2Muc2hvcHBlci1wcm9kdWN0cyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnJ3IHNmY2Muc2hvcHBlci1teWFjY291bnQucGF5bWVudGluc3RydW1lbnRzIHNmY2Muc2hvcHBlci1jdXN0b21lcnMubG9naW4gc2ZjYy5zaG9wcGVyLXN0b3JlcyBzZmNjLnNob3BwZXItbXlhY2NvdW50Lm9yZGVycyBzZmNjLnNob3BwZXItYmFza2V0cy1vcmRlcnMgc2ZjYy5zaG9wcGVyLWN1c3RvbWVycy5yZWdpc3RlciBzZmNjLnNob3BwZXItbXlhY2NvdW50LmFkZHJlc3Nlcy5ydyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnByb2R1Y3RsaXN0cy5ydyBzZmNjLnNob3BwZXItcHJvZHVjdGxpc3RzIHNmY2Muc2hvcHBlci1wcm9tb3Rpb25zIHNmY2Muc2hvcHBlci1iYXNrZXRzLW9yZGVycy5ydyBzZmNjLnNob3BwZXItZ2lmdC1jZXJ0aWZpY2F0ZXMgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5wYXltZW50aW5zdHJ1bWVudHMucncgc2ZjYy5zaG9wcGVyLXByb2R1Y3Qtc2VhcmNoIHNmY2Muc2hvcHBlci1teWFjY291bnQucHJvZHVjdGxpc3RzIHNmY2Muc2hvcHBlci1jYXRlZ29yaWVzIHNmY2Muc2hvcHBlci1teWFjY291bnQiLCJzdWIiOiJjYy1zbGFzOjpiamNsX2Rldjo6c2NpZDo1ZDI1ZjVmYS01YTRmLTQ2YjUtYTIxMS04NzU1NDJjODVhYzE6OnVzaWQ6YjA0NjVhZjktMjZmYy00M2E4LTg4YzAtYzUxNzJhOWRlYTc3IiwiY3R4Ijoic2xhcyIsImlzcyI6InNsYXMvcHJvZC9iamNsX2RldiIsImlzdCI6MSwiYXVkIjoiY29tbWVyY2VjbG91ZC9wcm9kL2JqY2xfZGV2IiwibmJmIjoxNzA3OTg2MDM2LCJzdHkiOiJVc2VyIiwiaXNiIjoidWlkbzplY29tOjp1cG46Z29waS52ZW11bGFAa29nbml2ZXJhLmNvbTo6dWlkbjpHb3Bpa3Jpc2huYSA0NDc0NiAyNi8wNS8yMDIzOjpnY2lkOmJjd0hhWWxIdEZ4SElSa0h4S3dXWVlrMGMyOjpyY2lkOmFiY2pIZGV3ZVhyZnZKdm1IMUZRUEFOaXp0OjpjaGlkOlRQLVNIT1AiLCJleHAiOjE3MDc5ODc4NjYsImlhdCI6MTcwNzk4NjA2NiwianRpIjoiQzJDLTEzMTE1NjM1NzAxNzg3NTExODUwMjM4ODQxNjA3MDMzNjg0MyJ9.CjEWbr6DLqNcZj6xgu6-Yf2XKJqu6SYSeC8obeXxuTxFe5nBay1wV-jzhGCNzoftuyf7PjsnAQWi88j4unNX_Q</value>
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
      <webElementGuid>ccf8b7b7-dc1c-4793-8185-3be50a244573</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.3.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${GlobalVariable.URL}/s/${GlobalVariable.SITEID}/dw/shop/v23_1/content/store-details?sellerID=${GlobalVariable.Seller_ID}</restUrl>
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
      <id>8f6e512c-d590-44c3-9c64-90f7d8e1927d</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.SITEID</defaultValue>
      <description></description>
      <id>ce9fac1a-f6db-404a-89d8-09e5cd42eade</id>
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
WS.verifyElementPropertyValue(response, 'id', &quot;store-details&quot;)
WS.verifyElementPropertyValue(response, 'name', &quot;store-details&quot;)
WS.verifyElementPropertyValue(response, 'c_result.ID', &quot;2016&quot;)
WS.verifyElementPropertyValue(response, 'c_result.name', &quot;IUSA&quot;)
WS.verifyElementPropertyValue(response, 'c_result.phone', &quot;5518215989&quot;)
WS.verifyElementPropertyValue(response, 'c_result.postalCode', &quot;50734&quot;)
WS.verifyElementPropertyValue(response, 'c_result.address', &quot;Carretera Panamericana México Querétaro Kilometro 109, México- Querétaro, CP 50734 Jocotitlán. Edo de México&quot;)
WS.verifyElementPropertyValue(response, 'c_result.city', &quot;Estado de México&quot;)
WS.verifyElementPropertyValue(response, 'c_result.image', &quot;https://salesforceqa.sistemastp.com.mx/on/demandware.static/-/Sites/default/dwbf93f9c1/images/seller/201621485.94782518528&quot;)
WS.verifyElementPropertyValue(response, 'c_result.latitude', 19.36952)
WS.verifyElementPropertyValue(response, 'c_result.longitude', -)
WS.verifyElementPropertyValue(response, 'c_result.todayOpenHrs', &quot;00:00-23:59&quot;)
WS.verifyElementPropertyValue(response, 'c_result.openHours', '')
WS.verifyElementPropertyValue(response, 'c_result.verticalsAvailable', &quot;Only MultiStore&quot;)
WS.verifyElementPropertyValue(response, 'c_result.MultistoreEDD', &quot;2 - 5 días&quot;)
WS.verifyElementPropertyValue(response, 'c_result.link', &quot;/dw/shop/v23_1/content/seller-home-page-store?corporateName=IUSA&quot;)
WS.verifyElementPropertyValue(response, 'c_result.open', true)
WS.verifyElementPropertyValue(response, 'c_result.corporateName', &quot;IUSA&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipmentCost.value', 50)
WS.verifyElementPropertyValue(response, 'c_result.shipmentCost.currency', &quot;MXN&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipmentCost.formatted', &quot;$50.00&quot;)
WS.verifyElementPropertyValue(response, 'c_result.shipmentCost.decimalPrice', &quot;50.00&quot;)
WS.verifyElementPropertyValue(response, 'c_result.storeType', &quot;Hogar&quot;)
WS.verifyElementPropertyValue(response, 'c_result.verticalType', &quot;MultiStore&quot;)
WS.verifyElementPropertyValue(response, 'c_result.corporateColorCode', &quot;#E2232A&quot;)
WS.verifyElementPropertyValue(response, 'c_result.politicaDePrecios', &quot;Los precios pueden variar de acuerdo con la sucursal. De acuerdo con la Ley del IVA, todos los precios publicados en Totalplay Tiendas incluyen este impuesto, a excepción de los productos exentos del mismo&quot;)
WS.verifyElementPropertyValue(response, 'c_result.tarifaDeEntrega', &quot;&quot;)
WS.verifyElementPropertyValue(response, 'c_result.grantiasDeLaTienda', &quot;&quot;)
WS.verifyElementPropertyValue(response, 'c_result.openHours', '')
WS.verifyElementPropertyValue(response, 'c_result.openHours.lunes', &quot;00:00-23:59&quot;)
WS.verifyElementPropertyValue(response, 'c_result.openHours.martes', &quot;00:00-23:59&quot;)
WS.verifyElementPropertyValue(response, 'c_result.openHours.miercoles', &quot;00:00-23:59&quot;)
WS.verifyElementPropertyValue(response, 'c_result.openHours.jueves', &quot;00:00-23:59&quot;)
WS.verifyElementPropertyValue(response, 'c_result.openHours.viernes', &quot;00:00-23:59&quot;)
WS.verifyElementPropertyValue(response, 'c_result.openHours.sabado', &quot;00:00-23:59&quot;)
WS.verifyElementPropertyValue(response, 'c_result.openHours.domingo', &quot;00:00-23:59&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
