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

Cart_Recommendations = WS.sendRequest(findTestObject('TotalPlay-Food/Cart Recommendations', [('URL') : GlobalVariable.URL]))

id = 'id'
c_result = 'c_result'
name='name'
c_result_carousel = 'c_result.carousel'
c_result_carousel_online = 'c_result.carousel[0].online'
c_result_carousel_link = 'c_result.carousel[0].link'
c_result_carousel_linkType = 'c_result.carousel[0].linkType'
c_result_carousel_productId = 'c_result.carousel[0].productId'
c_result_carousel_productName ='c_result.carousel[0].productName'
c_result_carousel_productDesc = 'c_result.carousel[0].productDesc'
c_result_carousel_productType = 'c_result.carousel[0].productType'
c_result_carousel_basePrice_value = 'c_result.carousel[0].basePrice.value'
c_result_carousel_basePrice = 'c_result.carousel[0].basePrice'
c_result_carousel_basePrice_currency = 'c_result.carousel[0].basePrice.currency'
c_result_carousel_basePrice_formatted = 'c_result.carousel[0].basePrice.formatted'
c_result_carousel_basePrice_decimalPrice = 'c_result.carousel[0].basePrice.decimalPrice'
c_result_carousel_salePrice = 'c_result.carousel[0].salePrice'
c_result_carousel_salePrice_value = 'c_result.carousel[0].salePrice.value'
c_result_carousel_salePrice_currency = 'c_result.carousel[0].salePrice.currency'
c_result_carousel_salePrice_decimalPrice = 'c_result.carousel[0].salePrice.decimalPrice'
c_result_carousel_salePrice_formatted = 'c_result.carousel[0].salePrice.formatted'
c_result_carousel_image = 'c_result.carousel[0].image'
c_result_carousel_image_alt = 'c_result.carousel[0].image[0].alt'
c_result_carousel_image_url = 'c_result.carousel[0].image[0].url'
c_result_carousel_image_title = 'c_result.carousel[0].image[0].title'
c_result_carousel_discount_percentage = 'c_result.carousel[0].discount_percentage'
c_result_carousel_isVariant = 'c_result.carousel[0].isVariant'
c_result_carousel_promotionName = 'c_result.carousel[0].promotionName'
c_result_carousel_colorSwatches = 'c_result.carousel[0].colorSwatches'
c_result_carousel_emi_installment_amount = 'c_result.carousel[0].emi_installment_amount'
c_result_carousel1 = 'c_result.carousel[1]'

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Cart_Recommendations,id)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Cart_Recommendations,c_result)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Cart_Recommendations,name)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Cart_Recommendations,c_result_carousel)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Cart_Recommendations,c_result_carousel_online)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Cart_Recommendations,c_result_carousel_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Cart_Recommendations,c_result_carousel_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Cart_Recommendations,c_result_carousel_productId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Cart_Recommendations,c_result_carousel_productName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Cart_Recommendations,c_result_carousel_productDesc)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Cart_Recommendations,c_result_carousel_productType)
CustomKeywords.'totalplay.Common.getNumValueofObject'(Cart_Recommendations,c_result_carousel_basePrice_value)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Cart_Recommendations,c_result_carousel_basePrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Cart_Recommendations,c_result_carousel_basePrice_currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Cart_Recommendations,c_result_carousel_basePrice_formatted)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Cart_Recommendations,c_result_carousel_basePrice_decimalPrice)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Cart_Recommendations,c_result_carousel_salePrice)
CustomKeywords.'totalplay.Common.getNumValueofObject'(Cart_Recommendations,c_result_carousel_salePrice_value)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Cart_Recommendations,c_result_carousel_salePrice_currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Cart_Recommendations,c_result_carousel_salePrice_decimalPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Cart_Recommendations,c_result_carousel_salePrice_formatted)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Cart_Recommendations,c_result_carousel_image)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Cart_Recommendations,c_result_carousel_image_alt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Cart_Recommendations,c_result_carousel_image_url)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Cart_Recommendations,c_result_carousel_image_title)
CustomKeywords.'totalplay.Common.getNumValueofObject'(Cart_Recommendations,c_result_carousel_discount_percentage)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Cart_Recommendations,c_result_carousel_isVariant)
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(Cart_Recommendations,c_result_carousel_promotionName)
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(Cart_Recommendations,c_result_carousel_colorSwatches)
CustomKeywords.'totalplay.Common.getNumValueofObject'(Cart_Recommendations,c_result_carousel_emi_installment_amount)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Cart_Recommendations,c_result_carousel1)
