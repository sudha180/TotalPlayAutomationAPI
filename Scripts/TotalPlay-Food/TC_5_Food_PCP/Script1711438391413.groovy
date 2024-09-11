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

FoodPCP = WS.sendRequest(findTestObject('TotalPlay-Food/Food PCP', [('URL') : GlobalVariable.URL]))

WS.verifyResponseStatusCode(FoodPCP, 200)
count = 'count'
hits = 'hits'
hits_type = 'hits[0]._type'
hits_hit_type = 'hits[0].hit_type'
hits_link = 'hits[0].link'
hits_product_name = 'hits[0].product_name'
hits_product_id = 'hits[0].product_id'
hits_product_type = 'hits[0].product_type'
hits_product_type_type = 'hits[0].product_type._type'
hits_product_type_item = 'hits[0].product_type.item'
hits_c_description = 'hits[0].c_description'
hits_c_basePrice = 'hits[0].c_basePrice'
hits_c_linkType = 'hits[0].c_linkType'
hits_c_productType = 'hits[0].c_productType'
hits_c_basePrice_value = 'hits[0].c_basePrice.value'
hits_c_basePrice_currency = 'hits[0].c_basePrice.currency'
hits_c_basePrice_formatted = 'hits[0].c_basePrice.formatted'
hits_c_basePrice_decimalPrice = 'hits[0].c_basePrice.decimalPrice'
hits_c_salePrice = 'hits[0].c_salePrice'
hits_c_salePrice_value = 'hits[0].c_salePrice.value'
hits_c_salePrice_currency = 'hits[0].c_salePrice.currency'
hits_c_salePrice_formatted = 'hits[0].c_salePrice.formatted'
hits_c_salePrice_decimalPrice = 'hits[0].c_salePrice.decimalPrice'
hits_c_Image = 'hits[0].c_Image'
hits_c_Image_alt = 'hits[0].c_Image[0].alt'
hits_c_Image_url = 'hits[0].c_Image[0].url'
hits_c_Image_title = 'hits[0].c_Image[0].title'
hits_c_promoPrice = 'hits[0].c_promoPrice'
hits_c_discount_percentage = 'hits[0].c_discount_percentage'
hits_c_isVariant = 'hits[0].c_isVariant'
hits_c_emi_months = 'hits[0].c_emi_months'
hits_c_emi_installment_amount = 'hits[0].c_emi_installment_amount'
hits_c_Edd = 'hits[0].c_Edd'
refinements = 'refinements'
refinements_type0 = 'refinements[0]._type'
refinements_attribute_id0 = 'refinements[0].attribute_id'
refinements_label0 = 'refinements[0].label'
refinements_type = 'refinements[1]._type'
refinements_attribute_id = 'refinements[1].attribute_id'
refinements_label = 'refinements[1].label'
refinements_values = 'refinements[1].values'
search_phrase_suggestions = 'search_phrase_suggestions'
search_phrase_suggestions_type = 'search_phrase_suggestions._type'
sorting_options = 'sorting_options'
sorting_options_type = 'sorting_options[0]._type'
sorting_options_label = 'sorting_options[0].label'
sorting_options_id = 'sorting_options[0].id'
start = 'start'
total = 'total'

CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPCP, count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, hits)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, hits_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, hits_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, hits_hit_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, hits_hit_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, hits_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, hits_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, hits_product_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, hits_product_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, hits_product_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, hits_product_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, hits_product_type_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, hits_product_type_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, hits_product_type)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPCP, hits_product_type_item)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, hits_c_description)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, hits_c_description)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, hits_c_basePrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, hits_c_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, hits_c_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, hits_c_productType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, hits_c_productType)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(FoodPCP, hits_c_basePrice_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, hits_c_basePrice_currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, hits_c_basePrice_currency)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, hits_c_basePrice_formatted)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, hits_c_basePrice_formatted)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, hits_c_basePrice_decimalPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, hits_c_basePrice_decimalPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, hits_c_salePrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, hits_c_Image_alt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, hits_c_Image_alt)

CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(FoodPCP, hits_c_salePrice_currency)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, hits_c_salePrice_currency)

CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(FoodPCP, hits_c_salePrice_formatted)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, hits_c_salePrice_formatted)

CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(FoodPCP, hits_c_salePrice_decimalPrice)

CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(FoodPCP, hits_c_Image_url)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, hits_c_Image_url)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, hits_c_Image_title)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, hits_c_Image_title)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(FoodPCP, hits_c_promoPrice)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(FoodPCP, hits_c_salePrice_value)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPCP, hits_c_isVariant)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(FoodPCP, hits_c_emi_months)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(FoodPCP, hits_c_emi_installment_amount)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, hits_c_emi_installment_amount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, hits_c_Edd)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, hits_c_Edd)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, refinements)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, refinements_type0)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, refinements_type0)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, refinements_attribute_id0)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, refinements_attribute_id0)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, refinements_label0)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, refinements_label0)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, refinements_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, refinements_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, refinements_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, refinements_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, refinements_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, refinements_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, refinements_values)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, search_phrase_suggestions)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, search_phrase_suggestions_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, search_phrase_suggestions_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, sorting_options)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, sorting_options_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, sorting_options_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, sorting_options_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, sorting_options_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPCP, sorting_options_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPCP, sorting_options_id)

CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPCP, start)

CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPCP, total)