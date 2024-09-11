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