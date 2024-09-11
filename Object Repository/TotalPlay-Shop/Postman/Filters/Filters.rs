<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Filters</name>
   <tag></tag>
   <elementGuidId>9eceddf5-2700-4cee-8f76-9c23f0bfe29b</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJ2ZXIiOiIxLjAiLCJqa3UiOiJzbGFzL3Byb2QvYmpjbF9kZXYiLCJraWQiOiI0NGVmM2ZkMy0xZTQ3LTRkMmEtOGJiNC0xZjFiNDJlZjUxY2QiLCJ0eXAiOiJqd3QiLCJjbHYiOiJKMi4zLjQiLCJhbGciOiJFUzI1NiJ9.eyJhdXQiOiJHVUlEIiwic2NwIjoic2ZjYy5zaG9wcGVyLW15YWNjb3VudC5iYXNrZXRzIHNmY2Muc2hvcHBlci1kaXNjb3Zlcnktc2VhcmNoIHNmY2Muc2hvcHBlci1teWFjY291bnQuYWRkcmVzc2VzIHNmY2Muc2hvcHBlci1wcm9kdWN0cyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnJ3IHNmY2Muc2hvcHBlci1teWFjY291bnQucGF5bWVudGluc3RydW1lbnRzIHNmY2Muc2hvcHBlci1jdXN0b21lcnMubG9naW4gc2ZjYy5zaG9wcGVyLXN0b3JlcyBzZmNjLnNob3BwZXItbXlhY2NvdW50Lm9yZGVycyBzZmNjLnNob3BwZXItYmFza2V0cy1vcmRlcnMgc2ZjYy5zaG9wcGVyLWN1c3RvbWVycy5yZWdpc3RlciBzZmNjLnNob3BwZXItbXlhY2NvdW50LmFkZHJlc3Nlcy5ydyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnByb2R1Y3RsaXN0cy5ydyBzZmNjLnNob3BwZXItcHJvZHVjdGxpc3RzIHNmY2Muc2hvcHBlci1wcm9tb3Rpb25zIHNmY2Muc2hvcHBlci1iYXNrZXRzLW9yZGVycy5ydyBzZmNjLnNob3BwZXItZ2lmdC1jZXJ0aWZpY2F0ZXMgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5wYXltZW50aW5zdHJ1bWVudHMucncgc2ZjYy5zaG9wcGVyLXByb2R1Y3Qtc2VhcmNoIHNmY2Muc2hvcHBlci1teWFjY291bnQucHJvZHVjdGxpc3RzIHNmY2Muc2hvcHBlci1jYXRlZ29yaWVzIHNmY2Muc2hvcHBlci1teWFjY291bnQiLCJzdWIiOiJjYy1zbGFzOjpiamNsX2Rldjo6c2NpZDo1ZDI1ZjVmYS01YTRmLTQ2YjUtYTIxMS04NzU1NDJjODVhYzE6OnVzaWQ6MGFhYzY5YWEtMDA3ZS00NTZiLWE3ZjEtNDM4ZDU2NzgyZTRlIiwiY3R4Ijoic2xhcyIsImlzcyI6InNsYXMvcHJvZC9iamNsX2RldiIsImlzdCI6MSwiZG50IjoiMCIsImF1ZCI6ImNvbW1lcmNlY2xvdWQvcHJvZC9iamNsX2RldiIsIm5iZiI6MTcwODQxNTczNCwic3R5IjoiVXNlciIsImlzYiI6InVpZG86ZWNvbTo6dXBuOmdvcGkudmVtdWxhQGtvZ25pdmVyYS5jb206OnVpZG46R29waWtyaXNobmEgNDQ3NDYgMjYvMDUvMjAyMzo6Z2NpZDpiY2tlZEZ3WHczd3VjUmtiYTF4cVlZbHJ4Rzo6cmNpZDphYmNqSGRld2VYcmZ2SnZtSDFGUVBBTml6dDo6Y2hpZDpUUC1TSE9QIiwiZXhwIjoxNzA4NDE3NTY0LCJpYXQiOjE3MDg0MTU3NjQsImp0aSI6IkMyQy0xMzExNTYzNTcwMTc4NzUxMTg1MDk1NTk3NzUzOTcwNjEzNTIifQ.kHPSrqIwFcrr7qlshOcOoIAtwinzuKTxRBfiqb2aUfAs1wiIGFsqe5TZx8t6rg5Cgfc7G_tBwLCve-tj2OTtcg</value>
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
      <webElementGuid>47e81ec6-d72e-4c65-81b8-f9e9bf35fdc7</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.3.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${GlobalVariable.URL}/s/${GlobalVariable.SITEID}/dw/shop/v23_2/product_search?sort=product-name-ascending&amp;refine_1=c_miraklShopID=2016</restUrl>
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
      <id>c93d0a43-12f7-468e-b356-3761afad8bc3</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.SITEID</defaultValue>
      <description></description>
      <id>3e2f574b-dff0-4445-a380-141a15ff0ec3</id>
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
WS.verifyElementPropertyValue(response, '_type', &quot;product_search_result&quot;)
WS.verifyElementPropertyValue(response, 'count', 25)
WS.verifyElementPropertyValue(response, 'hits[0]._type', &quot;product_search_hit&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].hit_type', &quot;product&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].link', &quot;https://salesforceqa.sistemastp.com.mx/s/TP-SHOP/dw/shop/v23_2/products/T380270398?sort=product-name-ascending&amp;refine_1=c_miraklShopID%3D2016&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].product_id', &quot;T380270398&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].product_name', &quot;Aire Acondicionado IUSA 1.5 Toneladas 220V Frío/Calor Ahorro de Energía&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].product_type._type', &quot;product_type&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].product_type.item', true)
WS.verifyElementPropertyValue(response, 'hits[0].represented_product._type', &quot;product_ref&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].represented_product.id', &quot;T380270398&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].represented_product.link', &quot;https://salesforceqa.sistemastp.com.mx/s/TP-SHOP/dw/shop/v23_2/products/T380270398?sort=product-name-ascending&amp;refine_1=c_miraklShopID%3D2016&quot;)
WS.verifyElementPropertyValue(response, 'refinements[0]._type', &quot;product_search_refinement&quot;)
WS.verifyElementPropertyValue(response, 'refinements[0].attribute_id', &quot;brand&quot;)
WS.verifyElementPropertyValue(response, 'refinements[0].label', &quot;Marca&quot;)
WS.verifyElementPropertyValue(response, 'refinements[0].values[0]._type', &quot;product_search_refinement_value&quot;)
WS.verifyElementPropertyValue(response, 'refinements[0].values[0].hit_count', 16)
WS.verifyElementPropertyValue(response, 'refinements[0].values[0].label', &quot;Enerhit&quot;)
WS.verifyElementPropertyValue(response, 'refinements[0].values[0].value', &quot;Enerhit&quot;)
WS.verifyElementPropertyValue(response, 'refinements[1].attribute_id', &quot;c_color&quot;)
WS.verifyElementPropertyValue(response, 'refinements[1].label', &quot;Comprar por Color&quot;)
WS.verifyElementPropertyValue(response, 'refinements[1].values[0]._type', &quot;product_search_refinement_value&quot;)
WS.verifyElementPropertyValue(response, 'refinements[1].values[0].hit_count', 1)
WS.verifyElementPropertyValue(response, 'refinements[1].values[0].label', &quot;Light grey&quot;)
WS.verifyElementPropertyValue(response, 'refinements[1].values[0].value', &quot;Light grey&quot;)
WS.verifyElementPropertyValue(response, 'refinements[2].attribute_id', &quot;c_miraklShopName&quot;)
WS.verifyElementPropertyValue(response, 'refinements[2].label', &quot;Comprar por Proveedor&quot;)
WS.verifyElementPropertyValue(response, 'refinements[2].values[0]._type', &quot;product_search_refinement_value&quot;)
WS.verifyElementPropertyValue(response, 'refinements[2].values[0].hit_count', 1)
WS.verifyElementPropertyValue(response, 'refinements[2].values[0].label', &quot;3B Ecatepec&quot;)
WS.verifyElementPropertyValue(response, 'refinements[2].values[0].value', &quot;3B Ecatepec&quot;)
WS.verifyElementPropertyValue(response, 'refinements[3].attribute_id', &quot;c_verticalType&quot;)
WS.verifyElementPropertyValue(response, 'refinements[3].label', &quot;Vertical Type&quot;)
WS.verifyElementPropertyValue(response, 'refinements[3].values[0]._type', &quot;product_search_refinement_value&quot;)
WS.verifyElementPropertyValue(response, 'refinements[3].values[0].hit_count', 51)
WS.verifyElementPropertyValue(response, 'refinements[3].values[0].label', &quot;MultiStore&quot;)
WS.verifyElementPropertyValue(response, 'refinements[3].values[0].value', &quot;MultiStore&quot;)
WS.verifyElementPropertyValue(response, 'refinements[4].attribute_id', &quot;c_tpshop&quot;)
WS.verifyElementPropertyValue(response, 'refinements[4].label', &quot;TPSHOP&quot;)
WS.verifyElementPropertyValue(response, 'refinements[4].values[0]._type', &quot;product_search_refinement_value&quot;)
WS.verifyElementPropertyValue(response, 'refinements[4].values[0].hit_count', 50)
WS.verifyElementPropertyValue(response, 'refinements[4].values[0].label', &quot;false&quot;)
WS.verifyElementPropertyValue(response, 'refinements[4].values[0].value', &quot;false&quot;)
WS.verifyElementPropertyValue(response, 'refinements[5].attribute_id', &quot;price&quot;)
WS.verifyElementPropertyValue(response, 'refinements[5].label', &quot;Comprar por Precio&quot;)
WS.verifyElementPropertyValue(response, 'refinements[5].values[0]._type', &quot;product_search_refinement_value&quot;)
WS.verifyElementPropertyValue(response, 'refinements[5].values[0].hit_count', 35)
WS.verifyElementPropertyValue(response, 'refinements[5].values[0].label', &quot;$0-$5,000&quot;)
WS.verifyElementPropertyValue(response, 'refinements[5].values[0].value', &quot;(0..5000)&quot;)
WS.verifyElementPropertyValue(response, 'refinements[6].attribute_id', &quot;cgid&quot;)
WS.verifyElementPropertyValue(response, 'refinements[6].label', &quot;Categoría&quot;)
WS.verifyElementPropertyValue(response, 'refinements[6].values[0]._type', &quot;product_search_refinement_value&quot;)
WS.verifyElementPropertyValue(response, 'refinements[6].values[0].hit_count', 2)
WS.verifyElementPropertyValue(response, 'refinements[6].values[0].label', &quot;General&quot;)
WS.verifyElementPropertyValue(response, 'refinements[6].values[0].value', &quot;SF_general&quot;)
WS.verifyElementPropertyValue(response, 'refinements[7].attribute_id', &quot;c_miraklShopID&quot;)
WS.verifyElementPropertyValue(response, 'refinements[7].label', &quot;ID de tienda&quot;)
WS.verifyElementPropertyValue(response, 'refinements[7].values[0]._type', &quot;product_search_refinement_value&quot;)
WS.verifyElementPropertyValue(response, 'refinements[7].values[0].hit_count', 117)
WS.verifyElementPropertyValue(response, 'refinements[7].values[0].label', &quot;2000&quot;)
WS.verifyElementPropertyValue(response, 'refinements[7].values[0].value', &quot;2000&quot;)
WS.verifyElementPropertyValue(response, 'refinements[8].attribute_id', &quot;c_modelo&quot;)
WS.verifyElementPropertyValue(response, 'refinements[8].label', &quot;Modelo&quot;)
WS.verifyElementPropertyValue(response, 'refinements[9].attribute_id', &quot;c_tipo-de-producto&quot;)
WS.verifyElementPropertyValue(response, 'refinements[9].label', &quot;Tipo de producto&quot;)
WS.verifyElementPropertyValue(response, 'refinements[10].attribute_id', &quot;c_material&quot;)
WS.verifyElementPropertyValue(response, 'refinements[10].label', &quot;Material&quot;)
WS.verifyElementPropertyValue(response, 'refinements[11].attribute_id', &quot;c_Memoria&quot;)
WS.verifyElementPropertyValue(response, 'refinements[11].label', &quot;Memoria&quot;)
WS.verifyElementPropertyValue(response, 'refinements[12].attribute_id', &quot;c_tamano&quot;)
WS.verifyElementPropertyValue(response, 'refinements[12].label', &quot;Tamaño&quot;)
WS.verifyElementPropertyValue(response, 'refinements[13].attribute_id', &quot;c_almacenamiento&quot;)
WS.verifyElementPropertyValue(response, 'refinements[13].label', &quot;Almacenamiento&quot;)
WS.verifyElementPropertyValue(response, 'refinements[14].attribute_id', &quot;c_sabor&quot;)
WS.verifyElementPropertyValue(response, 'refinements[14].label', &quot;Sabor&quot;)
WS.verifyElementPropertyValue(response, 'refinements[15].attribute_id', &quot;c_weight&quot;)
WS.verifyElementPropertyValue(response, 'refinements[15].label', &quot;Peso del producto&quot;)
WS.verifyElementPropertyValue(response, 'refinements[15].values[0]._type', &quot;product_search_refinement_value&quot;)
WS.verifyElementPropertyValue(response, 'refinements[15].values[0].hit_count', 2)
WS.verifyElementPropertyValue(response, 'refinements[15].values[0].label', &quot;14 kg&quot;)
WS.verifyElementPropertyValue(response, 'refinements[15].values[0].value', &quot;14 kg&quot;)
WS.verifyElementPropertyValue(response, 'refinements[16].attribute_id', &quot;c_capacidad&quot;)
WS.verifyElementPropertyValue(response, 'refinements[16].label', &quot;Capacidad&quot;)
WS.verifyElementPropertyValue(response, 'refinements[17].attribute_id', &quot;c_size&quot;)
WS.verifyElementPropertyValue(response, 'refinements[17].label', &quot;Talla&quot;)
WS.verifyElementPropertyValue(response, 'refinements[18].attribute_id', &quot;c_isPopular&quot;)
WS.verifyElementPropertyValue(response, 'refinements[18].label', &quot;isPopular&quot;)
WS.verifyElementPropertyValue(response, 'refinements[18].values[0]._type', &quot;product_search_refinement_value&quot;)
WS.verifyElementPropertyValue(response, 'refinements[18].values[0].hit_count', 1)
WS.verifyElementPropertyValue(response, 'refinements[18].values[0].label', &quot;false&quot;)
WS.verifyElementPropertyValue(response, 'refinements[18].values[0].value', &quot;false&quot;)
WS.verifyElementPropertyValue(response, 'refinements[19].attribute_id', &quot;c_corporateName&quot;)
WS.verifyElementPropertyValue(response, 'refinements[19].label', &quot;corporate Name&quot;)
WS.verifyElementPropertyValue(response, 'refinements[19].values[0]._type', &quot;product_search_refinement_value&quot;)
WS.verifyElementPropertyValue(response, 'refinements[19].values[0].hit_count', 1)
WS.verifyElementPropertyValue(response, 'refinements[19].values[0].label', &quot;3B_Ecatepec&quot;)
WS.verifyElementPropertyValue(response, 'refinements[19].values[0].value', &quot;3B_Ecatepec&quot;)
WS.verifyElementPropertyValue(response, 'selected_sorting_option', &quot;product-name-ascending&quot;)
WS.verifyElementPropertyValue(response, 'sorting_options[0]._type', &quot;product_search_sorting_option&quot;)
WS.verifyElementPropertyValue(response, 'sorting_options[0].id', &quot;best-matches&quot;)
WS.verifyElementPropertyValue(response, 'sorting_options[0].label', &quot;Best Matches&quot;)
WS.verifyElementPropertyValue(response, 'sorting_options[1].id', &quot;price-low-to-high&quot;)
WS.verifyElementPropertyValue(response, 'sorting_options[1].label', &quot;Price Low To High&quot;)
WS.verifyElementPropertyValue(response, 'sorting_options[2].id', &quot;price-high-to-low&quot;)
WS.verifyElementPropertyValue(response, 'sorting_options[2].label', &quot;Price High to Low&quot;)
WS.verifyElementPropertyValue(response, 'sorting_options[3].id', &quot;product-name-ascending&quot;)
WS.verifyElementPropertyValue(response, 'sorting_options[3].label', &quot;Product Name A - Z&quot;)
WS.verifyElementPropertyValue(response, 'sorting_options[4].id', &quot;product-name-descending&quot;)
WS.verifyElementPropertyValue(response, 'sorting_options[4].label', &quot;Product Name Z - A&quot;)
WS.verifyElementPropertyValue(response, 'sorting_options[5].id', &quot;brand&quot;)
WS.verifyElementPropertyValue(response, 'sorting_options[5].label', &quot;Brand&quot;)
WS.verifyElementPropertyValue(response, 'sorting_options[6].id', &quot;most-popular&quot;)
WS.verifyElementPropertyValue(response, 'sorting_options[6].label', &quot;Most Popular&quot;)
WS.verifyElementPropertyValue(response, 'sorting_options[7].id', &quot;top-sellers&quot;)
WS.verifyElementPropertyValue(response, 'sorting_options[7].label', &quot;Top Sellers&quot;)
WS.verifyElementPropertyValue(response, 'total', 51)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
