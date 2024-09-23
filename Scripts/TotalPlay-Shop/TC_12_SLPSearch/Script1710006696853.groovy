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
 
SLP_Search_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Search/SLP Search', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID]))
CustomKeywords.'totalplay.Common.printResponseinText'(SLP_Search_Response)

WS.verifyResponseStatusCode(SLP_Search_Response, 200)
 
CustomKeywords.'totalplay.Common.printResponseinText'(SLP_Search_Response)
 
store_name = 'stores[0].name'
store_corporateName = 'stores[0].corporateName'
store_ondemandEDD = 'stores[0].ondemandEDD'
store_multiStoreEDD = 'stores[0].multiStoreEDD'
store_image = 'stores[0].image'
store_productsCount = 'stores[0].productsCount'
store_link = 'stores[0].link'
store_linkType = 'stores[0].linkType'
store_corporateColorCode = 'stores[0].corporateColorCode'
store_verticalType = 'stores[0].verticalType'
store_Open = 'stores[0].storeOpen'
 
product_Id = 'stores[1].products[0].productId'
product_Name = 'stores[1].products[0].productName'
product_link = 'stores[1].products[0].link'
product_linkType = 'stores[1].products[0].linkType'
 
categories_id = 'categories[0].id'
categories_name = 'categories[0].name'
categories_link = 'categories[0].link'
categories_linkType = 'categories[0].linkType'
categories_parentCategoryName = 'categories[0].parentCategoryName'
 
product_productId = 'products[0].productId'
product_productName = 'products[0].productName'
product_product_link = 'products[0].link'
product_product_linkType  = 'products[0].linkType'
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, store_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, store_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, store_corporateName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, store_corporateName)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(SLP_Search_Response, store_ondemandEDD)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, store_ondemandEDD)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, store_multiStoreEDD)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, store_multiStoreEDD)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, store_image)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, store_image)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(SLP_Search_Response, store_productsCount)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, store_productsCount)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, store_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, store_link)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, store_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, store_linkType)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, store_corporateColorCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, store_corporateColorCode)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, store_verticalType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, store_verticalType)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SLP_Search_Response, store_Open)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, store_Open)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, product_Id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, product_Id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, product_Name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, product_Name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, product_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, product_link)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, product_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, product_linkType)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, categories_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, categories_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, categories_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, categories_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, categories_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, categories_link)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, categories_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, categories_linkType)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, categories_parentCategoryName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, categories_parentCategoryName)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, product_productId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, product_productId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, product_productName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, product_productName)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, product_product_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, product_product_link)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Search_Response, product_product_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Search_Response, product_product_linkType)
 