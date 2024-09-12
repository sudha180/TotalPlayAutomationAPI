<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Update Customer Address</name>
   <tag></tag>
   <elementGuidId>5c9561e8-8e53-4838-b9c4-f9b09d8daaca</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJ2ZXIiOiIxLjAiLCJqa3UiOiJzbGFzL3Byb2QvYmpjbF9kZXYiLCJraWQiOiI0NGVmM2ZkMy0xZTQ3LTRkMmEtOGJiNC0xZjFiNDJlZjUxY2QiLCJ0eXAiOiJqd3QiLCJjbHYiOiJKMi4zLjQiLCJhbGciOiJFUzI1NiJ9.eyJhdXQiOiJHVUlEIiwic2NwIjoic2ZjYy5zaG9wcGVyLW15YWNjb3VudC5iYXNrZXRzIHNmY2Muc2hvcHBlci1kaXNjb3Zlcnktc2VhcmNoIHNmY2Muc2hvcHBlci1teWFjY291bnQuYWRkcmVzc2VzIHNmY2Muc2hvcHBlci1wcm9kdWN0cyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnJ3IHNmY2Muc2hvcHBlci1teWFjY291bnQucGF5bWVudGluc3RydW1lbnRzIHNmY2Muc2hvcHBlci1jdXN0b21lcnMubG9naW4gc2ZjYy5zaG9wcGVyLXN0b3JlcyBzZmNjLnNob3BwZXItbXlhY2NvdW50Lm9yZGVycyBzZmNjLnNob3BwZXItYmFza2V0cy1vcmRlcnMgc2ZjYy5zaG9wcGVyLWN1c3RvbWVycy5yZWdpc3RlciBzZmNjLnNob3BwZXItbXlhY2NvdW50LmFkZHJlc3Nlcy5ydyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnByb2R1Y3RsaXN0cy5ydyBzZmNjLnNob3BwZXItcHJvZHVjdGxpc3RzIHNmY2Muc2hvcHBlci1wcm9tb3Rpb25zIHNmY2Muc2hvcHBlci1iYXNrZXRzLW9yZGVycy5ydyBzZmNjLnNob3BwZXItZ2lmdC1jZXJ0aWZpY2F0ZXMgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5wYXltZW50aW5zdHJ1bWVudHMucncgc2ZjYy5zaG9wcGVyLXByb2R1Y3Qtc2VhcmNoIHNmY2Muc2hvcHBlci1teWFjY291bnQucHJvZHVjdGxpc3RzIHNmY2Muc2hvcHBlci1jYXRlZ29yaWVzIHNmY2Muc2hvcHBlci1teWFjY291bnQiLCJzdWIiOiJjYy1zbGFzOjpiamNsX2Rldjo6c2NpZDo1ZDI1ZjVmYS01YTRmLTQ2YjUtYTIxMS04NzU1NDJjODVhYzE6OnVzaWQ6MWY2YzY1YTMtYTg2MC00ZTUxLThhMzQtMzZmOTAyMjBhNWZjIiwiY3R4Ijoic2xhcyIsImlzcyI6InNsYXMvcHJvZC9iamNsX2RldiIsImlzdCI6MSwiZG50IjoiMCIsImF1ZCI6ImNvbW1lcmNlY2xvdWQvcHJvZC9iamNsX2RldiIsIm5iZiI6MTcwODYwNDYzOSwic3R5IjoiVXNlciIsImlzYiI6InVpZG86ZWNvbTo6dXBuOmdvcGkudmVtdWxhQGtvZ25pdmVyYS5jb206OnVpZG46R29waWtyaXNobmEgNDQ3NDYgMjYvMDUvMjAyMzo6Z2NpZDphYmt1dzB3WHdad3JrUndyRTBrYVlZeHJzVjo6cmNpZDphYmNqSGRld2VYcmZ2SnZtSDFGUVBBTml6dDo6Y2hpZDpUUC1TSE9QIiwiZXhwIjoxNzA4NjA2NDY5LCJpYXQiOjE3MDg2MDQ2NjksImp0aSI6IkMyQy0xMzExNTYzNTcwMTc4NzUxMTg1MDMwMDcwMTk4NzkwMDg5MjYifQ._HLs7LqzIsstiIST0DWra-L0gDLd6mhIR1rbWxFGDRDv7kwdmSvBAT-o5MdAKqJq-bEQuAQRKuqbO9dr14NA7g</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;postal_code\&quot;: \&quot;${GlobalVariable.postal_code}\&quot;,\n    \&quot;c_latitude\&quot;: \&quot;${GlobalVariable.lattitude}\&quot;,\n    \&quot;c_longitude\&quot;: \&quot;${GlobalVariable.longitude}\&quot;\n}&quot;,
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
      <webElementGuid>e11407b3-4c05-4b8c-81e0-23905bb647d9</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${GlobalVariable.Authorization}</value>
      <webElementGuid>39332e5f-3a9f-403e-88fe-a3ccacdba49c</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.3.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>PATCH</restRequestMethod>
   <restUrl>${GlobalVariable.URL}/s/${GlobalVariable.SITEID}/dw/shop/v24_5/customers/${GlobalVariable.sla_customerId}/addresses/${GlobalVariable.address_id}</restUrl>
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
      <id>6867f2da-8212-4f54-bca7-536545f5d6bf</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.SITEID</defaultValue>
      <description></description>
      <id>935e20cb-1fdb-4299-9517-95fc679f43e5</id>
      <masked>false</masked>
      <name>SITEID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.sla_customerId</defaultValue>
      <description></description>
      <id>47265a04-56d8-4bd5-a027-d7539732dc61</id>
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
WS.verifyElementPropertyValue(response, '_type', &quot;customer_address&quot;)
WS.verifyElementPropertyValue(response, 'address1', &quot;Av. San Jeronimo&quot;)
WS.verifyElementPropertyValue(response, 'address_id', &quot;crm_default_address&quot;)
WS.verifyElementPropertyValue(response, 'city', &quot;Alvaro Obregón&quot;)
WS.verifyElementPropertyValue(response, 'company_name', &quot;TotalPlay SA&quot;)
WS.verifyElementPropertyValue(response, 'country_code', &quot;MX&quot;)
WS.verifyElementPropertyValue(response, 'creation_date', &quot;2023-10-19T13:21:27.000Z&quot;)
WS.verifyElementPropertyValue(response, 'first_name', &quot;Gopikrishna&quot;)
WS.verifyElementPropertyValue(response, 'full_name', &quot;Gopikrishna 26/05/2023 44746&quot;)
WS.verifyElementPropertyValue(response, 'last_modified', &quot;2024-02-19T03:28:18.663Z&quot;)
WS.verifyElementPropertyValue(response, 'last_name', &quot;44746&quot;)
WS.verifyElementPropertyValue(response, 'phone', &quot;5638003099&quot;)
WS.verifyElementPropertyValue(response, 'postal_code', &quot;99980&quot;)
WS.verifyElementPropertyValue(response, 'preferred', true)
WS.verifyElementPropertyValue(response, 'c_alias', &quot;Totalplay&quot;)
WS.verifyElementPropertyValue(response, 'c_brmId', &quot;0190050006&quot;)
WS.verifyElementPropertyValue(response, 'c_crm_address_id', &quot;a4z3C00000097dhQAA&quot;)
WS.verifyElementPropertyValue(response, 'c_isBilling', &quot;false&quot;)
WS.verifyElementPropertyValue(response, 'c_isContact', &quot;false&quot;)
WS.verifyElementPropertyValue(response, 'c_isShipping', &quot;false&quot;)
WS.verifyElementPropertyValue(response, 'c_latitude', &quot;0&quot;)
WS.verifyElementPropertyValue(response, 'c_longitude', &quot;0&quot;)
WS.verifyElementPropertyValue(response, 'c_state', &quot;DF&quot;)
WS.verifyElementPropertyValue(response, 'c_status', &quot;true&quot;)
WS.verifyElementPropertyValue(response, 'c_streetName', &quot;Av. San Jeronimo&quot;)
WS.verifyElementPropertyValue(response, 'c_longitude', &quot;0&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
