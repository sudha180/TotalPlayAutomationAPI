import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
 
WebUI.callTestCase(findTestCase('TotalPlay-Shop/TC_1_InterfaceLogin'), [:], FailureHandling.STOP_ON_FAILURE)
 
PDP_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/PDP/PDP', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID]))
 
WS.verifyResponseStatusCode(PDP_Response, 200)
 
 
pageId = 'pageId'
pageTypeId = 'pageTypeId'
pageTitle = 'pageTitle'
bestOfferPrice = 'components[0].result.bestOfferPrice'
available = 'components[0].result.available'
availability_messages = 'components[0].result.availability.messages'
availableQuantity = 'components[0].result.availability.availableQuantity'
uuid = 'components[0].result.uuid'
id = 'components[0].result.id'
shopIdName = 'components[0].result.shopIdName'
productName = 'components[0].result.productName'
productType = 'components[0].result.productType'
brand = 'components[0].result.brand'
sales_value = 'components[0].result.price.sales.value'
sales_currency = 'components[0].result.price.sales.currency'
sales_formatted = 'components[0].result.price.sales.formatted'
sales_decimalPrice = 'components[0].result.price.sales.decimalPrice'
list_value = 'components[0].result.price.list.value'
list_currency = 'components[0].result.price.list.currency'
list_formatted = 'components[0].result.price.list.formatted'
list_decimalPrice = 'components[0].result.price.list.decimalPrice'
images_alt = 'components[0].result.images.web[0].alt'
images_url = 'components[0].result.images.web[0].url'
images_title = 'components[0].result.images.web[0].title'
selectedQuantity = 'components[0].result.selectedQuantity'
minOrderQuantity = 'components[0].result.minOrderQuantity'
maxOrderQuantity = 'components[0].result.maxOrderQuantity'
variationAttributes = 'components[0].result.variationAttributes'
longDescription = 'components[0].result.longDescription'
shortDescription = 'components[0].result.shortDescription'
rating = 'components[0].result.rating'
promotions = 'components[0].result.promotions'
 
storefrontAttributes_ID = 'components[0].result.attributes[0].ID'
storefrontAttributes_name = 'components[0].result.attributes[0].name'
 
anchodel_label = 'components[0].result.attributes[0].attributes[0].label'
anchodel_value = 'components[0].result.attributes[0].attributes[0].value'
 
alturadel_label = 'components[0].result.attributes[0].attributes[1].label'
alturadel_value = 'components[0].result.attributes[0].attributes[1].value'
 
pesodel_label = 'components[0].result.attributes[0].attributes[2].label'
pesodel_value = 'components[0].result.attributes[0].attributes[2].value'
 
OperatorAttributes_ID = 'components[0].result.attributes[1].ID'
OperatorAttributes_name = 'components[0].result.attributes[1].name'
 
Descripciónlarga_label = 'components[0].result.attributes[1].attributes[0].label'
Descripciónlarga_value = 'components[0].result.attributes[1].attributes[0].value'
 
isPopular_label =  'components[0].result.attributes[1].attributes[1].label'
isPopular_value =  'components[0].result.attributes[1].attributes[1].value'
 
TipodeProducto_label =  'components[0].result.attributes[1].attributes[2].label'
TipodeProducto_value =  'components[0].result.attributes[1].attributes[2].value'
 
especificaciones_label = 'components[0].result.attributes[2].attributes[0].label'
especificaciones_value = 'components[0].result.attributes[2].attributes[0].value'
 
Marca_label = 'components[0].result.attributes[2].attributes[6].label'
Marca_value =  'components[0].result.attributes[2].attributes[6].value'
 
selectedProductUrl = 'components[0].result.selectedProductUrl'
readyToOrder = 'components[0].result.readyToOrder'
online = 'components[0].result.online'
isMarketplaceProduct = 'components[0].result.isMarketplaceProduct'
state = 'components[0].result.state'
promoId = 'components[0].result.promotionName[0].promoId'
promoName = 'components[0].result.promotionName[0].promoName'
shopName = 'components[0].result.shopName'
customProductType = 'components[0].result.customProductType'
shopID = 'components[0].result.shopID'
emi_months = 'components[0].result.emi_months'
emi_installment_amount = 'components[0].result.emi_installment_amount'
isVariant = 'components[0].result.isVariant'
 
 
 
FAQcomponentTypeId = 'components[2].componentTypeId'
FAQcomponentType = 'components[2].componentType'
FAQregionId = 'components[2].regionId'
 
SimilarProducts_componentTypeId = 'components[3].componentTypeId'
SimilarProducts_componentType = 'components[3].componentType'
Similarproducts_regionId = 'components[3].regionId'
SimilarProducts_carouselHeading = 'components[6].carouselHeading'
SimilarProducts_heading = 'components[6].heading'
SimilarProducts_online = 'components[6].carouselData[0].online'
SimilarProducts_link = 'components[6].carouselData[0].link'
SimilarProducts_productId = 'components[6].carouselData[0].productId'
SimilarProducts_productName = 'components[6].carouselData[0].productName'
SimilarProducts_productType = 'components[6].carouselData[0].productType'
SimilarProducts_basePrice_value = 'components[6].carouselData[0].basePrice.value'
SimilarProducts_basePrice_currency = 'components[6].carouselData[0].basePrice.currency'
SimilarProducts_basePrice_formatted = 'components[6].carouselData[0].basePrice.formatted'
SimilarProducts_basePrice_decimalPrice = 'components[6].carouselData[0].basePrice.decimalPrice'
SimilarProducts_salePrice_value = 'components[6].carouselData[0].salePrice.value'
SimilarProducts_salePrice_formatted = 'components[6].carouselData[0].salePrice.formatted'
SimilarProducts_salePrice_decimalPrice =  'components[6].carouselData[0].salePrice.decimalPrice'
SimilarProducts_image_alt =  'components[6].carouselData[0].image[0].alt'
SimilarProducts_image_url = 'components[6].carouselData[0].image[0].url'
SimilarProducts_image_title = 'components[6].carouselData[0].image[0].title'
SimilarProducts_discount_percentage = 'components[6].carouselData[0].discount_percentage'
SimilarProducts_promotionName = 'components[6].carouselData[0].promotionName'
SimilarProducts_promoPrice = 'components[6].carouselData[0].promoPrice'
SimilarProducts_isVariant = 'components[6].carouselData[0].isVariant'
SimilarProducts_colorSwatches = 'components[6].carouselData[0].colorSwatches'
SimilarProducts_emi_installment_amount =  'components[6].carouselData[0].emi_installment_amount'
SimilarProducts_bestOfferPrice = 'components[6].carouselData[0].bestOfferPrice'
 
 
 
CategoryCard_componentTypeId = 'components[6].componentAssets[0].componentTypeId'
CategoryCard_promotionName = 'components[6].componentAssets[0].promotionName'
CategoryCard_category_name = 'components[6].componentAssets[0].category.name'
CategoryCard_category_id = 'components[6].componentAssets[0].category.id'
CategoryCard_category_image = 'components[6].componentAssets[0].category.image'
CategoryCard_category_linkType = 'components[6].componentAssets[0].category.linkType'
CategoryCard_category_isLeaf = 'components[6].componentAssets[0].category.isLeaf'
CategoryCard_subCategory_name = 'components[6].componentAssets[0].category.subCategory[0].name'
CategoryCard_subCategory_id = 'components[6].componentAssets[0].category.subCategory[0].id'
CategoryCard_subCategory_url = 'components[6].componentAssets[0].category.subCategory[0].url'
CategoryCard_subCategory_image = 'components[6].componentAssets[0].category.subCategory[0].image'
CategoryCard_subCategory_isLeaf = 'components[6].componentAssets[0].category.subCategory[0].isLeaf'
CategoryCard_promotionMessage = 'components[6].componentAssets[0].promotionMessage'
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, pageId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, pageId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, pageTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, pageTypeId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, pageTitle)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, pageTitle)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PDP_Response, bestOfferPrice)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, bestOfferPrice)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PDP_Response, available)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, available)
 
 
/*String message = WS.getElementPropertyValue(PDP_Response, availability_messages)
KeywordUtil.logInfo(message)
if(message!=null) {
	KeywordUtil.markPassed("value is present")
}
else {
	KeywordUtil.markFailed("value is not present")
}*/
 
CustomKeywords.'totalplay.Common.verifyValueInObject' (PDP_Response, availability_messages)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, availableQuantity)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, availableQuantity)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, uuid)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, uuid)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, id)
 
 
CustomKeywords.'totalplay.Common.verifyValueInObject' (PDP_Response, shopIdName)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, shopIdName)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, productName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, productName)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, productType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, productType)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, brand)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, brand)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PDP_Response, sales_value)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, sales_value)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, sales_currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, sales_currency)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, sales_formatted)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, sales_formatted)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, sales_decimalPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, sales_decimalPrice)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(PDP_Response, list_value)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, list_value)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, list_currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, list_currency)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, list_formatted)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, list_formatted)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, list_decimalPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, list_decimalPrice)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, images_alt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, images_alt)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, images_url)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, images_url)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, images_title)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, images_title)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(PDP_Response, selectedQuantity)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, selectedQuantity)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(PDP_Response, minOrderQuantity)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, minOrderQuantity)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(PDP_Response, maxOrderQuantity)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, maxOrderQuantity)
 
CustomKeywords.'totalplay.Common.verifyPropertyEmpty'(PDP_Response, variationAttributes)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, variationAttributes)
 
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, longDescription)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, longDescription)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, shortDescription)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, shortDescription)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PDP_Response, rating)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, rating)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, promotions)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, promotions)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, storefrontAttributes_ID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, storefrontAttributes_ID)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, storefrontAttributes_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, storefrontAttributes_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, anchodel_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, anchodel_label)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, anchodel_value)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, anchodel_value)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, alturadel_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, alturadel_label)
 
CustomKeywords.'totalplay.Common.verifyValueInObject'(PDP_Response, alturadel_value)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, alturadel_value)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, pesodel_label)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, pesodel_label)
 
//CustomKeywords.'totalplay.Common.verifyValueInObject'(PDP_Response, pesodel_value)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, pesodel_value)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, OperatorAttributes_ID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, OperatorAttributes_ID)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, OperatorAttributes_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, OperatorAttributes_name)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, Descripciónlarga_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, Descripciónlarga_label)
 
CustomKeywords.'totalplay.Common.verifyValueInObject'(PDP_Response, Descripciónlarga_value)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, Descripciónlarga_value)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, isPopular_label)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, isPopular_label)
// 
//CustomKeywords.'totalplay.Common.verifyValueInObject'(PDP_Response, isPopular_value)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, isPopular_value)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, TipodeProducto_label)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, TipodeProducto_label)
 
//CustomKeywords.'totalplay.Common.verifyValueInObject'(PDP_Response, TipodeProducto_value)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, TipodeProducto_value)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, especificaciones_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, especificaciones_label)
 
//WS.getElementPropertyValue(PDP_Response, SimilarProducts_image_url)
CustomKeywords.'totalplay.Common.verifyValueInObject'(PDP_Response, especificaciones_value)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, especificaciones_value)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, Marca_label)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, Marca_label)
//
//CustomKeywords.'totalplay.Common.verifyValueInObject'(PDP_Response, Marca_value)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, Marca_value)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, selectedProductUrl)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, selectedProductUrl)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PDP_Response, readyToOrder)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, readyToOrder)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PDP_Response, online)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, online)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PDP_Response, isMarketplaceProduct)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, isMarketplaceProduct)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, state)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, promoId)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, promoId)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, promoName)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, promoName)
 
CustomKeywords.'totalplay.Common.verifyValueInObject'(PDP_Response, shopName)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, shopName)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, customProductType)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, customProductType)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, shopID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, shopID)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(PDP_Response, emi_months)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, emi_months)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, emi_installment_amount)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, emi_installment_amount)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PDP_Response, isVariant)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, isVariant)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, FAQcomponentTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, FAQcomponentTypeId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, FAQcomponentType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, FAQcomponentType)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, FAQregionId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, FAQregionId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, SimilarProducts_componentTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_componentTypeId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, SimilarProducts_componentType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_componentType)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, Similarproducts_regionId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, Similarproducts_regionId)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, SimilarProducts_carouselHeading)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_carouselHeading)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, SimilarProducts_heading)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_heading)
// 
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PDP_Response, SimilarProducts_online)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_online)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, SimilarProducts_link)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_link)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, SimilarProducts_productId)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_productId)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, SimilarProducts_productName)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_productName)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, SimilarProducts_productType)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_productType)
// 
//CustomKeywords.'totalplay.Common.getNumValueofObject'(PDP_Response, SimilarProducts_basePrice_value)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_basePrice_value)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, SimilarProducts_basePrice_currency)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_basePrice_currency)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, SimilarProducts_basePrice_formatted)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_basePrice_formatted)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, SimilarProducts_basePrice_decimalPrice)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_basePrice_decimalPrice)
// 
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PDP_Response, SimilarProducts_salePrice_value)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_salePrice_value)
// 
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PDP_Response, SimilarProducts_salePrice_formatted)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_salePrice_formatted)
// 
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PDP_Response, SimilarProducts_salePrice_decimalPrice)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_salePrice_decimalPrice)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, SimilarProducts_image_alt)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_image_alt)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, SimilarProducts_image_url)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_image_url)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, SimilarProducts_image_title)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_image_title)
// 
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PDP_Response, SimilarProducts_discount_percentage)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_discount_percentage)
// 
//CustomKeywords.'totalplay.Common.verifyValueInObject'(PDP_Response, SimilarProducts_promotionName)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_promotionName)
// 
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PDP_Response, SimilarProducts_promoPrice)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_promoPrice)
// 
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PDP_Response, SimilarProducts_isVariant)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_isVariant)
// 
//CustomKeywords.'totalplay.Common.verifyValueInObject'(PDP_Response, SimilarProducts_colorSwatches)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_colorSwatches)
////
////CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, SimilarProducts_emi_installment_amount)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_emi_installment_amount)
// 
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PDP_Response, SimilarProducts_bestOfferPrice)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, SimilarProducts_bestOfferPrice)
//// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, CategoryCard_componentTypeId)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, CategoryCard_componentTypeId)
// 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, CategoryCard_promotionName)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, CategoryCard_promotionName)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, CategoryCard_category_name)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, CategoryCard_category_name)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, CategoryCard_category_id)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, CategoryCard_category_id)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, CategoryCard_category_image)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, CategoryCard_category_image)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, CategoryCard_category_linkType)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, CategoryCard_category_linkType)
 
//CustomKeywords.'totalplay.Common.getBooleanValueofObject' (PDP_Response, CategoryCard_category_isLeaf)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, CategoryCard_category_isLeaf)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, CategoryCard_subCategory_name)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, CategoryCard_subCategory_name)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, CategoryCard_subCategory_id)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, CategoryCard_subCategory_id)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, CategoryCard_subCategory_url)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, CategoryCard_subCategory_url)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, CategoryCard_subCategory_image)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, CategoryCard_subCategory_image)
//
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PDP_Response, CategoryCard_subCategory_isLeaf)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, CategoryCard_subCategory_isLeaf)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PDP_Response, CategoryCard_promotionMessage)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PDP_Response, CategoryCard_promotionMessage)
 
 