<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>PLP Search</name>
   <tag></tag>
   <elementGuidId>1f57594e-48ef-4b69-a231-d18eeda621c6</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
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
      <webElementGuid>73917f32-efaa-41e2-bb8f-3610a9e4a4d1</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${GlobalVariable.URL}/s/TP-FOOD/dw/shop/v24_5/search_suggestion?q=coca&amp;page=plp&amp;shopId=${GlobalVariable.SellerId1}&amp;count=10</restUrl>
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
      <id>b9580086-3f7c-4a2d-9fd9-48162f55369b</id>
      <masked>false</masked>
      <name>URL</name>
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

WS.verifyElementPropertyValue(response, 'categories[0].id', &quot;SF_burger_king_santa_fe_burger&quot;)
WS.verifyElementPropertyValue(response, 'categories[0].name', &quot;Burger&quot;)
WS.verifyElementPropertyValue(response, 'categories[0].link', &quot;/dw/shop/v24_5/product_search?pcpPage=true&amp;refine_2=cgid=SF_burger_king_santa_fe_burger&amp;count=30&quot;)
WS.verifyElementPropertyValue(response, 'categories[0].linkType', &quot;PCP&quot;)
WS.verifyElementPropertyValue(response, 'categories[0].parentCategoryName', &quot;Burger King Santa Fe&quot;)
WS.verifyElementPropertyValue(response, 'categories[1].id', &quot;SF_americanburgers_hamburguesas_burger&quot;)
WS.verifyElementPropertyValue(response, 'categories[1].name', &quot;Burger&quot;)
WS.verifyElementPropertyValue(response, 'categories[1].link', &quot;/dw/shop/v24_5/product_search?pcpPage=true&amp;refine_2=cgid=SF_americanburgers_hamburguesas_burger&amp;count=30&quot;)
WS.verifyElementPropertyValue(response, 'categories[1].linkType', &quot;PCP&quot;)
WS.verifyElementPropertyValue(response, 'categories[1].parentCategoryName', &quot;Hamburguesas&quot;)
WS.verifyElementPropertyValue(response, 'categories[6].id', &quot;SF_burgerroy_hamburguesas_smash_burger&quot;)
WS.verifyElementPropertyValue(response, 'categories[6].name', &quot;Smash Burger&quot;)
WS.verifyElementPropertyValue(response, 'categories[6].link', &quot;/dw/shop/v24_5/product_search?pcpPage=true&amp;refine_2=cgid=SF_burgerroy_hamburguesas_smash_burger&amp;count=30&quot;)
WS.verifyElementPropertyValue(response, 'categories[6].linkType', &quot;PCP&quot;)
WS.verifyElementPropertyValue(response, 'categories[6].parentCategoryName', &quot;Hamburguesas&quot;)
WS.verifyElementPropertyValue(response, 'categories[7].id', &quot;SF_mizrahimeats_carne_mizrahi_burgers&quot;)
WS.verifyElementPropertyValue(response, 'categories[7].name', &quot;Mizrahi Burgers&quot;)
WS.verifyElementPropertyValue(response, 'categories[7].link', &quot;/dw/shop/v24_5/product_search?pcpPage=true&amp;refine_2=cgid=SF_mizrahimeats_carne_mizrahi_burgers&amp;count=30&quot;)
WS.verifyElementPropertyValue(response, 'categories[7].linkType', &quot;PCP&quot;)
WS.verifyElementPropertyValue(response, 'categories[7].parentCategoryName', &quot;Carne&quot;)
WS.verifyElementPropertyValue(response, 'products[0].online', true)
WS.verifyElementPropertyValue(response, 'products[0].link', &quot;/dw/shop/v23_1/content/seller-pdp?sellerID=2073&amp;c_productid=C2143897798&quot;)
WS.verifyElementPropertyValue(response, 'products[0].linkType', &quot;PDP&quot;)
WS.verifyElementPropertyValue(response, 'products[0].productId', &quot;C2143897798&quot;)
WS.verifyElementPropertyValue(response, 'products[0].productName', &quot;Hamburguesa De Pollo Crujiente Con Queso&quot;)
WS.verifyElementPropertyValue(response, 'products[0].productDesc', &quot;Filete doble de pollo crujiente, lechuga iceberg, cargado con salsa secreta Gochick, bollos de mantequilla, 380 g-400 g, pollo 100 % libre de antibióticos&quot;)
WS.verifyElementPropertyValue(response, 'products[0].productType', &quot;configurable&quot;)
WS.verifyElementPropertyValue(response, 'products[0].basePrice.value', 14)
WS.verifyElementPropertyValue(response, 'products[0].basePrice.currency', &quot;MXN&quot;)
WS.verifyElementPropertyValue(response, 'products[0].basePrice.formatted', &quot;14.00&quot;)
WS.verifyElementPropertyValue(response, 'products[0].basePrice.decimalPrice', &quot;14.00&quot;)
WS.verifyElementPropertyValue(response, 'products[0].salePrice.value', 0)
WS.verifyElementPropertyValue(response, 'products[0].salePrice.currency', &quot;&quot;)
WS.verifyElementPropertyValue(response, 'products[0].salePrice.formatted', &quot;&quot;)
WS.verifyElementPropertyValue(response, 'products[0].salePrice.decimalPrice', &quot;&quot;)
WS.verifyElementPropertyValue(response, 'products[0].image[0].alt', &quot;Hamburguesa De Pollo Crujiente Con Queso&quot;)
WS.verifyElementPropertyValue(response, 'products[0].image[0].url', &quot;https://salesforceqa.sistemastp.com.mx/on/demandware.static/-/Sites-Standard/default/dw2789b9b4/images/large/7d295c89e1fa4e88886229da3476834e.jpg&quot;)
WS.verifyElementPropertyValue(response, 'products[0].image[0].title', &quot;Hamburguesa De Pollo Crujiente Con Queso&quot;)
WS.verifyElementPropertyValue(response, 'products[0].discount_percentage', 0)
WS.verifyElementPropertyValue(response, 'products[0].isVariant', 0)
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
