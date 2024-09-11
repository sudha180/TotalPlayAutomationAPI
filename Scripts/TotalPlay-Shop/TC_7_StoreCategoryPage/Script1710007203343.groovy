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
pricetype = 'c_result.stores[0].products[0].price.type'
min_sales_value = 'c_result.stores[0].products[0].price.min.sales.value'
min_sales_currency = 'c_result.stores[0].products[0].price.min.sales.currency'
min_sales_formatted = 'c_result.stores[0].products[0].price.min.sales.formatted'
min_sales_decimalPrice = 'c_result.stores[0].products[0].price.min.sales.decimalPrice'
max_sales_value = 'c_result.stores[0].products[0].price.max.sales.value'
max_sales_formatted = 'c_result.stores[0].products[0].price.max.sales.formatted'
max_sales_decimalPrice = 'c_result.stores[0].products[0].price.max.sales.decimalPrice'
max_sales_currency = 'c_result.stores[0].products[0].price.max.sales.currency'
isVariant = 'c_result.stores[0].products[0].isVariant'
stores_count = 'c_result.stores_count'
overall_stores_count = 'c_result.overall_stores_count'


CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, Seller_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, Seller_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, Seller_image)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, Seller_image)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, ondemandEDD)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, ondemandEDD)

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

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, productImage)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, productImage)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, pricetype)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, pricetype)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SCP_Response, min_sales_value)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, min_sales_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, min_sales_currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, min_sales_currency)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, min_sales_formatted)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, min_sales_formatted)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, min_sales_decimalPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, min_sales_decimalPrice)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(SCP_Response, max_sales_value)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, max_sales_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, max_sales_formatted)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, max_sales_formatted)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, max_sales_decimalPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, max_sales_decimalPrice)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCP_Response, max_sales_currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, max_sales_currency)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SCP_Response, isVariant)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, isVariant)

CustomKeywords.'totalplay.Common.getNumValueofObject'(SCP_Response, stores_count)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, stores_count)

CustomKeywords.'totalplay.Common.getNumValueofObject'(SCP_Response, overall_stores_count)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCP_Response, overall_stores_count)














