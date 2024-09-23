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
 
PLP_OndemandResponse = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/PLP/PLP On Demand', [('URL') : GlobalVariable.URL]))
CustomKeywords.'totalplay.Common.printResponseinText'(PLP_OndemandResponse)

WS.verifyResponseStatusCode(PLP_OndemandResponse, 200)
 
action ='action'
locale = 'locale'
queryString = 'queryString'
pageId = 'pageId'
pageTitle = 'pageTitle'
pageTypeId = 'pageTypeId'
components_componentTypeId = 'components[0].componentTypeId'
components_componentType = 'components[0].componentType'
components_storeData = 'components[0].storeData'
components_storeData_ID = 'components[0].storeData.ID'
components_storeData_name ='components[0].storeData.name'
components_storeData_logo='components[0].storeData.logo'
components_storeData_todayOpenHrs ='components[0].storeData.todayOpenHrs'
components_storeData_storeType ='components[0].storeData.storeType'
components_storeData_verticalsAvailable ='components[0].storeData.verticalsAvailable'
components_storeData_link='components[0].storeData.link'
components_storeData_OndemandEDD='components[0].storeData.OndemandEDD'
components_storeData_linkType='components[0].storeData.linkType'
components_storeData_open='components[0].storeData.open'
components_storeData_corporateColorCode='components[0].storeData.corporateColorCode'
components_storeData_ageShowWarningModel ='components[0].storeData.ageShowWarningModel'
components_storeData_message_title='components[0].storeData.message.title'
components_storeData_message ='components[0].storeData.message'
components_storeData_message_description='components[0].storeData.message.description'
components_componentTypeId='components[1].componentTypeId'
components_componentType='components[1].componentType'
components_componentTypeId='components[2].componentTypeId'
components_componentType='components[2].componentType'
components_bannerLayout='components[2].bannerLayout'
components_textHeadline='components[2].textHeadline'
components_componentAssets='components[2].componentAssets'
components_componentAssets_componentTypeId='components[2].componentAssets[0].componentTypeId'
components_componentAssets_componentType='components[2].componentAssets[0].componentType'
components_componentAssets_image='components[2].componentAssets[0].image'
components_componentAssets_bannerDesc='components[2].componentAssets[0].bannerDesc'
components_componentAssets_isAgeRestricted='components[2].componentAssets[0].isAgeRestricted'
components_componentAssets_link='components[2].componentAssets[0].link'
components_componentAssets_bannerName='components[2].componentAssets[0].bannerName'
components_componentAssets_linkType='components[2].componentAssets[0].linkType'
components_componentAssets_storeLogo ='components[2].componentAssets[0].storeLogo'
components_componentAssets_corporateColorCode='components[2].componentAssets[0].corporateColorCode'
components_viewMore='components[4].viewMore'
components_linkType ='components[4].linkType'
components_products='components[4].products'
components_componentTypeId='components[5].componentTypeId'
components_layout ='components[5].layout'
components_filterTitle='components[5].filterTitle'
components_productSelector_value='components[5].productSelector.value'
components_productSelector='components[5].productSelector'
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, action)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, action)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, locale)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, locale)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, queryString)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, queryString)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, pageId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, pageId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, pageTitle)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, pageTitle)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, pageTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, pageTypeId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_componentTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_componentTypeId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_componentType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_componentType)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PLP_OndemandResponse, components_storeData)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_storeData_ID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_storeData_ID)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_storeData_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_storeData_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_storeData_logo)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_storeData_logo)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_storeData_todayOpenHrs)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_storeData_todayOpenHrs)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_storeData_storeType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_storeData_storeType)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_storeData_verticalsAvailable)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_storeData_verticalsAvailable)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_storeData_OndemandEDD)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_storeData_OndemandEDD)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_storeData_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_storeData_linkType)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PLP_OndemandResponse, components_storeData_open)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_storeData_corporateColorCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_storeData_corporateColorCode)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PLP_OndemandResponse, components_storeData_ageShowWarningModel)
 
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_storeData_message)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_storeData_message)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_storeData_message_description)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_storeData_message_description)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_componentTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_componentTypeId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_componentType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_componentType)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_bannerLayout)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_bannerLayout)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_textHeadline)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_textHeadline)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_componentAssets_componentTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_componentAssets_componentTypeId)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_componentAssets_componentType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_componentAssets_componentType)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_componentAssets_image)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_componentAssets_image)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_componentAssets_bannerDesc)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_componentAssets_bannerDesc)
 
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(PLP_OndemandResponse, components_componentAssets_isAgeRestricted)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_componentAssets_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_componentAssets_link)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_componentAssets_bannerName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_componentAssets_bannerName)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_componentAssets_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_componentAssets_linkType)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_componentAssets_storeLogo)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_componentAssets_storeLogo)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(PLP_OndemandResponse, components_componentAssets_corporateColorCode)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_viewMore)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_viewMore)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_linkType)
 
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_componentTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_componentTypeId)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_layout)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_layout)
 
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_filterTitle)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_filterTitle)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_productSelector)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_productSelector)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(PLP_OndemandResponse, components_productSelector_value)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PLP_OndemandResponse, components_productSelector_value)
 