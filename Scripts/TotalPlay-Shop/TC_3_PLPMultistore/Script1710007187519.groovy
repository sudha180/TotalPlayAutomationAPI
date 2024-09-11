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

WebUI.callTestCase(findTestCase('TotalPlay-Shop/TC_1_InterfaceLogin'), [:], FailureHandling.STOP_ON_FAILURE)

PLP_MultistoreResponse = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/PLP/PLP Multistore', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID]))

WS.verifyResponseStatusCode(PLP_MultistoreResponse,200)

pageId = 'pageId'
pageTypeId = 'pageTypeId'
pageTitle = 'pageTitle'
components_componentTypeId = 'components[0].componentTypeId'
components_componentType = 'components[0].componentType'

components_storeData_ID = 'components[0].storeData.ID'
components_storeData_name = 'components[0].storeData.name'
components_storeData_logo = 'components[0].storeData.logo'
components_storeData_todayOpenHrs = 'components[0].storeData.todayOpenHrs'
components_storeData_storeType = 'components[0].storeData.storeType'
components_storeData_verticalsAvailable = 'components[0].storeData.verticalsAvailable'
components_storeData_MultistoreEDD = 'components[0].storeData.MultistoreEDD'

components_storeData_link = 'components[0].storeData.link'
components_storeData_open = 'components[0].storeData.open'
components_storeData_linkType = 'components[0].storeData.linkType'
components_storeData_corporateColorCode = 'components[0].storeData.corporateColorCode'
components_storeData_ageShowWarningModel = 'components[0].storeData.ageShowWarningModel'

components_componentTypeId = 'components[1].componentTypeId'
components_componentTypeId = 'components[2].componentTypeId'
components_bannerLayout = 'components[2].bannerLayout'
components_textHeadline = 'components[2].textHeadline'

components_componentAssets_componentTypeId = 'components[2].componentAssets[0].componentTypeId'
components_componentAssets_image = 'components[2].componentAssets[0].image'
components_componentAssets_componentType = 'components[2].componentAssets[0].componentType'
components_componentAssets_bannerDesc = 'components[2].componentAssets[0].bannerDesc'
components_componentAssets_isAgeRestricted = 'components[2].componentAssets[0].isAgeRestricted'
components_componentAssets_link = 'components[2].componentAssets[0].link'
components_componentAssets_bannerName = 'components[2].componentAssets[0].bannerName'
components_componentAssets_linkType = 'components[2].componentAssets[0].linkType'
components_componentAssets_storeLogo = 'components[2].componentAssets[0].storeLogo'
components_componentAssets_corporateColorCode = 'components[2].componentAssets[0].corporateColorCode'
components_componentType = 'components[3].componentType'
components_componentTypeId = 'components[3].componentTypeId'
components_carouselHeading = 'components[3].carouselHeading'
components_heading = 'components[3].heading'
components_componentAssets_componentTypeId = 'components[3].componentAssets[0].componentTypeId'
components_componentAssets_category_name = 'components[3].componentAssets[0].category.name'
components_componentAssets_componentType = 'components[3].componentAssets[0].componentType'
components_componentAssets_category_id = 'components[3].componentAssets[0].category.id'
components_componentAssets_category_image = 'components[3].componentAssets[0].category.image'
components_componentAssets_category_url = 'components[3].componentAssets[0].category.url'
components_componentAssets_category_linkType = 'components[3].componentAssets[0].category.linkType'
components_componentAssets_category_isLeaf = 'components[3].componentAssets[0].category.isLeaf'
components_componentAssets_category_subCategory_name = 'components[3].componentAssets[0].category.subCategory[0].name'
components_componentAssets_category_subCategory_id = 'components[3].componentAssets[0].category.subCategory[0].id'
components_componentAssets_category_subCategory_image = 'components[3].componentAssets[0].category.subCategory[0].image'
components_componentAssets_category_subCategory_url = 'components[3].componentAssets[0].category.subCategory[0].url'
components_componentAssets_category_subCategory_isLeaf = 'components[3].componentAssets[0].category.subCategory[0].isLeaf'
components_componentAssets_promotionMessage = 'components[3].componentAssets[0].promotionMessage'
components_componentTypeId = 'components[4].componentTypeId'
components_componentType = 'components[4].componentType'
components_filterTitle = 'components[4].filterTitle'
components_layout = 'components[4].layout'
components_productSelector_value = 'components[4].productSelector.value'
components_title = 'components[4].title'
components_viewMore = 'components[4].viewMore'
components_products_online = 'components[4].products[0].online'
components_linkType = 'components[4].linkType'
components_products_link = 'components[4].products[0].link'
components_products_linkType = 'components[4].products[0].linkType'
components_products_productId = 'components[4].products[0].productId'
components_products_productName = 'components[4].products[0].productName'
components_products_productType = 'components[4].products[0].productType'
components_products_basePrice_value = 'components[4].products[0].basePrice.value'
components_products_basePrice_formatted = 'components[4].products[0].basePrice.formatted'
components_products_salePrice_value = 'components[4].products[0].salePrice.value'
components_products_image = 'components[4].products[0].image'
components_products_image_url = 'components[4].products[0].image[0].url'
components_products_image_title = 'components[4].products[0].image[0].title'
components_products_promotionName = 'components[4].products[0].promotionName'
components_products_discount_percentage = 'components[4].products[0].discount_percentage'
components_products_isVariant = 'components[4].products[0].isVariant'
components_products_bestOfferPrice = 'components[4].products[0].bestOfferPrice'
components_products = 'components[4].products[1]'
components_products_colorSwatches = 'components[4].products[0].colorSwatches'

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentTypeId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, pageTitle)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, pageTitle)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, pageTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, pageTypeId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, pageId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, pageId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_storeData_MultistoreEDD)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_storeData_MultistoreEDD)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_storeData_verticalsAvailable)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_storeData_verticalsAvailable)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_storeData_storeType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_storeData_storeType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_storeData_ID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_storeData_ID)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_storeData_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_storeData_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_storeData_logo)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_storeData_logo)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_storeData_todayOpenHrs)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_storeData_todayOpenHrs)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_storeData_verticalsAvailable)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_storeData_verticalsAvailable)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_storeData_storeType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_storeData_storeType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_storeData_MultistoreEDD)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_storeData_MultistoreEDD)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PLP_MultistoreResponse, components_storeData_open)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_storeData_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_storeData_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_storeData_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_storeData_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_storeData_corporateColorCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_storeData_corporateColorCode)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PLP_MultistoreResponse, components_storeData_ageShowWarningModel)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentTypeId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_textHeadline)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_textHeadline)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_bannerLayout)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_bannerLayout)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_componentTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_componentTypeId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_image)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_image)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_componentType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_componentType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_bannerDesc)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_bannerDesc)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PLP_MultistoreResponse, components_componentAssets_isAgeRestricted)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_bannerName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_bannerName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_linkType)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_storeLogo)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_storeLogo)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_corporateColorCode)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_corporateColorCode)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentTypeId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_carouselHeading)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_carouselHeading)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_heading)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_heading)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_componentTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_componentTypeId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_category_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_category_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_category_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_category_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_componentType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_componentType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_category_image)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_category_image)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_category_url)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_category_url)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_category_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_category_linkType)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PLP_MultistoreResponse, components_componentAssets_category_isLeaf)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_category_subCategory_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_category_subCategory_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_category_subCategory_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_category_subCategory_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_category_subCategory_image)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_category_subCategory_image)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PLP_MultistoreResponse, components_componentAssets_category_subCategory_isLeaf)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_category_subCategory_url)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_category_subCategory_url)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentAssets_promotionMessage)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentAssets_promotionMessage)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentTypeId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_componentType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_componentType)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_filterTitle)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_filterTitle)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_layout)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_layout)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_productSelector_value)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_productSelector_value)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_viewMore)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_viewMore)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_title)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_title)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_products_online)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_products_online)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_linkType)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_linkType)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_products_linkType)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_products_linkType)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_products_link)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_products_link)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_products_productId)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_products_productId)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_products_productName)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_products_productName)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_products_productType)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_products_productType)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_products_basePrice_value)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_products_basePrice_value)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_products_salePrice_value)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_products_salePrice_value)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_products_basePrice_formatted)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_products_basePrice_formatted)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_products_image)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_products_image)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_products_image_url)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_products_image_url)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_products_image_title)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_products_image_title)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_products_promotionName)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_products_promotionName)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_products_discount_percentage)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_products_discount_percentage)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_products_isVariant)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_products_isVariant)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_products_bestOfferPrice)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_products_bestOfferPrice)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_products)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_products)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_MultistoreResponse, components_products_colorSwatches)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_MultistoreResponse, components_products_colorSwatches)