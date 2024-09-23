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
 
SCP_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/SCP/Store category page', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID]))
 
WS.verifyResponseStatusCode(SCP_Response, 200)
 
id = 'id'
name = 'name'
Seller_name = 'c_result.stores[0].name'
Seller_image = 'c_result.stores[0].image'
ondemandEDD = 'c_result.stores[0].ondemandEDD'
corporateColorCode = 'c_result.stores[0].corporateColorCode'
multiStoreEDD = 'c_result.stores[0].multiStoreEDD'
link =  'c_result.stores[0].link'
linkType = 'c_result.stores[0].linkType'
product_name = 'c_result.stores[0].products[0].name'
product_ID = 'c_result.stores[0].products[0].ID'
sellerId = 'c_result.stores[0].products[0].sellerId'
corporateName = 'c_result.stores[0].products[0].corporateName'
productType = 'c_result.stores[0].products[0].productType'
productImage = 'c_result.stores[0].products[0].productImage'
c_result_stores_0_products_0_price_Sales_value='c_result_stores_0_products_0_price_Sales_value'
c_result_stores_0_products_0_price_sales_currency	=	 'c_result.stores[0].products[0].price.sales.currency'
c_result_stores_0_products_0_price_sales_formatted	=	 'c_result.stores[0].products[0].price.sales.formatted'
c_result_stores_0_products_0_price_sales_decimalPrice	=	 'c_result.stores[0].products[0].price.sales.decimalPrice'
c_result_stores_0_products_0_price_list_value	=	 'c_result.stores[0].products[0].price.list.value'
c_result_stores_0_products_0_price_list_currency	=	 'c_result.stores[0].products[0].price.list.currency'
c_result_stores_0_products_0_price_list_formatted	=	 'c_result.stores[0].products[0].price.list.formatted'
c_result_stores_0_products_0_price_list_decimalPrice	=	 'c_result.stores[0].products[0].price.list.decimalPrice'
c_result_stores_0_products_0_isVariant	=	 'c_result.stores[0].products[0].isVariant'
c_result_pageDetails_pagesCount	=	 'c_result.pageDetails.pagesCount'
c_result_pageDetails_storesPerPage	=	 'c_result.pageDetails.storesPerPage'
c_result_pageDetails_currentPage	=	 'c_result.pageDetails.currentPage'
c_result_pageDetails_currentPage	=	 'c_result.pageDetails.currentPage'
c_result_overall_stores_count	=	 'c_result.overall_stores_count'
c_result_stores_count='c_result.stores_count'
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, Seller_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, Seller_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, Seller_image)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, Seller_image)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(SCP_Response, ondemandEDD)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, corporateColorCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, corporateColorCode)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, multiStoreEDD)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, multiStoreEDD)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, link)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, linkType)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, product_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, product_name)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SCP_Response, c_result_stores_0_products_0_price_Sales_value)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, c_result_stores_0_products_0_price_sales_currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, c_result_stores_0_products_0_price_sales_currency)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, c_result_stores_0_products_0_price_sales_formatted)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, c_result_stores_0_products_0_price_sales_formatted)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, c_result_stores_0_products_0_price_sales_decimalPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, c_result_stores_0_products_0_price_sales_decimalPrice)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SCP_Response, c_result_stores_0_products_0_price_list_value)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, c_result_stores_0_products_0_price_list_currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, c_result_stores_0_products_0_price_list_currency)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, c_result_stores_0_products_0_price_list_formatted)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, c_result_stores_0_products_0_price_list_formatted)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, c_result_stores_0_products_0_price_list_decimalPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, c_result_stores_0_products_0_price_list_decimalPrice)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SCP_Response, c_result_stores_0_products_0_isVariant)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(SCP_Response, c_result_pageDetails_pagesCount)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SCP_Response, c_result_pageDetails_storesPerPage)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, c_result_pageDetails_currentPage)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, c_result_pageDetails_currentPage)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(SCP_Response, c_result_overall_stores_count)
CustomKeywords.'totalplay.Common.getNumValueofObject'(SCP_Response, c_result_stores_count)
 