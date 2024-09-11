<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Interface Login (SLAS)</name>
   <tag></tag>
   <elementGuidId>7cb6b158-ab7b-47ac-95ad-2c9ecd1e7700</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;contentType&quot;: &quot;multipart/form-data&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;,
  &quot;parameters&quot;: [
    {
      &quot;name&quot;: &quot;type&quot;,
      &quot;value&quot;: &quot;credentials&quot;,
      &quot;type&quot;: &quot;Text&quot;,
      &quot;contentType&quot;: &quot;&quot;
    },
    {
      &quot;name&quot;: &quot;brm_id&quot;,
      &quot;value&quot;: &quot;0190063890&quot;,
      &quot;type&quot;: &quot;Text&quot;,
      &quot;contentType&quot;: &quot;&quot;
    }
  ]
}</httpBodyContent>
   <httpBodyType>form-data</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>multipart/form-data</value>
      <webElementGuid>c6958734-07d5-48bc-ba0c-8a6af29620b2</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.3.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${GlobalVariable.URL}/on/demandware.store/Sites-${GlobalVariable.SITEID}-Site/es/SLASUtils-InterfaceLogin</restUrl>
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
      <id>1e01e6e4-7fcf-464e-a7da-1738bf6ac699</id>
      <masked>false</masked>
      <name>variable</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.SITEID</defaultValue>
      <description></description>
      <id>4885822f-6bc1-46c2-ba28-19121739c5df</id>
      <masked>false</masked>
      <name>variable_0</name>
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
WS.verifyElementPropertyValue(response, 'action', '')
WS.verifyElementPropertyValue(response, 'ocapiResponse.access_token', '')
WS.verifyElementPropertyValue(response, 'proxiedApi', '')
WS.verifyElementPropertyValue(response, 'ocapiResponse', '')
WS.verifyElementPropertyValue(response, 'ocapiResponse', '')
WS.verifyElementPropertyValue(response, 'ocapiResponse.refresh_token', '')
WS.verifyElementPropertyValue(response, 'ocapiResponse.customer_email', '')
WS.verifyElementPropertyValue(response, 'ocapiResponse.customer_name', '')
WS.verifyElementPropertyValue(response, 'ocapiResponse.c_brmId', '')
WS.verifyElementPropertyValue(response, 'ocapiResponse.access_token', '')
WS.verifyElementPropertyValue(response, 'ocapiResponse.c_brmId', '')
WS.verifyElementPropertyValue(response, 'ocapiResponse.c_basketId', '')
WS.verifyElementPropertyValue(response, '', '')</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
