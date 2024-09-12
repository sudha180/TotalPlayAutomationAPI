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

SLPSearch = WS.sendRequest(findTestObject('TotalPlay-Food/SLP Search'))

WS.verifyResponseStatusCode(SLPSearch, 200)

/*
count	=	'count'
hits	=	'hits'
hits_type	=	'hits[0]._type'
hits_hit_type	=	'hits[0].hit_type'
hits_link	=	'hits[0].link'
hits_product_id	=	'hits[0].product_id'
hits_product_name	=	'hits[0].product_name'
hits_product_type	=	'hits[0].product_type'
hits_product_type_type	=	'hits[0].product_type._type'
hits_product_type_item	=	'hits[0].product_type.item'
hits_represented_product	=	'hits[0].represented_product'
hits_represented_product_type	=	'hits[0].represented_product._type'
hits_represented_product_link	=	'hits[0].represented_product.link'
hits_c_image	=	'hits[0].c_image'
hits_c_storeData	=	'hits[0].c_storeData'
hits_c_storeData_id	=	'hits[0].c_storeData.id'
hits_c_storeData_name	=	'hits[0].c_storeData.name'
hits_c_storeData_logo	=	'hits[0].c_storeData.logo'
hits_c_storeData_link	=	'hits[0].c_storeData.link'
next	=	'next'
refinements	=	'refinements'
query	=	'query'
refinements_type	=	'refinements[0]._type'
refinements_attribute_id	=	'refinements[0].attribute_id'
refinements_label	=	'refinements[0].label'
refinements_values	=	'refinements[0].values'
refinements_values_type	=	'refinements[0].values[0]._type'
refinements_values_hit_count	=	'refinements[0].values[0].hit_count'
refinements_values_label	=	'refinements[0].values[0].label'
refinements_values_value	=	'refinements[0].values[0].value'
search_phrase_suggestions	=	'search_phrase_suggestions'
search_phrase_suggestions_type	=	'search_phrase_suggestions._type'
search_phrase_suggestions_suggested_phrases	=	'search_phrase_suggestions.suggested_phrases'
search_phrase_suggestions_suggested_phrases_exact_match	=	'search_phrase_suggestions.suggested_phrases[0].exact_match'
search_phrase_suggestions_suggested_phrases_type	=	'search_phrase_suggestions.suggested_phrases[0]._type'
search_phrase_suggestions_suggested_phrases_phrase	=	'search_phrase_suggestions.suggested_phrases[0].phrase'
search_phrase_suggestions_suggested_terms	=	'search_phrase_suggestions.suggested_terms'
search_phrase_suggestions_suggested_terms_type	=	'search_phrase_suggestions.suggested_terms[0]._type'
search_phrase_suggestions_suggested_terms_terms	=	'search_phrase_suggestions.suggested_terms[0].terms'
search_phrase_suggestions_suggested_terms_original_term	=	'search_phrase_suggestions.suggested_terms[0].original_term'
search_phrase_suggestions_suggested_terms_terms_type	=	'search_phrase_suggestions.suggested_terms[0].terms[0]._type'
search_phrase_suggestions_suggested_terms_terms_completed	=	'search_phrase_suggestions.suggested_terms[0].terms[0].completed'
search_phrase_suggestions_suggested_terms_terms_corrected	=	'search_phrase_suggestions.suggested_terms[0].terms[0].corrected'
search_phrase_suggestions_suggested_terms_terms_exact_match	=	'search_phrase_suggestions.suggested_terms[0].terms[0].exact_match'
search_phrase_suggestions_suggested_terms_terms_value	=	'search_phrase_suggestions.suggested_terms[0].terms[0].value'
sorting_options	=	'sorting_options'
sorting_options0_type	=	'sorting_options[0]._type'
sorting_options0_label	=	'sorting_options[0].label'
sorting_options0_id	=	'sorting_options[0].id'
sorting_options1_type	=	'sorting_options[1]._type'
sorting_options1_id	=	'sorting_options[1].id'
sorting_options1_label	=	'sorting_options[1].label'
total	=	'total'
start	=	'start'

CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodSLP, count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, hits)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, hits_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, hits_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, hits_hit_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, hits_hit_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, hits_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, hits_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, hits_product_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, hits_product_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, hits_product_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, hits_product_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, hits_product_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, hits_product_type_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, hits_product_type_type)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodSLP, hits_product_type_item)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, hits_represented_product)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, hits_represented_product_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, hits_represented_product_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, hits_represented_product_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, hits_represented_product_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, hits_c_image)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, hits_c_image)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, hits_c_storeData)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, hits_c_storeData_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, hits_c_storeData_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, hits_c_storeData_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, hits_c_storeData_logo)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, hits_c_storeData_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, hits_c_storeData_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, next)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, next)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, refinements)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, query)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, query)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, refinements_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, refinements_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, refinements_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, refinements_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, refinements_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, refinements_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, refinements_values)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, refinements_values_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, refinements_values_type)

CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodSLP, refinements_values_hit_count)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, refinements_values_label)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, refinements_values_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, search_phrase_suggestions)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, search_phrase_suggestions_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, search_phrase_suggestions_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, search_phrase_suggestions_suggested_phrases)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodSLP, search_phrase_suggestions_suggested_phrases_exact_match)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, search_phrase_suggestions_suggested_phrases_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, search_phrase_suggestions_suggested_phrases_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, search_phrase_suggestions_suggested_phrases_phrase)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, search_phrase_suggestions_suggested_phrases_phrase)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, search_phrase_suggestions_suggested_terms)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, search_phrase_suggestions_suggested_terms_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, search_phrase_suggestions_suggested_terms_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, search_phrase_suggestions_suggested_terms_terms)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, search_phrase_suggestions_suggested_terms_original_term)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, search_phrase_suggestions_suggested_terms_original_term)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, search_phrase_suggestions_suggested_terms_terms_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, search_phrase_suggestions_suggested_terms_terms_type)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodSLP, search_phrase_suggestions_suggested_terms_terms_completed)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodSLP, search_phrase_suggestions_suggested_terms_terms_corrected)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodSLP, search_phrase_suggestions_suggested_terms_terms_exact_match)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, search_phrase_suggestions_suggested_terms_terms_value)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, search_phrase_suggestions_suggested_terms_terms_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, sorting_options)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, sorting_options0_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, sorting_options0_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, sorting_options0_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, sorting_options0_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, sorting_options0_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, sorting_options0_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, sorting_options1_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, sorting_options1_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, sorting_options1_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, sorting_options1_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, sorting_options1_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, sorting_options1_label)

CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodSLP, total)

CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodSLP, start)
*/
stores_0_name = 'stores[0].name'

stores_0_corporateName = 'stores[0].corporateName'

stores_0_ondemandEDD = 'stores[0].ondemandEDD'

stores_0_multiStoreEDD = 'stores[0].multiStoreEDD'

stores_0_image = 'stores[0].image'

stores_0_productsCount = 'stores[0].productsCount'

stores_0_link = 'stores[0].link'

stores_0_linkType = 'stores[0].linkType'

stores_0_corporateColorCode = 'stores[0].corporateColorCode'

stores_0_verticalType = 'stores[0].verticalType'

stores_0_distance = 'stores[0].distance'

stores_0_isInRange = 'stores[0].isInRange'

stores_0_storeOpen = 'stores[0].storeOpen'

stores_0_isAgeRestricted = 'stores[0].isAgeRestricted'

stores_0_categoryName = 'stores[0].categoryName'

stores_0_products_0_productId = 'stores[0].products[0].productId'

stores_0_products_0_productName = 'stores[0].products[0].productName'

stores_0_products_0_link = 'stores[0].products[0].link'

stores_0_products_0_linkType = 'stores[0].products[0].linkType'

stores_1_name = 'stores[1].name'

stores_1_corporateName = 'stores[1].corporateName'

stores_1_ondemandEDD = 'stores[1].ondemandEDD'

stores_1_multiStoreEDD = 'stores[1].multiStoreEDD'

stores_1_image = 'stores[1].image'

stores_1_productsCount = 'stores[1].productsCount'

stores_1_link = 'stores[1].link'

stores_1_linkType = 'stores[1].linkType'

stores_1_corporateColorCode = 'stores[1].corporateColorCode'

stores_1_verticalType = 'stores[1].verticalType'

stores_1_distance = 'stores[1].distance'

stores_1_isInRange = 'stores[1].isInRange'

stores_1_storeOpen = 'stores[1].storeOpen'

stores_1_isAgeRestricted = 'stores[1].isAgeRestricted'

stores_1_categoryName = 'stores[1].categoryName'

stores_1_products_0_productId = 'stores[1].products[0].productId'

stores_1_products_0_productName = 'stores[1].products[0].productName'

stores_1_products_0_link = 'stores[1].products[0].link'

stores_1_products_0_linkType = 'stores[1].products[0].linkType'

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_0_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_0_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_0_corporateName)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_0_corporateName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_0_ondemandEDD)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_0_ondemandEDD)

CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(SLPSearch, stores_0_multiStoreEDD)
CustomKeywords.'totalplay.Common.verifyPropertyEmpty'(SLPSearch, stores_0_image)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SLPSearch, stores_0_productsCount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_0_link)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_0_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_0_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_0_linkType)

//CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(SLPSearch, stores_0_corporateColorCode)
//CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(SLPSearch, stores_0_verticalType)
//CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(SLPSearch, stores_0_distance)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SLPSearch, stores_0_isInRange)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SLPSearch, stores_0_storeOpen)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SLPSearch, stores_0_isAgeRestricted)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_0_categoryName)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_0_categoryName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_0_products_0_productId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_0_products_0_productId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_0_products_0_productName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_0_products_0_productName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_0_products_0_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_0_products_0_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_0_products_0_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_0_products_0_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_1_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_1_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_1_corporateName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_1_corporateName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_1_ondemandEDD)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_1_ondemandEDD)


CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(SLPSearch, stores_1_multiStoreEDD)
CustomKeywords.'totalplay.Common.verifyPropertyEmpty'(SLPSearch, stores_1_image)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SLPSearch, stores_1_productsCount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_1_link)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_1_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_1_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_1_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_1_corporateColorCode)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_1_corporateColorCode)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_1_verticalType)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_1_verticalType)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_1_distance)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_1_distance)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SLPSearch, stores_1_isInRange)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SLPSearch, stores_1_storeOpen)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SLPSearch, stores_1_isAgeRestricted)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_1_categoryName)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_1_categoryName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_1_products_0_productId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_1_products_0_productId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_1_products_0_productName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_1_products_0_productName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_1_products_0_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_1_products_0_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLPSearch, stores_1_products_0_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLPSearch, stores_1_products_0_linkType)
