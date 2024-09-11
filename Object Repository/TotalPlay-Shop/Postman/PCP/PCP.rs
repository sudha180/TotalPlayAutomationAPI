<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>PCP</name>
   <tag></tag>
   <elementGuidId>3dff9bb4-1142-468d-adcb-b9870ef9ae7d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJ2ZXIiOiIxLjAiLCJqa3UiOiJzbGFzL3Byb2QvYmpjbF9kZXYiLCJraWQiOiI0NGVmM2ZkMy0xZTQ3LTRkMmEtOGJiNC0xZjFiNDJlZjUxY2QiLCJ0eXAiOiJqd3QiLCJjbHYiOiJKMi4zLjQiLCJhbGciOiJFUzI1NiJ9.eyJhdXQiOiJHVUlEIiwic2NwIjoic2ZjYy5zaG9wcGVyLW15YWNjb3VudC5iYXNrZXRzIHNmY2Muc2hvcHBlci1kaXNjb3Zlcnktc2VhcmNoIHNmY2Muc2hvcHBlci1teWFjY291bnQuYWRkcmVzc2VzIHNmY2Muc2hvcHBlci1wcm9kdWN0cyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnJ3IHNmY2Muc2hvcHBlci1teWFjY291bnQucGF5bWVudGluc3RydW1lbnRzIHNmY2Muc2hvcHBlci1jdXN0b21lcnMubG9naW4gc2ZjYy5zaG9wcGVyLXN0b3JlcyBzZmNjLnNob3BwZXItbXlhY2NvdW50Lm9yZGVycyBzZmNjLnNob3BwZXItYmFza2V0cy1vcmRlcnMgc2ZjYy5zaG9wcGVyLWN1c3RvbWVycy5yZWdpc3RlciBzZmNjLnNob3BwZXItbXlhY2NvdW50LmFkZHJlc3Nlcy5ydyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnByb2R1Y3RsaXN0cy5ydyBzZmNjLnNob3BwZXItcHJvZHVjdGxpc3RzIHNmY2Muc2hvcHBlci1wcm9tb3Rpb25zIHNmY2Muc2hvcHBlci1iYXNrZXRzLW9yZGVycy5ydyBzZmNjLnNob3BwZXItZ2lmdC1jZXJ0aWZpY2F0ZXMgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5wYXltZW50aW5zdHJ1bWVudHMucncgc2ZjYy5zaG9wcGVyLXByb2R1Y3Qtc2VhcmNoIHNmY2Muc2hvcHBlci1teWFjY291bnQucHJvZHVjdGxpc3RzIHNmY2Muc2hvcHBlci1jYXRlZ29yaWVzIHNmY2Muc2hvcHBlci1teWFjY291bnQiLCJzdWIiOiJjYy1zbGFzOjpiamNsX2Rldjo6c2NpZDo1ZDI1ZjVmYS01YTRmLTQ2YjUtYTIxMS04NzU1NDJjODVhYzE6OnVzaWQ6YzIyOWVmOTYtYTM0OS00ZTY2LWEyMzctNzU5ODgzYzk5ZTMxIiwiY3R4Ijoic2xhcyIsImlzcyI6InNsYXMvcHJvZC9iamNsX2RldiIsImlzdCI6MSwiZG50IjoiMCIsImF1ZCI6ImNvbW1lcmNlY2xvdWQvcHJvZC9iamNsX2RldiIsIm5iZiI6MTcwODA1Njc3Mywic3R5IjoiVXNlciIsImlzYiI6InVpZG86ZWNvbTo6dXBuOmdvcGkudmVtdWxhQGtvZ25pdmVyYS5jb206OnVpZG46R29waWtyaXNobmEgNDQ3NDYgMjYvMDUvMjAyMzo6Z2NpZDphYndYZ1dtdXRLbXJ3Undya1ltcVlZeHJ3MDo6cmNpZDphYmNqSGRld2VYcmZ2SnZtSDFGUVBBTml6dDo6Y2hpZDpUUC1TSE9QIiwiZXhwIjoxNzA4MDU4NjAzLCJpYXQiOjE3MDgwNTY4MDMsImp0aSI6IkMyQy0xMzExNTYzNTcwMTc4NzUxMTg1MDI4Mzc1OTQxOTg1MTg0In0.sxBgW0i9ZBknXcW4KTru6WRXXWfIwgWIBQzCN8wQrUVi-onP0EO5BR_dIm0BYzkM_XMX0bR6f9weB1vWsy-haw</value>
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
      <webElementGuid>5b11533b-bb3c-4da2-904a-60301feb867b</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.3.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${GlobalVariable.URL}/s/${GlobalVariable.SITEID}/dw/shop/v23_2/product_search?pcpPage=true&amp;refine_2=orderable_only=true&amp;refine_3=c_miraklShopID=2016</restUrl>
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
      <id>474f6139-cfb5-47c8-ade1-877629a2277f</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.SITEID</defaultValue>
      <description></description>
      <id>badae175-80b3-4826-8ecd-ff322f0e1b14</id>
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
WS.verifyElementPropertyValue(response, 'count', 25)
WS.verifyElementPropertyValue(response, 'hits[0]._type', &quot;product_search_hit&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].hit_type', &quot;product&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].link', &quot;/dw/shop/v23_1/content/seller-pdp?sellerID=2016&amp;c_productid=T1610435907&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].product_id', &quot;T1610435907&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].product_name', &quot;Calentador Rápida Recuperación Enerhit 5 L Gas LP&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].c_linkType', &quot;PDP&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].c_basePrice.value', 4190.0)
WS.verifyElementPropertyValue(response, 'hits[0].c_basePrice.currency', &quot;MXN&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].c_basePrice.formatted', &quot;$4,190.00&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].c_basePrice.decimalPrice', &quot;4190.00&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].c_salePrice.value', 0.0)
WS.verifyElementPropertyValue(response, 'hits[0].c_salePrice.currency', &quot;&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].c_salePrice.formatted', &quot;&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].c_salePrice.decimalPrice', &quot;&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].c_Image[0].alt', &quot;Calentador Rápida Recuperación Enerhit 5 L Gas LP&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].c_Image[0].url', &quot;https://salesforceqa.sistemastp.com.mx/dw/image/v2/BJCL_DEV/on/demandware.static/-/Sites-Standard/default/dwf0250dea/images/large/62c3a4baa769471f8d5d2f01796fefdc.jpg?sw=480&amp;sh=480&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].c_Image[0].title', &quot;Calentador Rápida Recuperación Enerhit 5 L Gas LP&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].c_discount_percentage', 0.0)
WS.verifyElementPropertyValue(response, 'hits[0].c_promoPrice', 0.0)
WS.verifyElementPropertyValue(response, 'hits[0].c_isVariant', false)
WS.verifyElementPropertyValue(response, 'hits[0].c_emi_months', 7.0)
WS.verifyElementPropertyValue(response, 'hits[0].c_emi_installment_amount', &quot;$705.00&quot;)
WS.verifyElementPropertyValue(response, 'hits[0].c_Edd', &quot;2 - 5 días&quot;)
WS.verifyElementPropertyValue(response, 'refinements[0]._type', &quot;product_search_refinement&quot;)
WS.verifyElementPropertyValue(response, 'refinements[0].attribute_id', &quot;brand&quot;)
WS.verifyElementPropertyValue(response, 'refinements[0].label', &quot;Marca&quot;)
WS.verifyElementPropertyValue(response, 'refinements[0].values[0]._type', &quot;product_search_refinement_value&quot;)
WS.verifyElementPropertyValue(response, 'refinements[0].values[0].hit_count', 16)
WS.verifyElementPropertyValue(response, 'refinements[0].values[0].label', &quot;Enerhit&quot;)
WS.verifyElementPropertyValue(response, 'refinements[0].values[0].value', &quot;Enerhit&quot;)
WS.verifyElementPropertyValue(response, 'refinements[1]._type', &quot;product_search_refinement&quot;)
WS.verifyElementPropertyValue(response, 'refinements[1].attribute_id', &quot;c_color&quot;)
WS.verifyElementPropertyValue(response, 'refinements[1].label', &quot;Comprar por Color&quot;)
WS.verifyElementPropertyValue(response, 'refinements[1].values[0].hit_count', 1)
WS.verifyElementPropertyValue(response, 'refinements[1].values[0].label', &quot;Light grey&quot;)
WS.verifyElementPropertyValue(response, 'refinements[1].values[0].value', &quot;Light grey&quot;)
WS.verifyElementPropertyValue(response, 'refinements[2]._type', &quot;product_search_refinement&quot;)
WS.verifyElementPropertyValue(response, 'refinements[2].attribute_id', &quot;c_modelo&quot;)
WS.verifyElementPropertyValue(response, 'refinements[2].label', &quot;Modelo&quot;)
WS.verifyElementPropertyValue(response, 'refinements[3].attribute_id', &quot;c_tipo-de-producto&quot;)
WS.verifyElementPropertyValue(response, 'refinements[3].label', &quot;Tipo de producto&quot;)
WS.verifyElementPropertyValue(response, 'refinements[4].attribute_id', &quot;c_material&quot;)
WS.verifyElementPropertyValue(response, 'refinements[4].label', &quot;Material&quot;)
WS.verifyElementPropertyValue(response, 'refinements[5].attribute_id', &quot;c_Memoria&quot;)
WS.verifyElementPropertyValue(response, 'refinements[5].label', &quot;Memoria&quot;)
WS.verifyElementPropertyValue(response, 'refinements[6].attribute_id', &quot;c_tamano&quot;)
WS.verifyElementPropertyValue(response, 'refinements[6].label', &quot;Tamaño&quot;)
WS.verifyElementPropertyValue(response, 'refinements[7].attribute_id', &quot;c_almacenamiento&quot;)
WS.verifyElementPropertyValue(response, 'refinements[7].label', &quot;Almacenamiento&quot;)
WS.verifyElementPropertyValue(response, 'refinements[8].attribute_id', &quot;c_sabor&quot;)
WS.verifyElementPropertyValue(response, 'refinements[8].label', &quot;Sabor&quot;)
WS.verifyElementPropertyValue(response, 'refinements[9].attribute_id', &quot;c_weight&quot;)
WS.verifyElementPropertyValue(response, 'refinements[9].label', &quot;Peso del producto&quot;)
WS.verifyElementPropertyValue(response, 'refinements[9].values[0].hit_count', 2)
WS.verifyElementPropertyValue(response, 'refinements[9].values[0].label', &quot;14 kg&quot;)
WS.verifyElementPropertyValue(response, 'refinements[9].values[0].value', &quot;14 kg&quot;)
WS.verifyElementPropertyValue(response, 'refinements[10].attribute_id', &quot;c_capacidad&quot;)
WS.verifyElementPropertyValue(response, 'refinements[10].label', &quot;Capacidad&quot;)
WS.verifyElementPropertyValue(response, 'refinements[11].attribute_id', &quot;c_size&quot;)
WS.verifyElementPropertyValue(response, 'refinements[11].label', &quot;Talla&quot;)
WS.verifyElementPropertyValue(response, 'refinements[12].attribute_id', &quot;c_isPopular&quot;)
WS.verifyElementPropertyValue(response, 'refinements[12].label', &quot;isPopular&quot;)
WS.verifyElementPropertyValue(response, 'refinements[12].values[0].hit_count', 1)
WS.verifyElementPropertyValue(response, 'refinements[12].values[0].label', &quot;false&quot;)
WS.verifyElementPropertyValue(response, 'refinements[12].values[0].value', &quot;false&quot;)
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
