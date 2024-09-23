<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Register Card</name>
   <tag></tag>
   <elementGuidId>dab68241-4db8-4c3a-aa00-e3bd8d55d2f2</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\r\n    \&quot;c_AccountNumber\&quot;: \&quot;0100987105\&quot;,\r\n    \&quot;c_NewCard\&quot;: {\r\n        \&quot;Name\&quot;: \&quot;Roman\&quot;,\r\n        \&quot;LastName\&quot;: \&quot;Roman\&quot;,\r\n        \&quot;SecondLastName\&quot;: \&quot;Romano\&quot;,\r\n        \&quot;CardNumber\&quot;: \&quot;5263540124549482\&quot;,\r\n        \&quot;ExpirationMonth\&quot;: \&quot;08\&quot;,\r\n        \&quot;ExpirationYear\&quot;: \&quot;25\&quot;,\r\n        \&quot;CCTYPE\&quot;: \&quot;3\&quot;\r\n    }\r\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <katalonVersion>9.6.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${URL}/s/TP-SHOP/dw/shop/v23_2/customers/${sla_customerId}/payment_instruments?iptv=true&amp;myst=true</restUrl>
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
      <id>0aab8ed0-1adb-4a7b-b916-f971271806a3</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.sla_customerId</defaultValue>
      <description></description>
      <id>5951b96e-60be-4eba-9224-3ef13b827c65</id>
      <masked>false</masked>
      <name>sla_customerId</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
