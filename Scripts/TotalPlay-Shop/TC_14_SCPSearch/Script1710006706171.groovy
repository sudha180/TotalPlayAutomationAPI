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

SCPSearch_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Search/SCP Search', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID]))

WS.verifyResponseStatusCode(SCPSearch_Response, 200)

stores_name = 'stores[0].name'
stores_corporateName = 'stores[0].corporateName'
stores_image = 'stores[0].image' 
stores_ondemandEDD = 'stores[0].ondemandEDD'
stores_multiStoreEDD = 'stores[0].multiStoreEDD'
stores_storeOpen = 'stores[0].storeOpen'
stores_todayOpenHrs = 'stores[0].todayOpenHrs'
stores_productsCount = 'stores[0].productsCount'
stores_link = 'stores[0].link'
stores_linkType = 'stores[0].linkType' 
stores_corporateColorCode = 'stores[0].corporateColorCode' 
stores_verticalType = 'stores[0].verticalType' 
stores_isOpen = 'stores[0].isOpen'

product_Id = 'stores[0].products[0].productId' 
product_Name = 'stores[0].products[0].productName' 
product_image = 'stores[0].products[0].image'
product_link = 'stores[0].products[0].link' 
product_linkType = 'stores[0].products[0].linkType'
product_sellerId = 'stores[0].products[0].sellerId'

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCPSearch_Response, stores_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCPSearch_Response, stores_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCPSearch_Response, stores_corporateName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCPSearch_Response, stores_corporateName)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCPSearch_Response, stores_image)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCPSearch_Response, stores_image)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCPSearch_Response, stores_ondemandEDD)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCPSearch_Response, stores_ondemandEDD)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCPSearch_Response, stores_multiStoreEDD)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCPSearch_Response, stores_multiStoreEDD)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SCPSearch_Response, stores_storeOpen)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCPSearch_Response, stores_storeOpen)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCPSearch_Response, stores_todayOpenHrs)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCPSearch_Response, stores_todayOpenHrs)

CustomKeywords.'totalplay.Common.getNumValueofObject'(SCPSearch_Response, stores_productsCount)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCPSearch_Response, stores_productsCount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCPSearch_Response, stores_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCPSearch_Response, stores_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCPSearch_Response, stores_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCPSearch_Response, stores_linkType)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCPSearch_Response, stores_corporateColorCode)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCPSearch_Response, stores_corporateColorCode)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCPSearch_Response, stores_verticalType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCPSearch_Response, stores_verticalType)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SCPSearch_Response, stores_isOpen)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCPSearch_Response, stores_isOpen)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCPSearch_Response, product_Id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCPSearch_Response, product_Id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCPSearch_Response, product_Name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCPSearch_Response, product_Name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCPSearch_Response, product_image)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCPSearch_Response, product_image)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCPSearch_Response, product_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCPSearch_Response, product_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCPSearch_Response, product_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCPSearch_Response, product_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SCPSearch_Response, product_sellerId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SCPSearch_Response, product_sellerId)

