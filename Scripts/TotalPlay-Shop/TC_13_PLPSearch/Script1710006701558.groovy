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

PLPSearch_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Search/PLP Search', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID]))

WS.verifyResponseStatusCode(PLPSearch_Response,200)

categories_id = 'categories[0].id'
categories_name = 'categories[0].name'
categories_link = 'categories[0].link'
categories_linkType = 'categories[0].linkType'
categories_parentCategoryName = 'categories[0].parentCategoryName'

productId = 'products[0].productId'
productName = 'products[0].productName'
link = 'products[0].link'
linkType = 'products[0].linkType' 

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch_Response, categories_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch_Response, categories_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch_Response, categories_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch_Response, categories_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch_Response, categories_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch_Response, categories_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch_Response, categories_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch_Response, categories_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch_Response, categories_parentCategoryName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch_Response, categories_parentCategoryName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch_Response, productId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch_Response, productId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch_Response, productName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch_Response, productName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch_Response, link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch_Response, link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLPSearch_Response, linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLPSearch_Response, linkType)




