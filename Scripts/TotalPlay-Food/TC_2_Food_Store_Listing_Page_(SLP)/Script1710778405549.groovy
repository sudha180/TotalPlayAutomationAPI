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

WebUI.callTestCase(findTestCase('TotalPlay-Food/TC_1_Login_Service'), [:], FailureHandling.STOP_ON_FAILURE)

FoodSLP = WS.sendRequest(findTestObject('TotalPlay-Food/Food SLP', [('URL') : GlobalVariable.URL]))

WS.verifyResponseStatusCode(FoodSLP, 200)
//pageId = 'pageId'
//pageTypeId = 'pageTypeId'
//pageTitle = 'pageTitle'
//components_componentTypeId = 'components[0].componentTypeId'
//components = 'components'
//components_componentType = 'components[0].componentType'
//components_bannerLayout = 'components[0].bannerLayout'
//
//components_textHeadline = 'components[0].textHeadline'
//components_componentAssets = 'components[0].componentAssets'
//components_componentAssets_componentTypeId = 'components[0].componentAssets[0].componentTypeId'   
//components_componentAssets_image = 'components[0].componentAssets[0].image'
//components_componentAssets_componentType = 'components[0].componentAssets[0].componentType'
//components_componentAssets_corporateColorCode = 'components[0].componentAssets[0].corporateColorCode'
//
//components_componentAssets_bannerDesc = 'components[0].componentAssets[0].bannerDesc'
//components_componentAssets_isAgeRestricted = 'components[0].componentAssets[0].isAgeRestricted'
//components_componentAssets_link = 'components[0].componentAssets[0].link'
//components_componentAssets_bannerName = 'components[0].componentAssets[0].bannerName'
//
//components_componentAssets_logo = 'components[0].componentAssets[0].logo'
//components_componentAssets_linkType = 'components[0].componentAssets[0].linkType'
//components_componentAssets_positionAfter = 'components[0].componentAssets[0].positionAfter'
//components_componentAssets_deliveryTime = 'components[0].componentAssets[0].deliveryTime'
//components_componentAssets_promotion = 'components[0].componentAssets[0].promotion'
//
//components_componentAssets_storeName = 'components[0].componentAssets[0].storeName'
//components_componentAssets_ID = 'components[0].componentAssets[0].ID'
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, pageId)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, pageId)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_componentType)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_componentType)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_bannerLayout)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_bannerLayout)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_componentTypeId)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_componentTypeId)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, pageTitle)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, pageTitle)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, pageTypeId)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, pageTypeId)
//
//WS.verifyElementPropertyValue(FoodSLP, 'components[0].componentAssets[0].corporateColorCode', "")
//CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(FoodSLP, components_componentAssets_corporateColorCode)
////CustomKeywords.'totalplay.Common.verifyPropertyValueEmpty'(FoodSLP, components_componentAssets_corporateColorCode)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_componentAssets_componentType)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_componentAssets_componentType)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_componentAssets_image)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_componentAssets_image)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_componentAssets)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_componentAssets_componentTypeId)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_componentAssets_componentTypeId)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_textHeadline)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_textHeadline)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_componentAssets_bannerName)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_componentAssets_bannerName)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_componentAssets_link)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_componentAssets_link)
//
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodSLP, components_componentAssets_isAgeRestricted)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_componentAssets_bannerDesc)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_componentAssets_bannerDesc)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_componentAssets_deliveryTime)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_componentAssets_promotion)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_componentAssets_promotion)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(FoodSLP, components_componentAssets_positionAfter)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_componentAssets_positionAfter)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_componentAssets_linkType)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_componentAssets_linkType)
//
////CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(FoodSLP, components_componentAssets_logo)
////CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_componentAssets_logo)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_componentAssets_storeName)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_componentAssets_storeName)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(FoodSLP, components_componentAssets_ID)




pageId	=	 'pageId'
pageTypeId	=	 'pageTypeId'
pageTitle	=	 'pageTitle'
components_0_componentTypeId	=	 'components[0].componentTypeId'
components_0_componentType	=	 'components[0].componentType'
components_0_bannerLayout	=	 'components[0].bannerLayout'
components_0_textHeadline	=	 'components[0].textHeadline'
components_0_componentAssets_0_componentTypeId	=	 'components[0].componentAssets[0].componentTypeId'
components_0_componentAssets_0_componentType	=	 'components[0].componentAssets[0].componentType'
components_0_componentAssets_0_image	=	 'components[0].componentAssets[0].image'
components_0_componentAssets_0_bannerDesc	=	 'components[0].componentAssets[0].bannerDesc'
components_0_componentAssets_0_isAgeRestricted	=	 'components[0].componentAssets[0].isAgeRestricted'
components_0_componentAssets_0_link	=	 'components[0].componentAssets[0].link'
components_0_componentAssets_0_storeSelector_value	=	 'components[0].componentAssets[0].storeSelector.value'
components_0_componentAssets_0_bannerName	=	 'components[0].componentAssets[0].bannerName'
components_0_componentAssets_0_linkType	=	 'components[0].componentAssets[0].linkType'
components_0_componentAssets_0_storeId	=	 'components[0].componentAssets[0].storeId'
components_0_componentAssets_0_promotion	=	 'components[0].componentAssets[0].promotion'
components_0_componentAssets_0_storeName	=	 'components[0].componentAssets[0].storeName'
components_0_componentAssets_0_ID	=	 'components[0].componentAssets[0].ID'
components_0_componentAssets_0_corporateColorCode	=	 'components[0].componentAssets[0].corporateColorCode'
components_0_componentAssets_0_deliveryTime	=	 'components[0].componentAssets[0].deliveryTime'
components_0_componentAssets_0_positionAfter	=	 'components[0].componentAssets[0].positionAfter'

components_1_componentTypeId	=	 'components[1].componentTypeId'
components_1_componentType	=	 'components[1].componentType'
components_1_groupingName	=	 'components[1].groupingName'
components_1_sort	=	 'components[1].sort'
components_1_componentAssets	=	 'components[1].componentAssets'
components_1_componentAssets_0_componentTypeId	=	 'components[1].componentAssets[0].componentTypeId'
components_1_componentAssets_0_componentType	=	 'components[1].componentAssets[0].componentType'
components_1_componentAssets_0_category	=	 'components[1].componentAssets[0].category'
components_1_componentAssets_0_name	=	 'components[1].componentAssets[0].name'
components_1_componentAssets_0_id	=	 'components[1].componentAssets[0].id'
components_1_componentAssets_0_image	=	 'components[1].componentAssets[0].image'
components_1_componentAssets_0_url	=	 'components[1].componentAssets[0].url'
components_1_componentAssets_0_linkType	=	 'components[1].componentAssets[0].linkType'
components_2_viewType	=	 'components[2].viewType'
components_2_heading	=	 'components[2].heading'
components_2_linesToDisplay	=	 'components[2].linesToDisplay'
components_2_componentAssets_0_storeList_0_categories_0_name	=	 'components[2].componentAssets[0].storeList[0].categories[0].name'
components_2_componentAssets_0_storeList_0_categories_0_id	=	 'components[2].componentAssets[0].storeList[0].categories[0].id'
components_2_componentAssets_0_storeList_0_categories_0_image	=	 'components[2].componentAssets[0].storeList[0].categories[0].image'
components_2_componentAssets_0_storeList_0_categories_0_url	=	 'components[2].componentAssets[0].storeList[0].categories[0].url'
components_2_componentAssets_0_storeList_0_categories_0_isLeaf	=	 'components[2].componentAssets[0].storeList[0].categories[0].isLeaf'

components_2_componentAssets_0_storeList_0_ratings	=	 'components[2].componentAssets[0].storeList[0].ratings'
components_2_componentAssets_0_storeList_0_isInRange	=	 'components[2].componentAssets[0].storeList[0].isInRange'
components_2_componentAssets_0_storeList_0_storeOpen	=	 'components[2].componentAssets[0].storeList[0].storeOpen'
components_2_componentAssets_0_storeList_0_OpenHrs	=	 'components[2].componentAssets[0].storeList[0].OpenHrs'
components_2_componentAssets_0_storeList_0_OpenHrs_time_0_openingTime	=	 'components[2].componentAssets[0].storeList[0].OpenHrs.time[0].openingTime'
components_2_componentAssets_0_storeList_0_OpenHrs_time_0_closingTime	=	 'components[2].componentAssets[0].storeList[0].OpenHrs.time[0].closingTime'
components_2_componentAssets_0_storeList_0_OpenHrs_closed	=	 'components[2].componentAssets[0].storeList[0].OpenHrs.closed'
components_2_componentAssets_0_storeList_0_OpenHrs_day	=	 'components[2].componentAssets[0].storeList[0].OpenHrs.day'
components_2_componentAssets_0_storeList_0_link	=	 'components[2].componentAssets[0].storeList[0].link'
components_2_componentAssets_0_storeList_0_linkType	=	 'components[2].componentAssets[0].storeList[0].linkType'
components_2_componentAssets_0_storeList_0_ondemandEDD	=	 'components[2].componentAssets[0].storeList[0].ondemandEDD'
components_2_componentAssets_1_componentTypeId	=	 'components[2].componentAssets[1].componentTypeId'
components_2_componentAssets_1_componentType	=	 'components[2].componentAssets[1].componentType'
components_2_componentAssets_1_storeSelector_value	=	 'components[2].componentAssets[1].storeSelector.value'
components_2_componentAssets_1_linkType	=	 'components[2].componentAssets[1].linkType'
components_2_componentAssets_1_nodesLength	=	 'components[2].componentAssets[1].nodesLength'
components_2_componentAssets_1_link	=	 'components[2].componentAssets[1].link'
components_2_componentAssets_1_storeList_0_ID	=	 'components[2].componentAssets[1].storeList[0].ID'
components_2_componentAssets_1_storeList_0_name	=	 'components[2].componentAssets[1].storeList[0].name'
components_2_componentAssets_1_storeList_0_logo	=	 'components[2].componentAssets[1].storeList[0].logo'
components_2_componentAssets_1_storeList_0_bannerImage	=	 'components[2].componentAssets[1].storeList[0].bannerImage'
components_2_componentAssets_1_storeList_0_corporateColorCode	=	 'components[2].componentAssets[1].storeList[0].corporateColorCode'
components_2_componentAssets_1_storeList_0_corporateName	=	 'components[2].componentAssets[1].storeList[0].corporateName'
components_2_componentAssets_1_storeList_0_isInRange	=	 'components[2].componentAssets[1].storeList[0].isInRange'
components_2_componentAssets_1_storeList_0_storeOpen	=	 'components[2].componentAssets[1].storeList[0].storeOpen'
components_2_componentAssets_1_storeList_0_link	=	 'components[2].componentAssets[1].storeList[0].link'
components_2_componentAssets_1_storeList_0_linkType	=	 'components[2].componentAssets[1].storeList[0].linkType'
components_2_componentAssets_1_storeList_0_ondemandEDD	=	 'components[2].componentAssets[1].storeList[0].ondemandEDD'
components_3_carouselHeading	=	 'components[3].carouselHeading'
components_3_viewType	=	 'components[3].viewType'
components_3_linesToDisplay	=	 'components[3].linesToDisplay'
components_3_heading	=	 'components[3].heading'
components_3_componentAssets	=	 'components[3].componentAssets'
components_3_componentAssets_0	=	 'components[3].componentAssets[0]'


CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, pageId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, pageId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, pageTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, pageTypeId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, pageTitle)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, pageTitle)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_0_componentTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_0_componentTypeId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_0_componentType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_0_componentType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_0_bannerLayout)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_0_bannerLayout)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_0_textHeadline)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_0_textHeadline)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_0_componentAssets_0_componentTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_0_componentAssets_0_componentTypeId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_0_componentAssets_0_componentType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_0_componentAssets_0_componentType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_0_componentAssets_0_image)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_0_componentAssets_0_image)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_0_componentAssets_0_image)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_0_componentAssets_0_image)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodSLP, components_0_componentAssets_0_bannerDesc)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_0_componentAssets_0_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_0_componentAssets_0_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_0_componentAssets_0_storeSelector_value)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_0_componentAssets_0_storeSelector_value)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_0_componentAssets_0_bannerName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_0_componentAssets_0_bannerName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_0_componentAssets_0_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_0_componentAssets_0_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_0_componentAssets_0_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_0_componentAssets_0_linkType)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_0_componentAssets_0_promotion)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_0_componentAssets_0_promotion)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_0_componentAssets_0_storeName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_0_componentAssets_0_storeName)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_0_componentAssets_0_ID)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_0_componentAssets_0_ID)

CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(FoodSLP, components_0_componentAssets_0_corporateColorCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(FoodSLP, components_0_componentAssets_0_deliveryTime)
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(FoodSLP, components_0_componentAssets_0_positionAfter)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_1_componentTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_1_componentTypeId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_1_componentType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_1_componentType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_1_groupingName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_1_groupingName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_1_sort)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_1_sort)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_1_componentAssets_0_componentTypeId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_1_componentAssets_0_componentTypeId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_1_componentAssets_0_componentType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_1_componentAssets_0_componentType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_1_componentAssets_0_category)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_1_componentAssets_0_category)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_1_componentAssets_0_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_1_componentAssets_0_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_1_componentAssets_0_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_1_componentAssets_0_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_1_componentAssets_0_image)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_1_componentAssets_0_image)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_1_componentAssets_0_url)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_1_componentAssets_0_url)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_1_componentAssets_0_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_1_componentAssets_0_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_viewType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_viewType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_heading)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_heading)

CustomKeywords.'totalplay.Common.verifyPropertyValueNotEmptyorNotNull'(FoodSLP, components_2_linesToDisplay)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_componentAssets_0_storeList_0_categories_0_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_componentAssets_0_storeList_0_categories_0_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_componentAssets_0_storeList_0_categories_0_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_componentAssets_0_storeList_0_categories_0_id)

CustomKeywords.'totalplay.Common.verifyPropertyValueNotEmptyorNotNull'(FoodSLP, components_2_componentAssets_0_storeList_0_categories_0_image)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_componentAssets_0_storeList_0_categories_0_url)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_componentAssets_0_storeList_0_categories_0_url)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodSLP, components_2_componentAssets_0_storeList_0_categories_0_isLeaf)

CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodSLP, components_2_componentAssets_0_storeList_0_ratings)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodSLP, components_2_componentAssets_0_storeList_0_isInRange)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodSLP, components_2_componentAssets_0_storeList_0_storeOpen)

//CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(FoodSLP, components_2_componentAssets_0_storeList_0_OpenHrs)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_componentAssets_0_storeList_0_OpenHrs_time_0_openingTime)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_componentAssets_0_storeList_0_OpenHrs_time_0_openingTime)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_componentAssets_0_storeList_0_OpenHrs_time_0_closingTime)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_componentAssets_0_storeList_0_OpenHrs_time_0_closingTime)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodSLP, components_2_componentAssets_0_storeList_0_OpenHrs_closed)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_componentAssets_0_storeList_0_OpenHrs_day)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_componentAssets_0_storeList_0_OpenHrs_day)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_componentAssets_0_storeList_0_link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_componentAssets_0_storeList_0_link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_componentAssets_0_storeList_0_linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_componentAssets_0_storeList_0_linkType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_componentAssets_0_storeList_0_ondemandEDD)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_componentAssets_0_storeList_0_ondemandEDD)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_componentAssets_1_componentTypeId)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_componentAssets_1_componentTypeId)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_componentAssets_1_componentType)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_componentAssets_1_componentType)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_componentAssets_1_storeSelector_value)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_componentAssets_1_storeSelector_value)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_componentAssets_1_linkType)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_componentAssets_1_linkType)
//
//CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodSLP, components_2_componentAssets_1_nodesLength)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_componentAssets_1_link)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_componentAssets_1_link)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_componentAssets_1_storeList_0_ID)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_componentAssets_1_storeList_0_ID)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_componentAssets_1_storeList_0_name)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_componentAssets_1_storeList_0_name)
//
//CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(FoodSLP, components_2_componentAssets_1_storeList_0_logo)
//CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(FoodSLP, components_2_componentAssets_1_storeList_0_bannerImage)
//CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(FoodSLP, components_2_componentAssets_1_storeList_0_corporateColorCode)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_componentAssets_1_storeList_0_corporateName)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_componentAssets_1_storeList_0_corporateName)
//
////CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodSLP, components_2_componentAssets_1_storeList_0_isInRange)
//
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodSLP, components_2_componentAssets_1_storeList_0_storeOpen)
//CustomKeywords.'totalplay.Common.getBooleanValueofObject'(FoodSLP, components_2_componentAssets_1_storeList_0_link)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_componentAssets_1_storeList_0_linkType)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_componentAssets_1_storeList_0_linkType)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_2_componentAssets_1_storeList_0_ondemandEDD)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_2_componentAssets_1_storeList_0_ondemandEDD)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_3_carouselHeading)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_3_carouselHeading)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_3_viewType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_3_viewType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_3_linesToDisplay)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_3_linesToDisplay)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodSLP, components_3_heading)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodSLP, components_3_heading)
