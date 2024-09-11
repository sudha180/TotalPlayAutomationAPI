<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>NewAddAddresses</name>
   <tag></tag>
   <elementGuidId>47498ed6-a273-4819-b309-ad502101181b</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\r\n    \&quot;address1\&quot;: \&quot;Sample address1\&quot;,\r\n    \&quot;address2\&quot;: \&quot;\&quot;,\r\n    \&quot;city\&quot;: \&quot;Mexico City\&quot;,\r\n    \&quot;country_code\&quot;: \&quot;MX\&quot;,\r\n    \&quot;first_name\&quot;: \&quot;Test\&quot;,\r\n    \&quot;last_name\&quot;: \&quot;Dev\&quot;,\r\n    \&quot;phone\&quot;: \&quot;9123456780\&quot;,\r\n    \&quot;postal_code\&quot;: \&quot;91700\&quot;,\r\n    \&quot;state_code\&quot;: \&quot;MX-CMX\&quot;,\r\n    \&quot;c_comments\&quot;: \&quot;Leave the pack at the door step\&quot;,\r\n    \&quot;c_streetnumber\&quot;:\&quot;2\&quot;,\r\n    \&quot;c_streetname\&quot;:\&quot;Gandhi\&quot;,\r\n    \&quot;c_town\&quot;:\&quot;CDMX\&quot;,\r\n    \&quot;c_appartment\&quot;:14,\r\n    \&quot;c_isBilling\&quot;:true,\r\n    \&quot;c_latitude\&quot;:\&quot;19.80777\&quot;,\r\n    \&quot;c_longitude\&quot;:\&quot;99.80777\&quot;,\r\n    \&quot;c_isShipping\&quot;:true\r\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${shop_auth_token}</value>
      <webElementGuid>ccc5ec86-7f68-44f4-a52e-960595f0eb4a</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://salesforceqa.sistemastp.com.mx/s/TP-FOOD/dw/shop/v23_2/customers/bc6eQ75ajUTDcDT1qRr6MDBCHM/addresses</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.shop_auth_token</defaultValue>
      <description></description>
      <id>a7fa4295-393b-4201-8a01-3b4d212bb342</id>
      <masked>false</masked>
      <name>shop_auth_token</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
