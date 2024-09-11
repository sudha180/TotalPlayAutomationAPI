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

PCP_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/PCP/PCP', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID]))

WS.verifyResponseStatusCode(PCP_Response,200)

count = 'count'
type = 'hits[0]._type'
hit_type = 'hits[0].hit_type' 
link = 'hits[0].link'
product_id = 'hits[0].product_id'
product_name = 'hits[0].product_name'
linkType = 'hits[0].c_linkType'
basePrice_value = 'hits[0].c_basePrice.value'
basePrice_currency = 'hits[0].c_basePrice.currency'
basePrice_formatted = 'hits[0].c_basePrice.formatted'
basePrice_decimalPrice = 'hits[0].c_basePrice.decimalPrice'
salePrice_value = 'hits[0].c_salePrice.value'
salePrice_currency = 'hits[0].c_salePrice.currency'
salePrice_formatted = 'hits[0].c_salePrice.formatted'
salePrice_decimalPrice = 'hits[0].c_salePrice.decimalPrice'
Image_alt = 'hits[0].c_Image[0].alt'
Image_url = 'hits[0].c_Image[0].url'
Image_title = 'hits[0].c_Image[0].title'
discount_percentage = 'hits[0].c_discount_percentage'
promoPrice = 'hits[0].c_promoPrice'
isVariant = 'hits[0].c_isVariant'
emi_months = 'hits[0].c_emi_months'
emi_installment_amount = 'hits[0].c_emi_installment_amount'
Edd = 'hits[0].c_Edd'

brand_type = 'refinements[0]._type'
brand_attribute_id = 'refinements[0].attribute_id'
brand_label = 'refinements[0].label'
brand_hit_count = 'refinements[0].values[0].hit_count'
brandname_label = 'refinements[0].values[0].label'
brandname_value = 'refinements[0].values[0].value'

color_type = 'refinements[1]._type'
color_attribute_id = 'refinements[1].attribute_id'
color_label = 'refinements[1].label'
color_hit_count = 'refinements[1].values[0].hit_count'
colorname_label = 'refinements[1].values[0].label'
colorname_value = 'refinements[1].values[0].value'

modelo_type = 'refinements[2]._type'
modelo_attribute_id = 'refinements[2].attribute_id'
modelo_label = 'refinements[2].label'

tipo_de_producto_attribute_id = 'refinements[3].attribute_id'
tipo_de_producto_label = 'refinements[3].label'

material_attribute_id = 'refinements[4].attribute_id'
material_label = 'refinements[4].label'

Memoria_attribute_id =  'refinements[5].attribute_id'
Memoria_label = 'refinements[5].label'

tamano_attribute_id =  'refinements[6].attribute_id'
tamano_label = 'refinements[6].label'

almacenamiento_attribute_id = 'refinements[7].attribute_id'
almacenamiento_label = 'refinements[7].label'

sabor_attribute_id = 'refinements[8].attribute_id'
sabor_label = 'refinements[8].label'

weight_attribute_id ='refinements[9].attribute_id'
weight_label = 'refinements[9].label'
weight_hit_count = 'refinements[9].values[0].hit_count'
weightKG_label = 'refinements[9].values[0].label'
weightKG_value = 'refinements[9].values[0].value'

capacidad_attribute_id = 'refinements[10].attribute_id'
capacidad_label = 'refinements[10].label'

size_attribute_id = 'refinements[11].attribute_id'
size_label = 'refinements[11].label'

isPopular_attribute_id = 'refinements[12].attribute_id'
isPopular_label = 'refinements[12].label'
isPopular_hit_count = 'refinements[12].values[0].hit_count'
isPopularname_label = 'refinements[12].values[0].label'
isPopular_value = 'refinements[12].values[0].value'

sorting_type = 'sorting_options[0]._type'
bestmatches_id  = 'sorting_options[0].id'
bestmatches_label = 'sorting_options[0].label'

price_lowtohigh_id  = 'sorting_options[1].id'
price_lowtohigh_label = 'sorting_options[1].label'

price_hightolow_id  = 'sorting_options[2].id'
price_hightolow_label = 'sorting_options[2].label'

product_nameascending_id  = 'sorting_options[3].id'
product_nameascending_label = 'sorting_options[3].label'

product_namedescending_id  = 'sorting_options[4].id'
product_namedescending_label = 'sorting_options[4].label'

sortingbrand_id  = 'sorting_options[5].id'
sortingbrand_label = 'sorting_options[5].label'

mostpopular_id  = 'sorting_options[6].id'
mostpopular_label =  'sorting_options[6].label'

topsellers_id  = 'sorting_options[7].id'
topsellers_label = 'sorting_options[7].label'

total = 'total'

CustomKeywords.'totalplay.Common.getNumValueofObject'(PCP_Response, count)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, hit_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, hit_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, product_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, product_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, product_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, product_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, linkType)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PCP_Response, basePrice_value)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, basePrice_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, basePrice_currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, basePrice_currency)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, basePrice_formatted)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, basePrice_formatted)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, basePrice_decimalPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, basePrice_decimalPrice)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PCP_Response, salePrice_value)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, salePrice_value)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PCP_Response, salePrice_currency)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, salePrice_currency)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PCP_Response, salePrice_formatted)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, salePrice_formatted)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PCP_Response, salePrice_decimalPrice)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, salePrice_decimalPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, Image_alt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, Image_alt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, Image_url)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, Image_url)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, Image_title)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, Image_title)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PCP_Response, discount_percentage)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, discount_percentage)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PCP_Response, promoPrice)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, promoPrice)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PCP_Response, isVariant)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, isVariant)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(PCP_Response, emi_months)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, emi_months)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, emi_installment_amount)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, emi_installment_amount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, Edd)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, Edd)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, brand_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, brand_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, brand_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, brand_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, brand_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, brand_label)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PCP_Response, brand_hit_count)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, brand_hit_count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, brandname_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, brandname_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, brandname_value)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, brandname_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, color_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, color_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, color_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, color_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, color_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, color_label)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PCP_Response, color_hit_count)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, color_hit_count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, colorname_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, colorname_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, colorname_value)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, colorname_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, modelo_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, modelo_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, modelo_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, modelo_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, tipo_de_producto_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, tipo_de_producto_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, tipo_de_producto_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, tipo_de_producto_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, material_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, material_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, material_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, material_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, Memoria_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, Memoria_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, Memoria_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, Memoria_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, tamano_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, tamano_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, tamano_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, tamano_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, almacenamiento_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, almacenamiento_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, almacenamiento_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, almacenamiento_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, sabor_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, sabor_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, sabor_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, sabor_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, weight_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, weight_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, weight_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, weight_label)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PCP_Response, weight_hit_count)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, weight_hit_count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, weightKG_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, weightKG_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, weightKG_value)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, weightKG_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, capacidad_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, capacidad_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, capacidad_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, capacidad_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, size_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, size_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, size_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, size_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, isPopular_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, isPopular_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, isPopular_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, isPopular_label)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PCP_Response, isPopular_hit_count)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, isPopular_hit_count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, isPopularname_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, isPopularname_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, isPopular_value)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, isPopular_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, sorting_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, sorting_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, bestmatches_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, bestmatches_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, bestmatches_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, bestmatches_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, price_lowtohigh_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, price_lowtohigh_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, price_lowtohigh_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, price_lowtohigh_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, price_hightolow_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, price_hightolow_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, price_hightolow_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, price_hightolow_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, product_nameascending_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, product_nameascending_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, product_nameascending_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, product_nameascending_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, product_namedescending_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, product_namedescending_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, product_namedescending_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, product_namedescending_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, sortingbrand_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, sortingbrand_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, sortingbrand_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, sortingbrand_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, mostpopular_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, mostpopular_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, mostpopular_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, mostpopular_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, topsellers_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, topsellers_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCP_Response, topsellers_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, topsellers_label)

CustomKeywords.'totalplay.Common.getNumValueofObject'(PCP_Response, total)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCP_Response, total)

