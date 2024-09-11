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

SLP_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/SLP/Store Listing Page', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID]))

WS.verifyResponseStatusCode(SLP_Response,200)

homebanner_pageId = 'pageId'
homebanner_pageTypeId = 'pageTypeId'
homebanner_pageTitle = 'pageTitle'
homebanner_componentTypeId = 'components[0].componentTypeId'
homebanner_componentType = 'components[0].componentType'
homebanner_textHeadline = 'components[0].textHeadline'
homebanner_bannerLayout = 'components[0].bannerLayout'
homebanner_componentTypeId = 'components[0].componentAssets[1].componentTypeId'
homebanner_componentType = 'components[0].componentAssets[1].componentType'
homebanner_image = 'components[0].componentAssets[1].image'
homebanner_bannerDesc = 'components[0].componentAssets[1].bannerDesc'
homebanner_isAgeRestricted = 'components[0].componentAssets[1].isAgeRestricted'
homebanner_link = 'components[0].componentAssets[1].link'
homebanner_weblink = 'components[0].componentAssets[1].weblink'
homebanner_bannerName = 'components[0].componentAssets[1].bannerName'
homebanner_linkType = 'components[0].componentAssets[1].linkType'
homebanner_storeLogo = 'components[0].componentAssets[1].storeLogo'
homebanner_corporateColorCode = 'components[0].componentAssets[1].corporateColorCode'


CategoryCluster_componentTypeId = 'components[1].componentTypeId'
CategoryCluster_componentType = 'components[1].componentType'
CategoryCluster_storeSelectorvalue = 'components[1].storeSelector.value'
CategoryCluster_groupingName = 'components[1].groupingName'
CategoryCluster_isCluster = 'components[1].isCluster'
CategoryCluster_clusterName = 'components[1].clusterName'
CategoryCluster_nodesLength = 'components[1].nodesLength'
CategoryCluster_link = 'components[1].link'
CategoryCluster_linkType = 'components[1].linkType'
CategoryCluster_ID = 'components[1].storeList[0].ID'
CategoryCluster_name = 'components[1].storeList[0].name'
CategoryCluster_logo = 'components[1].storeList[0].logo'
CategoryCluster_corporateColorCode = 'components[1].storeList[0].corporateColorCode'
CategoryCluster_corporateName = 'components[1].storeList[0].corporateName'
CategoryCluster_storeOpen = 'components[1].storeList[0].storeOpen'
CategoryCluster_OpenHrs = 'components[1].storeList[0].OpenHrs'
CategoryCluster_multistoreEDD = 'components[1].storeList[0].multistoreEDD'
CategoryCluster_isAgeRestricted = 'components[1].storeList[0].isAgeRestricted'
CategoryCluster_link = 'components[1].storeList[0].link'
CategoryCluster_linkType = 'components[1].storeList[0].linkType'


CategoryCluster1_componentTypeId = 'components[2].componentTypeId'
CategoryCluster1_componentType = 'components[2].componentType'
CategoryCluster1_storeSelectorvalue = 'components[2].storeSelector.value'
CategoryCluster1_groupingName = 'components[2].groupingName'
CategoryCluster1_isCluster = 'components[2].isCluster'
CategoryCluster1_clusterName = 'components[2].clusterName'
CategoryCluster1_nodesLength = 'components[2].nodesLength'
CategoryCluster1_link = 'components[2].link'
CategoryCluster1_linkType = 'components[2].linkType'
CategoryCluster1_ID = 'components[2].storeList[0].ID'
CategoryCluster1_name = 'components[2].storeList[0].name'
CategoryCluster1_logo = 'components[2].storeList[0].logo'
CategoryCluster1_corporateColorCode = 'components[2].storeList[0].corporateColorCode'
CategoryCluster1_corporateName = 'components[2].storeList[0].corporateName'
CategoryCluster1_isInRange = 'components[2].storeList[0].isInRange'
CategoryCluster1_storeOpen = 'components[2].storeList[0].storeOpen'
CategoryCluster1_OpenHrs = 'components[2].storeList[0].OpenHrs'
CategoryCluster1_ondemandEDD = 'components[2].storeList[0].ondemandEDD'
CategoryCluster1_isAgeRestricted = 'components[2].storeList[0].isAgeRestricted'
CategoryCluster1_link = 'components[2].storeList[0].link'
CategoryCluster1_linkType = 'components[2].storeList[0].linkType'


GroupingStores_componentTypeId = 'components[5].componentTypeId'
GroupingStores_componentType = 'components[5].componentType'
GroupingStores_groupingName = 'components[5].groupingName'
GroupingStores_linkType = 'components[5].linkType'
GroupingStores_link = 'components[5].link'
GroupingStores_componentTypeId = 'components[5].componentAssets[0].componentTypeId'
GroupingStores_componentType = 'components[5].componentAssets[0].componentType'
GroupingStores_storeDesc = 'components[5].componentAssets[0].storeDesc'
GroupingStores_Storelink = 'components[5].componentAssets[0].link'
GroupingStores_StorelinkType = 'components[5].componentAssets[0].linkType'
GroupingStores_bgImage = 'components[5].componentAssets[0].bgImage'
GroupingStores_storeIDvalue = 'components[5].componentAssets[0].storeID.value'
GroupingStores_logo = 'components[5].componentAssets[0].logo'
GroupingStores_storeName = 'components[5].componentAssets[0].storeName'
GroupingStores_corporateColorCode = 'components[5].componentAssets[0].corporateColorCode'
GroupingStores_corporateName = 'components[5].componentAssets[0].corporateName'
GroupingStores_ondemandEDD = 'components[5].componentAssets[0].ondemandEDD'
GroupingStores_multistoreEDD = 'components[5].componentAssets[0].multistoreEDD'
GroupingStores_storeOpen = 'components[5].componentAssets[0].storeOpen'
GroupingStores_OpenHrs = 'components[5].componentAssets[0].OpenHrs'
GroupingStores_isAgeRestricted = 'components[5].componentAssets[0].isAgeRestricted'

// homebanner

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, homebanner_pageId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, homebanner_pageId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, homebanner_pageTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, homebanner_pageTypeId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, homebanner_pageTitle)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, homebanner_pageTitle)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, homebanner_textHeadline)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, homebanner_textHeadline)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, homebanner_image)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, homebanner_image)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, homebanner_bannerDesc)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, homebanner_bannerDesc)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SLP_Response, homebanner_isAgeRestricted)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, homebanner_isAgeRestricted)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, homebanner_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, homebanner_link)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, homebanner_weblink)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, homebanner_weblink)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, homebanner_bannerName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, homebanner_bannerName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, homebanner_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, homebanner_linkType)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SLP_Response, homebanner_storeLogo)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, homebanner_storeLogo)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, homebanner_corporateColorCode)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, homebanner_corporateColorCode)

// storeCategoryCluster 

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, CategoryCluster_storeSelectorvalue)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, CategoryCluster_storeSelectorvalue)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, CategoryCluster_groupingName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, CategoryCluster_groupingName)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SLP_Response, CategoryCluster_isCluster)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, CategoryCluster_isCluster)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, CategoryCluster_clusterName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, CategoryCluster_clusterName)

CustomKeywords.'totalplay.Common.getNumValueofObject'(SLP_Response, CategoryCluster_nodesLength)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, CategoryCluster_nodesLength)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, CategoryCluster_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, CategoryCluster_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, CategoryCluster_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, CategoryCluster_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, CategoryCluster_ID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, CategoryCluster_ID)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, CategoryCluster_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, CategoryCluster_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, CategoryCluster_logo)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, CategoryCluster_logo)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, CategoryCluster_corporateColorCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, CategoryCluster_corporateColorCode)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, CategoryCluster_corporateName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, CategoryCluster_corporateName)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SLP_Response, CategoryCluster_storeOpen)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, CategoryCluster_storeOpen)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, CategoryCluster_OpenHrs)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, CategoryCluster_OpenHrs)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, CategoryCluster_multistoreEDD)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, CategoryCluster_multistoreEDD)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SLP_Response, CategoryCluster_isAgeRestricted)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, CategoryCluster_isAgeRestricted)


CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, CategoryCluster_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, CategoryCluster_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, CategoryCluster_linkType)  
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, CategoryCluster_linkType)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SLP_Response, CategoryCluster1_isInRange)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, CategoryCluster1_isInRange)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, CategoryCluster1_ondemandEDD)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, CategoryCluster1_ondemandEDD)

// StoreCategoryGroup


CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, GroupingStores_groupingName )
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, GroupingStores_groupingName )

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, GroupingStores_linkType )
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, GroupingStores_linkType )

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, GroupingStores_link )
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, GroupingStores_link )

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, GroupingStores_storeDesc )
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, GroupingStores_storeDesc )

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, GroupingStores_Storelink )
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, GroupingStores_Storelink )

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, GroupingStores_StorelinkType )
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, GroupingStores_StorelinkType )

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, GroupingStores_bgImage )
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, GroupingStores_bgImage )

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, GroupingStores_storeIDvalue )
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, GroupingStores_storeIDvalue )

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, GroupingStores_logo )
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, GroupingStores_logo )

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, GroupingStores_storeName )
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, GroupingStores_storeName )


//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, GroupingStores_corporateColorCode )
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, GroupingStores_corporateColorCode )


CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, GroupingStores_corporateName )
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, GroupingStores_corporateName )


//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, GroupingStores_ondemandEDD )
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, GroupingStores_ondemandEDD )

CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, GroupingStores_multistoreEDD )
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, GroupingStores_multistoreEDD )

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SLP_Response, GroupingStores_storeOpen)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, GroupingStores_storeOpen)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(SLP_Response, GroupingStores_OpenHrs )
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, GroupingStores_OpenHrs )


CustomKeywords.'totalplay.Common.getBooleanValueofObject'(SLP_Response, GroupingStores_isAgeRestricted)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(SLP_Response, GroupingStores_isAgeRestricted)




