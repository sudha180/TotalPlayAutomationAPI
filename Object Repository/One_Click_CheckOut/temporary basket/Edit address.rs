<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Edit address</name>
   <tag></tag>
   <elementGuidId>957b5906-23a9-43f2-b888-75a5115aad26</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\r\n    \&quot;c_crm_address_id\&quot;: \&quot;a4z3C00000092KhQAI\&quot;\r\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <katalonVersion>9.6.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>${URL}/s/${SITEID}/dw/shop/v23_1/baskets/${temporary_basket_id}/billing_address?use_as_shipping=true</restUrl>
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
      <id>c7d2162b-3d21-4e28-81ff-e7f6991f312f</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.SITEID</defaultValue>
      <description></description>
      <id>2b501e72-7108-45c6-9af2-7a5db5fa5487</id>
      <masked>false</masked>
      <name>SITEID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.temporary_basket_id</defaultValue>
      <description></description>
      <id>c3ec5e1e-be9f-4612-8aa7-73cca1e0fc6b</id>
      <masked>false</masked>
      <name>temporary_basket_id</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
