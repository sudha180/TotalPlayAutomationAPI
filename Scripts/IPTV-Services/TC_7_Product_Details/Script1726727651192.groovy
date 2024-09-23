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
 
WebUI.callTestCase(findTestCase('IPTV-services/TC_1_Interface_Login'), [:], FailureHandling.STOP_ON_FAILURE)
 
Product_Details_response=WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/IPTV Services Copy/Get Product Details', [('URL') : GlobalVariable.URL]))
 
WS.verifyResponseStatusCode(Product_Details_response, 200)
 
CustomKeywords.'totalplay.Common.printResponseinText'(Product_Details_response)
 
 
averageRating	=	 'averageRating'
brand	=	 'brand'
categories_0_catalog	=	 'categories[0].catalog'
categories_0_catalogVersion	=	 'categories[0].catalogVersion'
categories_0_code	=	 'categories[0].code'
costoEnvio	=	 'costoEnvio'
cpEnvio	=	 'cpEnvio'
deliveryDays	=	 'deliveryDays'
description	=	 'description'
descriptionPlainText	=	 'descriptionPlainText'
envioGratis	=	 'envioGratis'
envioProveedor	=	 'envioProveedor'
id	=	 'id'
idProvedor	=	 'idProvedor'
id_category	=	 'id_category'
paquete_largo	=	 'paquete.largo'
paquete_alto	=	 'paquete.alto'
paquete_ancho	=	 'paquete.ancho'
paquete_esPaquete	=	 'paquete.esPaquete'
paquete_peso	=	 'paquete.peso'
paymentMethods_0_name	=	 'paymentMethods[0].name'
paymentMethods_0_payments_0_NPayments	=	 'paymentMethods[0].payments[0].NPayments'
paymentMethods_0_payments_0_id	=	 'paymentMethods[0].payments[0].id'
paymentMethods_0_payments_0_min	=	 'paymentMethods[0].payments[0].min'
paymentMethods_0_payments_0_month	=	 'paymentMethods[0].payments[0].month'
paymentMethods_0_payments_0_type	=	 'paymentMethods[0].payments[0].type'
price_amount	=	 'price.amount'
price_amountRounded	=	 'price.amountRounded'
price_currency	=	 'price.currency'
price_priceHasDiscount	=	 'price.priceHasDiscount'
price_priceWithDiscount	=	 'price.priceWithDiscount'
price_priceWithDiscountRounded	=	 'price.priceWithDiscountRounded'
totalplay_min	=	 'totalplay.min'
promotion_month	=	 'promotion.month'
promotion_typePromotion	=	 'promotion.typePromotion'
promotion_date_end	=	 'promotion.date_end'
promotion_date_start	=	 'promotion.date_start'
promotion_disccountPrice	=	 'promotion.disccountPrice'
promotion_disccountPriceRounded	=	 'promotion.disccountPriceRounded'
promotion_discount	=	 'promotion.discount'
promotion_quantityDisccount	=	 'promotion.quantityDisccount'
promotion_quantityDisccountRounded	=	 'promotion.quantityDisccountRounded'
provedor	=	 'provedor'
sku	=	 'sku'
status	=	 'status'
stock	=	 'stock'
stockAvailable	=	 'stockAvailable'
summary	=	 'summary'
tasaFinal	=	 'tasaFinal'
title	=	 'title'
attributes_0_ID	=	 'attributes[0].ID'
attributes_0_name	=	 'attributes[0].name'
attributes_0_attributes_0_label	=	 'attributes[0].attributes[0].label'
 
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(Product_Details_response, deliveryDays)
CustomKeywords.'totalplay.Common.getNumValueofObject'(Product_Details_response, averageRating)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_Details_response, brand)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, Response_IdResult)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, categories_0_catalog)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, categories_0_catalog)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, categories_0_catalogVersion)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, categories_0_catalogVersion)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, categories_0_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, categories_0_code)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, costoEnvio)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, costoEnvio)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, cpEnvio)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, cpEnvio)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, description)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, description)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, descriptionPlainText)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, descriptionPlainText)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Product_Details_response, envioGratis)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Product_Details_response, envioProveedor)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, idProvedor)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, idProvedor)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, id_category)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, id_category)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, paquete_alto)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, paquete_alto)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, paquete_ancho)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, paquete_ancho)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_Details_response, paquete_largo)
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_Details_response, paquete_peso)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Product_Details_response, paquete_esPaquete)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Product_Details_response, price_priceHasDiscount)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, paymentMethods_0_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, paymentMethods_0_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, paymentMethods_0_payments_0_NPayments)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, paymentMethods_0_payments_0_NPayments)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, paymentMethods_0_payments_0_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, paymentMethods_0_payments_0_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, paymentMethods_0_payments_0_min)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, paymentMethods_0_payments_0_min)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, paymentMethods_0_payments_0_month)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, paymentMethods_0_payments_0_month)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, paymentMethods_0_payments_0_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, paymentMethods_0_payments_0_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, price_amount)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, price_amount)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, price_amountRounded)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, price_amountRounded)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, price_currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, price_currency)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, price_priceWithDiscount)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, price_priceWithDiscount)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, price_priceWithDiscountRounded)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, price_priceWithDiscountRounded)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(Product_Details_response, totalplay_min)
CustomKeywords.'totalplay.Common.getNumValueofObject'(Product_Details_response, promotion_month)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_Details_response, promotion_typePromotion)
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_Details_response, promotion_date_end)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_Details_response, promotion_date_start)
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_Details_response, promotion_discount)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, promotion_disccountPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, promotion_disccountPrice)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, promotion_disccountPriceRounded)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, promotion_disccountPriceRounded)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, provedor)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, provedor)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, sku)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, sku)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, status)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, status)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Product_Details_response, stock)
CustomKeywords.'totalplay.Common.getNumValueofObject'(Product_Details_response, stockAvailable)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, summary)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, summary)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Product_Details_response, tasaFinal)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, title)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, title)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, attributes_0_ID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, attributes_0_ID)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, attributes_0_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, attributes_0_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Details_response, attributes_0_attributes_0_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Details_response, attributes_0_attributes_0_label)
 