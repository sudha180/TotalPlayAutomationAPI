<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Add Address</name>
   <tag></tag>
   <elementGuidId>82f4b74b-8d8c-41ce-a071-80d7aa7ebafa</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\r\n    \&quot;c_appartment\&quot;: \&quot;6-131\&quot;,\r\n    \&quot;c_isBilling\&quot;: false,\r\n    \&quot;c_isContact\&quot;: false,\r\n    \&quot;country_code\&quot;: \&quot;MX\&quot;,\r\n    \&quot;c_district\&quot;: \&quot;benito juarez\&quot;,\r\n    \&quot;full_name\&quot;: \&quot;cesar test\&quot;,\r\n    \&quot;c_latitude\&quot;: \&quot;0\&quot;,\r\n    \&quot;c_longitude\&quot;: \&quot;0\&quot;,\r\n    \&quot;c_regionCode\&quot;: \&quot;MX-CMX\&quot;,\r\n    \&quot;postal_code\&quot;: \&quot;57000\&quot;,\r\n    \&quot;phone\&quot;: \&quot;44789899\&quot;,\r\n    \&quot;c_isShipping\&quot;: true,\r\n    \&quot;address_id\&quot;:123\r\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <katalonVersion>9.6.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${URL}/s/TP-SHOP/dw/shop/v23_2/customers/${sla_customerId}/addresses?iptv=true&amp;myst=true</restUrl>
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
      <id>091af6f9-7d45-43eb-a8c4-dd1512406e5f</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.sla_customerId</defaultValue>
      <description></description>
      <id>e498b97e-e761-475a-acaa-c9cc019014ea</id>
      <masked>false</masked>
      <name>sla_customerId</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
