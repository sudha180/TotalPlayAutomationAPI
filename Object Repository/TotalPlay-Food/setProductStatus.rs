<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>setProductStatus</name>
   <tag></tag>
   <elementGuidId>e540aa0b-6d78-4006-8f19-9f6eaf9e1bbe</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\r\n  \&quot;authVendorInfo\&quot;: {\r\n    \&quot;idVendor\&quot;: \&quot;5155\&quot;,\r\n    \&quot;password\&quot;: \&quot;1234\&quot;,\r\n    \&quot;user\&quot;: \&quot;starbucks_pedregal\&quot;\r\n  },\r\n  \&quot;idProduct\&quot;: \&quot;C759784328\&quot;,\r\n  \&quot;reason\&quot;: \&quot;STOCK_AVAIL_TODAY\&quot;,\r\n  \&quot;status\&quot;: \&quot;unapproved\&quot;\r\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${URL}/on/demandware.store/Sites-TP-FOOD-Site/default/Product-Update</restUrl>
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
      <id>25c1300c-1dfd-4858-99cb-23d94ee3d43a</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
