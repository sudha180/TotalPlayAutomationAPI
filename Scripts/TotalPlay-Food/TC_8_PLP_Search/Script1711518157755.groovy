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

WebUI.callTestCase(findTestCase('TotalPlay-Food/TC_1_Login_Service'), [:], FailureHandling.STOP_ON_FAILURE)

PLPSearch = WS.sendRequest(findTestObject('TotalPlay-Food/PLP Search', [('URL') : GlobalVariable.URL]))
CustomKeywords.'totalplay.Common.printResponseinText'(PLPSearch)

WS.verifyResponseStatusCode(PLPSearch, 200)

/*
categories	=	'categories'
categories_id	=	'categories[0].id'
categories_name	=	'categories[0].name'
categories_link	=	'categories[0].link'
categories_linkType	=	'categories[0].linkType'
categories0_parentCategoryName	=	'categories[0].parentCategoryName'
categories9_parentCategoryName	=	'categories[9].parentCategoryName'
products	=	'products'
products_online	=	'products[0].online'
products_link	=	'products[0].link'
products_linkType	=	'products[0].linkType'
products_productId	=	'products[0].productId'
products_productDesc	=	'products[0].productDesc'
products_productName	=	'products[0].productName'
products_productType	=	'products[0].productType'
products_basePrice	=	'products[0].basePrice'
products_basePrice_value	=	'products[0].basePrice.value'
products_basePrice_currency	=	'products[0].basePrice.currency'
products_basePrice_formatted	=	'products[0].basePrice.formatted'
products_salePrice	=	'products[0].salePrice'
products_basePrice_decimalPrice	=	'products[0].basePrice.decimalPrice'
products_salePrice_value	=	'products[0].salePrice.value'
products_salePrice_currency	=	'products[0].salePrice.currency'
products_salePrice_formatted	=	'products[0].salePrice.formatted'
products_image	=	'products[0].image'
products_salePrice_decimalPrice	=	'products[0].salePrice.decimalPrice'
products_image_alt	=	'products[0].image[0].alt'
products_image_url	=	'products[0].image[0].url'
products_image_title	=	'products[0].image[0].title'
products_discount_percentage	=	'products[0].discount_percentage'
products_promotionName	=	'products[0].promotionName'
products_isVariant	=	'products[0].isVariant'
products_colorSwatches	=	'products[0].colorSwatches'
products_emi_months	=	'products[0].emi_months'
products_bestOfferPrice	=	'products[0].bestOfferPrice'
productSuggestions_phrase	=	'productSuggestions[0].phrase'


CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, categories)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, categories_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, categories_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, categories_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, categories_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, categories_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, categories_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, categories_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, categories_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, categories0_parentCategoryName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, categories0_parentCategoryName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, categories9_parentCategoryName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, categories9_parentCategoryName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PLPSearch, products_online)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_productId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_productId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_productDesc)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_productDesc)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_productName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_productName)

CustomKeywords.'totalplay.Common.verifyPropertyValueEmpty'(PLPSearch, products_productType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_basePrice)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PLPSearch, products_basePrice_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_basePrice_currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_basePrice_currency)
*/
/*
 * println(products_basePrice_formatted)
 * CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch,
 * products_basePrice_formatted)
 */
/*
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_salePrice)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_basePrice_decimalPrice)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PLPSearch, products_salePrice_value)

CustomKeywords.'totalplay.Common.verifyPropertyValueEmpty'(PLPSearch, products_salePrice_currency)

CustomKeywords.'totalplay.Common.verifyPropertyValueEmpty'(PLPSearch, products_salePrice_formatted)

CustomKeywords.'totalplay.Common.verifyPropertyValueEmpty'(PLPSearch, products_salePrice_decimalPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_image)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_image_alt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_image_alt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_image_url)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_image_url)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_image_title)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_image_title)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PLPSearch, products_discount_percentage)

CustomKeywords.'totalplay.Common.verifyPropertyEmpty'(PLPSearch, products_promotionName)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PLPSearch, products_isVariant)

CustomKeywords.'totalplay.Common.verifyPropertyEmpty'(PLPSearch, products_colorSwatches)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PLPSearch, products_emi_months)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PLPSearch, products_bestOfferPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, productSuggestions_phrase)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, productSuggestions_phrase)
*/
categories_0_id = 'categories[0].id'

categories_0_name = 'categories[0].name'

categories_0_link = 'categories[0].link'

categories_0_linkType = 'categories[0].linkType'

categories_0_parentCategoryName = 'categories[0].parentCategoryName'

categories_1_id = 'categories[1].id'

categories_1_name = 'categories[1].name'

categories_1_link = 'categories[1].link'

categories_1_linkType = 'categories[1].linkType'

categories_1_parentCategoryName = 'categories[1].parentCategoryName'

products_0_online = 'products[0].online'

products_0_link = 'products[0].link'

products_0_linkType = 'products[0].linkType'

products_0_productId = 'products[0].productId'

products_0_productName = 'products[0].productName'

products_0_productDesc = 'products[0].productDesc'

products_0_productType = 'products[0].productType'

products_0_basePrice_value = 'products[0].basePrice.value'

products_0_basePrice_currency = 'products[0].basePrice.currency'

products_0_basePrice_formatted = 'products[0].basePrice.formatted'

products_0_basePrice_decimalPrice = 'products[0].basePrice.decimalPrice'

products_0_salePrice_value = 'products[0].salePrice.value'

products_0_salePrice_currency = 'products[0].salePrice.currency'

products_0_salePrice_formatted = 'products[0].salePrice.formatted'

products_0_salePrice_decimalPrice = 'products[0].salePrice.decimalPrice'

products_0_image_0_alt = 'products[0].image[0].alt'

products_0_image_0_url = 'products[0].image[0].url'

products_0_image_0_title = 'products[0].image[0].title'

products_0_discount_percentage = 'products[0].discount_percentage'

products_0_isVariant = 'products[0].isVariant'

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, categories_0_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, categories_0_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, categories_0_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, categories_0_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, categories_0_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, categories_0_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, categories_0_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, categories_0_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, categories_0_parentCategoryName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, categories_0_parentCategoryName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, categories_1_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, categories_1_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, categories_1_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, categories_1_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, categories_1_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, categories_1_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, categories_1_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, categories_1_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, categories_1_parentCategoryName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, categories_1_parentCategoryName)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PLPSearch, products_0_online)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_0_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_0_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_0_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_0_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_0_productId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_0_productId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_0_productName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_0_productName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_0_productDesc)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_0_productDesc)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_0_productType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_0_productType)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PLPSearch, products_0_basePrice_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_0_basePrice_currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_0_basePrice_currency)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_0_basePrice_formatted)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_0_basePrice_formatted)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_0_basePrice_decimalPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_0_basePrice_decimalPrice)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PLPSearch, products_0_salePrice_value)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_0_salePrice_currency)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_0_salePrice_formatted)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_0_salePrice_decimalPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_0_image_0_alt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_0_image_0_alt)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_0_image_0_url)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_0_image_0_url)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch, products_0_image_0_title)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch, products_0_image_0_title)

//CustomKeywords.'totalplay.Common.getNumValueofObject'(PLPSearch, products_0_discount_percentage)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PLPSearch, products_0_isVariant)
