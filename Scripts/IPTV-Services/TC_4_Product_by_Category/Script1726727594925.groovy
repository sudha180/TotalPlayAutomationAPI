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
 
Product_by_Category_Response=WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/IPTV Services Copy/GetProductByCategory', [('URL') : GlobalVariable.URL]))
 
WS.verifyResponseStatusCode(Product_by_Category_Response, 200)
 
CustomKeywords.'totalplay.Common.printResponseinText'(Product_by_Category_Response)
 
Response_IdResult	=	 'Response.IdResult'
Response_Result	=	 'Response.Result'
Response_ResultDescription	=	 'Response.ResultDescription'
banner_type	=	 'banner.type'
banner_content_id	=	 'banner.content.id'
banner_content_amount	=	 'banner.content.amount'
banner_content_price	=	 'banner.content.price'
banner_content_brand	=	 'banner.content.brand'
banner_content_name	=	 'banner.content.name'
banner_content_complement	=	 'banner.content.complement'
banner_content_typePromotion	=	 'banner.content.promotion.typePromotion'
banner_content_promotion_discount	=	 'banner.content.promotion.discount'
banner_content_promotion_exipiration	=	 'banner.content.promotion.exipiration'
banner_content_promotion_discountPrice	=	 'banner.content.promotion.disccountPrice'
banner_content_promotion_quantityDisccount	=	 'banner.content.promotion.quantityDisccount'
products_0_id	=	 'products[0].id'
products_0_name	=	 'products[0].name'
products_0_amount	=	 'products[0].price.amount'
products_0_promotion_typePromotion	=	 'products[0].promotion.typePromotion'
products_0_promotion_disccountPrice	=	 'products[0].promotion.disccountPrice'
products_0_promotion_quantityDisccount	=	 'products[0].promotion.quantityDisccount'
products_0_totalplay	=	 'products[0].totalplay'
products_0_totalplay_min	=	 'products[0].totalplay.min'
products_0_summary	=	 'products[0].summary'
products_0_exipiration	=	 'products[0].promotion.exipiration'
totalPages='totalPages'
page='page'
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_by_Category_Response, Response_IdResult)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_by_Category_Response, Response_IdResult)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_by_Category_Response, Response_Result)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_by_Category_Response, Response_Result)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_by_Category_Response, Response_ResultDescription)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_by_Category_Response, Response_ResultDescription)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_by_Category_Response, banner_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_by_Category_Response, banner_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_by_Category_Response, banner_content_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_by_Category_Response, banner_content_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_by_Category_Response, banner_content_amount)
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_by_Category_Response, banner_content_price)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_by_Category_Response, banner_content_brand)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_by_Category_Response, banner_content_brand)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_by_Category_Response, banner_content_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_by_Category_Response, banner_content_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_by_Category_Response, banner_content_complement)
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_by_Category_Response, banner_content_typePromotion)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_by_Category_Response, banner_content_promotion_discount)
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_by_Category_Response, banner_content_promotion_exipiration)
 
CustomKeywords.'totalplay.Common.verifyValueInObject'(Product_by_Category_Response, banner_content_promotion_discountPrice)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_by_Category_Response, banner_content_promotion_discountPrice)
 
CustomKeywords.'totalplay.Common.verifyValueInObject'(Product_by_Category_Response, banner_content_promotion_quantityDisccount)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_by_Category_Response, banner_content_promotion_quantityDisccount)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_by_Category_Response, products_0_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_by_Category_Response, products_0_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_by_Category_Response, products_0_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_by_Category_Response, products_0_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_by_Category_Response, products_0_amount)
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_by_Category_Response, products_0_promotion_typePromotion)
 
CustomKeywords.'totalplay.Common.verifyValueInObject'(Product_by_Category_Response, products_0_promotion_disccountPrice)
CustomKeywords.'totalplay.Common.verifyValueInObject'(Product_by_Category_Response, products_0_promotion_quantityDisccount)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_by_Category_Response, products_0_totalplay_min)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_by_Category_Response, products_0_totalplay_min)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_by_Category_Response, products_0_summary)
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_by_Category_Response, products_0_exipiration)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(Product_by_Category_Response, page)
CustomKeywords.'totalplay.Common.getNumValueofObject'(Product_by_Category_Response, totalPages)
 
 