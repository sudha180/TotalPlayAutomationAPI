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
 
Search_Response=WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/IPTV Services Copy/Search', [('URL') : GlobalVariable.URL]))
 
WS.verifyResponseStatusCode(Search_Response, 200)
 
CustomKeywords.'totalplay.Common.printResponseinText'(Search_Response)
 
Response_IdResult	=	 'Response.IdResult'
Response_Result	=	 'Response.Result'
Response_ResultDescription	=	 'Response.ResultDescription'
products_0_id	=	 'products[0].id'
products_0_title	=	 'products[0].title'
products_0_price_price	=	 'products[0].price.price'
products_0_price_amount	=	 'products[0].price.amount'
products_0_price_color	=	 'products[0].price.color'
products_0_price_currency	=	 'products[0].price.currency'
products_0_promotion_discount	=	 'products[0].promotion.discount'
products_0_promotion_disccountPrice	=	 'products[0].promotion.disccountPrice'
products_0_promotion_exipiration	=	 'products[0].promotion.exipiration'
products_0_promotion_quantityDisccount	=	 'products[0].promotion.quantityDisccount'
products_0_media_video	=	 'products[0].media.video'
products_0_totalplay_min	=	 'products[0].totalplay.min'
products_0_totalplay_month	=	 'products[0].totalplay.month'
products_0_inWishlist	=	 'products[0].inWishlist'
products_0_description	=	 'products[0].description'
products_0_inStock	=	 'products[0].inStock'
page	=	 'page'
totalPages	=	 'totalPages'
totalResults	=	 'totalResults'
 
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Search_Response, Response_IdResult)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Search_Response, Response_IdResult)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Search_Response, Response_Result)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Search_Response, Response_Result)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Search_Response, Response_ResultDescription)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Search_Response, Response_ResultDescription)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Search_Response, products_0_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Search_Response, products_0_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Search_Response, products_0_title)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Search_Response, products_0_title)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Search_Response, products_0_price_price)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Search_Response, products_0_price_price)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Search_Response, products_0_price_amount)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Search_Response, products_0_promotion_disccountPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Search_Response, products_0_promotion_disccountPrice)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Search_Response, products_0_promotion_quantityDisccount)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Search_Response, products_0_promotion_quantityDisccount)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Search_Response, products_0_promotion_discount)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Search_Response, products_0_media_video)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Search_Response, products_0_promotion_exipiration)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Search_Response, products_0_price_color)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Search_Response, products_0_price_color)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Search_Response, products_0_price_currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Search_Response, products_0_price_currency)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Search_Response, products_0_totalplay_min)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Search_Response, products_0_totalplay_min)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Search_Response, products_0_totalplay_month)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Search_Response, products_0_inWishlist)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Search_Response, products_0_description)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Search_Response, products_0_inStock)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(Search_Response, page)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(Search_Response, totalPages)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(Search_Response, totalResults)
 