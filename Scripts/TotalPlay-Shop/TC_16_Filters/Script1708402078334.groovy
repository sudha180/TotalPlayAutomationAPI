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

Filters_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Filters/Filters', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID]))

WS.verifyResponseStatusCode(Filters_Response, 200)

type = '_type'
count = 'count'
type1 = 'hits[0].hit_type'
hit_type = 'hits[0].hit_type'
link = 'hits[0].link'
product_id = 'hits[0].product_id'
product_name = 'hits[0].product_name' 
product_type_type = 'hits[0].product_type._type'
product_type_item = 'hits[0].product_type.item'
represented_product_type = 'hits[0].represented_product._type' 
represented_product_id = 'hits[0].represented_product.id' 
represented_product_link = 'hits[0].represented_product.link'

search_refinement_type = 'refinements[0]._type'
brand_attribute_id = 'refinements[0].attribute_id'
brand_label = 'refinements[0].label' 
brand_type = 'refinements[0].values[0]._type'
brand_hit_count =  'refinements[0].values[0].hit_count'
brandname_label = 'refinements[0].values[0].label'
brandname_value = 'refinements[0].values[0].value'

color_attribute_id = 'refinements[1].attribute_id'
color_label = 'refinements[1].label' 
color_type = 'refinements[1].values[0]._type' 
color_hit_count = 'refinements[1].values[0].hit_count' 
colorname_label =  'refinements[1].values[0].label' 
colorname_value = 'refinements[1].values[0].value'

miraklShopName_attribute_id = 'refinements[2].attribute_id'
miraklShopName_label = 'refinements[2].label'
miraklShopName_type = 'refinements[2].values[0]._type'
miraklShopName_hit_count = 'refinements[2].values[0].hit_count'
miraklShopName1_label =  'refinements[2].values[0].label'
miraklShopName1_value = 'refinements[2].values[0].value'

verticalType_attribute_id = 'refinements[3].attribute_id'
verticalType_label = 'refinements[3].label'
verticalType_type = 'refinements[3].values[0]._type'
verticalType_hit_count = 'refinements[3].values[0].hit_count'
verticalTypename_label =  'refinements[3].values[0].label'
verticalTypename_value = 'refinements[3].values[0].value'

tpshop_attribute_id = 'refinements[4].attribute_id'
tpshop_label = 'refinements[4].label'
tpshop_type = 'refinements[4].values[0]._type'
tpshop_hit_count = 'refinements[4].values[0].hit_count'
tpshopname_label = 'refinements[4].values[0].label'
tpshopname_value = 'refinements[4].values[0].value'

price_attribute_id = 'refinements[5].attribute_id'
price_label = 'refinements[5].label'
price_type = 'refinements[5].values[0]._type'
price_hit_count = 'refinements[5].values[0].hit_count'
pricevalue_label = 'refinements[5].values[0].label'
pricevalue_value = 'refinements[5].values[0].value'

cgid_attribute_id = 'refinements[6].attribute_id'
cgid_label = 'refinements[6].label'
cgid_type = 'refinements[6].values[0]._type'
cgid_hit_count = 'refinements[6].values[0].hit_count'
cgidname_label = 'refinements[6].values[0].label'
cgidname_value = 'refinements[6].values[0].value'

miraklShopID_attribute_id = 'refinements[7].attribute_id'
miraklShopID_label = 'refinements[7].label'
miraklShopID_type = 'refinements[7].values[0]._type'
miraklShopID_hit_count = 'refinements[7].values[0].hit_count'
miraklShopID1_label = 'refinements[7].values[0].label'
miraklShopID1_value = 'refinements[7].values[0].value'

modelo_attribute_id = 'refinements[8].attribute_id'
modelo_label = 'refinements[8].label'

tipo_de_producto_attribute_id = 'refinements[9].attribute_id'
tipo_de_producto_label = 'refinements[9].label'

material_attribute_id = 'refinements[10].attribute_id'
material_label = 'refinements[10].label'

Memoria_attribute_id = 'refinements[11].attribute_id'
Memoria_label = 'refinements[11].label'

tamano_attribute_id = 'refinements[12].attribute_id'
tamano_label = 'refinements[12].label'

almacenamiento_attribute_id =  'refinements[13].attribute_id'
almacenamiento_label = 'refinements[13].label'

sabor_attribute_id = 'refinements[14].attribute_id'
sabor_label = 'refinements[14].label'

weight_attribute_id = 'refinements[15].attribute_id'
weight_label = 'refinements[15].label'
weight_type = 'refinements[15].values[0]._type'
weight_hit_count = 'refinements[15].values[0].hit_count'
weightkg_label = 'refinements[15].values[0].label'
weightkg_value = 'refinements[15].values[0].value'

capacidad_attribute_id =   'refinements[16].attribute_id'
capacidad_label = 'refinements[16].label'

size_attribute_id = 'refinements[17].attribute_id'
size_label = 'refinements[17].label'

isPopular_attribute_id = 'refinements[18].attribute_id'
isPopular_label = 'refinements[18].label'
isPopular_type = 'refinements[18].values[0]._type'
isPopular_hit_count = 'refinements[18].values[0].hit_count'
isPopular1_label = 'refinements[18].values[0].label'
isPopular1_value = 'refinements[18].values[0].value'

corporateName_attribute_id = 'refinements[19].attribute_id'
corporateName_label = 'refinements[19].label'
corporateName_type = 'refinements[19].values[0]._type'
corporateName_hit_count = 'refinements[19].values[0].hit_count'
corporateName1_label = 'refinements[19].values[0].label'
corporateName1_value = 'refinements[19].values[0].value'

selected_sorting_option =  'selected_sorting_option'
Sorting_type  = 'sorting_options[0]._type'

best_matches_id = 'sorting_options[0].id'
best_matches_label = 'sorting_options[0].label'

price_low_to_high_id = 'sorting_options[1].id'
price_low_to_high_label = 'sorting_options[1].label'

price_high_to_low_id = 'sorting_options[2].id'
price_high_to_low_label = 'sorting_options[2].label'

product_name_ascending_id = 'sorting_options[3].id'
product_name_ascending_label = 'sorting_options[3].label'

product_name_descending_id = 'sorting_options[4].id'
product_name_descending_label = 'sorting_options[4].label'

brand_id = 'sorting_options[5].id'
brand_label = 'sorting_options[5].label'

most_popular_id = 'sorting_options[6].id'
most_popular_label = 'sorting_options[6].label'

top_sellers_id = 'sorting_options[7].id'
top_sellers_label = 'sorting_options[7].label'

total = 'total' 

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, type)

CustomKeywords.'totalplay.Common.getNumValueofObject'(Filters_Response, count)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, type1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, type1)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, hit_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, hit_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, product_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, product_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, product_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, product_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, product_type_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, product_type_type)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Filters_Response, product_type_item)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, product_type_item)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, represented_product_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, represented_product_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, represented_product_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, represented_product_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, represented_product_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, represented_product_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, search_refinement_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, search_refinement_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, brand_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, brand_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, brand_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, brand_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, brand_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, brand_type)
	
CustomKeywords.'totalplay.Common.getNumValueofObject'(Filters_Response, brand_hit_count)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, brand_hit_count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, brandname_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, brandname_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, brandname_value)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, brandname_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, color_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, color_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, color_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, color_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, color_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, color_type)

CustomKeywords.'totalplay.Common.getNumValueofObject'(Filters_Response, color_hit_count)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, color_hit_count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, colorname_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, colorname_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, colorname_value)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, colorname_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, miraklShopName_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, miraklShopName_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, miraklShopName_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, miraklShopName_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, miraklShopName_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, miraklShopName_type)

CustomKeywords.'totalplay.Common.getNumValueofObject'(Filters_Response, miraklShopName_hit_count)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, miraklShopName_hit_count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, miraklShopName1_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, miraklShopName1_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, miraklShopName1_value)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, miraklShopName1_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, verticalType_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, verticalType_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, verticalType_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, verticalType_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, verticalType_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, verticalType_type)

CustomKeywords.'totalplay.Common.getNumValueofObject'(Filters_Response, verticalType_hit_count)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, verticalType_hit_count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, verticalTypename_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, verticalTypename_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, verticalTypename_value)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, verticalTypename_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, tpshop_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, tpshop_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, tpshop_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, tpshop_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, tpshop_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, tpshop_type)

CustomKeywords.'totalplay.Common.getNumValueofObject'(Filters_Response, tpshop_hit_count)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, tpshop_hit_count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, tpshopname_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, tpshopname_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, tpshopname_value)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, tpshopname_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, price_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, price_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, price_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, price_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, price_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, price_type)

CustomKeywords.'totalplay.Common.getNumValueofObject'(Filters_Response, price_hit_count)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, price_hit_count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, pricevalue_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, pricevalue_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, pricevalue_value)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, pricevalue_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, cgid_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, cgid_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, cgid_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, cgid_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, cgid_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, cgid_type)

CustomKeywords.'totalplay.Common.getNumValueofObject'(Filters_Response, cgid_hit_count)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, cgid_hit_count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, cgidname_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, cgidname_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, cgidname_value)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, cgidname_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, miraklShopID_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, miraklShopID_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, miraklShopID_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, miraklShopID_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, miraklShopID_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, miraklShopID_type)

CustomKeywords.'totalplay.Common.getNumValueofObject'(Filters_Response, miraklShopID_hit_count)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, miraklShopID_hit_count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, miraklShopID1_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, miraklShopID1_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, miraklShopID1_value)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, miraklShopID1_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, modelo_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, modelo_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, modelo_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, modelo_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, tipo_de_producto_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, tipo_de_producto_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, tipo_de_producto_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, tipo_de_producto_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, material_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, material_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, material_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, material_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, Memoria_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, Memoria_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, Memoria_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, Memoria_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, tamano_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, tamano_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, tamano_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, tamano_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, almacenamiento_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, almacenamiento_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, almacenamiento_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, almacenamiento_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, sabor_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, sabor_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, sabor_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, sabor_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, weight_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, weight_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, weight_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, weight_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, weight_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, weight_type)

CustomKeywords.'totalplay.Common.getNumValueofObject'(Filters_Response, weight_hit_count)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, weight_hit_count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, weightkg_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, weightkg_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, weightkg_value)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, weightkg_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, capacidad_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, capacidad_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, capacidad_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, capacidad_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, size_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, size_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, size_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, size_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, isPopular_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, isPopular_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, isPopular_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, isPopular_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, isPopular_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, isPopular_type)

CustomKeywords.'totalplay.Common.getNumValueofObject'(Filters_Response, isPopular_hit_count)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, isPopular_hit_count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, isPopular1_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, isPopular1_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, isPopular1_value)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, isPopular1_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, corporateName_attribute_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, corporateName_attribute_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, corporateName_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, corporateName_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, corporateName_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, corporateName_type)

CustomKeywords.'totalplay.Common.getNumValueofObject'(Filters_Response, corporateName_hit_count)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, corporateName_hit_count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, corporateName1_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, corporateName1_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, corporateName1_value)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, corporateName1_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, selected_sorting_option)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, selected_sorting_option)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, Sorting_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, Sorting_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, best_matches_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, best_matches_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, best_matches_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, best_matches_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, price_low_to_high_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, price_low_to_high_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, price_low_to_high_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, price_low_to_high_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, price_high_to_low_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, price_high_to_low_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, price_high_to_low_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, price_high_to_low_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, product_name_ascending_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, product_name_ascending_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, product_name_ascending_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, product_name_ascending_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, product_name_descending_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, product_name_descending_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, product_name_descending_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, product_name_descending_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, brand_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, brand_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, brand_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, brand_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, most_popular_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, most_popular_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, most_popular_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, most_popular_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, top_sellers_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, top_sellers_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(Filters_Response, top_sellers_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, top_sellers_label)

CustomKeywords.'totalplay.Common.getNumValueofObject'(Filters_Response, total)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Filters_Response, total)




