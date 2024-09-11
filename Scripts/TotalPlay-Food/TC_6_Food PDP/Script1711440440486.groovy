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

FoodPDP = WS.sendRequest(findTestObject('TotalPlay-Food/Food PDP', [('URL') : GlobalVariable.URL]))

WS.verifyResponseStatusCode(FoodPDP, 200)

//brand	=	'brand'
//currency	=	'currency'
//id	=	'id'
//image_groups	=	'image_groups'
//image_groups_type	=	'image_groups[0]._type'
//image_groups_images	=	'image_groups[0].images'
//image_groups_images_type	=	'image_groups[0].images[0]._type'
//image_groups_images_alt	=	'image_groups[0].images[0].alt'
//image_groups_images_dis_base_link	=	'image_groups[0].images[0].dis_base_link'
//image_groups_images_link	=	'image_groups[0].images[0].link'
//image_groups_images_title	=	'image_groups[0].images[0].title'
//image_groups_view_type	=	'image_groups[0].view_type'
//inventory	=	'inventory'
//inventory_type	=	'inventory._type'
//inventory_ats	=	'inventory.ats'
//inventory_backorderable	=	'inventory.backorderable'
//inventory_orderable	=	'inventory.orderable'
//inventory_id	=	'inventory.id'
//inventory_preorderable	=	'inventory.preorderable'
//inventory_stock_level	=	'inventory.stock_level'
//long_description	=	'long_description'
//min_order_quantity	=	'min_order_quantity'
//name	=	'name'
//price=	'price'	
//price_per_unit	=	'price_per_unit'
//product_promotions	=	'product_promotions'
//product_promotions_type	=	'product_promotions[0]._type'
//product_promotions_callout_msg	=	'product_promotions[0].callout_msg'
//product_promotions_link	=	'product_promotions[0].link'
//product_promotions_promotion_id	=	'product_promotions[0].promotion_id'
//short_description	=	'short_description'
//step_quantity	=	'step_quantity'
//type_type	=	'type._type'
//type	=	'type'
//type_item	=	'type.item'
//c_DefaultList	=	'c_DefaultList'
//unit_quantity	=	'unit_quantity'
//c_DefaultList0_products	=	'c_DefaultList[0].products'
//c_DefaultList0_products_productId	=	'c_DefaultList[0].products[0].productId'
//c_DefaultList0_products0_productName	=	'c_DefaultList[0].products[0].productName'
//c_DefaultList0_products0_selected	=	'c_DefaultList[0].products[0].selected'
//c_DefaultList0_products1_productId	=	'c_DefaultList[0].products[1].productId'
//c_DefaultList0_products1_productName	=	'c_DefaultList[0].products[1].productName'
//c_DefaultList0_products1_selected	=	'c_DefaultList[0].products[1].selected'
//c_DefaultList0_requiredQuantity	=	'c_DefaultList[0].requiredQuantity'
//c_DefaultList0_Group	=	'c_DefaultList[0].Group'
//c_DefaultList0_maximumQuantity	=	'c_DefaultList[0].maximumQuantity'
//c_DefaultList0_multiValue	=	'c_DefaultList[0].multiValue'
//c_DefaultList0_Must	=	'c_DefaultList[0].Must'
//c_DefaultList0_freeAddOn	=	'c_DefaultList[0].freeAddOn'
//c_DefaultList0_displayQuantity	=	'c_DefaultList[0].displayQuantity'
//c_DefaultList1_products	=	'c_DefaultList[1].products'
//c_DefaultList1_products_productId	=	'c_DefaultList[1].products[0].productId'
//c_DefaultList1_products_selected	=	'c_DefaultList[1].products[0].selected'
//c_DefaultList1_products_productName	=	'c_DefaultList[1].products[0].productName'
//c_DefaultList1_Group	=	'c_DefaultList[1].Group'
//c_DefaultList1_requiredQuantity	=	'c_DefaultList[1].requiredQuantity'
//c_DefaultList1_maximumQuantity	=	'c_DefaultList[1].maximumQuantity'
//c_DefaultList1_Must	=	'c_DefaultList[1].Must'
//c_DefaultList1_multiValue	=	'c_DefaultList[1].multiValue'
//c_DefaultList1_displayQuantity	=	'c_DefaultList[1].displayQuantity'
//c_DefaultList1_freeAddOn	=	'c_DefaultList[1].freeAddOn'
//c_DefaultList1_customerGroupName	=	'c_DefaultList[1].customerGroupName'
//c_corporateName	=	'c_corporateName'
//c_description	=	'c_description'
//c_discountPercentage	=	'c_discountPercentage'
//c_group	=	'c_group'
//c_individualDelivery	=	'c_individualDelivery'
//c_marketplaceProduct	=	'c_marketplaceProduct'
//c_miraklImages	=	'c_miraklImages'
//c_miraklProductDataSource	=	'c_miraklProductDataSource'
//c_miraklProductId	=	'c_miraklProductId'
//c_miraklShopID	=	'c_miraklShopID'
//c_miraklShopName	=	'c_miraklShopName'
//c_personCount	=	'c_personCount'
//c_productType	=	'c_productType'
//c_promotionName	=	'c_promotionName'
//c_seller_lead_times	=	'c_seller-lead-times'
//c_sellerDescription	=	'c_sellerDescription'
//c_shopIdName='c_shopIdName'		
//c_tpshop	=	'c_tpshop'
//c_updateMiraklImages	=	'c_updateMiraklImages'
//c_salePrice	=	'c_salePrice'
//c_verticalType	=	'c_verticalType'
//c_salePrice_value	=	'c_salePrice.value'
//c_salePrice_currency	=	'c_salePrice.currency'
//c_salePrice_formatted	=	'c_salePrice.formatted'
//c_salePrice_decimalPrice	=	'c_salePrice.decimalPrice'
//c_basePrice	=	'c_basePrice'
//c_basePrice_value	=	'c_basePrice.value'
//c_basePrice_currency	=	'c_basePrice.currency'
//c_basePrice_formatted	=	'c_basePrice.formatted'
//c_basePrice_decimalPrice	=	'c_basePrice.decimalPrice'
//c_similarProducts	=	'c_similarProducts'
//c_similarProducts_online	=	'c_similarProducts[0].online'
//c_similarProducts_link	=	'c_similarProducts[0].link'
//c_similarProducts_linkType	=	'c_similarProducts[0].linkType'
//c_similarProducts_productId	=	'c_similarProducts[0].productId'
//c_similarProducts_productName	=	'c_similarProducts[0].productName'
//c_similarProducts_productDesc	=	'c_similarProducts[0].productDesc'
//c_similarProducts_productType	=	'c_similarProducts[0].productType'
//c_similarProducts_basePrice	=	'c_similarProducts[0].basePrice'
//c_similarProducts_basePrice_value	=	'c_similarProducts[0].basePrice.value'
//c_similarProducts_basePrice_currency	=	'c_similarProducts[0].basePrice.currency'
//c_similarProducts_basePrice_formatted	=	'c_similarProducts[0].basePrice.formatted'
//c_similarProducts_basePrice_decimalPrice	=	'c_similarProducts[0].basePrice.decimalPrice'
//c_similarProducts_salePrice	=	'c_similarProducts[0].salePrice'
//c_similarProducts_salePrice_currency	=	'c_similarProducts[0].salePrice.currency'
//c_similarProducts_salePrice_value	=	'c_similarProducts[0].salePrice.value'
//c_similarProducts_salePrice_formatted	=	'c_similarProducts[0].salePrice.formatted'
//c_similarProducts_salePrice_decimalPrice	=	'c_similarProducts[0].salePrice.decimalPrice'
//c_similarProducts_image	=	'c_similarProducts[0].image'
//c_similarProducts_image_alt	=	'c_similarProducts[0].image[0].alt'
//c_similarProducts_image_url	=	'c_similarProducts[0].image[0].url'
//c_similarProducts_image_title	=	'c_similarProducts[0].image[0].title'
//c_similarProducts_discount_percentage	=	'c_similarProducts[0].discount_percentage'
//c_similarProducts_promotionName	=	'c_similarProducts[0].promotionName'
//c_similarProducts_promotionName_calloutMsg	=	'c_similarProducts[0].promotionName[0].calloutMsg'
//c_similarProducts_promotionName_details	=	'c_similarProducts[0].promotionName[0].details'
//c_similarProducts_promotionName_enabled	=	'c_similarProducts[0].promotionName[0].enabled'
//c_similarProducts_promotionName_name	=	'c_similarProducts[0].promotionName[0].name'
//c_similarProducts_promotionName_id	=	'c_similarProducts[0].promotionName[0].id'
//c_similarProducts_promotionName_promotionClass	=	'c_similarProducts[0].promotionName[0].promotionClass'
//c_similarProducts_promotionName_rank	=	'c_similarProducts[0].promotionName[0].rank'
//c_similarProducts0_promoPrice	=	'c_similarProducts[0].promoPrice'
//c_similarProducts0_colorSwatches	=	'c_similarProducts[0].colorSwatches'
//c_similarProducts0_isVariant	=	'c_similarProducts[0].isVariant'
//c_similarProducts0_emi_installment_amount	=	'c_similarProducts[0].emi_installment_amount'
//c_similarProducts0_bestOfferPrice	=	'c_similarProducts[0].bestOfferPrice'
//c_similarProducts1_link	=	'c_similarProducts[1].link'
//c_similarProducts1_linkType	=	'c_similarProducts[1].linkType'
//c_similarProducts1_productId	=	'c_similarProducts[1].productId'
//c_similarProducts1_productName	=	'c_similarProducts[1].productName'
//c_similarProducts1_productDesc	=	'c_similarProducts[1].productDesc'
//c_similarProducts1_productType	=	'c_similarProducts[1].productType'
//c_similarProducts1_basePrice	=	'c_similarProducts[1].basePrice'
//c_similarProducts1_basePrice_currency	=	'c_similarProducts[1].basePrice.currency'
//c_similarProducts1_basePrice_value	=	'c_similarProducts[1].basePrice.value'
//c_similarProducts1_basePrice_formatted	=	'c_similarProducts[1].basePrice.formatted'
//c_similarProducts1_basePrice_decimalPrice	=	'c_similarProducts[1].basePrice.decimalPrice'
//c_similarProducts1_salePrice_value	=	'c_similarProducts[1].salePrice.value'
//c_similarProducts1_salePrice_currency	=	'c_similarProducts[1].salePrice.currency'
//c_similarProducts1_salePrice_formatted	=	'c_similarProducts[1].salePrice.formatted'
//c_similarProducts1_salePrice_decimalPrice	=	'c_similarProducts[1].salePrice.decimalPrice'
//c_similarProducts1_image	=	'c_similarProducts[1].image[0]'
//c_similarProducts1_image_url	=	'c_similarProducts[1].image[0].url'
//c_similarProducts1_image_title	=	'c_similarProducts[1].image[0].title'
//c_similarProducts1_promotionName	=	'c_similarProducts[1].promotionName'
//c_similarProducts_promoPrice	=	'c_similarProducts[1].promoPrice'
//c_similarProducts_colorSwatches	=	'c_similarProducts[1].colorSwatches'
//c_similarProducts_emi_months	=	'c_similarProducts[1].emi_months'
//c_similarProducts2	=	'c_similarProducts[2]'
//c_similarProducts1_emi_installment_amount	=	'c_similarProducts[1].emi_installment_amount'
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, brand)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, brand)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, currency)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, currency)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, id)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, id)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, image_groups)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, image_groups_type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, image_groups_type)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, image_groups_images)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, image_groups_images_type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, image_groups_images_type)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, image_groups_images_alt)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, image_groups_images_alt)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, image_groups_images_dis_base_link)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, image_groups_images_dis_base_link)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, image_groups_images_link)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, image_groups_images_link)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, image_groups_images_title)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, image_groups_images_title)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, image_groups_view_type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, image_groups_view_type)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, inventory)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, inventory_type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, inventory_type)
//
//CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, inventory_ats)
//
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, inventory_backorderable)
//
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, inventory_orderable)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, inventory_id)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, inventory_id)
//
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, inventory_preorderable)
//
//CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, inventory_stock_level)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, long_description)
//
//CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, min_order_quantity)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, name)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, name)
//
//CustomKeywords.'totalplay.Common.getDecimalValueofObject'(FoodPDP, price)
//
//CustomKeywords.'totalplay.Common.getDecimalValueofObject'(FoodPDP, price_per_unit)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, product_promotions)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, product_promotions_type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, product_promotions_type)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, product_promotions_callout_msg)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, product_promotions_callout_msg)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, product_promotions_link)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, product_promotions_link)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, product_promotions_promotion_id)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, product_promotions_promotion_id)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, short_description)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, short_description)
//
//CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, step_quantity)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, type_type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, type_type)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, type)
//
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, type_item)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_DefaultList)
//
//CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, unit_quantity)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_DefaultList0_products)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_DefaultList0_products_productId)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_DefaultList0_products0_productName)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_DefaultList0_products0_productName)
//
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, c_DefaultList0_products0_selected)
////
////CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_DefaultList0_products1_productId)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_DefaultList0_products1_productId)
//
////CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_DefaultList0_products1_productId)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_DefaultList0_products1_productId)
//
////CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_DefaultList0_products1_productName)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_DefaultList0_products1_productName)
//
////CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, c_DefaultList0_products1_selected)
//
//CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, c_DefaultList0_requiredQuantity)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_DefaultList0_Group)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_DefaultList0_Group)
//
//CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, c_DefaultList0_maximumQuantity)
//
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, c_DefaultList0_multiValue)
//
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, c_DefaultList0_Must)
//
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, c_DefaultList0_freeAddOn)
//
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, c_DefaultList0_displayQuantity)
//
////CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_DefaultList1_products)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_DefaultList1_products)
//
////CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_DefaultList1_products_productId)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_DefaultList1_products_productId)
//
////CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_DefaultList1_products_selected)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_DefaultList1_products_selected)
////
////CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_DefaultList1_products_productName)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_DefaultList1_products_productName)
//
////CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_DefaultList1_Group)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_DefaultList1_Group)
////
////CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_DefaultList1_requiredQuantity)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_DefaultList1_requiredQuantity)
////
////CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_DefaultList1_maximumQuantity)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_DefaultList1_maximumQuantity)
////
////CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_DefaultList1_Must)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_DefaultList1_Must)
////
////CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, c_DefaultList1_multiValue)
////
////CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_DefaultList1_displayQuantity)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_DefaultList1_displayQuantity)
////
////CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_DefaultList1_freeAddOn)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_DefaultList1_freeAddOn)
////
////CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_DefaultList1_customerGroupName)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_DefaultList1_customerGroupName)
////
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_corporateName)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_group)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_group)
//
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, c_individualDelivery)
//
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, c_marketplaceProduct)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_miraklImages)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_miraklImages)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_miraklProductDataSource)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_miraklProductDataSource)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_miraklProductId)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_miraklProductId)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_miraklShopID)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_miraklShopName)
//
//CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, c_personCount)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_productType)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_productType)
//
////CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_promotionName)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_promotionName)
//
////CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_seller_lead_times)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_seller_lead_times)
////
////CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_sellerDescription)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_sellerDescription)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_shopIdName)
//
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, c_tpshop)
//
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, c_updateMiraklImages)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_salePrice)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_verticalType)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_productType)
//
//CustomKeywords.'totalplay.Common.getDecimalValueofObject'(FoodPDP, c_salePrice_value)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_salePrice_currency)
//
///*
// * CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP,
// * c_salePrice_formatted)
// * CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP,
// * c_salePrice_formatted)
// */
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueEmpty'(FoodPDP, c_salePrice_decimalPrice)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_basePrice)
//
//CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, c_basePrice_value)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_basePrice_currency)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_basePrice_currency)
//
////CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_basePrice_formatted)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_basePrice_formatted)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueNotEmptyorNotNull'(FoodPDP, c_basePrice_decimalPrice)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts)
//
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, c_similarProducts_online)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_link)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts_link)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_linkType)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts_linkType)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_productId)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts_productId)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_productName)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts_productName)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_productDesc)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts_productDesc)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_productType)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts_productType)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_basePrice)
//
//CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, c_similarProducts_basePrice_value)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_basePrice_currency)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts_basePrice_currency)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueNotEmptyorNotNull'(FoodPDP, c_similarProducts_basePrice_formatted)
//
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueNotEmptyorNotNull'(FoodPDP, c_similarProducts_basePrice_decimalPrice)
//
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_salePrice)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueEmpty'(FoodPDP, c_similarProducts_salePrice_currency)
//
//CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, c_similarProducts_salePrice_value)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueEmpty'(FoodPDP, c_similarProducts_salePrice_formatted)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueEmpty'(FoodPDP, c_similarProducts_salePrice_decimalPrice)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_image)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_image_alt)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts_image_alt)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_image_url)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts_image_url)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_image_title)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts_image_title)
//
//CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, c_similarProducts_discount_percentage)
//
//CustomKeywords.'totalplay.Common.verifyPropertyEmpty'(FoodPDP, c_similarProducts_promotionName)
///*
// * CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP,
// * c_similarProducts_promotionName_calloutMsg)
// * CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP,
// * c_similarProducts_promotionName_calloutMsg)
// * 
// * CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP,
// * c_similarProducts_promotionName_details)
// * CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP,
// * c_similarProducts_promotionName_details)
// * 
// * CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP,
// * c_similarProducts_promotionName_enabled)
// * CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP,
// * c_similarProducts_promotionName_enabled)
// * 
// * CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP,
// * c_similarProducts_promotionName_name)
// * CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP,
// * c_similarProducts_promotionName_name)
// * 
// * CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP,
// * c_similarProducts_promotionName_id)
// * CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP,
// * c_similarProducts_promotionName_id)
// * 
// * CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP,
// * c_similarProducts_promotionName_promotionClass)
// * CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP,
// * c_similarProducts_promotionName_promotionClass)
// * 
// * CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP,
// * c_similarProducts_promotionName_rank)
// * CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP,
// * c_similarProducts_promotionName_rank)
// * 
// * CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP,
// * c_similarProducts0_promoPrice)
// */
//
//CustomKeywords.'totalplay.Common.verifyPropertyEmpty'(FoodPDP, c_similarProducts0_colorSwatches)
//
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, c_similarProducts0_isVariant)
//// getting $ and decimal price
///*
// * CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP,
// * c_similarProducts0_emi_installment_amount)
// * CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP,
// * c_similarProducts0_emi_installment_amount)
// */
//
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, c_similarProducts0_bestOfferPrice)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts1_link)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts1_link)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts1_linkType)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts1_linkType)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts1_productId)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts1_productId)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts1_productName)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts1_productName)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts1_productDesc)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts1_productDesc)
////value is coming empty in product type of similar products1
//
///*
// * String c_similarProducts1_productTypeValue =
// * WS.getElementPropertyValue(FoodPDP, c_similarProducts1_productType)
// * println(c_similarProducts1_productTypeValue)
// * CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP,
// * c_similarProducts1_productType)
// * CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP,
// * c_similarProducts1_productType)
// */
// 
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts1_basePrice)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts1_basePrice_currency)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts1_basePrice_currency)
//
//CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, c_similarProducts1_basePrice_value)
//
///*
// * CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP,
// * c_similarProducts1_basePrice_formatted)
// * CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP,
// * c_similarProducts1_basePrice_formatted)
// */
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueNotEmptyorNotNull'(FoodPDP, c_similarProducts1_basePrice_decimalPrice)
//
//CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, c_similarProducts1_salePrice_value)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueEmpty'(FoodPDP, c_similarProducts1_salePrice_currency)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueEmpty'(FoodPDP, c_similarProducts1_salePrice_formatted)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueEmpty'(FoodPDP, c_similarProducts1_salePrice_decimalPrice)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts1_image)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts1_image_url)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts1_image_url)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts1_image_title)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts1_image_title)
//
//CustomKeywords.'totalplay.Common.verifyPropertyEmpty'(FoodPDP, c_similarProducts1_promotionName)
//
//CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, c_similarProducts_promoPrice)
//
//CustomKeywords.'totalplay.Common.verifyPropertyEmpty'(FoodPDP, c_similarProducts_colorSwatches)
/*
 * CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP,
 * c_similarProducts1_emi_installment_amount)
 * CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP,
 * c_similarProducts1_emi_installment_amount)
 */



type = '_type'

brand = 'brand'

currency = 'currency'

id = 'id'

inventory = 'inventory'

inventory_type = 'inventory._type'

inventory_ats = 'inventory.ats'

inventory_backorderable = 'inventory.backorderable'

inventory_id = 'inventory.id'

inventory_orderable = 'inventory.orderable'

inventory_preorderable = 'inventory.preorderable'

inventory_stock_level = 'inventory.stock_level'

min_order_quantity = 'min_order_quantity'

name = 'name'

price = 'price'

price_per_unit = 'price_per_unit'

product_promotions = 'product_promotions'

product_promotions_type = 'product_promotions[0]._type'

product_promotions_link = 'product_promotions[0].link'

product_promotions_promotion_id = 'product_promotions[0].promotion_id'

step_quantity = 'step_quantity'

type_type = 'type._type'

c_PromoAvailable = 'c_PromoAvailable'

c_corporateName = 'c_corporateName'

c_description = 'c_description'

c_discountPercentage = 'c_discountPercentage'

c_individualDelivery = 'c_individualDelivery'

c_marketplaceProduct = 'c_marketplaceProduct'

c_miraklProductDataSource = 'c_miraklProductDataSource'

c_miraklProductId = 'c_miraklProductId'

c_miraklShopID = 'c_miraklShopID'

c_miraklShopName = 'c_miraklShopName'

c_productType = 'c_productType'

c_promotionName = 'c_promotionName'

c_sapId = 'c_sapId'

c_selectable = 'c_selectable'

c_seller_lead_times = 'c_seller-lead-times'

c_sellerDescription = 'c_sellerDescription'

c_shopIdName = 'c_shopIdName'

c_tpshop = 'c_tpshop'

c_updateMiraklImages = 'c_updateMiraklImages'

c_verticalType = 'c_verticalType'

c_salePrice = 'c_salePrice'

c_salePrice_value = 'c_salePrice.value'

c_salePrice_currency = 'c_salePrice.currency'

//c_salePrice_formatted = 'c_salePrice.formatted'
c_salePrice_decimalPrice = 'c_salePrice.decimalPrice'

c_basePrice = 'c_basePrice'

//c_basePrice_value = 'c_basePrice.value'
c_basePrice_currency = 'c_basePrice.currency'

//c_basePrice_formatted = 'c_basePrice.formatted'
c_basePrice_decimalPrice = 'c_basePrice.decimalPrice'

c_similarProducts = 'c_similarProducts'

c_similarProducts_online = 'c_similarProducts[0].online'

c_similarProducts_link = 'c_similarProducts[0].link'

c_similarProducts_linkType = 'c_similarProducts[0].linkType'

c_similarProducts_productId = 'c_similarProducts[0].productId'

c_similarProducts_productName = 'c_similarProducts[0].productName'

c_similarProducts_productDesc = 'c_similarProducts[0].productDesc'

c_similarProducts_productType = 'c_similarProducts[0].productType'

c_similarProducts_basePrice = 'c_similarProducts[0].basePrice'

//c_similarProducts_basePrice.value = 'c_similarProducts[0].basePrice.value'
c_similarProducts_basePrice_currency = 'c_similarProducts[0].basePrice.currency'

//c_similarProducts_basePrice_formatted = 'c_similarProducts[0].basePrice.formatted'
c_similarProducts_basePrice_decimalPrice = 'c_similarProducts[0].basePrice.decimalPrice'

c_similarProducts_salePrice = 'c_similarProducts[0].salePrice'

c_similarProducts_salePrice_value = 'c_similarProducts[0].salePrice.value'

c_similarProducts_salePrice_currency = 'c_similarProducts[0].salePrice.currency'

c_similarProducts_salePrice_formatted = 'c_similarProducts[0].salePrice.formatted'

c_similarProducts_image_alt = 'c_similarProducts[0].image[0].alt'

c_similarProducts_image_url = 'c_similarProducts[0].image[0].url'

c_similarProducts_imagetitle = 'c_similarProducts[0].image[0].title'

c_similarProducts_discount_percentage = 'c_similarProducts[0].discount_percentage'

c_similarProducts_promotionName = 'c_similarProducts[0].promotionName'

c_similarProducts_promotionName_calloutMsg = 'c_similarProducts[0].promotionName[0].calloutMsg'

c_similarProducts_promotionName_details = 'c_similarProducts[0].promotionName[0].details'

c_similarProducts_promotionName_enabled = 'c_similarProducts[0].promotionName[0].enabled'

c_similarProducts_promotionName_id = 'c_similarProducts[0].promotionName[0].id'

c_similarProducts_promotionName_name = 'c_similarProducts[0].promotionName[0].name'

c_similarProducts_promotionName_promotionClass = 'c_similarProducts[0].promotionName[0].promotionClass'

c_similarProducts_promotionName_rank = 'c_similarProducts[0].promotionName[0].rank'

c_similarProducts_promoPrice = 'c_similarProducts[0].promoPrice'

c_similarProducts_isVariant = 'c_similarProducts[0].isVariant'

c_similarProducts_colorSwatches = 'c_similarProducts[0].colorSwatches'

c_similarProducts_emi_installment_amount = 'c_similarProducts[0].emi_installment_amount'

c_similarProducts_bestOfferPrice = 'c_similarProducts[0].bestOfferPrice'

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, brand)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, brand)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, currency)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, currency)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, inventory)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, inventory_type)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, inventory_type)

CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, inventory_ats)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, inventory_backorderable)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, inventory_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, inventory_id)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, inventory_orderable)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, inventory_preorderable)
CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, inventory_stock_level)
CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, min_order_quantity)


CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, name)
CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, price)
CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, price_per_unit)
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, product_promotions)
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, product_promotions_type)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, product_promotions_type)
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, product_promotions_link)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, product_promotions_link)
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, product_promotions_promotion_id)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, product_promotions_promotion_id)
//CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodPDP, step_quantity)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, type_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, type_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_PromoAvailable)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_PromoAvailable)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_description)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_description)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, c_individualDelivery)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, c_marketplaceProduct)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_miraklProductDataSource)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_miraklProductDataSource)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_miraklProductId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_miraklProductId)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_miraklShopID)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_miraklShopName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_productType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_productType)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_promotionName)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_promotionName)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_sapId)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_sapId)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_selectable)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_selectable)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_sellerDescription)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_sellerDescription)
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_shopIdName)
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, c_tpshop)
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, c_updateMiraklImages)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_verticalType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_salePrice)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_salePrice_currency)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_salePrice_currency)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_salePrice_decimalPrice)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_salePrice_decimalPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_basePrice_currency)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_basePrice_currency)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_basePrice_decimalPrice)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_basePrice_decimalPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodPDP, c_similarProducts_online)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_link)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_productId)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts_productId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_productName)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts_productName)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_productDesc)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts_productDesc)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_productType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts_productType)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_basePrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts_basePrice_currency)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_basePrice_currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts_basePrice_decimalPrice)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_basePrice_decimalPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_salePrice)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_image_alt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodPDP, c_similarProducts_image_alt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_imagetitle)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodPDP, c_similarProducts_promotionName)
