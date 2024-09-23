<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>submit payment temporary basket TP-credit</name>
   <tag></tag>
   <elementGuidId>8008d247-2493-4bb9-94e5-94998ec371ce</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\n    \&quot;amount\&quot;: ${GlobalVariable.temporary_basket_order_total},\n\n    \&quot;payment_method_id\&quot;: \&quot;TP_CREDIT\&quot;,\n\n    \&quot;c_selected_emi\&quot;: 3,\n\n    \&quot;c_LineaCredito\&quot;: \&quot;7718009774786247057\&quot;,\n\n    \&quot;c_inActive\&quot; : false\n\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>7da2478b-e681-4597-b936-818dec62bf0a</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${GlobalVariable.Authorization}</value>
      <webElementGuid>84c14a68-b38a-4a03-94a9-880a8ce41acd</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.6.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
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
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.URL</defaultValue>
      <description></description>
      <id>03cf8065-847e-46c6-a81b-f4a04ff0627c</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.SITEID</defaultValue>
      <description></description>
      <id>2b65da6c-5e57-4e75-8a6c-4470db1b8796</id>
      <masked>false</masked>
      <name>SITEID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.temporary_basket_id</defaultValue>
      <description></description>
      <id>137ec65f-d0fa-409b-b6ec-7f9aaad2a952</id>
      <masked>false</masked>
      <name>temporary_basket_id</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.temporary_basket_order_total</defaultValue>
      <description></description>
      <id>ff0a8609-3a9f-45ec-ab8c-333a9f2f25f5</id>
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

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
